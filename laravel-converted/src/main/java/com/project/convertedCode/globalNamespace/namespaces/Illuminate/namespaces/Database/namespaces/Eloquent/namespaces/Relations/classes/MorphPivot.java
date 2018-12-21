package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Pivot;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphPivot.php

*/

public class MorphPivot extends Pivot {

    public Object morphType = null;

    public Object morphClass = null;

    public MorphPivot(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MorphPivot.class) {
            this.__construct(env, args);
        }
    }

    public MorphPivot(NoConstructor n) {
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
        env.callMethod(query, "where", MorphPivot.class, this.morphType, this.morphClass);
        return ZVal.assign(super.setKeysForSaveQuery(env, query));
    }

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args) {
        Object query = null;
        query = env.callMethod(this, "getDeleteQuery", MorphPivot.class);
        env.callMethod(query, "where", MorphPivot.class, this.morphType, this.morphClass);
        return ZVal.assign(env.callMethod(query, "delete", MorphPivot.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "morphType")
    public Object setMorphType(RuntimeEnv env, Object... args) {
        Object morphType = assignParameter(args, 0, false);
        this.morphType = morphType;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "morphClass")
    public Object setMorphClass(RuntimeEnv env, Object... args) {
        Object morphClass = assignParameter(args, 0, false);
        this.morphClass = morphClass;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getQueueableId(RuntimeEnv env, Object... args) {
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "attributes", env),
                env,
                env.callMethod(this, "getKeyName", MorphPivot.class))) {
            return ZVal.assign(env.callMethod(this, "getKey", MorphPivot.class));
        }

        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "%s:%s:%s:%s:%s:%s",
                                toObjectR(this).accessProp(this, env).name("foreignKey").value(),
                                env.callMethod(
                                        this,
                                        "getAttribute",
                                        MorphPivot.class,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("foreignKey")
                                                .value()),
                                toObjectR(this).accessProp(this, env).name("relatedKey").value(),
                                env.callMethod(
                                        this,
                                        "getAttribute",
                                        MorphPivot.class,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("relatedKey")
                                                .value()),
                                this.morphType,
                                this.morphClass)
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
                                env.callMethod(
                                        env.callMethod(
                                                this, "newQueryWithoutScopes", MorphPivot.class),
                                        "where",
                                        MorphPivot.class,
                                        segments.arrayGet(env, 0),
                                        segments.arrayGet(env, 1)),
                                "where",
                                MorphPivot.class,
                                segments.arrayGet(env, 2),
                                segments.arrayGet(env, 3)),
                        "where",
                        MorphPivot.class,
                        segments.arrayGet(env, 4),
                        segments.arrayGet(env, 5)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids", typeHint = "array")
    protected Object newQueryForCollectionRestoration(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphPivot.php");
        ReferenceContainer ids = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object query = null;
        Object id = null;
        Object segments = null;
        if (!ZVal.isTrue(Str.runtimeStaticObject.contains(env, ids.arrayGet(env, 0), ":"))) {
            return ZVal.assign(super.newQueryForRestoration(env, ids.getObject()));
        }

        query = env.callMethod(this, "newQueryWithoutScopes", MorphPivot.class);
        for (ZPair zpairResult327 : ZVal.getIterable(ids.getObject(), env, true)) {
            id = ZVal.assign(zpairResult327.getValue());
            segments = function_explode.f.env(env).call(":", id).value();
            env.callMethod(
                    query,
                    "orWhere",
                    MorphPivot.class,
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
                                                    env.callMethod(
                                                            query,
                                                            "where",
                                                            MorphPivot.class,
                                                            segments.arrayGet(env, 0),
                                                            segments.arrayGet(env, 1)),
                                                    "where",
                                                    MorphPivot.class,
                                                    segments.arrayGet(env, 2),
                                                    segments.arrayGet(env, 3)),
                                            "where",
                                            MorphPivot.class,
                                            segments.arrayGet(env, 4),
                                            segments.arrayGet(env, 5)));
                        }
                    }.use("segments", segments));
        }

        return ZVal.assign(query);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Eloquent\\Relations\\MorphPivot";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Pivot.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\MorphPivot")
                    .setLookup(
                            MorphPivot.class,
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
                            "morphClass",
                            "morphType",
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
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphPivot.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Queue\\QueueableEntity")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlRoutable")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Relations\\Pivot")
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
