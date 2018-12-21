package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Relation;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasOneOrMany.php

*/

public abstract class HasOneOrMany extends Relation {

    public Object foreignKey = null;

    public Object localKey = null;

    public HasOneOrMany(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HasOneOrMany.class) {
            this.__construct(env, args);
        }
    }

    public HasOneOrMany(NoConstructor n) {
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
    @ConvertedParameter(index = 2, name = "foreignKey")
    @ConvertedParameter(index = 3, name = "localKey")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object foreignKey = assignParameter(args, 2, false);
        Object localKey = assignParameter(args, 3, false);
        this.localKey = localKey;
        this.foreignKey = foreignKey;
        super.__construct(env, query, parent);
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
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasOneOrMany.php");
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("related")
                                                .value(),
                                        "newInstance",
                                        HasOneOrMany.class,
                                        attributes),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent\\Relations",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "instance")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object instance = assignParameter(args, 0, false);
                                        HasOneOrMany.this.setForeignAttributesForCreate(
                                                env, instance);
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    public Object addConstraints(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                env.getRequestStaticProperties(Relation.RequestStaticProperties.class)
                        .constraints)) {
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("query").value(),
                    "where",
                    HasOneOrMany.class,
                    this.foreignKey,
                    "=",
                    this.getParentKey(env));
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("query").value(),
                    "whereNotNull",
                    HasOneOrMany.class,
                    this.foreignKey);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    public Object addEagerConstraints(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "whereIn",
                HasOneOrMany.class,
                this.foreignKey,
                env.callMethod(this, "getKeys", HasOneOrMany.class, models, this.localKey));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "results",
        typeHint = "Illuminate\\Database\\Eloquent\\Collection"
    )
    @ConvertedParameter(index = 2, name = "relation")
    public Object matchOne(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object results = assignParameter(args, 1, false);
        Object relation = assignParameter(args, 2, false);
        return ZVal.assign(this.matchOneOrMany(env, models, results, relation, "one"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "results",
        typeHint = "Illuminate\\Database\\Eloquent\\Collection"
    )
    @ConvertedParameter(index = 2, name = "relation")
    public Object matchMany(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object results = assignParameter(args, 1, false);
        Object relation = assignParameter(args, 2, false);
        return ZVal.assign(this.matchOneOrMany(env, models, results, relation, "many"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "results",
        typeHint = "Illuminate\\Database\\Eloquent\\Collection"
    )
    @ConvertedParameter(index = 2, name = "relation")
    @ConvertedParameter(index = 3, name = "type")
    protected Object matchOneOrMany(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object results = assignParameter(args, 1, false);
        Object relation = assignParameter(args, 2, false);
        Object type = assignParameter(args, 3, false);
        ReferenceContainer dictionary = new BasicReferenceContainer(null);
        Object model = null;
        Object key = null;
        dictionary.setObject(this.buildDictionary(env, results));
        for (ZPair zpairResult322 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult322.getValue());
            if (arrayActionR(
                    ArrayAction.ISSET,
                    dictionary,
                    env,
                    key =
                            env.callMethod(
                                    model, "getAttribute", HasOneOrMany.class, this.localKey))) {
                env.callMethod(
                        model,
                        "setRelation",
                        HasOneOrMany.class,
                        relation,
                        this.getRelationValue(env, dictionary.getObject(), key, type));
            }
        }

        return ZVal.assign(models);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dictionary", typeHint = "array")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "type")
    protected Object getRelationValue(RuntimeEnv env, Object... args) {
        ReferenceContainer dictionary =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object key = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object value = null;
        value = ZVal.assign(dictionary.arrayGet(env, key));
        return ZVal.assign(
                ZVal.equalityCheck(type, "one")
                        ? function_reset.f.env(env).call(value).value()
                        : env.callMethod(
                                toObjectR(this).accessProp(this, env).name("related").value(),
                                "newCollection",
                                HasOneOrMany.class,
                                value));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "results",
        typeHint = "Illuminate\\Database\\Eloquent\\Collection"
    )
    protected Object buildDictionary(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasOneOrMany.php");
        Object results = assignParameter(args, 0, false);
        Object foreign = null;
        foreign = this.getForeignKeyName(env);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                results,
                                "mapToDictionary",
                                HasOneOrMany.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent\\Relations",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "result")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object result = assignParameter(args, 0, false);
                                        Object foreign = null;
                                        foreign =
                                                this.contextReferences.getCapturedValue("foreign");
                                        return ZVal.assign(
                                                ZVal.newArray(
                                                        new ZPair(
                                                                toObjectR(result)
                                                                        .accessProp(this, env)
                                                                        .name(foreign)
                                                                        .value(),
                                                                result)));
                                    }
                                }.use("foreign", foreign)),
                        "all",
                        HasOneOrMany.class));
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
        if (function_is_null
                .f
                .env(env)
                .call(instance = env.callMethod(this, "find", HasOneOrMany.class, id, columns))
                .getBool()) {
            instance =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("related").value(),
                            "newInstance",
                            HasOneOrMany.class);
            this.setForeignAttributesForCreate(env, instance);
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
    public Object firstOrNew(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, true);
        if (null == values) {
            values = ZVal.newArray();
        }
        Object instance = null;
        if (function_is_null
                .f
                .env(env)
                .call(
                        instance =
                                env.callMethod(
                                        env.callMethod(
                                                this, "where", HasOneOrMany.class, attributes),
                                        "first",
                                        HasOneOrMany.class))
                .getBool()) {
            instance =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("related").value(),
                            "newInstance",
                            HasOneOrMany.class,
                            ZVal.add(attributes, values));
            this.setForeignAttributesForCreate(env, instance);
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
    public Object firstOrCreate(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object values = assignParameter(args, 1, true);
        if (null == values) {
            values = ZVal.newArray();
        }
        Object instance = null;
        if (function_is_null
                .f
                .env(env)
                .call(
                        instance =
                                env.callMethod(
                                        env.callMethod(
                                                this, "where", HasOneOrMany.class, attributes),
                                        "first",
                                        HasOneOrMany.class))
                .getBool()) {
            instance = this.create(env, ZVal.add(attributes, values));
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
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasOneOrMany.php");
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
                                        "Illuminate\\Database\\Eloquent\\Relations",
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
                                                instance, "fill", HasOneOrMany.class, values);
                                        env.callMethod(instance, "save", HasOneOrMany.class);
                                        return null;
                                    }
                                }.use("values", values))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "model",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    public Object save(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        this.setForeignAttributesForCreate(env, model);
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(model, "save", HasOneOrMany.class)) ? model : false);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models")
    public Object saveMany(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object model = null;
        for (ZPair zpairResult323 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult323.getValue());
            this.save(env, model);
        }

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
    public Object create(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasOneOrMany.php");
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("related")
                                                .value(),
                                        "newInstance",
                                        HasOneOrMany.class,
                                        attributes),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent\\Relations",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "instance")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object instance = assignParameter(args, 0, false);
                                        HasOneOrMany.this.setForeignAttributesForCreate(
                                                env, instance);
                                        env.callMethod(instance, "save", HasOneOrMany.class);
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "records", typeHint = "array")
    public Object createMany(RuntimeEnv env, Object... args) {
        Object records = assignParameter(args, 0, false);
        Object instances = null;
        Object record = null;
        instances =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("related").value(),
                        "newCollection",
                        HasOneOrMany.class);
        for (ZPair zpairResult324 : ZVal.getIterable(records, env, true)) {
            record = ZVal.assign(zpairResult324.getValue());
            env.callMethod(instances, "push", HasOneOrMany.class, this.create(env, record));
        }

        return ZVal.assign(instances);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "model",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    protected Object setForeignAttributesForCreate(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        env.callMethod(
                model,
                "setAttribute",
                HasOneOrMany.class,
                this.getForeignKeyName(env),
                this.getParentKey(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object update(RuntimeEnv env, Object... args) {
        ReferenceContainer attributes =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        if (ZVal.toBool(
                        env.callMethod(
                                toObjectR(this).accessProp(this, env).name("related").value(),
                                "usesTimestamps",
                                HasOneOrMany.class))
                && ZVal.toBool(
                        !function_is_null
                                .f
                                .env(env)
                                .call(env.callMethod(this, "relatedUpdatedAt", HasOneOrMany.class))
                                .getBool())) {
            attributes
                    .arrayAccess(env, env.callMethod(this, "relatedUpdatedAt", HasOneOrMany.class))
                    .set(
                            env.callMethod(
                                    toObjectR(this).accessProp(this, env).name("related").value(),
                                    "freshTimestampString",
                                    HasOneOrMany.class));
        }

        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("query").value(),
                        "update",
                        HasOneOrMany.class,
                        attributes.getObject()));
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
                toObjectR(env.callMethod(query, "getQuery", HasOneOrMany.class))
                        .accessProp(this, env)
                        .name("from")
                        .value(),
                toObjectR(env.callMethod(parentQuery, "getQuery", HasOneOrMany.class))
                        .accessProp(this, env)
                        .name("from")
                        .value())) {
            return ZVal.assign(
                    this.getRelationExistenceQueryForSelfRelation(
                            env, query, parentQuery, columns));
        }

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
                HasOneOrMany.class,
                toStringR(
                                env.callMethod(
                                        env.callMethod(query, "getModel", HasOneOrMany.class),
                                        "getTable",
                                        HasOneOrMany.class),
                                env)
                        + " as "
                        + toStringR(hash = this.getRelationCountHash(env), env));
        env.callMethod(
                env.callMethod(query, "getModel", HasOneOrMany.class),
                "setTable",
                HasOneOrMany.class,
                hash);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(query, "select", HasOneOrMany.class, columns),
                        "whereColumn",
                        HasOneOrMany.class,
                        this.getQualifiedParentKeyName(env),
                        "=",
                        toStringR(hash, env) + "." + toStringR(this.getForeignKeyName(env), env)));
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
                                                        .HasOneOrMany
                                                        .RequestStaticProperties
                                                        .class,
                                                "selfJoinCount")),
                                env));
    }

    @ConvertedMethod
    public Object getExistenceCompareKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getQualifiedForeignKeyName(env));
    }

    @ConvertedMethod
    public Object getParentKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("parent").value(),
                        "getAttribute",
                        HasOneOrMany.class,
                        this.localKey));
    }

    @ConvertedMethod
    public Object getQualifiedParentKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("parent").value(),
                        "qualifyColumn",
                        HasOneOrMany.class,
                        this.localKey));
    }

    @ConvertedMethod
    public Object getForeignKeyName(RuntimeEnv env, Object... args) {
        Object segments = null;
        segments =
                function_explode.f.env(env).call(".", this.getQualifiedForeignKeyName(env)).value();
        return ZVal.assign(function_end.f.env(env).call(segments).value());
    }

    @ConvertedMethod
    public Object getQualifiedForeignKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.foreignKey);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Eloquent\\Relations\\HasOneOrMany";

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
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\HasOneOrMany")
                    .setLookup(
                            HasOneOrMany.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("foreignKey", "localKey", "parent", "query", "related")
                    .setStaticPropertyNames("selfJoinCount")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasOneOrMany.php")
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
