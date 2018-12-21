package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Pivot.php

*/

public class Pivot extends Model {

    public Object pivotParent = null;

    public Object foreignKey = null;

    public Object relatedKey = null;

    public Pivot(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.guarded = ZVal.newArray();
        if (this.getClass() == Pivot.class) {
            this.__construct(env, args);
        }
    }

    public Pivot(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object setKeysForSaveQuery(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "attributes", env),
                env,
                env.callMethod(this, "getKeyName", Pivot.class))) {
            return ZVal.assign(super.setKeysForSaveQuery(env, query));
        }

        env.callMethod(
                query,
                "where",
                Pivot.class,
                this.foreignKey,
                env.callMethod(
                        this,
                        "getOriginal",
                        Pivot.class,
                        this.foreignKey,
                        env.callMethod(this, "getAttribute", Pivot.class, this.foreignKey)));
        return ZVal.assign(
                env.callMethod(
                        query,
                        "where",
                        Pivot.class,
                        this.relatedKey,
                        env.callMethod(
                                this,
                                "getOriginal",
                                Pivot.class,
                                this.relatedKey,
                                env.callMethod(
                                        this, "getAttribute", Pivot.class, this.relatedKey))));
    }

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args) {
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "attributes", env),
                env,
                env.callMethod(this, "getKeyName", Pivot.class))) {
            return ZVal.assign(super.delete(env));
        }

        return ZVal.assign(env.callMethod(this.getDeleteQuery(env), "delete", Pivot.class));
    }

    @ConvertedMethod
    protected Object getDeleteQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "newQuery", Pivot.class),
                        "where",
                        Pivot.class,
                        ZVal.newArray(
                                new ZPair(
                                        this.foreignKey,
                                        env.callMethod(
                                                this,
                                                "getOriginal",
                                                Pivot.class,
                                                this.foreignKey,
                                                env.callMethod(
                                                        this,
                                                        "getAttribute",
                                                        Pivot.class,
                                                        this.foreignKey))),
                                new ZPair(
                                        this.relatedKey,
                                        env.callMethod(
                                                this,
                                                "getOriginal",
                                                Pivot.class,
                                                this.relatedKey,
                                                env.callMethod(
                                                        this,
                                                        "getAttribute",
                                                        Pivot.class,
                                                        this.relatedKey))))));
    }

    @ConvertedMethod
    public Object getTable(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(toObjectR(this).accessProp(this, env).name("table").value())) {
            env.callMethod(
                    this,
                    "setTable",
                    Pivot.class,
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    "\\",
                                    "",
                                    Str.runtimeStaticObject.snake(
                                            env,
                                            Str.runtimeStaticObject.singular(
                                                    env,
                                                    class_basename.f.env(env).call(this).value())))
                            .value());
        }

        return ZVal.assign(toObjectR(this).accessProp(this, env).name("table").value());
    }

    @ConvertedMethod
    public Object getForeignKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.foreignKey);
    }

    @ConvertedMethod
    public Object getRelatedKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.relatedKey);
    }

    @ConvertedMethod
    public Object getOtherKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getRelatedKey(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "foreignKey")
    @ConvertedParameter(index = 1, name = "relatedKey")
    public Object setPivotKeys(RuntimeEnv env, Object... args) {
        Object foreignKey = assignParameter(args, 0, false);
        Object relatedKey = assignParameter(args, 1, false);
        this.foreignKey = foreignKey;
        this.relatedKey = relatedKey;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object hasTimestampAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                this.getCreatedAtColumn(env),
                                toObjectR(this).accessProp(this, env).name("attributes").value())
                        .value());
    }

    @ConvertedMethod
    public Object getCreatedAtColumn(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.pivotParent)
                        ? env.callMethod(this.pivotParent, "getCreatedAtColumn", Pivot.class)
                        : super.getCreatedAtColumn(env));
    }

    @ConvertedMethod
    public Object getUpdatedAtColumn(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(this.pivotParent)
                        ? env.callMethod(this.pivotParent, "getUpdatedAtColumn", Pivot.class)
                        : super.getUpdatedAtColumn(env));
    }

    @ConvertedMethod
    public Object getQueueableId(RuntimeEnv env, Object... args) {
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "attributes", env),
                env,
                env.callMethod(this, "getKeyName", Pivot.class))) {
            return ZVal.assign(env.callMethod(this, "getKey", Pivot.class));
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s:%s:%s:%s",
                                this.foreignKey,
                                env.callMethod(this, "getAttribute", Pivot.class, this.foreignKey),
                                this.relatedKey,
                                env.callMethod(this, "getAttribute", Pivot.class, this.relatedKey))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids")
    public Object newQueryForRestoration(RuntimeEnv env, Object... args) {
        Object ids = assignParameter(args, 0, false);
        ReferenceContainer segments = new BasicReferenceContainer(null);
        if (function_is_array.f.env(env).call(ids).getBool()) {
            return ZVal.assign(this.newQueryForCollectionRestoration(env, ids));
        }

        if (!ZVal.isTrue(Str.runtimeStaticObject.contains(env, ids, ":"))) {
            return ZVal.assign(super.newQueryForRestoration(env, ids));
        }

        segments.setObject(function_explode.f.env(env).call(":", ids).value());
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "newQueryWithoutScopes", Pivot.class),
                                "where",
                                Pivot.class,
                                segments.arrayGet(env, 0),
                                segments.arrayGet(env, 1)),
                        "where",
                        Pivot.class,
                        segments.arrayGet(env, 2),
                        segments.arrayGet(env, 3)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids", typeHint = "array")
    protected Object newQueryForCollectionRestoration(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Pivot.php");
        ReferenceContainer ids = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object query = null;
        Object id = null;
        Object segments = null;
        if (!ZVal.isTrue(Str.runtimeStaticObject.contains(env, ids.arrayGet(env, 0), ":"))) {
            return ZVal.assign(super.newQueryForRestoration(env, ids.getObject()));
        }

        query = env.callMethod(this, "newQueryWithoutScopes", Pivot.class);
        for (ZPair zpairResult333 : ZVal.getIterable(ids.getObject(), env, true)) {
            id = ZVal.assign(zpairResult333.getValue());
            segments = function_explode.f.env(env).call(":", id).value();
            env.callMethod(
                    query,
                    "orWhere",
                    Pivot.class,
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Illuminate\\Database\\Eloquent\\Relations",
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
                            ReferenceContainer segments = new BasicReferenceContainer(null);
                            segments = this.contextReferences.getReferenceContainer("segments");
                            return ZVal.assign(
                                    env.callMethod(
                                            env.callMethod(
                                                    query,
                                                    "where",
                                                    Pivot.class,
                                                    segments.arrayGet(env, 0),
                                                    segments.arrayGet(env, 1)),
                                            "where",
                                            Pivot.class,
                                            segments.arrayGet(env, 2),
                                            segments.arrayGet(env, 3)));
                        }
                    }.use("segments", segments));
        }

        return ZVal.assign(query);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Relations\\Pivot";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Model.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "parent",
            typeHint = "Illuminate\\Database\\Eloquent\\Model"
        )
        @ConvertedParameter(index = 1, name = "attributes")
        @ConvertedParameter(index = 2, name = "table")
        @ConvertedParameter(
            index = 3,
            name = "exists",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object fromAttributes(RuntimeEnv env, Object... args) {
            Object parent = assignParameter(args, 0, false);
            Object attributes = assignParameter(args, 1, false);
            Object table = assignParameter(args, 2, false);
            Object exists = assignParameter(args, 3, true);
            if (null == exists) {
                exists = false;
            }
            Object instance = null;
            instance = env.createNewWithLateStaticBindings(this);
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(
                                            instance,
                                            "setConnection",
                                            Pivot.class,
                                            env.callMethod(
                                                    parent, "getConnectionName", Pivot.class)),
                                    "setTable",
                                    Pivot.class,
                                    table),
                            "forceFill",
                            Pivot.class,
                            attributes),
                    "syncOriginal",
                    Pivot.class);
            toObjectR(instance).accessProp(this, env).name("pivotParent").set(parent);
            toObjectR(instance).accessProp(this, env).name("exists").set(exists);
            toObjectR(instance)
                    .accessProp(this, env)
                    .name("timestamps")
                    .set(env.callMethod(instance, "hasTimestampAttributes", Pivot.class));
            return ZVal.assign(instance);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "parent",
            typeHint = "Illuminate\\Database\\Eloquent\\Model"
        )
        @ConvertedParameter(index = 1, name = "attributes")
        @ConvertedParameter(index = 2, name = "table")
        @ConvertedParameter(
            index = 3,
            name = "exists",
            defaultValue = "false",
            defaultValueType = "constant"
        )
        public Object fromRawAttributes(RuntimeEnv env, Object... args) {
            Object parent = assignParameter(args, 0, false);
            Object attributes = assignParameter(args, 1, false);
            Object table = assignParameter(args, 2, false);
            Object exists = assignParameter(args, 3, true);
            if (null == exists) {
                exists = false;
            }
            Object instance = null;
            instance =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Pivot.class)
                            .method("fromAttributes")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(parent, ZVal.newArray(), table, exists)
                            .value();
            env.callMethod(instance, "setRawAttributes", Pivot.class, attributes, true);
            toObjectR(instance)
                    .accessProp(this, env)
                    .name("timestamps")
                    .set(env.callMethod(instance, "hasTimestampAttributes", Pivot.class));
            return ZVal.assign(instance);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\Pivot")
                    .setLookup(
                            Pivot.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "appends",
                            "attributes",
                            "casts",
                            "changes",
                            "connection",
                            "dateFormat",
                            "dates",
                            "dispatchesEvents",
                            "exists",
                            "fillable",
                            "foreignKey",
                            "guarded",
                            "guarded",
                            "hidden",
                            "incrementing",
                            "keyType",
                            "observables",
                            "original",
                            "perPage",
                            "pivotParent",
                            "primaryKey",
                            "relatedKey",
                            "relations",
                            "table",
                            "timestamps",
                            "touches",
                            "visible",
                            "wasRecentlyCreated",
                            "with",
                            "withCount")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/Pivot.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Queue\\QueueableEntity")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlRoutable")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Model")
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
