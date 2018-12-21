package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.MorphPivot;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.BelongsToMany;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphToMany.php

*/

public class MorphToMany extends BelongsToMany {

    public Object morphType = null;

    public Object morphClass = null;

    public Object inverse = null;

    public MorphToMany(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MorphToMany.class) {
            this.__construct(env, args);
        }
    }

    public MorphToMany(NoConstructor n) {
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
    @ConvertedParameter(index = 2, name = "name")
    @ConvertedParameter(index = 3, name = "table")
    @ConvertedParameter(index = 4, name = "foreignPivotKey")
    @ConvertedParameter(index = 5, name = "relatedPivotKey")
    @ConvertedParameter(index = 6, name = "parentKey")
    @ConvertedParameter(index = 7, name = "relatedKey")
    @ConvertedParameter(
        index = 8,
        name = "relationName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 9,
        name = "inverse",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object name = assignParameter(args, 2, false);
        Object table = assignParameter(args, 3, false);
        Object foreignPivotKey = assignParameter(args, 4, false);
        Object relatedPivotKey = assignParameter(args, 5, false);
        Object parentKey = assignParameter(args, 6, false);
        Object relatedKey = assignParameter(args, 7, false);
        Object relationName = assignParameter(args, 8, true);
        if (null == relationName) {
            relationName = ZVal.getNull();
        }
        Object inverse = assignParameter(args, 9, true);
        if (null == inverse) {
            inverse = false;
        }
        this.inverse = inverse;
        this.morphType = toStringR(name, env) + "_type";
        this.morphClass =
                ZVal.isTrue(inverse)
                        ? env.callMethod(
                                env.callMethod(query, "getModel", MorphToMany.class),
                                "getMorphClass",
                                MorphToMany.class)
                        : env.callMethod(parent, "getMorphClass", MorphToMany.class);
        super.__construct(
                env,
                query,
                parent,
                table,
                foreignPivotKey,
                relatedPivotKey,
                parentKey,
                relatedKey,
                relationName);
        return null;
    }

    @ConvertedMethod
    protected Object addWhereConstraints(RuntimeEnv env, Object... args) {
        super.addWhereConstraints(env);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "where",
                MorphToMany.class,
                toStringR(toObjectR(this).accessProp(this, env).name("table").value(), env)
                        + "."
                        + toStringR(this.morphType, env),
                this.morphClass);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    public Object addEagerConstraints(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        super.addEagerConstraints(env, models);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "where",
                MorphToMany.class,
                toStringR(toObjectR(this).accessProp(this, env).name("table").value(), env)
                        + "."
                        + toStringR(this.morphType, env),
                this.morphClass);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    @ConvertedParameter(index = 1, name = "timed")
    protected Object baseAttachRecord(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        Object timed = assignParameter(args, 1, false);
        return ZVal.assign(
                Arr.runtimeStaticObject.add(
                        env,
                        super.baseAttachRecord(env, id, timed),
                        this.morphType,
                        this.morphClass));
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
        return ZVal.assign(
                env.callMethod(
                        super.getRelationExistenceQuery(env, query, parentQuery, columns),
                        "where",
                        MorphToMany.class,
                        toStringR(toObjectR(this).accessProp(this, env).name("table").value(), env)
                                + "."
                                + toStringR(this.morphType, env),
                        this.morphClass));
    }

    @ConvertedMethod
    protected Object newPivotQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        super.newPivotQuery(env),
                        "where",
                        MorphToMany.class,
                        this.morphType,
                        this.morphClass));
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
        ReferenceContainer attributes = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == attributes.getObject()) {
            attributes.setObject(ZVal.newArray());
        }
        ReferenceContainer exists = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == exists.getObject()) {
            exists.setObject(false);
        }
        Object using = null;
        Object pivot = null;
        using = ZVal.assign(toObjectR(this).accessProp(this, env).name("using").value());
        pivot =
                ZVal.assign(
                        ZVal.isTrue(using)
                                ? StaticMethodUtils.getStaticBaseClass(using, env)
                                        .callUnknownStaticMethod(
                                                env,
                                                "fromRawAttributes",
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                new ReferenceClassProperty(
                                                                        this, "parent", env))
                                                        .add(1, attributes)
                                                        .add(
                                                                2,
                                                                new ReferenceClassProperty(
                                                                        this, "table", env))
                                                        .add(3, exists),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("parent")
                                                        .value(),
                                                attributes.getObject(),
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("table")
                                                        .value(),
                                                exists.getObject())
                                : MorphPivot.runtimeStaticObject.fromAttributes(
                                        env,
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("parent")
                                                .value(),
                                        attributes.getObject(),
                                        toObjectR(this).accessProp(this, env).name("table").value(),
                                        exists.getObject()));
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                pivot,
                                "setPivotKeys",
                                MorphToMany.class,
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("foreignPivotKey")
                                        .value(),
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("relatedPivotKey")
                                        .value()),
                        "setMorphType",
                        MorphToMany.class,
                        this.morphType),
                "setMorphClass",
                MorphToMany.class,
                this.morphClass);
        return ZVal.assign(pivot);
    }

    @ConvertedMethod
    protected Object aliasedPivotColumns(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphToMany.php");
        Object defaults = null;
        defaults =
                ZVal.newArray(
                        new ZPair(
                                0,
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("foreignPivotKey")
                                        .value()),
                        new ZPair(
                                1,
                                toObjectR(this)
                                        .accessProp(this, env)
                                        .name("relatedPivotKey")
                                        .value()),
                        new ZPair(2, this.morphType));
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
                                                                .call(
                                                                        defaults,
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name(
                                                                                        "pivotColumns")
                                                                                .value())
                                                                .value())
                                                .value(),
                                        "map",
                                        MorphToMany.class,
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
                                                        toStringR(
                                                                        toObjectR(_closureThisVar)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("table")
                                                                                .value(),
                                                                        env)
                                                                + "."
                                                                + toStringR(column, env)
                                                                + " as pivot_"
                                                                + toStringR(column, env));
                                            }
                                        }),
                                "unique",
                                MorphToMany.class),
                        "all",
                        MorphToMany.class));
    }

    @ConvertedMethod
    public Object getMorphType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.morphType);
    }

    @ConvertedMethod
    public Object getMorphClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.morphClass);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Eloquent\\Relations\\MorphToMany";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BelongsToMany.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\MorphToMany")
                    .setLookup(
                            MorphToMany.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "accessor",
                            "foreignPivotKey",
                            "inverse",
                            "morphClass",
                            "morphType",
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
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphToMany.php")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Relations\\BelongsToMany")
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
