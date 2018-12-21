package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.HasOneOrMany;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasMany.php

*/

public class HasMany extends HasOneOrMany {

    public HasMany(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HasMany.class) {
            this.__construct(env, args);
        }
    }

    public HasMany(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object getResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("query").value(),
                        "get",
                        HasMany.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    @ConvertedParameter(index = 1, name = "relation")
    public Object initRelation(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object relation = assignParameter(args, 1, false);
        Object model = null;
        for (ZPair zpairResult316 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult316.getValue());
            env.callMethod(
                    model,
                    "setRelation",
                    HasMany.class,
                    relation,
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("related").value(),
                            "newCollection",
                            HasMany.class));
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
                env.callMethod(this, "matchMany", HasMany.class, models, results, relation));
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Relations\\HasMany";

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
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\HasMany")
                    .setLookup(
                            HasMany.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("foreignKey", "localKey", "parent", "query", "related")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/HasMany.php")
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
