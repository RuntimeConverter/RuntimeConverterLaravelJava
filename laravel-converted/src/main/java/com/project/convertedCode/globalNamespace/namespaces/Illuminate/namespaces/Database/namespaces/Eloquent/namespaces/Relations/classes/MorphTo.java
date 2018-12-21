package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.BelongsTo;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.functions.head;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Collection;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphTo.php

*/

public class MorphTo extends BelongsTo {

    public Object morphType = null;

    public Object models = null;

    public Object dictionary = ZVal.newArray();

    public Object macroBuffer = ZVal.newArray();

    public MorphTo(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MorphTo.class) {
            this.__construct(env, args);
        }
    }

    public MorphTo(NoConstructor n) {
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
    @ConvertedParameter(index = 3, name = "ownerKey")
    @ConvertedParameter(index = 4, name = "type")
    @ConvertedParameter(index = 5, name = "relation")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object foreignKey = assignParameter(args, 2, false);
        Object ownerKey = assignParameter(args, 3, false);
        Object type = assignParameter(args, 4, false);
        Object relation = assignParameter(args, 5, false);
        this.morphType = type;
        super.__construct(env, query, parent, foreignKey, ownerKey, relation);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models", typeHint = "array")
    public Object addEagerConstraints(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        this.buildDictionary(env, this.models = Collection.runtimeStaticObject.make(env, models));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "models",
        typeHint = "Illuminate\\Database\\Eloquent\\Collection"
    )
    protected Object buildDictionary(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        Object model = null;
        for (ZPair zpairResult328 : ZVal.getIterable(models, env, true)) {
            model = ZVal.assign(zpairResult328.getValue());
            if (toObjectR(model).accessProp(this, env).name(this.morphType).getBool()) {
                new ReferenceClassProperty(this, "dictionary", env)
                        .arrayAppend(
                                env,
                                toObjectR(model).accessProp(this, env).name(this.morphType).value(),
                                toObjectR(model)
                                        .accessProp(this, env)
                                        .name(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("foreignKey")
                                                        .value())
                                        .value())
                        .set(model);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getResults(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toObjectR(this).accessProp(this, env).name("ownerKey").getBool()
                        ? super.getResults(env)
                        : ZVal.getNull());
    }

    @ConvertedMethod
    public Object getEager(RuntimeEnv env, Object... args) {
        Object type = null;
        for (ZPair zpairResult329 :
                ZVal.getIterable(
                        function_array_keys.f.env(env).call(this.dictionary).value(), env, true)) {
            type = ZVal.assign(zpairResult329.getValue());
            this.matchToMorphParents(env, type, this.getResultsByType(env, type));
        }

        return ZVal.assign(this.models);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    protected Object getResultsByType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object instance = null;
        Object query = null;
        Object ternaryExpressionTemp = null;
        Object ownerKey = null;
        instance = this.createModelByType(env, type);
        ownerKey =
                ZVal.assign(
                        ZVal.isDefined(
                                        ternaryExpressionTemp =
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name("ownerKey")
                                                        .value())
                                ? ternaryExpressionTemp
                                : env.callMethod(instance, "getKeyName", MorphTo.class));
        query =
                env.callMethod(
                        env.callMethod(
                                this.replayMacros(
                                        env, env.callMethod(instance, "newQuery", MorphTo.class)),
                                "mergeConstraintsFrom",
                                MorphTo.class,
                                env.callMethod(this, "getQuery", MorphTo.class)),
                        "with",
                        MorphTo.class,
                        env.callMethod(
                                env.callMethod(this, "getQuery", MorphTo.class),
                                "getEagerLoads",
                                MorphTo.class));
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                query,
                                "whereIn",
                                MorphTo.class,
                                toStringR(env.callMethod(instance, "getTable", MorphTo.class), env)
                                        + "."
                                        + toStringR(ownerKey, env),
                                this.gatherKeysByType(env, type)),
                        "get",
                        MorphTo.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    protected Object gatherKeysByType(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphTo.php");
        Object type = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                collect.f
                                                        .env(env)
                                                        .call(
                                                                new ReferenceClassProperty(
                                                                                this,
                                                                                "dictionary",
                                                                                env)
                                                                        .arrayGet(env, type))
                                                        .value(),
                                                "map",
                                                MorphTo.class,
                                                new Closure(
                                                        env,
                                                        runtimeConverterFunctionClassConstants,
                                                        "Illuminate\\Database\\Eloquent\\Relations",
                                                        this) {
                                                    @Override
                                                    @ConvertedMethod
                                                    @ConvertedParameter(index = 0, name = "models")
                                                    public Object run(
                                                            RuntimeEnv env,
                                                            Object thisvar,
                                                            PassByReferenceArgs
                                                                    runtimePassByReferenceArgs,
                                                            Object... args) {
                                                        Object _closureThisVar =
                                                                this.getClosureThisVar();
                                                        Object models =
                                                                assignParameter(args, 0, false);
                                                        return ZVal.assign(
                                                                head.f
                                                                        .env(env)
                                                                        .call(models)
                                                                        .getObject()
                                                                        .accessProp(this, env)
                                                                        .name(
                                                                                toObjectR(
                                                                                                _closureThisVar)
                                                                                        .accessProp(
                                                                                                this,
                                                                                                env)
                                                                                        .name(
                                                                                                "foreignKey")
                                                                                        .value())
                                                                        .value());
                                                    }
                                                }),
                                        "values",
                                        MorphTo.class),
                                "unique",
                                MorphTo.class),
                        "all",
                        MorphTo.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object createModelByType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object _pClass = null;
        _pClass = Model.runtimeStaticObject.getActualClassNameForMorph(env, type);
        return ZVal.assign(env.createNew(_pClass));
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
        return ZVal.assign(models);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    @ConvertedParameter(
        index = 1,
        name = "results",
        typeHint = "Illuminate\\Database\\Eloquent\\Collection"
    )
    protected Object matchToMorphParents(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        Object results = assignParameter(args, 1, false);
        Object result = null;
        Object model = null;
        Object ownerKey = null;
        for (ZPair zpairResult330 : ZVal.getIterable(results, env, true)) {
            result = ZVal.assign(zpairResult330.getValue());
            ownerKey =
                    ZVal.assign(
                            !function_is_null
                                            .f
                                            .env(env)
                                            .call(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("ownerKey")
                                                            .value())
                                            .getBool()
                                    ? toObjectR(result)
                                            .accessProp(this, env)
                                            .name(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("ownerKey")
                                                            .value())
                                            .value()
                                    : env.callMethod(result, "getKey", MorphTo.class));
            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "dictionary", env),
                    env,
                    type,
                    ownerKey)) {
                for (ZPair zpairResult331 :
                        ZVal.getIterable(
                                new ReferenceClassProperty(this, "dictionary", env)
                                        .arrayGet(env, type, ownerKey),
                                env,
                                true)) {
                    model = ZVal.assign(zpairResult331.getValue());
                    env.callMethod(
                            model,
                            "setRelation",
                            MorphTo.class,
                            toObjectR(this).accessProp(this, env).name("relation").value(),
                            result);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object associate(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("parent").value(),
                "setAttribute",
                MorphTo.class,
                toObjectR(this).accessProp(this, env).name("foreignKey").value(),
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        model,
                                        Model.class,
                                        "Illuminate\\Database\\Eloquent\\Model"))
                        ? env.callMethod(model, "getKey", MorphTo.class)
                        : ZVal.getNull());
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("parent").value(),
                "setAttribute",
                MorphTo.class,
                this.morphType,
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        model,
                                        Model.class,
                                        "Illuminate\\Database\\Eloquent\\Model"))
                        ? env.callMethod(model, "getMorphClass", MorphTo.class)
                        : ZVal.getNull());
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("parent").value(),
                        "setRelation",
                        MorphTo.class,
                        toObjectR(this).accessProp(this, env).name("relation").value(),
                        model));
    }

    @ConvertedMethod
    public Object dissociate(RuntimeEnv env, Object... args) {
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("parent").value(),
                "setAttribute",
                MorphTo.class,
                toObjectR(this).accessProp(this, env).name("foreignKey").value(),
                ZVal.getNull());
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("parent").value(),
                "setAttribute",
                MorphTo.class,
                this.morphType,
                ZVal.getNull());
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("parent").value(),
                        "setRelation",
                        MorphTo.class,
                        toObjectR(this).accessProp(this, env).name("relation").value(),
                        ZVal.getNull()));
    }

    @ConvertedMethod
    public Object getMorphType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.morphType);
    }

    @ConvertedMethod
    public Object getDictionary(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.dictionary);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object replayMacros(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        ReferenceContainer macro = new BasicReferenceContainer(null);
        for (ZPair zpairResult332 : ZVal.getIterable(this.macroBuffer, env, true)) {
            macro.setObject(ZVal.assign(zpairResult332.getValue()));
            env.callMethod(
                    query,
                    new RuntimeArgsWithReferences(),
                    toStringR(macro.arrayGet(env, "method"), env),
                    MorphTo.class,
                    PackedVaradicArgs.unpack(
                            new PackedVaradicArgs(macro.arrayGet(env, "parameters"))));
        }

        return ZVal.assign(query);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope91 scope = new Scope91();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphTo.php");
            scope.method = assignParameter(args, 0, false);
            scope.parameters = assignParameter(args, 1, false);
            scope.e = null;
            try {
                throw new IncludeEventException(
                        ZVal.assign(super.__call(env, scope.method, scope.parameters)));
            } catch (ConvertedException convertedException28) {
                if (convertedException28.instanceOf(
                        BadMethodCallException.class, "BadMethodCallException")) {
                    scope.e = convertedException28.getObject();
                    new ReferenceClassProperty(scope._thisVarAlias, "macroBuffer", env)
                            .arrayAppend(env)
                            .set(
                                    function_compact
                                            .f
                                            .env(env)
                                            .call(stack, "method", "parameters")
                                            .value());
                    throw new IncludeEventException(ZVal.assign(scope._thisVarAlias));
                } else {
                    throw convertedException28;
                }
            }

        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Relations\\MorphTo";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BelongsTo.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Relations\\MorphTo")
                    .setLookup(
                            MorphTo.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "child",
                            "dictionary",
                            "foreignKey",
                            "macroBuffer",
                            "models",
                            "morphType",
                            "ownerKey",
                            "parent",
                            "query",
                            "related",
                            "relation",
                            "withDefault")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Relations/MorphTo.php")
                    .addExtendsClass("Illuminate\\Database\\Eloquent\\Relations\\BelongsTo")
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

    private static class Scope91 implements UpdateRuntimeScopeInterface {

        Object method;
        Object e;
        Object _thisVarAlias;
        Object parameters;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("method", this.method);
            stack.setVariable("e", this.e);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("parameters", this.parameters);
        }

        public void updateScope(RuntimeStack stack) {

            this.method = stack.getVariable("method");
            this.e = stack.getVariable("e");
            this._thisVarAlias = stack.getVariable("this");
            this.parameters = stack.getVariable("parameters");
        }
    }
}
