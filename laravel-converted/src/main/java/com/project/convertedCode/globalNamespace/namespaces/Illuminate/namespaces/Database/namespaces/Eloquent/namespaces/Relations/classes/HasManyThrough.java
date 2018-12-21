package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.ModelNotFoundException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Relation;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.SoftDeletes;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.functions.class_uses_recursive;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasManyThrough.php

*/

public class HasManyThrough extends Relation {

    public Object throughParent = null;

    public Object farParent = null;

    public Object firstKey = null;

    public Object secondKey = null;

    public Object localKey = null;

    public Object secondLocalKey = null;

    public HasManyThrough(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HasManyThrough.class) {
            this.__construct(env, args);
        }
    }

    public HasManyThrough(NoConstructor n) {
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
        name = "farParent",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    @ConvertedParameter(
        index = 2,
        name = "throughParent",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    @ConvertedParameter(index = 3, name = "firstKey")
    @ConvertedParameter(index = 4, name = "secondKey")
    @ConvertedParameter(index = 5, name = "localKey")
    @ConvertedParameter(index = 6, name = "secondLocalKey")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object farParent = assignParameter(args, 1, false);
        Object throughParent = assignParameter(args, 2, false);
        Object firstKey = assignParameter(args, 3, false);
        Object secondKey = assignParameter(args, 4, false);
        Object localKey = assignParameter(args, 5, false);
        Object secondLocalKey = assignParameter(args, 6, false);
        this.localKey = localKey;
        this.firstKey = firstKey;
        this.secondKey = secondKey;
        this.farParent = farParent;
        this.throughParent = throughParent;
        this.secondLocalKey = secondLocalKey;
        super.__construct(env, query, throughParent);
        return null;
    }

    @ConvertedMethod
    public Object addConstraints(RuntimeEnv env, Object... args) {
        Object localValue = null;
        localValue =
                ZVal.assign(
                        new ReferenceClassProperty(this, "farParent", env)
                                .arrayGet(env, this.localKey));
        this.performJoin(env);
        if (ZVal.isTrue(
                env.getRequestStaticProperties(Relation.RequestStaticProperties.class)
                        .constraints)) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("query").value(),
                    "where",
                    HasManyThrough.class,
                    this.getQualifiedFirstKeyName(env),
                    "=",
                    localValue);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object performJoin(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, true);
        if (null == query) {
            query = ZVal.getNull();
        }
        Object farKey = null;
        Object ternaryExpressionTemp = null;
        query =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = query)
                                ? ternaryExpressionTemp
                                : toObjectR(this).accessProp(this, env).name("query").value());
        farKey = this.getQualifiedFarKeyName(env);
        env.callMethod(
                query,
                "join",
                HasManyThrough.class,
                env.callMethod(this.throughParent, "getTable", HasManyThrough.class),
                this.getQualifiedParentKeyName(env),
                "=",
                farKey);
        if (ZVal.isTrue(this.throughParentSoftDeletes(env))) {
            env.callMethod(
                    query,
                    "whereNull",
                    HasManyThrough.class,
                    env.callMethod(
                            this.throughParent,
                            "getQualifiedDeletedAtColumn",
                            HasManyThrough.class));
        }

        return null;
    }

    @ConvertedMethod
    public Object getQualifiedParentKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("parent").value(),
                        "qualifyColumn",
                        HasManyThrough.class,
                        this.secondLocalKey));
    }

    @ConvertedMethod
    public Object throughParentSoftDeletes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_in_array
                        .f
                        .env(env)
                        .call(
                                SoftDeletes.CONST_class,
                                class_uses_recursive
                                        .f
                                        .env(env)
                                        .call(
                                                function_get_class
                                                        .f
                                                        .env(env)
                                                        .call(this.throughParent)
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    public Object addEagerConstraints(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "whereIn",
                HasManyThrough.class,
                this.getQualifiedFirstKeyName(env),
                env.callMethod(this, "getKeys", HasManyThrough.class, models, this.localKey));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(index = 1, name = "relation")
    public Object initRelation(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object relation = assignParameter(args, 1, false);
        Object model = null;
        for (ZPair zpairResult317 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult317.getValue());
            env.callMethod(
                    model,
                    "setRelation",
                    HasManyThrough.class,
                    relation,
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("related").value(),
                            "newCollection",
                            HasManyThrough.class));
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
        for (ZPair zpairResult318 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult318.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    dictionary,
                    env,
                    key =
                            env.callMethod(
                                    model, "getAttribute", HasManyThrough.class, this.localKey))) {
                env.callMethod(
                        model,
                        "setRelation",
                        HasManyThrough.class,
                        relation,
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("related").value(),
                                "newCollection",
                                HasManyThrough.class,
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
        for (ZPair zpairResult319 : ZVal.getIterable(results, env, true)) {
            result = ZVal.assign(zpairResult319.getValue());
            dictionary
                    .arrayAppend(
                            env,
                            toObjectR(result).accessProp(this, env).name(this.firstKey).value())
                    .set(result);
        }

        return ZVal.assign(dictionary.getObject());
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
                                                this, "where", HasManyThrough.class, attributes),
                                        "first",
                                        HasManyThrough.class))
                .getBool()) {
            instance =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("related").value(),
                            "newInstance",
                            HasManyThrough.class,
                            attributes);
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
    public Object updateOrCreate(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, true);
        if (null == values) {
            values = ZVal.newArray();
        }
        Object instance = null;
        instance = this.firstOrNew(env, attributes);
        env.callMethod(
                env.callMethod(instance, "fill", HasManyThrough.class, values),
                "save",
                HasManyThrough.class);
        return ZVal.assign(instance);
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
                        env.callMethod(this, "take", HasManyThrough.class, 1),
                        "get",
                        HasManyThrough.class,
                        columns);
        return ZVal.assign(
                ZVal.isGreaterThan(function_count.f.env(env).call(results).value(), '>', 0)
                        ? env.callMethod(results, "first", HasManyThrough.class)
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
                        HasManyThrough.class,
                        function_get_class
                                .f
                                .env(env)
                                .call(toObjectR(this).accessProp(this, env).name("related").value())
                                .value()));
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
        if (function_is_array.f.env(env).call(id).getBool()) {
            return ZVal.assign(this.findMany(env, id, columns));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this,
                                "where",
                                HasManyThrough.class,
                                env.callMethod(
                                        env.callMethod(this, "getRelated", HasManyThrough.class),
                                        "getQualifiedKeyName",
                                        HasManyThrough.class),
                                "=",
                                id),
                        "first",
                        HasManyThrough.class,
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
        if (ZVal.isEmpty(ids)) {
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(this, "getRelated", HasManyThrough.class),
                            "newCollection",
                            HasManyThrough.class));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this,
                                "whereIn",
                                HasManyThrough.class,
                                env.callMethod(
                                        env.callMethod(this, "getRelated", HasManyThrough.class),
                                        "getQualifiedKeyName",
                                        HasManyThrough.class),
                                ids),
                        "get",
                        HasManyThrough.class,
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
                        HasManyThrough.class,
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
        builder = this.prepareQueryBuilder(env, columns);
        models = env.callMethod(builder, "getModels", HasManyThrough.class);
        if (ZVal.isGreaterThan(function_count.f.env(env).call(models).value(), '>', 0)) {
            models = env.callMethod(builder, "eagerLoadRelations", HasManyThrough.class, models);
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("related").value(),
                        "newCollection",
                        HasManyThrough.class,
                        models));
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
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "addSelect",
                HasManyThrough.class,
                this.shouldSelect(env, columns));
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("query").value(),
                        "paginate",
                        HasManyThrough.class,
                        perPage,
                        columns,
                        pageName,
                        page));
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
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "addSelect",
                HasManyThrough.class,
                this.shouldSelect(env, columns));
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("query").value(),
                        "simplePaginate",
                        HasManyThrough.class,
                        perPage,
                        columns,
                        pageName,
                        page));
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
                                                            HasManyThrough.class),
                                                    env)
                                            + ".*"));
        }

        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                columns,
                                ZVal.newArray(new ZPair(0, this.getQualifiedFirstKeyName(env))))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    public Object chunk(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.prepareQueryBuilder(env),
                        "chunk",
                        HasManyThrough.class,
                        count,
                        callback));
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
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasManyThrough.php");
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
                                Object results = assignParameter(args, 0, false);
                                Object callback = null;
                                ReferenceContainer value = new BasicReferenceContainer(null);
                                ReferenceContainer key = new BasicReferenceContainer(null);
                                callback = this.contextReferences.getCapturedValue("callback");
                                for (ZPair zpairResult320 : ZVal.getIterable(results, env, false)) {
                                    key.setObject(ZVal.assign(zpairResult320.getKey()));
                                    value.setObject(ZVal.assign(zpairResult320.getValue()));
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
    protected Object prepareQueryBuilder(RuntimeEnv env, Object... args) {
        Object columns = assignParameter(args, 0, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("query").value(),
                                "applyScopes",
                                HasManyThrough.class),
                        "addSelect",
                        HasManyThrough.class,
                        this.shouldSelect(
                                env,
                                toObjectR(
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("query")
                                                                        .value(),
                                                                "getQuery",
                                                                HasManyThrough.class))
                                                .accessProp(this, env)
                                                .name("columns")
                                                .getBool()
                                        ? ZVal.newArray()
                                        : columns)));
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
                toObjectR(env.callMethod(parentQuery, "getQuery", HasManyThrough.class))
                        .accessProp(this, env)
                        .name("from")
                        .value(),
                toObjectR(env.callMethod(query, "getQuery", HasManyThrough.class))
                        .accessProp(this, env)
                        .name("from")
                        .value())) {
            return ZVal.assign(
                    this.getRelationExistenceQueryForSelfRelation(
                            env, query, parentQuery, columns));
        }

        this.performJoin(env, query);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(query, "select", HasManyThrough.class, columns),
                        "whereColumn",
                        HasManyThrough.class,
                        this.getQualifiedLocalKeyName(env),
                        "=",
                        this.getQualifiedFirstKeyName(env)));
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
    public Object getRelationExistenceQueryForSelfRelation(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parentQuery = assignParameter(args, 1, false);
        Object columns = assignParameter(args, 2, true);
        if (null == columns) {
            columns = ZVal.arrayFromList("*");
        }
        Object hash = null;
        env.callMethod(
                query,
                "from",
                HasManyThrough.class,
                toStringR(
                                env.callMethod(
                                        env.callMethod(query, "getModel", HasManyThrough.class),
                                        "getTable",
                                        HasManyThrough.class),
                                env)
                        + " as "
                        + toStringR(hash = this.getRelationCountHash(env), env));
        env.callMethod(
                query,
                "join",
                HasManyThrough.class,
                env.callMethod(this.throughParent, "getTable", HasManyThrough.class),
                this.getQualifiedParentKeyName(env),
                "=",
                toStringR(hash, env) + "." + toStringR(this.secondLocalKey, env));
        if (ZVal.isTrue(this.throughParentSoftDeletes(env))) {
            env.callMethod(
                    query,
                    "whereNull",
                    HasManyThrough.class,
                    env.callMethod(
                            this.throughParent,
                            "getQualifiedDeletedAtColumn",
                            HasManyThrough.class));
        }

        env.callMethod(
                env.callMethod(query, "getModel", HasManyThrough.class),
                "setTable",
                HasManyThrough.class,
                hash);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(query, "select", HasManyThrough.class, columns),
                        "whereColumn",
                        HasManyThrough.class,
                        toStringR(
                                        toObjectR(
                                                        env.callMethod(
                                                                parentQuery,
                                                                "getQuery",
                                                                HasManyThrough.class))
                                                .accessProp(this, env)
                                                .name("from")
                                                .value(),
                                        env)
                                + "."
                                + toStringR(
                                        env.callMethod(
                                                env.callMethod(
                                                        query, "getModel", HasManyThrough.class),
                                                "getKeyName",
                                                HasManyThrough.class),
                                        env),
                        "=",
                        this.getQualifiedFirstKeyName(env)));
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
                                                        .HasManyThrough
                                                        .RequestStaticProperties
                                                        .class,
                                                "selfJoinCount")),
                                env));
    }

    @ConvertedMethod
    public Object getQualifiedFarKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getQualifiedForeignKeyName(env));
    }

    @ConvertedMethod
    public Object getQualifiedFirstKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.throughParent, "qualifyColumn", HasManyThrough.class, this.firstKey));
    }

    @ConvertedMethod
    public Object getQualifiedForeignKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("related").value(),
                        "qualifyColumn",
                        HasManyThrough.class,
                        this.secondKey));
    }

    @ConvertedMethod
    public Object getQualifiedLocalKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.farParent, "qualifyColumn", HasManyThrough.class, this.localKey));
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Eloquent\\Relations\\HasManyThrough";

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
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\HasManyThrough")
                    .setLookup(
                            HasManyThrough.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "farParent",
                            "firstKey",
                            "localKey",
                            "parent",
                            "query",
                            "related",
                            "secondKey",
                            "secondLocalKey",
                            "throughParent")
                    .setStaticPropertyNames("selfJoinCount")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasManyThrough.php")
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
}
