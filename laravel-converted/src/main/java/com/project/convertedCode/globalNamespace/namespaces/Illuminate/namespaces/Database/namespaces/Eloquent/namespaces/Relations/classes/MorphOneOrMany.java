package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.HasOneOrMany;
import com.project.convertedCode.globalNamespace.functions.last;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Relation;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphOneOrMany.php

*/

public abstract class MorphOneOrMany extends HasOneOrMany {

    public Object morphType = null;

    public Object morphClass = null;

    public MorphOneOrMany(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MorphOneOrMany.class) {
            this.__construct(env, args);
        }
    }

    public MorphOneOrMany(NoConstructor n) {
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
    @ConvertedParameter(index = 2, name = "type")
    @ConvertedParameter(index = 3, name = "id")
    @ConvertedParameter(index = 4, name = "localKey")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object id = assignParameter(args, 3, false);
        Object localKey = assignParameter(args, 4, false);
        this.morphType = type;
        this.morphClass = env.callMethod(parent, "getMorphClass", MorphOneOrMany.class);
        super.__construct(env, query, parent, id, localKey);
        return null;
    }

    @ConvertedMethod
    public Object addConstraints(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                env.getRequestStaticProperties(Relation.RequestStaticProperties.class)
                        .constraints)) {
            super.addConstraints(env);
            env.callMethod(
                    toObjectR(this).accessProp(this, env).name("query").value(),
                    "where",
                    MorphOneOrMany.class,
                    this.morphType,
                    this.morphClass);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    public Object addEagerConstraints(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        super.addEagerConstraints(env, models);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("query").value(),
                "where",
                MorphOneOrMany.class,
                this.morphType,
                this.morphClass);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "model",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    public Object save(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        env.callMethod(
                model,
                "setAttribute",
                MorphOneOrMany.class,
                this.getMorphType(env),
                this.morphClass);
        return ZVal.assign(super.save(env, model));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "model",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    protected Object setForeignAttributesForCreate(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        toObjectR(model)
                .accessProp(this, env)
                .name(env.callMethod(this, "getForeignKeyName", MorphOneOrMany.class))
                .set(env.callMethod(this, "getParentKey", MorphOneOrMany.class));
        toObjectR(model).accessProp(this, env).name(this.getMorphType(env)).set(this.morphClass);
        return null;
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
                        MorphOneOrMany.class,
                        this.morphType,
                        this.morphClass));
    }

    @ConvertedMethod
    public Object getQualifiedMorphType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.morphType);
    }

    @ConvertedMethod
    public Object getMorphType(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                last.f
                        .env(env)
                        .call(function_explode.f.env(env).call(".", this.morphType).value())
                        .value());
    }

    @ConvertedMethod
    public Object getMorphClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.morphClass);
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Eloquent\\Relations\\MorphOneOrMany";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends HasOneOrMany.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\MorphOneOrMany")
                    .setLookup(
                            MorphOneOrMany.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "foreignKey",
                            "localKey",
                            "morphClass",
                            "morphType",
                            "parent",
                            "query",
                            "related")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphOneOrMany.php")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Relations\\HasOneOrMany")
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
