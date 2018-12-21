package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Pivot;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.ModelNotFoundException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Relation;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/BelongsToMany.php

*/

public class BelongsToMany extends Relation {

    public Object table = null;

    public Object foreignPivotKey = null;

    public Object relatedPivotKey = null;

    public Object parentKey = null;

    public Object relatedKey = null;

    public Object relationName = null;

    public Object pivotColumns = ZVal.newArray();

    public Object pivotWheres = ZVal.newArray();

    public Object pivotWhereIns = ZVal.newArray();

    public Object pivotValues = ZVal.newArray();

    public Object withTimestamps = false;

    public Object pivotCreatedAt = null;

    public Object pivotUpdatedAt = null;

    public Object using = null;

    public Object accessor = "pivot";

    public BelongsToMany(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BelongsToMany.class) {
            this.__construct(env, args);
        }
    }

    public BelongsToMany(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 1,
        name = "parent",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    @ConvertedParameter(index = 2, name = "table")
    @ConvertedParameter(index = 3, name = "foreignPivotKey")
    @ConvertedParameter(index = 4, name = "relatedPivotKey")
    @ConvertedParameter(index = 5, name = "parentKey")
    @ConvertedParameter(index = 6, name = "relatedKey")
    @ConvertedParameter(
        index = 7,
        name = "relationName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, false);
        Object foreignPivotKey = assignParameter(args, 3, false);
        Object relatedPivotKey = assignParameter(args, 4, false);
        Object parentKey = assignParameter(args, 5, false);
        Object relatedKey = assignParameter(args, 6, false);
        Object relationName = assignParameter(args, 7, true);
        if (null == relationName) {
            relationName = ZVal.getNull();
        }
        this.table = table;
        this.parentKey = parentKey;
        this.relatedKey = relatedKey;
        this.relationName = relationName;
        this.relatedPivotKey = relatedPivotKey;
        this.foreignPivotKey = foreignPivotKey;
        super.__construct(env, query, parent);
        return null;
    }

    @ConvertedMethod
    public Object addConstraints(RuntimeEnv env, Object... args) {
        this.performJoin(env);
        if (ZVal.isTrue(
                env.getRequestStaticProperties(Relation.RequestStaticProperties.class)
                        .constraints)) {
            this.addWhereConstraints(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object performJoin(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, true);
        if (null == query) {
            query = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        Object baseTable = null;
        Object key = null;
        query =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = query)
                                ? ternaryExpressionTemp
                                : toObjectR(this).accessProp(this, env).name("query").value());
        baseTable =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("related").value(),
                        "getTable",
                        BelongsToMany.class);
        key = toStringR(baseTable, env) + "." + toStringR(this.relatedKey, env);
        env.callMethod(
                query,
                "join",
                BelongsToMany.class,
                this.table,
                key,
                "=",
                this.getQualifiedRelatedPivotKeyName(env));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object addWhereConstraints(RuntimeEnv env, Object... args) {
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "where",
                BelongsToMany.class,
                this.getQualifiedForeignPivotKeyName(env),
                "=",
                toObjectR(this)
                        .accessProp(this, env)
                        .name("parent")
                        .getObject()
                        .accessProp(this, env)
                        .name(this.parentKey)
                        .value());
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    public Object addEagerConstraints(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "whereIn",
                BelongsToMany.class,
                this.getQualifiedForeignPivotKeyName(env),
                env.callMethod(this, "getKeys", BelongsToMany.class, models, this.parentKey));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(index = 1, name = "relation")
    public Object initRelation(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object relation = assignParameter(args, 1, false);
        Object model = null;
        for (ZPair zpairResult303 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult303.getValue());
            env.callMethod(
                    model,
                    "setRelation",
                    BelongsToMany.class,
                    relation,
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("related").value(),
                            "newCollection",
                            BelongsToMany.class));
        }

        return ZVal.assign(models);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "results",
        typeHint = "Illuminate\\Database\\Eloquent\\Collection"
    )
    @ConvertedParameter(index = 2, name = "relation")
    public Object match(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object results = assignParameter(args, 1, false);
        Object relation = assignParameter(args, 2, false);
        ReferenceContainer dictionary = new BasicReferenceContainer(null);
        Object model = null;
        Object key = null;
        dictionary.setObject(this.buildDictionary(env, results));
        for (ZPair zpairResult304 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult304.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    dictionary,
                    env,
                    key =
                            ZVal.assign(
                                    toObjectR(model)
                                            .accessProp(this, env)
                                            .name(this.parentKey)
                                            .value()))) {
                env.callMethod(
                        model,
                        "setRelation",
                        BelongsToMany.class,
                        relation,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("related").value(),
                                "newCollection",
                                BelongsToMany.class,
                                dictionary.arrayGet(env, key)));
            }
        }

        return ZVal.assign(models);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "results",
        typeHint = "Illuminate\\Database\\Eloquent\\Collection"
    )
    protected Object buildDictionary(RuntimeEnv env, Object... args) {
        Object results = assignParameter(args, 0, false);
        Object result = null;
        ReferenceContainer dictionary = new BasicReferenceContainer(null);
        dictionary.setObject(ZVal.newArray());
        for (ZPair zpairResult305 : ZVal.getIterable(results, env, true)) {
            result = ZVal.assign(zpairResult305.getValue());
            dictionary
                    .arrayAppend(
                            env,
                            toObjectR(result)
                                    .accessProp(this, env)
                                    .name(this.accessor)
                                    .getObject()
                                    .accessProp(this, env)
                                    .name(this.foreignPivotKey)
                                    .value())
                    .set(result);
        }

        return ZVal.assign(dictionary.getObject());
    }

    @ConvertedMethod
    public Object getPivotClass(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = this.using)
                        ? ternaryExpressionTemp
                        : Pivot.CONST_class);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object using(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        this.using = _pClass;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "accessor")
    public Object as(RuntimeEnv env, Object... args) {
        Object accessor = assignParameter(args, 0, false);
        this.accessor = accessor;
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
    public Object wherePivot(RuntimeEnv env, Object... args) {
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
        new ReferenceClassProperty(this, "pivotWheres", env)
                .arrayAppend(env)
                .set(
                        function_func_get_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value());
        return ZVal.assign(
                env.callMethod(
                        this,
                        "where",
                        BelongsToMany.class,
                        toStringR(this.table, env) + "." + toStringR(column, env),
                        operator,
                        value,
                        _pBoolean));
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
    public Object wherePivotIn(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        Object _pBoolean = assignParameter(args, 2, true);
        if (null == _pBoolean) {
            _pBoolean = "and";
        }
        Object not = assignParameter(args, 3, true);
        if (null == not) {
            not = false;
        }
        new ReferenceClassProperty(this, "pivotWhereIns", env)
                .arrayAppend(env)
                .set(
                        function_func_get_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value());
        return ZVal.assign(
                env.callMethod(
                        this,
                        "whereIn",
                        BelongsToMany.class,
                        toStringR(this.table, env) + "." + toStringR(column, env),
                        values,
                        _pBoolean,
                        not));
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
    public Object orWherePivot(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        return ZVal.assign(this.wherePivot(env, column, operator, value, "or"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(
        index = 1,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object withPivotValue(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope90 scope = new Scope90();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/BelongsToMany.php");
            scope.column = assignParameter(args, 0, false);
            scope.value = assignParameter(args, 1, true);
            if (null == scope.value) {
                scope.value = ZVal.getNull();
            }
            scope.name = null;
            if (function_is_array.f.env(env).call(scope.column).getBool()) {
                for (ZPair zpairResult306 : ZVal.getIterable(scope.column, env, false)) {
                    scope.name = ZVal.assign(zpairResult306.getKey());
                    scope.value = ZVal.assign(zpairResult306.getValue());
                    this.withPivotValue(env, scope.name, scope.value);
                }

                throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
            }

            if (function_is_null.f.env(env).call(scope.value).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(env, "The provided value may not be null."));
            }

            new ReferenceClassProperty(scope._thisVarAlias, "pivotValues", env)
                    .arrayAppend(env)
                    .set(function_compact.f.env(env).call(stack, "column", "value").value());
            throw new IncludeEventException(
                    ZVal.assign(this.wherePivot(env, scope.column, "=", scope.value)));
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "values")
    public Object orWherePivotIn(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, false);
        return ZVal.assign(this.wherePivotIn(env, column, values, "or"));
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
        Object instance = null;
        if (function_is_null.f.env(env).call(instance = this.find(env, id, columns)).getBool()) {
            instance =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("related").value(),
                            "newInstance",
                            BelongsToMany.class);
        }

        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object firstOrNew(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object instance = null;
        if (function_is_null
                .f
                .env(env)
                .call(
                        instance =
                                env.callMethod(
                                        env.callMethod(
                                                this, "where", BelongsToMany.class, attributes),
                                        "first",
                                        BelongsToMany.class))
                .getBool()) {
            instance =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("related").value(),
                            "newInstance",
                            BelongsToMany.class,
                            attributes);
        }

        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "joining",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "touch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object firstOrCreate(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object joining = assignParameter(args, 1, true);
        if (null == joining) {
            joining = ZVal.newArray();
        }
        Object touch = assignParameter(args, 2, true);
        if (null == touch) {
            touch = true;
        }
        Object instance = null;
        if (function_is_null
                .f
                .env(env)
                .call(
                        instance =
                                env.callMethod(
                                        env.callMethod(
                                                this, "where", BelongsToMany.class, attributes),
                                        "first",
                                        BelongsToMany.class))
                .getBool()) {
            instance = this.create(env, attributes, joining, touch);
        }

        return ZVal.assign(instance);
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
    @ConvertedParameter(
        index = 2,
        name = "joining",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "touch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object updateOrCreate(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, true);
        if (null == values) {
            values = ZVal.newArray();
        }
        Object joining = assignParameter(args, 2, true);
        if (null == joining) {
            joining = ZVal.newArray();
        }
        Object touch = assignParameter(args, 3, true);
        if (null == touch) {
            touch = true;
        }
        Object instance = null;
        if (function_is_null
                .f
                .env(env)
                .call(
                        instance =
                                env.callMethod(
                                        env.callMethod(
                                                this, "where", BelongsToMany.class, attributes),
                                        "first",
                                        BelongsToMany.class))
                .getBool()) {
            return ZVal.assign(this.create(env, values, joining, touch));
        }

        env.callMethod(instance, "fill", BelongsToMany.class, values);
        env.callMethod(
                instance, "save", BelongsToMany.class, ZVal.newArray(new ZPair("touch", false)));
        return ZVal.assign(instance);
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
                function_is_array.f.env(env).call(id).getBool()
                        ? this.findMany(env, id, columns)
                        : env.callMethod(
                                env.callMethod(
                                        this,
                                        "where",
                                        BelongsToMany.class,
                                        env.callMethod(
                                                env.callMethod(
                                                        this, "getRelated", BelongsToMany.class),
                                                "getQualifiedKeyName",
                                                BelongsToMany.class),
                                        "=",
                                        id),
                                "first",
                                BelongsToMany.class,
                                columns));
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
        return ZVal.assign(
                ZVal.isEmpty(ids)
                        ? env.callMethod(
                                env.callMethod(this, "getRelated", BelongsToMany.class),
                                "newCollection",
                                BelongsToMany.class)
                        : env.callMethod(
                                env.callMethod(
                                        this,
                                        "whereIn",
                                        BelongsToMany.class,
                                        env.callMethod(
                                                env.callMethod(
                                                        this, "getRelated", BelongsToMany.class),
                                                "getQualifiedKeyName",
                                                BelongsToMany.class),
                                        ids),
                                "get",
                                BelongsToMany.class,
                                columns));
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
                        BelongsToMany.class,
                        function_get_class
                                .f
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name("related").value())
                                .value()));
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
        Object results = null;
        results =
                env.callMethod(
                        env.callMethod(this, "take", BelongsToMany.class, 1),
                        "get",
                        BelongsToMany.class,
                        columns);
        return ZVal.assign(
                ZVal.isGreaterThan(function_count.f.env(env).call(results).value(), '>', 0)
                        ? env.callMethod(results, "first", BelongsToMany.class)
                        : ZVal.getNull());
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
                        BelongsToMany.class,
                        function_get_class
                                .f
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name("related").value())
                                .value()));
    }

    @ConvertedMethod
    public Object getResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.get(env));
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
        columns =
                ZVal.assign(
                        toObjectR(
                                                env.callMethod(
                                                        toObjectR(this)
                                                                .accessProp(this, env)
                                                                .name("query")
                                                                .value(),
                                                        "getQuery",
                                                        BelongsToMany.class))
                                        .accessProp(this, env)
                                        .name("columns")
                                        .getBool()
                                ? ZVal.newArray()
                                : columns);
        builder =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("query").value(),
                        "applyScopes",
                        BelongsToMany.class);
        models =
                env.callMethod(
                        env.callMethod(
                                builder,
                                "addSelect",
                                BelongsToMany.class,
                                this.shouldSelect(env, columns)),
                        "getModels",
                        BelongsToMany.class);
        this.hydratePivotRelation(env, models);
        if (ZVal.isGreaterThan(function_count.f.env(env).call(models).value(), '>', 0)) {
            models = env.callMethod(builder, "eagerLoadRelations", BelongsToMany.class, models);
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("related").value(),
                        "newCollection",
                        BelongsToMany.class,
                        models));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "columns",
        typeHint = "array",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    protected Object shouldSelect(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        if (ZVal.equalityCheck(columns, ZVal.arrayFromList("*"))) {
            columns =
                    ZVal.newArray(
                            new ZPair(
                                    0,
                                    toStringR(
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("related")
                                                                    .value(),
                                                            "getTable",
                                                            BelongsToMany.class),
                                                    env)
                                            + ".*"));
        }

        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(columns, this.aliasedPivotColumns(env))
                        .value());
    }

    @ConvertedMethod
    protected Object aliasedPivotColumns(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/BelongsToMany.php");
        Object defaults = null;
        defaults =
                ZVal.newArray(
                        new ZPair(0, this.foreignPivotKey), new ZPair(1, this.relatedPivotKey));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        collect.f
                                                .env(env)
                                                .call(
                                                        function_array_merge
                                                                .f
                                                                .env(env)
                                                                .call(defaults, this.pivotColumns)
                                                                .value())
                                                .value(),
                                        "map",
                                        BelongsToMany.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Database\\Eloquent\\Relations",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "column")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object column = assignParameter(args, 0, false);
                                                return ZVal.assign(
                                                        toStringR(BelongsToMany.this.table, env)
                                                                + "."
                                                                + toStringR(column, env)
                                                                + " as pivot_"
                                                                + toStringR(column, env));
                                            }
                                        }),
                                "unique",
                                BelongsToMany.class),
                        "all",
                        BelongsToMany.class));
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
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/BelongsToMany.php");
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
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "addSelect",
                BelongsToMany.class,
                this.shouldSelect(env, columns));
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("query").value(),
                                        "paginate",
                                        BelongsToMany.class,
                                        perPage,
                                        columns,
                                        pageName,
                                        page),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent\\Relations",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "paginator")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object paginator = assignParameter(args, 0, false);
                                        BelongsToMany.this.hydratePivotRelation(
                                                env,
                                                env.callMethod(
                                                        paginator, "items", BelongsToMany.class));
                                        return null;
                                    }
                                })
                        .value());
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
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/BelongsToMany.php");
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
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "addSelect",
                BelongsToMany.class,
                this.shouldSelect(env, columns));
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("query").value(),
                                        "simplePaginate",
                                        BelongsToMany.class,
                                        perPage,
                                        columns,
                                        pageName,
                                        page),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent\\Relations",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "paginator")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object paginator = assignParameter(args, 0, false);
                                        BelongsToMany.this.hydratePivotRelation(
                                                env,
                                                env.callMethod(
                                                        paginator, "items", BelongsToMany.class));
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    public Object chunk(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/BelongsToMany.php");
        Object count = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "addSelect",
                BelongsToMany.class,
                this.shouldSelect(env));
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("query").value(),
                        "chunk",
                        BelongsToMany.class,
                        count,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent\\Relations",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "results")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                ReferenceContainer results =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                BelongsToMany.this.hydratePivotRelation(
                                        env,
                                        env.callMethod(
                                                results.getObject(), "all", BelongsToMany.class));
                                return ZVal.assign(
                                        env.callFunctionDynamic(
                                                        callback,
                                                        new RuntimeArgsWithReferences()
                                                                .add(0, results),
                                                        results.getObject())
                                                .value());
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    protected Object hydratePivotRelation(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object model = null;
        for (ZPair zpairResult307 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult307.getValue());
            env.callMethod(
                    model,
                    "setRelation",
                    BelongsToMany.class,
                    this.accessor,
                    this.newExistingPivot(env, this.migratePivotAttributes(env, model)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "model",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    protected Object migratePivotAttributes(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        ReferenceContainer values = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        values.setObject(ZVal.newArray());
        for (ZPair zpairResult308 :
                ZVal.getIterable(
                        env.callMethod(model, "getAttributes", BelongsToMany.class), env, false)) {
            key = ZVal.assign(zpairResult308.getKey());
            value = ZVal.assign(zpairResult308.getValue());
            if (ZVal.strictEqualityCheck(
                    function_strpos.f.env(env).call(key, "pivot_").value(), "===", 0)) {
                values.arrayAccess(env, function_substr.f.env(env).call(key, 6).value()).set(value);
                toObjectR(model).accessProp(this, env).name(key).set(null);
            }
        }

        return ZVal.assign(values.getObject());
    }

    @ConvertedMethod
    public Object touchIfTouching(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.touchingParent(env))) {
            env.callMethod(
                    env.callMethod(this, "getParent", BelongsToMany.class),
                    "touch",
                    BelongsToMany.class);
        }

        if (ZVal.isTrue(
                env.callMethod(
                        env.callMethod(this, "getParent", BelongsToMany.class),
                        "touches",
                        BelongsToMany.class,
                        this.relationName))) {
            this.touch(env);
        }

        return null;
    }

    @ConvertedMethod
    protected Object touchingParent(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "getRelated", BelongsToMany.class),
                        "touches",
                        BelongsToMany.class,
                        this.guessInverseRelation(env)));
    }

    @ConvertedMethod
    protected Object guessInverseRelation(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                Str.runtimeStaticObject.camel(
                        env,
                        Str.runtimeStaticObject.plural(
                                env,
                                class_basename
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this, "getParent", BelongsToMany.class))
                                        .value())));
    }

    @ConvertedMethod
    public Object touch(RuntimeEnv env, Object... args) {
        Object columns = null;
        Object ids = null;
        Object key = null;
        key =
                env.callMethod(
                        env.callMethod(this, "getRelated", BelongsToMany.class),
                        "getKeyName",
                        BelongsToMany.class);
        columns =
                ZVal.newArray(
                        new ZPair(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("related")
                                                .value(),
                                        "getUpdatedAtColumn",
                                        BelongsToMany.class),
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("related")
                                                .value(),
                                        "freshTimestampString",
                                        BelongsToMany.class)));
        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(ids = this.allRelatedIds(env)).value(), '>', 0)) {
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(this, "getRelated", BelongsToMany.class),
                                    "newQuery",
                                    BelongsToMany.class),
                            "whereIn",
                            BelongsToMany.class,
                            key,
                            ids),
                    "update",
                    BelongsToMany.class,
                    columns);
        }

        return null;
    }

    @ConvertedMethod
    public Object allRelatedIds(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.newPivotQuery(env),
                        "pluck",
                        BelongsToMany.class,
                        this.relatedPivotKey));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "model",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    @ConvertedParameter(
        index = 1,
        name = "pivotAttributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "touch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object save(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        Object pivotAttributes = assignParameter(args, 1, true);
        if (null == pivotAttributes) {
            pivotAttributes = ZVal.newArray();
        }
        Object touch = assignParameter(args, 2, true);
        if (null == touch) {
            touch = true;
        }
        env.callMethod(
                model, "save", BelongsToMany.class, ZVal.newArray(new ZPair("touch", false)));
        this.attach(
                env, env.callMethod(model, "getKey", BelongsToMany.class), pivotAttributes, touch);
        return ZVal.assign(model);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models")
    @ConvertedParameter(
        index = 1,
        name = "pivotAttributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object saveMany(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        ReferenceContainer pivotAttributes =
                new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == pivotAttributes.getObject()) {
            pivotAttributes.setObject(ZVal.newArray());
        }
        Object model = null;
        Object ternaryExpressionTemp = null;
        Object key = null;
        for (ZPair zpairResult309 : ZVal.getIterable(models, env, false)) {
            key = ZVal.assign(zpairResult309.getKey());
            model = ZVal.assign(zpairResult309.getValue());
            this.save(
                    env,
                    model,
                    rToArrayCast(
                            ZVal.isDefined(
                                            ternaryExpressionTemp =
                                                    pivotAttributes.arrayGet(env, key))
                                    ? ternaryExpressionTemp
                                    : ZVal.newArray()),
                    false);
        }

        this.touchIfTouching(env);
        return ZVal.assign(models);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "joining",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "touch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object create(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object joining = assignParameter(args, 1, true);
        if (null == joining) {
            joining = ZVal.newArray();
        }
        Object touch = assignParameter(args, 2, true);
        if (null == touch) {
            touch = true;
        }
        Object instance = null;
        instance =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("related").value(),
                        "newInstance",
                        BelongsToMany.class,
                        attributes);
        env.callMethod(
                instance, "save", BelongsToMany.class, ZVal.newArray(new ZPair("touch", false)));
        this.attach(env, env.callMethod(instance, "getKey", BelongsToMany.class), joining, touch);
        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "joinings",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object createMany(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        ReferenceContainer joinings = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == joinings.getObject()) {
            joinings.setObject(ZVal.newArray());
        }
        ReferenceContainer instances = new BasicReferenceContainer(null);
        Object record = null;
        Object ternaryExpressionTemp = null;
        Object key = null;
        instances.setObject(ZVal.newArray());
        for (ZPair zpairResult310 : ZVal.getIterable(records, env, false)) {
            key = ZVal.assign(zpairResult310.getKey());
            record = ZVal.assign(zpairResult310.getValue());
            instances
                    .arrayAppend(env)
                    .set(
                            this.create(
                                    env,
                                    record,
                                    rToArrayCast(
                                            ZVal.isDefined(
                                                            ternaryExpressionTemp =
                                                                    joinings.arrayGet(env, key))
                                                    ? ternaryExpressionTemp
                                                    : ZVal.newArray()),
                                    false));
        }

        this.touchIfTouching(env);
        return ZVal.assign(instances.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 1,
        name = "parentQuery",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 2,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object getRelationExistenceQuery(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parentQuery = assignParameter(args, 1, false);
        Object columns = assignParameter(args, 2, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        if (ZVal.equalityCheck(
                toObjectR(env.callMethod(parentQuery, "getQuery", BelongsToMany.class))
                        .accessProp(this, env)
                        .name("from")
                        .value(),
                toObjectR(env.callMethod(query, "getQuery", BelongsToMany.class))
                        .accessProp(this, env)
                        .name("from")
                        .value())) {
            return ZVal.assign(
                    this.getRelationExistenceQueryForSelfJoin(env, query, parentQuery, columns));
        }

        this.performJoin(env, query);
        return ZVal.assign(super.getRelationExistenceQuery(env, query, parentQuery, columns));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 1,
        name = "parentQuery",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(
        index = 2,
        name = "columns",
        defaultValue = "ZVal.arrayFromList(\"*\")",
        defaultValueType = "array"
    )
    public Object getRelationExistenceQueryForSelfJoin(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parentQuery = assignParameter(args, 1, false);
        Object columns = assignParameter(args, 2, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object hash = null;
        env.callMethod(query, "select", BelongsToMany.class, columns);
        env.callMethod(
                query,
                "from",
                BelongsToMany.class,
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("related")
                                                .value(),
                                        "getTable",
                                        BelongsToMany.class),
                                env)
                        + " as "
                        + toStringR(hash = this.getRelationCountHash(env), env));
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("related").value(),
                "setTable",
                BelongsToMany.class,
                hash);
        this.performJoin(env, query);
        return ZVal.assign(super.getRelationExistenceQuery(env, query, parentQuery, columns));
    }

    @ConvertedMethod
    public Object getExistenceCompareKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getQualifiedForeignPivotKeyName(env));
    }

    @ConvertedMethod
    public Object getRelationCountHash(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                "laravel_reserved_"
                        + toStringR(
                                ZVal.postIncrement(
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
                                                        .namespaces
                                                        .Relations
                                                        .classes
                                                        .BelongsToMany
                                                        .RequestStaticProperties
                                                        .class,
                                                "selfJoinCount")),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "createdAt",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "updatedAt",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object withTimestamps(RuntimeEnv env, Object... args) {
        Object createdAt = assignParameter(args, 0, true);
        if (null == createdAt) {
            createdAt = ZVal.getNull();
        }
        Object updatedAt = assignParameter(args, 1, true);
        if (null == updatedAt) {
            updatedAt = ZVal.getNull();
        }
        this.withTimestamps = true;
        this.pivotCreatedAt = createdAt;
        this.pivotUpdatedAt = updatedAt;
        return ZVal.assign(this.withPivot(env, this.createdAt(env), this.updatedAt(env)));
    }

    @ConvertedMethod
    public Object createdAt(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.pivotCreatedAt)
                        ? ternaryExpressionTemp
                        : env.callMethod(
                                toObjectR(this).accessProp(this, env).name("parent").value(),
                                "getCreatedAtColumn",
                                BelongsToMany.class));
    }

    @ConvertedMethod
    public Object updatedAt(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.pivotUpdatedAt)
                        ? ternaryExpressionTemp
                        : env.callMethod(
                                toObjectR(this).accessProp(this, env).name("parent").value(),
                                "getUpdatedAtColumn",
                                BelongsToMany.class));
    }

    @ConvertedMethod
    public Object getForeignPivotKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.foreignPivotKey);
    }

    @ConvertedMethod
    public Object getQualifiedForeignPivotKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.table, env) + "." + toStringR(this.foreignPivotKey, env));
    }

    @ConvertedMethod
    public Object getRelatedPivotKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.relatedPivotKey);
    }

    @ConvertedMethod
    public Object getQualifiedRelatedPivotKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.table, env) + "." + toStringR(this.relatedPivotKey, env));
    }

    @ConvertedMethod
    public Object getQualifiedParentKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("parent").value(),
                        "qualifyColumn",
                        BelongsToMany.class,
                        this.parentKey));
    }

    @ConvertedMethod
    public Object getTable(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.table);
    }

    @ConvertedMethod
    public Object getRelationName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.relationName);
    }

    @ConvertedMethod
    public Object getPivotAccessor(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.accessor);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids")
    @ConvertedParameter(
        index = 1,
        name = "touch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object toggle(RuntimeEnv env, Object... args) {
        Object ids = assignParameter(args, 0, false);
        Object touch = assignParameter(args, 1, true);
        if (null == touch) {
            touch = true;
        }
        Object records = null;
        ReferenceContainer changes = new BasicReferenceContainer(null);
        Object detach = null;
        Object attach = null;
        changes.setObject(
                ZVal.newArray(
                        new ZPair("attached", ZVal.newArray()),
                        new ZPair("detached", ZVal.newArray())));
        records = this.formatRecordsList(env, this.parseIds(env, ids));
        detach =
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_intersect
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        env.callMethod(
                                                                this.newPivotQuery(env),
                                                                "pluck",
                                                                BelongsToMany.class,
                                                                this.relatedPivotKey),
                                                        "all",
                                                        BelongsToMany.class),
                                                function_array_keys
                                                        .f
                                                        .env(env)
                                                        .call(records)
                                                        .value())
                                        .value())
                        .value();
        if (ZVal.isGreaterThan(function_count.f.env(env).call(detach).value(), '>', 0)) {
            this.detach(env, detach, false);
            changes.arrayAccess(env, "detached").set(this.castKeys(env, detach));
        }

        attach =
                function_array_diff_key
                        .f
                        .env(env)
                        .call(records, function_array_flip.f.env(env).call(detach).value())
                        .value();
        if (ZVal.isGreaterThan(function_count.f.env(env).call(attach).value(), '>', 0)) {
            this.attach(env, attach, ZVal.newArray(), false);
            changes.arrayAccess(env, "attached")
                    .set(function_array_keys.f.env(env).call(attach).value());
        }

        if (ZVal.toBool(touch)
                && ZVal.toBool(
                        ZVal.toBool(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(changes.arrayGet(env, "attached"))
                                                .value())
                                || ZVal.toBool(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(changes.arrayGet(env, "detached"))
                                                .value()))) {
            this.touchIfTouching(env);
        }

        return ZVal.assign(changes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids")
    public Object syncWithoutDetaching(RuntimeEnv env, Object... args) {
        Object ids = assignParameter(args, 0, false);
        return ZVal.assign(this.sync(env, ids, false));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids")
    @ConvertedParameter(
        index = 1,
        name = "detaching",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object sync(RuntimeEnv env, Object... args) {
        Object ids = assignParameter(args, 0, false);
        Object detaching = assignParameter(args, 1, true);
        if (null == detaching) {
            detaching = true;
        }
        Object current = null;
        Object records = null;
        ReferenceContainer changes = new BasicReferenceContainer(null);
        Object detach = null;
        changes.setObject(
                ZVal.newArray(
                        new ZPair("attached", ZVal.newArray()),
                        new ZPair("detached", ZVal.newArray()),
                        new ZPair("updated", ZVal.newArray())));
        current =
                env.callMethod(
                        env.callMethod(
                                this.newPivotQuery(env),
                                "pluck",
                                BelongsToMany.class,
                                this.relatedPivotKey),
                        "all",
                        BelongsToMany.class);
        detach =
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                current,
                                function_array_keys
                                        .f
                                        .env(env)
                                        .call(
                                                records =
                                                        this.formatRecordsList(
                                                                env, this.parseIds(env, ids)))
                                        .value())
                        .value();
        if (ZVal.toBool(detaching)
                && ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count.f.env(env).call(detach).value(), '>', 0))) {
            this.detach(env, detach);
            changes.arrayAccess(env, "detached").set(this.castKeys(env, detach));
        }

        changes.setObject(
                function_array_merge
                        .f
                        .env(env)
                        .call(changes.getObject(), this.attachNew(env, records, current, false))
                        .value());
        if (ZVal.toBool(function_count.f.env(env).call(changes.arrayGet(env, "attached")).value())
                || ZVal.toBool(
                        function_count.f.env(env).call(changes.arrayGet(env, "updated")).value())) {
            this.touchIfTouching(env);
        }

        return ZVal.assign(changes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    protected Object formatRecordsList(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Concerns/InteractsWithPivotTable.php");
        Object records = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                collect.f.env(env).call(records).value(),
                                "mapWithKeys",
                                BelongsToMany.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent\\Relations\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "attributes")
                                    @ConvertedParameter(index = 1, name = "id")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object attributes = assignParameter(args, 0, false);
                                        Object id = assignParameter(args, 1, false);
                                        Object runtimeTempArrayResult234 = null;
                                        if (!function_is_array
                                                .f
                                                .env(env)
                                                .call(attributes)
                                                .getBool()) {
                                            ZVal.list(
                                                    runtimeTempArrayResult234 =
                                                            ZVal.newArray(
                                                                    new ZPair(0, attributes),
                                                                    new ZPair(1, ZVal.newArray())),
                                                    (id =
                                                            listGet(
                                                                    runtimeTempArrayResult234,
                                                                    0,
                                                                    env)),
                                                    (attributes =
                                                            listGet(
                                                                    runtimeTempArrayResult234,
                                                                    1,
                                                                    env)));
                                        }

                                        return ZVal.assign(
                                                ZVal.newArray(new ZPair(id, attributes)));
                                    }
                                }),
                        "all",
                        BelongsToMany.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    @ConvertedParameter(index = 1, name = "current", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "touch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object attachNew(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        Object current = assignParameter(args, 1, false);
        Object touch = assignParameter(args, 2, true);
        if (null == touch) {
            touch = true;
        }
        ReferenceContainer changes = new BasicReferenceContainer(null);
        Object attributes = null;
        Object id = null;
        changes.setObject(
                ZVal.newArray(
                        new ZPair("attached", ZVal.newArray()),
                        new ZPair("updated", ZVal.newArray())));
        for (ZPair zpairResult2298 : ZVal.getIterable(records, env, false)) {
            id = ZVal.assign(zpairResult2298.getKey());
            attributes = ZVal.assign(zpairResult2298.getValue());
            if (!function_in_array.f.env(env).call(id, current).getBool()) {
                this.attach(env, id, attributes, touch);
                changes.arrayAppend(env, "attached").set(this.castKey(env, id));

            } else if (ZVal.toBool(
                            ZVal.isGreaterThan(
                                    function_count.f.env(env).call(attributes).value(), '>', 0))
                    && ZVal.toBool(this.updateExistingPivot(env, id, attributes, touch))) {
                changes.arrayAppend(env, "updated").set(this.castKey(env, id));
            }
        }

        return ZVal.assign(changes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "attributes", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "touch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object updateExistingPivot(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, false);
        Object touch = assignParameter(args, 2, true);
        if (null == touch) {
            touch = true;
        }
        Object updated = null;
        if (function_in_array.f.env(env).call(this.updatedAt(env), this.pivotColumns).getBool()) {
            attributes = this.addTimestampsToAttachment(env, attributes, true);
        }

        updated =
                env.callMethod(
                        this.newPivotStatementForId(env, this.parseId(env, id)),
                        "update",
                        BelongsToMany.class,
                        this.castAttributes(env, attributes));
        if (ZVal.isTrue(touch)) {
            this.touchIfTouching(env);
        }

        return ZVal.assign(updated);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "touch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object attach(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object touch = assignParameter(args, 2, true);
        if (null == touch) {
            touch = true;
        }
        env.callMethod(
                this.newPivotStatement(env),
                "insert",
                BelongsToMany.class,
                this.formatAttachRecords(env, this.parseIds(env, id), attributes));
        if (ZVal.isTrue(touch)) {
            this.touchIfTouching(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids")
    @ConvertedParameter(index = 1, name = "attributes", typeHint = "array")
    protected Object formatAttachRecords(RuntimeEnv env, Object... args) {
        Object ids = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, false);
        Object hasTimestamps = null;
        ReferenceContainer records = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        records.setObject(ZVal.newArray());
        hasTimestamps =
                ZVal.toBool(this.hasPivotColumn(env, this.createdAt(env)))
                        || ZVal.toBool(this.hasPivotColumn(env, this.updatedAt(env)));
        for (ZPair zpairResult2299 : ZVal.getIterable(ids, env, false)) {
            key = ZVal.assign(zpairResult2299.getKey());
            value = ZVal.assign(zpairResult2299.getValue());
            records.arrayAppend(env)
                    .set(this.formatAttachRecord(env, key, value, attributes, hasTimestamps));
        }

        return ZVal.assign(records.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "attributes")
    @ConvertedParameter(index = 3, name = "hasTimestamps")
    protected Object formatAttachRecord(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object attributes = assignParameter(args, 2, false);
        Object hasTimestamps = assignParameter(args, 3, false);
        Object runtimeTempArrayResult235 = null;
        Object id = null;
        ZVal.list(
                runtimeTempArrayResult235 =
                        this.extractAttachIdAndAttributes(env, key, value, attributes),
                (id = listGet(runtimeTempArrayResult235, 0, env)),
                (attributes = listGet(runtimeTempArrayResult235, 1, env)));
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.baseAttachRecord(env, id, hasTimestamps),
                                this.castAttributes(env, attributes))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    @ConvertedParameter(index = 2, name = "attributes", typeHint = "array")
    protected Object extractAttachIdAndAttributes(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object attributes = assignParameter(args, 2, false);
        return ZVal.assign(
                function_is_array.f.env(env).call(value).getBool()
                        ? ZVal.newArray(
                                new ZPair(0, key),
                                new ZPair(
                                        1,
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(value, attributes)
                                                .value()))
                        : ZVal.newArray(new ZPair(0, value), new ZPair(1, attributes)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "timed")
    protected Object baseAttachRecord(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object timed = assignParameter(args, 1, false);
        ReferenceContainer record = new BasicReferenceContainer(null);
        ReferenceContainer value = new BasicReferenceContainer(null);
        record.arrayAccess(env, this.relatedPivotKey).set(id);
        record.arrayAccess(env, this.foreignPivotKey)
                .set(
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("parent")
                                .getObject()
                                .accessProp(this, env)
                                .name(this.parentKey)
                                .value());
        if (ZVal.isTrue(timed)) {
            record.setObject(this.addTimestampsToAttachment(env, record.getObject()));
        }

        for (ZPair zpairResult2300 : ZVal.getIterable(this.pivotValues, env, true)) {
            value.setObject(ZVal.assign(zpairResult2300.getValue()));
            record.arrayAccess(env, value.arrayGet(env, "column"))
                    .set(value.arrayGet(env, "value"));
        }

        return ZVal.assign(record.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "exists",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    protected Object addTimestampsToAttachment(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object exists = assignParameter(args, 1, true);
        if (null == exists) {
            exists = false;
        }
        Object pivotModel = null;
        Object fresh = null;
        fresh =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("parent").value(),
                        "freshTimestamp",
                        BelongsToMany.class);
        if (ZVal.isTrue(this.using)) {
            pivotModel = env.createNew(this.using);
            fresh =
                    env.callMethod(
                            fresh,
                            "format",
                            BelongsToMany.class,
                            env.callMethod(pivotModel, "getDateFormat", BelongsToMany.class));
        }

        if (ZVal.toBool(!ZVal.isTrue(exists))
                && ZVal.toBool(this.hasPivotColumn(env, this.createdAt(env)))) {
            record.arrayAccess(env, this.createdAt(env)).set(fresh);
        }

        if (ZVal.isTrue(this.hasPivotColumn(env, this.updatedAt(env)))) {
            record.arrayAccess(env, this.updatedAt(env)).set(fresh);
        }

        return ZVal.assign(record.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    protected Object hasPivotColumn(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        return ZVal.assign(function_in_array.f.env(env).call(column, this.pivotColumns).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "ids",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "touch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object detach(RuntimeEnv env, Object... args) {
        Object ids = assignParameter(args, 0, true);
        if (null == ids) {
            ids = ZVal.getNull();
        }
        Object touch = assignParameter(args, 1, true);
        if (null == touch) {
            touch = true;
        }
        Object query = null;
        Object results = null;
        query = this.newPivotQuery(env);
        if (!function_is_null.f.env(env).call(ids).getBool()) {
            ids = this.parseIds(env, ids);
            if (ZVal.isEmpty(ids)) {
                return 0;
            }

            env.callMethod(
                    query, "whereIn", BelongsToMany.class, this.relatedPivotKey, rToArrayCast(ids));
        }

        results = env.callMethod(query, "delete", BelongsToMany.class);
        if (ZVal.isTrue(touch)) {
            this.touchIfTouching(env);
        }

        return ZVal.assign(results);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "exists",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object newPivot(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object exists = assignParameter(args, 1, true);
        if (null == exists) {
            exists = false;
        }
        Object pivot = null;
        pivot =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("related").value(),
                        "newPivot",
                        BelongsToMany.class,
                        toObjectR(this).accessProp(this, env).name("parent").value(),
                        attributes,
                        this.table,
                        exists,
                        this.using);
        return ZVal.assign(
                env.callMethod(
                        pivot,
                        "setPivotKeys",
                        BelongsToMany.class,
                        this.foreignPivotKey,
                        this.relatedPivotKey));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object newExistingPivot(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(this.newPivot(env, attributes, true));
    }

    @ConvertedMethod
    public Object newPivotStatement(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("query").value(),
                                        "getQuery",
                                        BelongsToMany.class),
                                "newQuery",
                                BelongsToMany.class),
                        "from",
                        BelongsToMany.class,
                        this.table));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object newPivotStatementForId(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this.newPivotQuery(env),
                        "where",
                        BelongsToMany.class,
                        this.relatedPivotKey,
                        id));
    }

    @ConvertedMethod
    protected Object newPivotQuery(RuntimeEnv env, Object... args) {
        Object query = null;
        Object arguments = null;
        query = this.newPivotStatement(env);
        for (ZPair zpairResult2301 : ZVal.getIterable(this.pivotWheres, env, true)) {
            arguments = ZVal.assign(zpairResult2301.getValue());
            function_call_user_func_array
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(ZVal.newArray(new ZPair(0, query), new ZPair(1, "where")), arguments);
        }

        for (ZPair zpairResult2302 : ZVal.getIterable(this.pivotWhereIns, env, true)) {
            arguments = ZVal.assign(zpairResult2302.getValue());
            function_call_user_func_array
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(ZVal.newArray(new ZPair(0, query), new ZPair(1, "whereIn")), arguments);
        }

        return ZVal.assign(
                env.callMethod(
                        query,
                        "where",
                        BelongsToMany.class,
                        this.foreignPivotKey,
                        toObjectR(this)
                                .accessProp(this, env)
                                .name("parent")
                                .getObject()
                                .accessProp(this, env)
                                .name(this.parentKey)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "columns")
    public Object withPivot(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, false);
        this.pivotColumns =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.pivotColumns,
                                function_is_array.f.env(env).call(columns).getBool()
                                        ? columns
                                        : function_func_get_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value())
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object parseIds(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        value, Model.class, "Illuminate\\Database\\Eloquent\\Model"))) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, env.callMethod(value, "getKey", BelongsToMany.class))));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        value,
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
                                .Collection
                                .class,
                        "Illuminate\\Database\\Eloquent\\Collection"))) {
            return ZVal.assign(env.callMethod(value, "modelKeys", BelongsToMany.class));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        value,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Support
                                .classes
                                .Collection
                                .class,
                        "Illuminate\\Support\\Collection"))) {
            return ZVal.assign(env.callMethod(value, "toArray", BelongsToMany.class));
        }

        return ZVal.assign(rToArrayCast(value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object parseId(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        value,
                                        Model.class,
                                        "Illuminate\\Database\\Eloquent\\Model"))
                        ? env.callMethod(value, "getKey", BelongsToMany.class)
                        : value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys", typeHint = "array")
    protected Object castKeys(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Concerns/InteractsWithPivotTable.php");
        Object keys = assignParameter(args, 0, false);
        return ZVal.assign(
                rToArrayCast(
                        function_array_map
                                .f
                                .env(env)
                                .call(
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Database\\Eloquent\\Relations\\Concerns",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "v")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object _closureThisVar = this.getClosureThisVar();
                                                Object v = assignParameter(args, 0, false);
                                                return ZVal.assign(
                                                        BelongsToMany.this.castKey(env, v));
                                            }
                                        },
                                        keys)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object castKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                function_is_numeric.f.env(env).call(key).getBool()
                        ? ZVal.toLong(key)
                        : toStringR(key, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes")
    protected Object castAttributes(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(this.using)
                        ? env.callMethod(
                                env.callMethod(
                                        this.newPivot(env),
                                        "fill",
                                        BelongsToMany.class,
                                        attributes),
                                "getAttributes",
                                BelongsToMany.class)
                        : attributes);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Eloquent\\Relations\\BelongsToMany";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Relation.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object selfJoinCount = 0;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\BelongsToMany")
                    .setLookup(
                            BelongsToMany.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "accessor",
                            "foreignPivotKey",
                            "parent",
                            "parentKey",
                            "pivotColumns",
                            "pivotCreatedAt",
                            "pivotUpdatedAt",
                            "pivotValues",
                            "pivotWhereIns",
                            "pivotWheres",
                            "query",
                            "related",
                            "relatedKey",
                            "relatedPivotKey",
                            "relationName",
                            "table",
                            "using",
                            "withTimestamps")
                    .setStaticPropertyNames("selfJoinCount")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/BelongsToMany.php")
                    .addTrait(
                            "Illuminate\\Database\\Eloquent\\Relations\\Concerns\\InteractsWithPivotTable")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Relations\\Relation")
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

    private static class Scope90 implements UpdateRuntimeScopeInterface {

        Object _thisVarAlias;
        Object name;
        Object column;
        Object value;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("name", this.name);
            stack.setVariable("column", this.column);
            stack.setVariable("value", this.value);
        }

        public void updateScope(RuntimeStack stack) {

            this._thisVarAlias = stack.getVariable("this");
            this.name = stack.getVariable("name");
            this.column = stack.getVariable("column");
            this.value = stack.getVariable("value");
        }
    }
}
