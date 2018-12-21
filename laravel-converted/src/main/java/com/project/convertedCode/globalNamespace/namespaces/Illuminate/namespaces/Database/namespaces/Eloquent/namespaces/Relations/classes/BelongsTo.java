package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Relation;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/BelongsTo.php

*/

public class BelongsTo extends Relation {

    public Object child = null;

    public Object foreignKey = null;

    public Object ownerKey = null;

    public Object relation = null;

    public Object withDefault = null;

    public BelongsTo(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BelongsTo.class) {
            this.__construct(env, args);
        }
    }

    public BelongsTo(NoConstructor n) {
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
        name = "child",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    @ConvertedParameter(index = 2, name = "foreignKey")
    @ConvertedParameter(index = 3, name = "ownerKey")
    @ConvertedParameter(index = 4, name = "relation")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object child = assignParameter(args, 1, false);
        Object foreignKey = assignParameter(args, 2, false);
        Object ownerKey = assignParameter(args, 3, false);
        Object relation = assignParameter(args, 4, false);
        this.ownerKey = ownerKey;
        this.relation = relation;
        this.foreignKey = foreignKey;
        this.child = child;
        super.__construct(env, query, child);
        return null;
    }

    @ConvertedMethod
    public Object getResults(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("query")
                                                        .value(),
                                                "first",
                                                BelongsTo.class))
                        ? ternaryExpressionTemp
                        : this.getDefaultFor(
                                env, toObjectR(this).accessProp(this, env).name("parent").value()));
    }

    @ConvertedMethod
    public Object addConstraints(RuntimeEnv env, Object... args) {
        Object table = null;
        if (ZVal.isTrue(
                env.getRequestStaticProperties(Relation.RequestStaticProperties.class)
                        .constraints)) {
            table =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("related").value(),
                            "getTable",
                            BelongsTo.class);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("query").value(),
                    "where",
                    BelongsTo.class,
                    toStringR(table, env) + "." + toStringR(this.ownerKey, env),
                    "=",
                    toObjectR(this.child).accessProp(this, env).name(this.foreignKey).value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    public Object addEagerConstraints(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object key = null;
        key =
                toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("related")
                                                .value(),
                                        "getTable",
                                        BelongsTo.class),
                                env)
                        + "."
                        + toStringR(this.ownerKey, env);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "whereIn",
                BelongsTo.class,
                key,
                this.getEagerModelKeys(env, models));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    protected Object getEagerModelKeys(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        ReferenceContainer keys = new BasicReferenceContainer(null);
        Object model = null;
        Object value = null;
        keys.setObject(ZVal.newArray());
        for (ZPair zpairResult299 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult299.getValue());
            if (!function_is_null
                    .f
                    .env(env)
                    .call(
                            value =
                                    ZVal.assign(
                                            toObjectR(model)
                                                    .accessProp(this, env)
                                                    .name(this.foreignKey)
                                                    .value()))
                    .getBool()) {
                keys.arrayAppend(env).set(value);
            }
        }

        if (ZVal.strictEqualityCheck(
                function_count.f.env(env).call(keys.getObject()).value(), "===", 0)) {
            return ZVal.assign(ZVal.newArray(new ZPair(0, ZVal.getNull())));
        }

        function_sort.f.env(env).call(keys.getObject());
        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(function_array_unique.f.env(env).call(keys.getObject()).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(index = 1, name = "relation")
    public Object initRelation(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object relation = assignParameter(args, 1, false);
        Object model = null;
        for (ZPair zpairResult300 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult300.getValue());
            env.callMethod(
                    model,
                    "setRelation",
                    BelongsTo.class,
                    relation,
                    this.getDefaultFor(env, model));
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
        Object owner = null;
        Object result = null;
        ReferenceContainer dictionary = new BasicReferenceContainer(null);
        Object model = null;
        Object foreign = null;
        foreign = ZVal.assign(this.foreignKey);
        owner = ZVal.assign(this.ownerKey);
        dictionary.setObject(ZVal.newArray());
        for (ZPair zpairResult301 : ZVal.getIterable(results, env, true)) {
            result = ZVal.assign(zpairResult301.getValue());
            dictionary
                    .arrayAccess(
                            env, env.callMethod(result, "getAttribute", BelongsTo.class, owner))
                    .set(result);
        }

        for (ZPair zpairResult302 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult302.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    dictionary,
                    env,
                    toObjectR(model).accessProp(this, env).name(foreign).value())) {
                env.callMethod(
                        model,
                        "setRelation",
                        BelongsTo.class,
                        relation,
                        dictionary.arrayGet(
                                env, toObjectR(model).accessProp(this, env).name(foreign).value()));
            }
        }

        return ZVal.assign(models);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object update(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.getResults(env), "fill", BelongsTo.class, attributes),
                        "save",
                        BelongsTo.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object associate(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        Object ownerKey = null;
        ownerKey =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                model,
                                                Model.class,
                                                "Illuminate\\Database\\Eloquent\\Model"))
                                ? env.callMethod(
                                        model, "getAttribute", BelongsTo.class, this.ownerKey)
                                : model);
        env.callMethod(this.child, "setAttribute", BelongsTo.class, this.foreignKey, ownerKey);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        model, Model.class, "Illuminate\\Database\\Eloquent\\Model"))) {
            env.callMethod(this.child, "setRelation", BelongsTo.class, this.relation, model);
        }

        return ZVal.assign(this.child);
    }

    @ConvertedMethod
    public Object dissociate(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.child, "setAttribute", BelongsTo.class, this.foreignKey, ZVal.getNull());
        return ZVal.assign(
                env.callMethod(
                        this.child, "setRelation", BelongsTo.class, this.relation, ZVal.getNull()));
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
                toObjectR(env.callMethod(parentQuery, "getQuery", BelongsTo.class))
                        .accessProp(this, env)
                        .name("from")
                        .value(),
                toObjectR(env.callMethod(query, "getQuery", BelongsTo.class))
                        .accessProp(this, env)
                        .name("from")
                        .value())) {
            return ZVal.assign(
                    this.getRelationExistenceQueryForSelfRelation(
                            env, query, parentQuery, columns));
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(query, "select", BelongsTo.class, columns),
                        "whereColumn",
                        BelongsTo.class,
                        this.getQualifiedForeignKey(env),
                        "=",
                        env.callMethod(query, "qualifyColumn", BelongsTo.class, this.ownerKey)));
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
                env.callMethod(query, "select", BelongsTo.class, columns),
                "from",
                BelongsTo.class,
                toStringR(
                                env.callMethod(
                                        env.callMethod(query, "getModel", BelongsTo.class),
                                        "getTable",
                                        BelongsTo.class),
                                env)
                        + " as "
                        + toStringR(hash = this.getRelationCountHash(env), env));
        env.callMethod(
                env.callMethod(query, "getModel", BelongsTo.class),
                "setTable",
                BelongsTo.class,
                hash);
        return ZVal.assign(
                env.callMethod(
                        query,
                        "whereColumn",
                        BelongsTo.class,
                        toStringR(hash, env)
                                + "."
                                + toStringR(
                                        env.callMethod(
                                                env.callMethod(query, "getModel", BelongsTo.class),
                                                "getKeyName",
                                                BelongsTo.class),
                                        env),
                        "=",
                        this.getQualifiedForeignKey(env)));
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
                                                        .BelongsTo
                                                        .RequestStaticProperties
                                                        .class,
                                                "selfJoinCount")),
                                env));
    }

    @ConvertedMethod
    protected Object relationHasIncrementingId(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("related")
                                                .value(),
                                        "getIncrementing",
                                        BelongsTo.class))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        env.callMethod(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("related")
                                                        .value(),
                                                "getKeyType",
                                                BelongsTo.class),
                                        "===",
                                        "int")));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parent",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    protected Object newRelatedInstanceFor(RuntimeEnv env, Object... args) {
        Object parent = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("related").value(),
                        "newInstance",
                        BelongsTo.class));
    }

    @ConvertedMethod
    public Object getForeignKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.foreignKey);
    }

    @ConvertedMethod
    public Object getQualifiedForeignKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.child, "qualifyColumn", BelongsTo.class, this.foreignKey));
    }

    @ConvertedMethod
    public Object getOwnerKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.ownerKey);
    }

    @ConvertedMethod
    public Object getQualifiedOwnerKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("related").value(),
                        "qualifyColumn",
                        BelongsTo.class,
                        this.ownerKey));
    }

    @ConvertedMethod
    public Object getRelation(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.relation);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "callback",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object withDefault(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, true);
        if (null == callback) {
            callback = true;
        }
        this.withDefault = callback;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parent",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    protected Object getDefaultFor(RuntimeEnv env, Object... args) {
        Object parent = assignParameter(args, 0, false);
        Object instance = null;
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(this.withDefault)) {
            return null;
        }

        instance = this.newRelatedInstanceFor(env, parent);
        if (function_is_callable.f.env(env).call(this.withDefault).getBool()) {
            return ZVal.assign(
                    ZVal.isTrue(
                                    ternaryExpressionTemp =
                                            function_call_user_func
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call(this.withDefault, instance, parent)
                                                    .value())
                            ? ternaryExpressionTemp
                            : instance);
        }

        if (function_is_array.f.env(env).call(this.withDefault).getBool()) {
            env.callMethod(instance, "forceFill", BelongsTo.class, this.withDefault);
        }

        return ZVal.assign(instance);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Relations\\BelongsTo";

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
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\BelongsTo")
                    .setLookup(
                            BelongsTo.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "child",
                            "foreignKey",
                            "ownerKey",
                            "parent",
                            "query",
                            "related",
                            "relation",
                            "withDefault")
                    .setStaticPropertyNames("selfJoinCount")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/BelongsTo.php")
                    .addTrait(
                            "Illuminate\\Database\\Eloquent\\Relations\\Concerns\\SupportsDefaultModels")
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
