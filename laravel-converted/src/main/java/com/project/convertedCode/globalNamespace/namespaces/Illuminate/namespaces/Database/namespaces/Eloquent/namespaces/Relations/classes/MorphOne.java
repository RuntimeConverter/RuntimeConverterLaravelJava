package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.MorphOneOrMany;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphOne.php

*/

public class MorphOne extends MorphOneOrMany {

    public Object withDefault = null;

    public MorphOne(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MorphOne.class) {
            this.__construct(env, args);
        }
    }

    public MorphOne(NoConstructor n) {
        super(n);
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
                                                MorphOne.class))
                        ? ternaryExpressionTemp
                        : this.getDefaultFor(
                                env, toObjectR(this).accessProp(this, env).name("parent").value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(index = 1, name = "relation")
    public Object initRelation(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object relation = assignParameter(args, 1, false);
        Object model = null;
        for (ZPair zpairResult326 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult326.getValue());
            env.callMethod(
                    model, "setRelation", MorphOne.class, relation, this.getDefaultFor(env, model));
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
        return ZVal.assign(
                env.callMethod(this, "matchOne", MorphOne.class, models, results, relation));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parent",
        typeHint = "Illuminate\\Database\\Eloquent\\Model"
    )
    public Object newRelatedInstanceFor(RuntimeEnv env, Object... args) {
        Object parent = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("related")
                                                .value(),
                                        "newInstance",
                                        MorphOne.class),
                                "setAttribute",
                                MorphOne.class,
                                env.callMethod(this, "getForeignKeyName", MorphOne.class),
                                toObjectR(parent)
                                        .accessProp(this, env)
                                        .name(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("localKey")
                                                        .value())
                                        .value()),
                        "setAttribute",
                        MorphOne.class,
                        env.callMethod(this, "getMorphType", MorphOne.class),
                        toObjectR(this).accessProp(this, env).name("morphClass").value()));
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
            env.callMethod(instance, "forceFill", MorphOne.class, this.withDefault);
        }

        return ZVal.assign(instance);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Relations\\MorphOne";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MorphOneOrMany.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\MorphOne")
                    .setLookup(
                            MorphOne.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "foreignKey",
                            "localKey",
                            "morphClass",
                            "morphType",
                            "parent",
                            "query",
                            "related",
                            "withDefault")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphOne.php")
                    .addTrait(
                            "Illuminate\\Database\\Eloquent\\Relations\\Concerns\\SupportsDefaultModels")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Relations\\MorphOneOrMany")
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
