package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.JsonEncodingException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_forward_static_call;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.functions.last;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.MorphTo;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.functions.class_basename;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.MorphOne;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect_key;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.BelongsToMany;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Pivot;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.MorphToMany;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.functions.collect;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeFunctions.array.function_sort;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.HasMany;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.UrlRoutable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.HasManyThrough;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Jsonable;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.BelongsTo;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.QueueableEntity;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Relation;
import com.runtimeconverter.runtime.nativeClasses.date.DateTimeInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.MorphMany;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.HasOne;
import com.runtimeconverter.runtime.nativeInterfaces.JsonSerializable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Carbon;
import com.project.convertedCode.globalNamespace.functions.class_uses_recursive;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.QueueableCollection;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Scope;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.MassAssignmentException;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Model.php

*/

public abstract class Model extends RuntimeClassBase
        implements ArrayAccess,
                Arrayable,
                Jsonable,
                JsonSerializable,
                QueueableEntity,
                UrlRoutable {

    public Object connection = null;

    public Object table = null;

    public Object primaryKey = "id";

    public Object keyType = "int";

    public Object incrementing = true;

    public Object with = ZVal.newArray();

    public Object withCount = ZVal.newArray();

    public Object perPage = 15;

    public Object exists = false;

    public Object wasRecentlyCreated = false;

    public Object attributes = ZVal.newArray();

    public Object original = ZVal.newArray();

    public Object changes = ZVal.newArray();

    public Object casts = ZVal.newArray();

    public Object dates = ZVal.newArray();

    public Object dateFormat = null;

    public Object appends = ZVal.newArray();

    public Object dispatchesEvents = ZVal.newArray();

    public Object observables = ZVal.newArray();

    public Object relations = ZVal.newArray();

    public Object touches = ZVal.newArray();

    public Object timestamps = true;

    public Object hidden = ZVal.newArray();

    public Object visible = ZVal.newArray();

    public Object fillable = ZVal.newArray();

    public Object guarded = ZVal.arrayFromList("*");

    public Model(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Model.class) {
            this.__construct(env, args);
        }
    }

    public Model(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        this.bootIfNotBooted(env);
        this.syncOriginal(env);
        this.fill(env, attributes);
        return null;
    }

    @ConvertedMethod
    protected Object bootIfNotBooted(RuntimeEnv env, Object... args) {
        if (!arrayActionR(
                ArrayAction.ISSET,
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
                                .classes
                                .Model
                                .RequestStaticProperties
                                .class,
                        "booted"),
                env,
                ClassConstantUtils.getConstantValueLateStatic(env, this, "class"))) {
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
                                    .classes
                                    .Model
                                    .RequestStaticProperties
                                    .class,
                            "booted")
                    .arrayAccess(
                            env, ClassConstantUtils.getConstantValueLateStatic(env, this, "class"))
                    .set(true);
            this.fireModelEvent(env, "booting", false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("boot")
                    .call()
                    .value();
            this.fireModelEvent(env, "booted", false);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object fill(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object value = null;
        Object key = null;
        Object totallyGuarded = null;
        totallyGuarded = this.totallyGuarded(env);
        for (ZPair zpairResult291 :
                ZVal.getIterable(this.fillableFromArray(env, attributes), env, false)) {
            key = ZVal.assign(zpairResult291.getKey());
            value = ZVal.assign(zpairResult291.getValue());
            key = this.removeTableFromKey(env, key);
            if (ZVal.isTrue(this.isFillable(env, key))) {
                this.setAttribute(env, key, value);

            } else if (ZVal.isTrue(totallyGuarded)) {
                throw ZVal.getException(
                        env,
                        new MassAssignmentException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Add [%s] to fillable property to allow mass assignment on [%s].",
                                                key,
                                                function_get_class.f.env(env).call(this).value())
                                        .value()));
            }
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    public Object forceFill(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Model.php");
        Object attributes = assignParameter(args, 0, false);
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                        .method("unguarded")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object attributes = null;
                                        attributes =
                                                this.contextReferences.getCapturedValue(
                                                        "attributes");
                                        return ZVal.assign(Model.this.fill(env, attributes));
                                    }
                                }.use("attributes", attributes))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    public Object qualifyColumn(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, column, "."))) {
            return ZVal.assign(column);
        }

        return ZVal.assign(toStringR(this.getTable(env), env) + "." + toStringR(column, env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object removeTableFromKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(Str.runtimeStaticObject.contains(env, key, "."))
                        ? last.f
                                .env(env)
                                .call(function_explode.f.env(env).call(".", key).value())
                                .value()
                        : key);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "exists",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object newInstance(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object exists = assignParameter(args, 1, true);
        if (null == exists) {
            exists = false;
        }
        Object model = null;
        model = env.createNewWithLateStaticBindings(this, rToArrayCast(attributes));
        toObjectR(model).accessProp(this, env).name("exists").set(exists);
        env.callMethod(model, "setConnection", Model.class, this.getConnectionName(env));
        return ZVal.assign(model);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 1,
        name = "connection",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object newFromBuilder(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object connection = assignParameter(args, 1, true);
        if (null == connection) {
            connection = ZVal.getNull();
        }
        Object model = null;
        Object ternaryExpressionTemp = null;
        model = this.newInstance(env, ZVal.newArray(), true);
        env.callMethod(model, "setRawAttributes", Model.class, rToArrayCast(attributes), true);
        env.callMethod(
                model,
                "setConnection",
                Model.class,
                ZVal.isTrue(ternaryExpressionTemp = connection)
                        ? ternaryExpressionTemp
                        : this.getConnectionName(env));
        env.callMethod(model, "fireModelEvent", Model.class, "retrieved", false);
        return ZVal.assign(model);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations")
    public Object load(RuntimeEnv env, Object... args) {
        Object relations = assignParameter(args, 0, false);
        Object query = null;
        query =
                env.callMethod(
                        this.newQueryWithoutRelationships(env),
                        "with",
                        Model.class,
                        function_is_string.f.env(env).call(relations).getBool()
                                ? function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value()
                                : relations);
        env.callMethod(query, "eagerLoadRelations", Model.class, ZVal.newArray(new ZPair(0, this)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations")
    public Object loadMissing(RuntimeEnv env, Object... args) {
        Object relations = assignParameter(args, 0, false);
        relations =
                ZVal.assign(
                        function_is_string.f.env(env).call(relations).getBool()
                                ? function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value()
                                : relations);
        env.callMethod(
                this.newCollection(env, ZVal.newArray(new ZPair(0, this))),
                "loadMissing",
                Model.class,
                relations);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "amount", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "extra",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object increment(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object amount = assignParameter(args, 1, true);
        if (null == amount) {
            amount = 1;
        }
        Object extra = assignParameter(args, 2, true);
        if (null == extra) {
            extra = ZVal.newArray();
        }
        return ZVal.assign(this.incrementOrDecrement(env, column, amount, extra, "increment"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "amount", defaultValue = "1", defaultValueType = "number")
    @ConvertedParameter(
        index = 2,
        name = "extra",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object decrement(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object amount = assignParameter(args, 1, true);
        if (null == amount) {
            amount = 1;
        }
        Object extra = assignParameter(args, 2, true);
        if (null == extra) {
            extra = ZVal.newArray();
        }
        return ZVal.assign(this.incrementOrDecrement(env, column, amount, extra, "decrement"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "amount")
    @ConvertedParameter(index = 2, name = "extra")
    @ConvertedParameter(index = 3, name = "method")
    protected Object incrementOrDecrement(RuntimeEnv env, Object... args) {
        ReferenceContainer column = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer amount = new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer extra = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object method = assignParameter(args, 3, false);
        Object query = null;
        query = this.newQuery(env);
        if (!ZVal.isTrue(this.exists)) {
            return ZVal.assign(
                    env.callMethod(
                            query,
                            new RuntimeArgsWithReferences()
                                    .add(0, column)
                                    .add(1, amount)
                                    .add(2, extra),
                            toStringR(method, env),
                            Model.class,
                            column.getObject(),
                            amount.getObject(),
                            extra.getObject()));
        }

        this.incrementOrDecrementAttributeValue(
                env, column.getObject(), amount.getObject(), extra.getObject(), method);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                query,
                                "where",
                                Model.class,
                                this.getKeyName(env),
                                this.getKey(env)),
                        new RuntimeArgsWithReferences().add(0, column).add(1, amount).add(2, extra),
                        toStringR(method, env),
                        Model.class,
                        column.getObject(),
                        amount.getObject(),
                        extra.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "column")
    @ConvertedParameter(index = 1, name = "amount")
    @ConvertedParameter(index = 2, name = "extra")
    @ConvertedParameter(index = 3, name = "method")
    protected Object incrementOrDecrementAttributeValue(RuntimeEnv env, Object... args) {
        Object column = assignParameter(args, 0, false);
        Object amount = assignParameter(args, 1, false);
        Object extra = assignParameter(args, 2, false);
        Object method = assignParameter(args, 3, false);
        toObjectR(this)
                .accessProp(this, env)
                .name(column)
                .set(
                        ZVal.add(
                                toObjectR(this).accessProp(this, env).name(column).value(),
                                ZVal.equalityCheck(method, "increment")
                                        ? amount
                                        : ZVal.multiply(amount, -1)));
        this.forceFill(env, extra);
        this.syncOriginalAttribute(env, column);
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
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object update(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        if (!ZVal.isTrue(this.exists)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                env.callMethod(this.fill(env, attributes), "save", Model.class, options));
    }

    @ConvertedMethod
    public Object push(RuntimeEnv env, Object... args) {
        Object models = null;
        Object model = null;
        if (!ZVal.isTrue(this.save(env))) {
            return ZVal.assign(false);
        }

        for (ZPair zpairResult292 : ZVal.getIterable(this.relations, env, true)) {
            models = ZVal.assign(zpairResult292.getValue());
            models =
                    ZVal.assign(
                            ZVal.isTrue(
                                            ZVal.checkInstanceType(
                                                    models,
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Illuminate
                                                            .namespaces
                                                            .Database
                                                            .namespaces
                                                            .Eloquent
                                                            .classes
                                                            .Collection
                                                            .class,
                                                    "Illuminate\\Database\\Eloquent\\Collection"))
                                    ? env.callMethod(models, "all", Model.class)
                                    : ZVal.newArray(new ZPair(0, models)));
            for (ZPair zpairResult293 :
                    ZVal.getIterable(
                            function_array_filter.f.env(env).call(models).value(), env, true)) {
                model = ZVal.assign(zpairResult293.getValue());
                if (!ZVal.isTrue(env.callMethod(model, "push", Model.class))) {
                    return ZVal.assign(false);
                }
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object save(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object saved = null;
        Object query = null;
        Object connection = null;
        query = this.newModelQuery(env);
        if (ZVal.strictEqualityCheck(this.fireModelEvent(env, "saving"), "===", false)) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.exists)) {
            saved =
                    ZVal.assign(
                            ZVal.isTrue(this.isDirty(env)) ? this.performUpdate(env, query) : true);

        } else {
            saved = this.performInsert(env, query);
            if (ZVal.toBool(!ZVal.isTrue(this.getConnectionName(env)))
                    && ZVal.toBool(
                            connection = env.callMethod(query, "getConnection", Model.class))) {
                this.setConnection(env, env.callMethod(connection, "getName", Model.class));
            }
        }

        if (ZVal.isTrue(saved)) {
            this.finishSave(env, options);
        }

        return ZVal.assign(saved);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object saveOrFail(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Model.php");
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        this.getConnection(env),
                        "transaction",
                        Model.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object options = null;
                                options = this.contextReferences.getCapturedValue("options");
                                return ZVal.assign(Model.this.save(env, options));
                            }
                        }.use("options", options)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    protected Object finishSave(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ternaryExpressionTemp = null;
        this.fireModelEvent(env, "saved", false);
        if (ZVal.toBool(this.isDirty(env))
                && ZVal.toBool(
                        ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "touch"))
                                ? ternaryExpressionTemp
                                : true)) {
            this.touchOwners(env);
        }

        this.syncOriginal(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object performUpdate(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object dirty = null;
        if (ZVal.strictEqualityCheck(this.fireModelEvent(env, "updating"), "===", false)) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.usesTimestamps(env))) {
            this.updateTimestamps(env);
        }

        dirty = this.getDirty(env);
        if (ZVal.isGreaterThan(function_count.f.env(env).call(dirty).value(), '>', 0)) {
            env.callMethod(this.setKeysForSaveQuery(env, query), "update", Model.class, dirty);
            this.fireModelEvent(env, "updated", false);
            this.syncChanges(env);
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object setKeysForSaveQuery(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        env.callMethod(
                query,
                "where",
                Model.class,
                this.getKeyName(env),
                "=",
                this.getKeyForSaveQuery(env));
        return ZVal.assign(query);
    }

    @ConvertedMethod
    protected Object getKeyForSaveQuery(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "original", env)
                                                .arrayGet(env, this.getKeyName(env)))
                        ? ternaryExpressionTemp
                        : this.getKey(env));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    protected Object performInsert(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object attributes = null;
        if (ZVal.strictEqualityCheck(this.fireModelEvent(env, "creating"), "===", false)) {
            return ZVal.assign(false);
        }

        if (ZVal.isTrue(this.usesTimestamps(env))) {
            this.updateTimestamps(env);
        }

        attributes = ZVal.assign(this.attributes);
        if (ZVal.isTrue(this.getIncrementing(env))) {
            this.insertAndSetId(env, query, attributes);

        } else {
            if (ZVal.isEmpty(attributes)) {
                return ZVal.assign(true);
            }

            env.callMethod(query, "insert", Model.class, attributes);
        }

        this.exists = true;
        this.wasRecentlyCreated = true;
        this.fireModelEvent(env, "created", false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Eloquent\\Builder"
    )
    @ConvertedParameter(index = 1, name = "attributes")
    protected Object insertAndSetId(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, false);
        Object keyName = null;
        Object id = null;
        id =
                env.callMethod(
                        query,
                        "insertGetId",
                        Model.class,
                        attributes,
                        keyName = this.getKeyName(env));
        this.setAttribute(env, keyName, id);
        return null;
    }

    @ConvertedMethod
    public Object delete(RuntimeEnv env, Object... args) {
        if (function_is_null.f.env(env).call(this.getKeyName(env)).getBool()) {
            throw ZVal.getException(env, new PHPException(env, "No primary key defined on model."));
        }

        if (!ZVal.isTrue(this.exists)) {
            return null;
        }

        if (ZVal.strictEqualityCheck(this.fireModelEvent(env, "deleting"), "===", false)) {
            return ZVal.assign(false);
        }

        this.touchOwners(env);
        this.performDeleteOnModel(env);
        this.fireModelEvent(env, "deleted", false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object forceDelete(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.delete(env));
    }

    @ConvertedMethod
    protected Object performDeleteOnModel(RuntimeEnv env, Object... args) {
        env.callMethod(
                this.setKeysForSaveQuery(env, this.newModelQuery(env)), "delete", Model.class);
        this.exists = false;
        return null;
    }

    @ConvertedMethod
    public Object newQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.registerGlobalScopes(env, this.newQueryWithoutScopes(env)));
    }

    @ConvertedMethod
    public Object newModelQuery(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.newEloquentBuilder(env, this.newBaseQueryBuilder(env)),
                        "setModel",
                        Model.class,
                        this));
    }

    @ConvertedMethod
    public Object newQueryWithoutRelationships(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                this.registerGlobalScopes(
                        env,
                        env.callMethod(
                                this.newEloquentBuilder(env, this.newBaseQueryBuilder(env)),
                                "setModel",
                                Model.class,
                                this)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "builder")
    public Object registerGlobalScopes(RuntimeEnv env, Object... args) {
        Object builder = assignParameter(args, 0, false);
        Object identifier = null;
        Object scope = null;
        for (ZPair zpairResult295 : ZVal.getIterable(this.getGlobalScopes(env), env, false)) {
            identifier = ZVal.assign(zpairResult295.getKey());
            scope = ZVal.assign(zpairResult295.getValue());
            env.callMethod(builder, "withGlobalScope", Model.class, identifier, scope);
        }

        return ZVal.assign(builder);
    }

    @ConvertedMethod
    public Object newQueryWithoutScopes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.newModelQuery(env), "with", Model.class, this.with),
                        "withCount",
                        Model.class,
                        this.withCount));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "scope")
    public Object newQueryWithoutScope(RuntimeEnv env, Object... args) {
        Object scope = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.newQuery(env), "withoutGlobalScope", Model.class, scope));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ids")
    public Object newQueryForRestoration(RuntimeEnv env, Object... args) {
        Object ids = assignParameter(args, 0, false);
        return ZVal.assign(
                function_is_array.f.env(env).call(ids).getBool()
                        ? env.callMethod(
                                this.newQueryWithoutScopes(env),
                                "whereIn",
                                Model.class,
                                this.getQualifiedKeyName(env),
                                ids)
                        : env.callMethod(
                                this.newQueryWithoutScopes(env), "whereKey", Model.class, ids));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "query")
    public Object newEloquentBuilder(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Database
                        .namespaces
                        .Eloquent
                        .classes
                        .Builder(env, query));
    }

    @ConvertedMethod
    protected Object newBaseQueryBuilder(RuntimeEnv env, Object... args) {
        Object connection = null;
        connection = this.getConnection(env);
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Database
                        .namespaces
                        .Query
                        .classes
                        .Builder(
                        env,
                        connection,
                        env.callMethod(connection, "getQueryGrammar", Model.class),
                        env.callMethod(connection, "getPostProcessor", Model.class)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "models",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object newCollection(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, true);
        if (null == models) {
            models = ZVal.newArray();
        }
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Database
                        .namespaces
                        .Eloquent
                        .classes
                        .Collection(env, models));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parent", typeHint = "self")
    @ConvertedParameter(index = 1, name = "attributes", typeHint = "array")
    @ConvertedParameter(index = 2, name = "table")
    @ConvertedParameter(index = 3, name = "exists")
    @ConvertedParameter(
        index = 4,
        name = "using",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object newPivot(RuntimeEnv env, Object... args) {
        ReferenceContainer parent = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer attributes =
                new BasicReferenceContainer(assignParameter(args, 1, false));
        ReferenceContainer table = new BasicReferenceContainer(assignParameter(args, 2, false));
        ReferenceContainer exists = new BasicReferenceContainer(assignParameter(args, 3, false));
        Object using = assignParameter(args, 4, true);
        if (null == using) {
            using = ZVal.getNull();
        }
        return ZVal.assign(
                ZVal.isTrue(using)
                        ? StaticMethodUtils.getStaticBaseClass(using, env)
                                .callUnknownStaticMethod(
                                        env,
                                        "fromRawAttributes",
                                        new RuntimeArgsWithReferences()
                                                .add(0, parent)
                                                .add(1, attributes)
                                                .add(2, table)
                                                .add(3, exists),
                                        parent.getObject(),
                                        attributes.getObject(),
                                        table.getObject(),
                                        exists.getObject())
                        : Pivot.runtimeStaticObject.fromAttributes(
                                env,
                                parent.getObject(),
                                attributes.getObject(),
                                table.getObject(),
                                exists.getObject()));
    }

    @ConvertedMethod
    public Object toArray(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(this.attributesToArray(env), this.relationsToArray(env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object toJson(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, true);
        if (null == options) {
            options = 0;
        }
        Object json = null;
        json = NamespaceGlobal.json_encode.env(env).call(this.jsonSerialize(env), options).value();
        if (ZVal.strictNotEqualityCheck(
                0, "!==", NamespaceGlobal.json_last_error.env(env).call().value())) {
            throw ZVal.getException(
                    env,
                    JsonEncodingException.runtimeStaticObject.forModel(
                            env,
                            this,
                            NamespaceGlobal.json_last_error_msg.env(env).call().value()));
        }

        return ZVal.assign(json);
    }

    @ConvertedMethod
    public Object jsonSerialize(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toArray(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "with", defaultValue = "", defaultValueType = "array")
    public Object fresh(RuntimeEnv env, Object... args) {
        Object with = assignParameter(args, 0, true);
        if (null == with) {
            with = ZVal.newArray();
        }
        if (!ZVal.isTrue(this.exists)) {
            return null;
        }

        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Model.class)
                                                .method("newQueryWithoutScopes")
                                                .call()
                                                .value(),
                                        "with",
                                        Model.class,
                                        function_is_string.f.env(env).call(with).getBool()
                                                ? function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value()
                                                : with),
                                "where",
                                Model.class,
                                this.getKeyName(env),
                                this.getKey(env)),
                        "first",
                        Model.class));
    }

    @ConvertedMethod
    public Object refresh(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.exists)) {
            return ZVal.assign(this);
        }

        this.setRawAttributes(
                env,
                toObjectR(
                                env.callMethod(
                                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                                        env, this, Model.class)
                                                .method("newQueryWithoutScopes")
                                                .call()
                                                .value(),
                                        "findOrFail",
                                        Model.class,
                                        this.getKey(env)))
                        .accessProp(this, env)
                        .name("attributes")
                        .value());
        this.load(
                env,
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        collect.f.env(env).call(this.relations).value(),
                                        "except",
                                        Model.class,
                                        "pivot"),
                                "keys",
                                Model.class),
                        "toArray",
                        Model.class));
        this.syncOriginal(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "except",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object replicate(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Model.php");
        Object except = assignParameter(args, 0, true);
        if (null == except) {
            except = ZVal.getNull();
        }
        Object defaults = null;
        Object attributes = null;
        defaults =
                ZVal.newArray(
                        new ZPair(0, this.getKeyName(env)),
                        new ZPair(1, this.getCreatedAtColumn(env)),
                        new ZPair(2, this.getUpdatedAtColumn(env)));
        attributes =
                Arr.runtimeStaticObject.except(
                        env,
                        this.attributes,
                        ZVal.isTrue(except)
                                ? function_array_unique
                                        .f
                                        .env(env)
                                        .call(
                                                function_array_merge
                                                        .f
                                                        .env(env)
                                                        .call(except, defaults)
                                                        .value())
                                        .value()
                                : defaults);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.createNewWithLateStaticBindings(this),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent",
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
                                        Object attributes = null;
                                        attributes =
                                                this.contextReferences.getCapturedValue(
                                                        "attributes");
                                        env.callMethod(
                                                instance,
                                                "setRawAttributes",
                                                Model.class,
                                                attributes);
                                        env.callMethod(
                                                instance,
                                                "setRelations",
                                                Model.class,
                                                Model.this.relations);
                                        return null;
                                    }
                                }.use("attributes", attributes))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object is(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(
                                                                !function_is_null
                                                                        .f
                                                                        .env(env)
                                                                        .call(model)
                                                                        .getBool())
                                                        && ZVal.toBool(
                                                                ZVal.strictEqualityCheck(
                                                                        this.getKey(env),
                                                                        "===",
                                                                        env.callMethod(
                                                                                model,
                                                                                "getKey",
                                                                                Model.class))))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        this.getTable(env),
                                                        "===",
                                                        env.callMethod(
                                                                model, "getTable", Model.class))))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        this.getConnectionName(env),
                                        "===",
                                        env.callMethod(model, "getConnectionName", Model.class))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "model")
    public Object isNot(RuntimeEnv env, Object... args) {
        Object model = assignParameter(args, 0, false);
        return ZVal.assign(!ZVal.isTrue(this.is(env, model)));
    }

    @ConvertedMethod
    public Object getConnection(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                        .method("resolveConnection")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                this.getConnectionName(env))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object getConnectionName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.connection);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setConnection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.connection = name;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getTable(RuntimeEnv env, Object... args) {
        if (!ZVal.isset(this.table)) {
            return ZVal.assign(
                    function_str_replace
                            .f
                            .env(env)
                            .call(
                                    "\\",
                                    "",
                                    Str.runtimeStaticObject.snake(
                                            env,
                                            Str.runtimeStaticObject.plural(
                                                    env,
                                                    class_basename.f.env(env).call(this).value())))
                            .value());
        }

        return ZVal.assign(this.table);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "table")
    public Object setTable(RuntimeEnv env, Object... args) {
        Object table = assignParameter(args, 0, false);
        this.table = table;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.primaryKey);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object setKeyName(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        this.primaryKey = key;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getQualifiedKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.qualifyColumn(env, this.getKeyName(env)));
    }

    @ConvertedMethod
    public Object getKeyType(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.keyType);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "type")
    public Object setKeyType(RuntimeEnv env, Object... args) {
        Object type = assignParameter(args, 0, false);
        this.keyType = type;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getIncrementing(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.incrementing);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setIncrementing(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.incrementing = value;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getAttribute(env, this.getKeyName(env)));
    }

    @ConvertedMethod
    public Object getQueueableId(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getKey(env));
    }

    @ConvertedMethod
    public Object getQueueableRelations(RuntimeEnv env, Object... args) {
        Object entityValue = null;
        Object entityKey = null;
        ReferenceContainer relations = new BasicReferenceContainer(null);
        Object collectionValue = null;
        Object key = null;
        Object relation = null;
        relations.setObject(ZVal.newArray());
        for (ZPair zpairResult296 : ZVal.getIterable(this.getRelations(env), env, false)) {
            key = ZVal.assign(zpairResult296.getKey());
            relation = ZVal.assign(zpairResult296.getValue());
            if (function_method_exists.f.env(env).call(this, key).getBool()) {
                relations.arrayAppend(env).set(key);
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            relation,
                            QueueableCollection.class,
                            "Illuminate\\Contracts\\Queue\\QueueableCollection"))) {
                for (ZPair zpairResult297 :
                        ZVal.getIterable(
                                env.callMethod(relation, "getQueueableRelations", Model.class),
                                env,
                                true)) {
                    collectionValue = ZVal.assign(zpairResult297.getValue());
                    relations
                            .arrayAppend(env)
                            .set(toStringR(key, env) + "." + toStringR(collectionValue, env));
                }
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            relation,
                            QueueableEntity.class,
                            "Illuminate\\Contracts\\Queue\\QueueableEntity"))) {
                for (ZPair zpairResult298 :
                        ZVal.getIterable(
                                env.callMethod(relation, "getQueueableRelations", Model.class),
                                env,
                                false)) {
                    entityKey = ZVal.assign(zpairResult298.getKey());
                    entityValue = ZVal.assign(zpairResult298.getValue());
                    relations
                            .arrayAppend(env)
                            .set(toStringR(key, env) + "." + toStringR(entityValue, env));
                }
            }
        }

        return ZVal.assign(function_array_unique.f.env(env).call(relations.getObject()).value());
    }

    @ConvertedMethod
    public Object getQueueableConnection(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getConnectionName(env));
    }

    @ConvertedMethod
    public Object getRouteKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getAttribute(env, this.getRouteKeyName(env)));
    }

    @ConvertedMethod
    public Object getRouteKeyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getKeyName(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object resolveRouteBinding(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                this, "where", Model.class, this.getRouteKeyName(env), value),
                        "first",
                        Model.class));
    }

    @ConvertedMethod
    public Object getForeignKey(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(
                                Str.runtimeStaticObject.snake(
                                        env, class_basename.f.env(env).call(this).value()),
                                env)
                        + "_"
                        + toStringR(this.getKeyName(env), env));
    }

    @ConvertedMethod
    public Object getPerPage(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.perPage);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "perPage")
    public Object setPerPage(RuntimeEnv env, Object... args) {
        Object perPage = assignParameter(args, 0, false);
        this.perPage = perPage;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.getAttribute(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.setAttribute(env, key, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(
                !function_is_null.f.env(env).call(this.getAttribute(env, offset)).getBool());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        return ZVal.assign(this.getAttribute(env, offset));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.setAttribute(env, offset, value);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "offset")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object offset = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "attributes", env),
                env,
                offset);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "relations", env), env, offset);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __isset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.offsetExists(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __unset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        this.offsetUnset(env, key);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        if (function_in_array
                .f
                .env(env)
                .call(method, ZVal.arrayFromList("increment", "decrement"))
                .getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences(),
                            toStringR(method, env),
                            Model.class,
                            PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
        }

        return ZVal.assign(
                env.callMethod(
                        this.newQuery(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        Model.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.toJson(env));
    }

    @ConvertedMethod
    public Object __wakeup(RuntimeEnv env, Object... args) {
        this.bootIfNotBooted(env);
        return null;
    }

    @ConvertedMethod
    public Object attributesToArray(RuntimeEnv env, Object... args) {
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object mutatedAttributes = null;
        Object key = null;
        attributes.setObject(
                this.addDateAttributesToArray(
                        env, attributes.setObject(this.getArrayableAttributes(env))));
        attributes.setObject(
                this.addMutatedAttributesToArray(
                        env,
                        attributes.getObject(),
                        mutatedAttributes = this.getMutatedAttributes(env)));
        attributes.setObject(
                this.addCastAttributesToArray(env, attributes.getObject(), mutatedAttributes));
        for (ZPair zpairResult2285 : ZVal.getIterable(this.getArrayableAppends(env), env, true)) {
            key = ZVal.assign(zpairResult2285.getValue());
            attributes
                    .arrayAccess(env, key)
                    .set(this.mutateAttributeForArray(env, key, ZVal.getNull()));
        }

        return ZVal.assign(attributes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    protected Object addDateAttributesToArray(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer attributes =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object key = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2286 : ZVal.getIterable(this.getDates(env), env, true)) {
            key = ZVal.assign(zpairResult2286.getValue());
            if (!arrayActionR(ArrayAction.ISSET, attributes, env, key)) {
                continue;
            }

            attributes
                    .arrayAccess(env, key)
                    .set(
                            this.serializeDate(
                                    env, this.asDateTime(env, attributes.arrayGet(env, key))));
        }

        return ZVal.assign(attributes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "mutatedAttributes", typeHint = "array")
    protected Object addMutatedAttributesToArray(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer attributes =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object mutatedAttributes = assignParameter(args, 1, false);
        Object key = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2287 : ZVal.getIterable(mutatedAttributes, env, true)) {
            key = ZVal.assign(zpairResult2287.getValue());
            if (!function_array_key_exists.f.env(env).call(key, attributes.getObject()).getBool()) {
                continue;
            }

            attributes
                    .arrayAccess(env, key)
                    .set(this.mutateAttributeForArray(env, key, attributes.arrayGet(env, key)));
        }

        return ZVal.assign(attributes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    @ConvertedParameter(index = 1, name = "mutatedAttributes", typeHint = "array")
    protected Object addCastAttributesToArray(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        ReferenceContainer attributes =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        Object mutatedAttributes = assignParameter(args, 1, false);
        Object value = null;
        Object key = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult2288 : ZVal.getIterable(this.getCasts(env), env, false)) {
            key = ZVal.assign(zpairResult2288.getKey());
            value = ZVal.assign(zpairResult2288.getValue());
            if (ZVal.toBool(
                            !function_array_key_exists
                                    .f
                                    .env(env)
                                    .call(key, attributes.getObject())
                                    .getBool())
                    || ZVal.toBool(
                            function_in_array.f.env(env).call(key, mutatedAttributes).value())) {
                continue;
            }

            attributes
                    .arrayAccess(env, key)
                    .set(this.castAttribute(env, key, attributes.arrayGet(env, key)));
            if (ZVal.toBool(attributes.arrayGet(env, key))
                    && ZVal.toBool(
                            ZVal.toBool(ZVal.strictEqualityCheck(value, "===", "date"))
                                    || ZVal.toBool(
                                            ZVal.strictEqualityCheck(value, "===", "datetime")))) {
                attributes
                        .arrayAccess(env, key)
                        .set(this.serializeDate(env, attributes.arrayGet(env, key)));
            }

            if (ZVal.toBool(attributes.arrayGet(env, key))
                    && ZVal.toBool(this.isCustomDateTimeCast(env, value))) {
                attributes
                        .arrayAccess(env, key)
                        .set(
                                env.callMethod(
                                        attributes.arrayGet(env, key),
                                        "format",
                                        Model.class,
                                        handleReturnReference(
                                                        function_explode
                                                                .f
                                                                .env(env)
                                                                .call(":", value, 2)
                                                                .value())
                                                .arrayGet(env, 1)));
            }
        }

        return ZVal.assign(attributes.getObject());
    }

    @ConvertedMethod
    protected Object getArrayableAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getArrayableItems(env, this.attributes));
    }

    @ConvertedMethod
    protected Object getArrayableAppends(RuntimeEnv env, Object... args) {
        if (!function_count.f.env(env).call(this.appends).getBool()) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                this.getArrayableItems(
                        env,
                        function_array_combine
                                .f
                                .env(env)
                                .call(this.appends, this.appends)
                                .value()));
    }

    @ConvertedMethod
    public Object relationsToArray(RuntimeEnv env, Object... args) {
        ReferenceContainer attributes = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        Object relation = null;
        attributes.setObject(ZVal.newArray());
        for (ZPair zpairResult2289 :
                ZVal.getIterable(this.getArrayableRelations(env), env, false)) {
            key = ZVal.assign(zpairResult2289.getKey());
            value = ZVal.assign(zpairResult2289.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            value, Arrayable.class, "Illuminate\\Contracts\\Support\\Arrayable"))) {
                relation = env.callMethod(value, "toArray", Model.class);

            } else if (function_is_null.f.env(env).call(value).getBool()) {
                relation = ZVal.assign(value);
            }

            if (ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .snakeAttributes)) {
                key = Str.runtimeStaticObject.snake(env, key);
            }

            if (ZVal.toBool(ZVal.isset(relation))
                    || ZVal.toBool(function_is_null.f.env(env).call(value).value())) {
                attributes.arrayAccess(env, key).set(relation);
            }

            relation = null;
        }

        return ZVal.assign(attributes.getObject());
    }

    @ConvertedMethod
    protected Object getArrayableRelations(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getArrayableItems(env, this.relations));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values", typeHint = "array")
    protected Object getArrayableItems(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(this.getVisible(env)).value(), '>', 0)) {
            values =
                    function_array_intersect_key
                            .f
                            .env(env)
                            .call(
                                    values,
                                    function_array_flip
                                            .f
                                            .env(env)
                                            .call(this.getVisible(env))
                                            .value())
                            .value();
        }

        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(this.getHidden(env)).value(), '>', 0)) {
            values =
                    function_array_diff_key
                            .f
                            .env(env)
                            .call(
                                    values,
                                    function_array_flip
                                            .f
                                            .env(env)
                                            .call(this.getHidden(env))
                                            .value())
                            .value();
        }

        return ZVal.assign(values);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (!ZVal.isTrue(key)) {
            return null;
        }

        if (ZVal.toBool(function_array_key_exists.f.env(env).call(key, this.attributes).value())
                || ZVal.toBool(this.hasGetMutator(env, key))) {
            return ZVal.assign(this.getAttributeValue(env, key));
        }

        if (function_method_exists.f.env(env).call(CONST_class, key).getBool()) {
            return null;
        }

        return ZVal.assign(this.getRelationValue(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getAttributeValue(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = null;
        value = this.getAttributeFromArray(env, key);
        if (ZVal.isTrue(this.hasGetMutator(env, key))) {
            return ZVal.assign(this.mutateAttribute(env, key, value));
        }

        if (ZVal.isTrue(this.hasCast(env, key))) {
            return ZVal.assign(this.castAttribute(env, key, value));
        }

        if (ZVal.toBool(function_in_array.f.env(env).call(key, this.getDates(env)).value())
                && ZVal.toBool(!function_is_null.f.env(env).call(value).getBool())) {
            return ZVal.assign(this.asDateTime(env, value));
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object getAttributeFromArray(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "attributes", env), env, key)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "attributes", env).arrayGet(env, key));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object getRelationValue(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.relationLoaded(env, key))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "relations", env).arrayGet(env, key));
        }

        if (function_method_exists.f.env(env).call(this, key).getBool()) {
            return ZVal.assign(this.getRelationshipFromMethod(env, key));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    protected Object getRelationshipFromMethod(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns/HasAttributes.php");
        Object method = assignParameter(args, 0, false);
        Object relation = null;
        relation = env.callMethod(this, toStringR(method, env), Model.class);
        if (!ZVal.isTrue(
                ZVal.checkInstanceType(
                        relation,
                        Relation.class,
                        "Illuminate\\Database\\Eloquent\\Relations\\Relation"))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "%s::%s must return a relationship instance.",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            method)
                                    .value()));
        }

        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.callMethod(relation, "getResults", Model.class),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "results")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object results = assignParameter(args, 0, false);
                                        Object method = null;
                                        method = this.contextReferences.getCapturedValue("method");
                                        Model.this.setRelation(env, method, results);
                                        return null;
                                    }
                                }.use("method", method))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasGetMutator(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                function_method_exists
                        .f
                        .env(env)
                        .call(
                                this,
                                "get"
                                        + toStringR(Str.runtimeStaticObject.studly(env, key), env)
                                        + "Attribute")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object mutateAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, value),
                        "get"
                                + toStringR(Str.runtimeStaticObject.studly(env, key), env)
                                + "Attribute",
                        Model.class,
                        value.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object mutateAttributeForArray(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        value = this.mutateAttribute(env, key, value);
        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        value,
                                        Arrayable.class,
                                        "Illuminate\\Contracts\\Support\\Arrayable"))
                        ? env.callMethod(value, "toArray", Model.class)
                        : value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object castAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (function_is_null.f.env(env).call(value).getBool()) {
            return ZVal.assign(value);
        }

        SwitchEnumType23 switchVariable23 =
                ZVal.getEnum(
                        this.getCastType(env, key),
                        SwitchEnumType23.DEFAULT_CASE,
                        SwitchEnumType23.STRING_int,
                        "int",
                        SwitchEnumType23.STRING_integer,
                        "integer",
                        SwitchEnumType23.STRING_real,
                        "real",
                        SwitchEnumType23.STRING_float,
                        "float",
                        SwitchEnumType23.STRING_double,
                        "double",
                        SwitchEnumType23.STRING_string,
                        "string",
                        SwitchEnumType23.STRING_bool,
                        "bool",
                        SwitchEnumType23.STRING_boolean,
                        "boolean",
                        SwitchEnumType23.STRING_object,
                        "object",
                        SwitchEnumType23.STRING_array,
                        "array",
                        SwitchEnumType23.STRING_json,
                        "json",
                        SwitchEnumType23.STRING_collection,
                        "collection",
                        SwitchEnumType23.STRING_date,
                        "date",
                        SwitchEnumType23.STRING_datetime,
                        "datetime",
                        SwitchEnumType23.STRING_custom_datetime,
                        "custom_datetime",
                        SwitchEnumType23.STRING_timestamp,
                        "timestamp");
        switch (switchVariable23) {
            case STRING_int:
            case STRING_integer:
                return ZVal.assign(ZVal.toLong(value));
            case STRING_real:
            case STRING_float:
            case STRING_double:
                return ZVal.assign(ZVal.toDouble(value));
            case STRING_string:
                return ZVal.assign(toStringR(value, env));
            case STRING_bool:
            case STRING_boolean:
                return ZVal.assign(ZVal.toBool(value));
            case STRING_object:
                return ZVal.assign(this.fromJson(env, value, true));
            case STRING_array:
            case STRING_json:
                return ZVal.assign(this.fromJson(env, value));
            case STRING_collection:
                return ZVal.assign(
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Support
                                .classes
                                .Collection(env, this.fromJson(env, value)));
            case STRING_date:
                return ZVal.assign(this.asDate(env, value));
            case STRING_datetime:
            case STRING_custom_datetime:
                return ZVal.assign(this.asDateTime(env, value));
            case STRING_timestamp:
                return ZVal.assign(this.asTimestamp(env, value));
            case DEFAULT_CASE:
                return ZVal.assign(value);
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object getCastType(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                this.isCustomDateTimeCast(
                        env, handleReturnReference(this.getCasts(env)).arrayGet(env, key)))) {
            return "custom_datetime";
        }

        return ZVal.assign(
                function_trim
                        .f
                        .env(env)
                        .call(
                                NamespaceGlobal.strtolower
                                        .env(env)
                                        .call(
                                                handleReturnReference(this.getCasts(env))
                                                        .arrayGet(env, key))
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cast")
    protected Object isCustomDateTimeCast(RuntimeEnv env, Object... args) {
        Object cast = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        NamespaceGlobal.strncmp
                                                .env(env)
                                                .call(cast, "date:", 5)
                                                .value(),
                                        "===",
                                        0))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        NamespaceGlobal.strncmp
                                                .env(env)
                                                .call(cast, "datetime:", 9)
                                                .value(),
                                        "===",
                                        0)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object setAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (ZVal.isTrue(this.hasSetMutator(env, key))) {
            return ZVal.assign(this.setMutatedAttributeValue(env, key, value));

        } else if (ZVal.toBool(value) && ZVal.toBool(this.isDateAttribute(env, key))) {
            value = this.fromDateTime(env, value);
        }

        if (ZVal.toBool(this.isJsonCastable(env, key))
                && ZVal.toBool(!function_is_null.f.env(env).call(value).getBool())) {
            value = this.castAttributeAsJson(env, key, value);
        }

        if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, key, "->"))) {
            return ZVal.assign(this.fillJsonAttribute(env, key, value));
        }

        new ReferenceClassProperty(this, "attributes", env).arrayAccess(env, key).set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object hasSetMutator(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                function_method_exists
                        .f
                        .env(env)
                        .call(
                                this,
                                "set"
                                        + toStringR(Str.runtimeStaticObject.studly(env, key), env)
                                        + "Attribute")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object setMutatedAttributeValue(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        ReferenceContainer value = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                env.callMethod(
                        this,
                        new RuntimeArgsWithReferences().add(0, value),
                        "set"
                                + toStringR(Str.runtimeStaticObject.studly(env, key), env)
                                + "Attribute",
                        Model.class,
                        value.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object isDateAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(function_in_array.f.env(env).call(key, this.getDates(env)).value())
                        || ZVal.toBool(this.isDateCastable(env, key)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object fillJsonAttribute(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        Object path = null;
        Object runtimeTempArrayResult229 = null;
        ZVal.list(
                runtimeTempArrayResult229 = function_explode.f.env(env).call("->", key, 2).value(),
                (key = listGet(runtimeTempArrayResult229, 0, env)),
                (path = listGet(runtimeTempArrayResult229, 1, env)));
        new ReferenceClassProperty(this, "attributes", env)
                .arrayAccess(env, key)
                .set(this.asJson(env, this.getArrayAttributeWithValue(env, path, key, value)));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "key")
    @ConvertedParameter(index = 2, name = "value")
    protected Object getArrayAttributeWithValue(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns/HasAttributes.php");
        Object path = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, false);
        Object value = assignParameter(args, 2, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                this.getArrayAttributeByKey(env, key),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent\\Concerns",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "array")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer array =
                                                assignParameterRef(
                                                        runtimePassByReferenceArgs, args, 0, false);
                                        Object path = null;
                                        Object value = null;
                                        path = this.contextReferences.getCapturedValue("path");
                                        value = this.contextReferences.getCapturedValue("value");
                                        Arr.runtimeStaticObject.set(
                                                env,
                                                new RuntimeArgsWithReferences().add(0, array),
                                                array.getObject(),
                                                function_str_replace
                                                        .f
                                                        .env(env)
                                                        .call("->", ".", path)
                                                        .value(),
                                                value);
                                        return null;
                                    }
                                }.use("path", path).use("value", value))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object getArrayAttributeByKey(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "attributes", env),
                                env,
                                key)
                        ? this.fromJson(
                                env,
                                new ReferenceClassProperty(this, "attributes", env)
                                        .arrayGet(env, key))
                        : ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object castAttributeAsJson(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        value = this.asJson(env, value);
        if (ZVal.strictEqualityCheck(value, "===", false)) {
            throw ZVal.getException(
                    env,
                    JsonEncodingException.runtimeStaticObject.forAttribute(
                            env,
                            this,
                            key,
                            NamespaceGlobal.json_last_error_msg.env(env).call().value()));
        }

        return ZVal.assign(value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object asJson(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(NamespaceGlobal.json_encode.env(env).call(value).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "asObject",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object fromJson(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object asObject = assignParameter(args, 1, true);
        if (null == asObject) {
            asObject = false;
        }
        return ZVal.assign(
                NamespaceGlobal.json_decode.env(env).call(value, !ZVal.isTrue(asObject)).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object asDate(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.asDateTime(env, value), "startOfDay", Model.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object asDateTime(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(value, Carbon.class, "Illuminate\\Support\\Carbon"))) {
            return ZVal.assign(value);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(value, DateTimeInterface.class, "DateTimeInterface"))) {
            return ZVal.assign(
                    new Carbon(
                            env,
                            env.callMethod(value, "format", Model.class, "Y-m-d H:i:s.u"),
                            env.callMethod(value, "getTimezone", Model.class)));
        }

        if (function_is_numeric.f.env(env).call(value).getBool()) {
            return ZVal.assign(Carbon.runtimeStaticObject.createFromTimestamp(env, value));
        }

        if (ZVal.isTrue(this.isStandardDateFormat(env, value))) {
            return ZVal.assign(
                    env.callMethod(
                            Carbon.runtimeStaticObject.createFromFormat(env, "Y-m-d", value),
                            "startOfDay",
                            Model.class));
        }

        return ZVal.assign(
                Carbon.runtimeStaticObject.createFromFormat(
                        env,
                        function_str_replace
                                .f
                                .env(env)
                                .call(".v", ".u", this.getDateFormat(env))
                                .value(),
                        value));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object isStandardDateFormat(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                function_preg_match
                        .f
                        .env(env)
                        .call("/^(\\d{4})-(\\d{1,2})-(\\d{1,2})$/", value)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object fromDateTime(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isEmpty(value)
                        ? value
                        : env.callMethod(
                                this.asDateTime(env, value),
                                "format",
                                Model.class,
                                this.getDateFormat(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    protected Object asTimestamp(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(this.asDateTime(env, value), "getTimestamp", Model.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "date", typeHint = "DateTimeInterface")
    protected Object serializeDate(RuntimeEnv env, Object... args) {
        Object date = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(date, "format", Model.class, this.getDateFormat(env)));
    }

    @ConvertedMethod
    public Object getDates(RuntimeEnv env, Object... args) {
        Object defaults = null;
        defaults =
                ZVal.newArray(
                        new ZPair(
                                0,
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "CREATED_AT")),
                        new ZPair(
                                1,
                                ClassConstantUtils.getConstantValueLateStatic(
                                        env, this, "UPDATED_AT")));
        return ZVal.assign(
                ZVal.isTrue(this.usesTimestamps(env))
                        ? function_array_unique
                                .f
                                .env(env)
                                .call(
                                        function_array_merge
                                                .f
                                                .env(env)
                                                .call(this.dates, defaults)
                                                .value())
                                .value()
                        : this.dates);
    }

    @ConvertedMethod
    public Object getDateFormat(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.dateFormat)
                        ? ternaryExpressionTemp
                        : env.callMethod(
                                env.callMethod(
                                        this.getConnection(env), "getQueryGrammar", Model.class),
                                "getDateFormat",
                                Model.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format")
    public Object setDateFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        this.dateFormat = format;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "types",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasCast(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object types = assignParameter(args, 1, true);
        if (null == types) {
            types = ZVal.getNull();
        }
        if (function_array_key_exists.f.env(env).call(key, this.getCasts(env)).getBool()) {
            return ZVal.assign(
                    ZVal.isTrue(types)
                            ? function_in_array
                                    .f
                                    .env(env)
                                    .call(this.getCastType(env, key), rToArrayCast(types), true)
                                    .value()
                            : true);
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getCasts(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(this.getIncrementing(env))) {
            return ZVal.assign(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    ZVal.newArray(
                                            new ZPair(this.getKeyName(env), this.getKeyType(env))),
                                    this.casts)
                            .value());
        }

        return ZVal.assign(this.casts);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object isDateCastable(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.hasCast(env, key, ZVal.arrayFromList("date", "datetime")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    protected Object isJsonCastable(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                this.hasCast(
                        env, key, ZVal.arrayFromList("array", "json", "object", "collection")));
    }

    @ConvertedMethod
    public Object getAttributes(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attributes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "sync",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object setRawAttributes(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object sync = assignParameter(args, 1, true);
        if (null == sync) {
            sync = false;
        }
        this.attributes = attributes;
        if (ZVal.isTrue(sync)) {
            this.syncOriginal(env);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getOriginal(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(Arr.runtimeStaticObject.get(env, this.original, key, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes")
    public Object only(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        Object attribute = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        results.setObject(ZVal.newArray());
        for (ZPair zpairResult2290 :
                ZVal.getIterable(
                        function_is_array.f.env(env).call(attributes).getBool()
                                ? attributes
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value(),
                        env,
                        true)) {
            attribute = ZVal.assign(zpairResult2290.getValue());
            results.arrayAccess(env, attribute).set(this.getAttribute(env, attribute));
        }

        return ZVal.assign(results.getObject());
    }

    @ConvertedMethod
    public Object syncOriginal(RuntimeEnv env, Object... args) {
        this.original = this.attributes;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    public Object syncOriginalAttribute(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "original", env)
                .arrayAccess(env, attribute)
                .set(new ReferenceClassProperty(this, "attributes", env).arrayGet(env, attribute));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object syncChanges(RuntimeEnv env, Object... args) {
        this.changes = this.getDirty(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object isDirty(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.getNull();
        }
        return ZVal.assign(
                this.hasChanges(
                        env,
                        this.getDirty(env),
                        function_is_array.f.env(env).call(attributes).getBool()
                                ? attributes
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object isClean(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.getNull();
        }
        return ZVal.assign(
                !ZVal.isTrue(
                        this.isDirty(
                                env,
                                PackedVaradicArgs.unpack(
                                        new PackedVaradicArgs(
                                                function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value())))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object wasChanged(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.getNull();
        }
        return ZVal.assign(
                this.hasChanges(
                        env,
                        this.getChanges(env),
                        function_is_array.f.env(env).call(attributes).getBool()
                                ? attributes
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "changes")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object hasChanges(RuntimeEnv env, Object... args) {
        Object changes = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.getNull();
        }
        Object attribute = null;
        if (ZVal.isEmpty(attributes)) {
            return ZVal.assign(
                    ZVal.isGreaterThan(function_count.f.env(env).call(changes).value(), '>', 0));
        }

        for (ZPair zpairResult2291 :
                ZVal.getIterable(Arr.runtimeStaticObject.wrap(env, attributes), env, true)) {
            attribute = ZVal.assign(zpairResult2291.getValue());
            if (function_array_key_exists.f.env(env).call(attribute, changes).getBool()) {
                return ZVal.assign(true);
            }
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getDirty(RuntimeEnv env, Object... args) {
        ReferenceContainer dirty = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        dirty.setObject(ZVal.newArray());
        for (ZPair zpairResult2292 : ZVal.getIterable(this.getAttributes(env), env, false)) {
            key = ZVal.assign(zpairResult2292.getKey());
            value = ZVal.assign(zpairResult2292.getValue());
            if (!ZVal.isTrue(this.originalIsEquivalent(env, key, value))) {
                dirty.arrayAccess(env, key).set(value);
            }
        }

        return ZVal.assign(dirty.getObject());
    }

    @ConvertedMethod
    public Object getChanges(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.changes);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "current")
    protected Object originalIsEquivalent(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object current = assignParameter(args, 1, false);
        Object original = null;
        if (!function_array_key_exists.f.env(env).call(key, this.original).getBool()) {
            return ZVal.assign(false);
        }

        original = this.getOriginal(env, key);
        if (ZVal.strictEqualityCheck(current, "===", original)) {
            return ZVal.assign(true);

        } else if (function_is_null.f.env(env).call(current).getBool()) {
            return ZVal.assign(false);

        } else if (ZVal.isTrue(this.isDateAttribute(env, key))) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            this.fromDateTime(env, current),
                            "===",
                            this.fromDateTime(env, original)));

        } else if (ZVal.isTrue(this.hasCast(env, key))) {
            return ZVal.assign(
                    ZVal.strictEqualityCheck(
                            this.castAttribute(env, key, current),
                            "===",
                            this.castAttribute(env, key, original)));
        }

        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(function_is_numeric.f.env(env).call(current).value())
                                        && ZVal.toBool(
                                                function_is_numeric
                                                        .f
                                                        .env(env)
                                                        .call(original)
                                                        .value()))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        NamespaceGlobal.strcmp
                                                .env(env)
                                                .call(
                                                        toStringR(current, env),
                                                        toStringR(original, env))
                                                .value(),
                                        "===",
                                        0)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes")
    public Object append(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        this.appends =
                function_array_unique
                        .f
                        .env(env)
                        .call(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                this.appends,
                                                function_is_string
                                                                .f
                                                                .env(env)
                                                                .call(attributes)
                                                                .getBool()
                                                        ? function_func_get_args
                                                                .f
                                                                .env(env)
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithInfo(
                                                                                args, this))
                                                                .call()
                                                                .value()
                                                        : attributes)
                                        .value())
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "appends", typeHint = "array")
    public Object setAppends(RuntimeEnv env, Object... args) {
        Object appends = assignParameter(args, 0, false);
        this.appends = appends;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getMutatedAttributes(RuntimeEnv env, Object... args) {
        ReferenceContainer _pClass = new BasicReferenceContainer(null);
        _pClass.setObject(
                ZVal.assign(ClassConstantUtils.getConstantValueLateStatic(env, this, "class")));
        if (!arrayActionR(
                ArrayAction.ISSET,
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
                                .classes
                                .Model
                                .RequestStaticProperties
                                .class,
                        "mutatorCache"),
                env,
                _pClass.getObject())) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("cacheMutatedAttributes")
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(0, _pClass))
                    .call(_pClass.getObject())
                    .value();
        }

        return ZVal.assign(
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
                                        .classes
                                        .Model
                                        .RequestStaticProperties
                                        .class,
                                "mutatorCache")
                        .arrayGet(env, _pClass.getObject()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object registerObserver(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object className = null;
        ReferenceContainer event = new BasicReferenceContainer(null);
        className =
                ZVal.assign(
                        function_is_string.f.env(env).call(_pClass).getBool()
                                ? _pClass
                                : function_get_class.f.env(env).call(_pClass).value());
        for (ZPair zpairResult2294 : ZVal.getIterable(this.getObservableEvents(env), env, true)) {
            event.setObject(ZVal.assign(zpairResult2294.getValue()));
            if (function_method_exists.f.env(env).call(_pClass, event.getObject()).getBool()) {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                        .method("registerModelEvent")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, event))
                        .call(
                                event.getObject(),
                                toStringR(className, env) + "@" + toStringR(event.getObject(), env))
                        .value();
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getObservableEvents(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.arrayFromList(
                                        "retrieved",
                                        "creating",
                                        "created",
                                        "updating",
                                        "updated",
                                        "saving",
                                        "saved",
                                        "restoring",
                                        "restored",
                                        "deleting",
                                        "deleted",
                                        "forceDeleted"),
                                this.observables)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "observables", typeHint = "array")
    public Object setObservableEvents(RuntimeEnv env, Object... args) {
        Object observables = assignParameter(args, 0, false);
        this.observables = observables;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "observables")
    public Object addObservableEvents(RuntimeEnv env, Object... args) {
        Object observables = assignParameter(args, 0, false);
        this.observables =
                function_array_unique
                        .f
                        .env(env)
                        .call(
                                function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                this.observables,
                                                function_is_array
                                                                .f
                                                                .env(env)
                                                                .call(observables)
                                                                .getBool()
                                                        ? observables
                                                        : function_func_get_args
                                                                .f
                                                                .env(env)
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithInfo(
                                                                                args, this))
                                                                .call()
                                                                .value())
                                        .value())
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "observables")
    public Object removeObservableEvents(RuntimeEnv env, Object... args) {
        Object observables = assignParameter(args, 0, false);
        this.observables =
                function_array_diff
                        .f
                        .env(env)
                        .call(
                                this.observables,
                                function_is_array.f.env(env).call(observables).getBool()
                                        ? observables
                                        : function_func_get_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value())
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(
        index = 1,
        name = "halt",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object fireModelEvent(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object halt = assignParameter(args, 1, true);
        if (null == halt) {
            halt = true;
        }
        Object result = null;
        Object method = null;
        if (!ZVal.isset(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Database
                                        .namespaces
                                        .Eloquent
                                        .classes
                                        .Model
                                        .RequestStaticProperties
                                        .class)
                        .dispatcher)) {
            return ZVal.assign(true);
        }

        method = ZVal.assign(ZVal.isTrue(halt) ? "until" : "fire");
        result = this.filterModelEventResults(env, this.fireCustomModelEvent(env, event, method));
        if (ZVal.strictEqualityCheck(result, "===", false)) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                !ZVal.isEmpty(result)
                        ? result
                        : env.callMethod(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Illuminate
                                                        .namespaces
                                                        .Database
                                                        .namespaces
                                                        .Eloquent
                                                        .classes
                                                        .Model
                                                        .RequestStaticProperties
                                                        .class)
                                        .dispatcher,
                                new RuntimeArgsWithReferences()
                                        .add(1, new ReadOnlyReferenceContainer(this)),
                                toStringR(method, env),
                                Model.class,
                                toStringR("eloquent." + toStringR(event, env) + ": ", env)
                                        + toStringR(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                env),
                                this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "event")
    @ConvertedParameter(index = 1, name = "method")
    protected Object fireCustomModelEvent(RuntimeEnv env, Object... args) {
        Object event = assignParameter(args, 0, false);
        Object method = assignParameter(args, 1, false);
        Object result = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "dispatchesEvents", env),
                env,
                event)) {
            return null;
        }

        result =
                env.callMethod(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Database
                                                .namespaces
                                                .Eloquent
                                                .classes
                                                .Model
                                                .RequestStaticProperties
                                                .class)
                                .dispatcher,
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        Model.class,
                        env.createNew(
                                new ReferenceClassProperty(this, "dispatchesEvents", env)
                                        .arrayGet(env, event),
                                this));
        if (!function_is_null.f.env(env).call(result).getBool()) {
            return ZVal.assign(result);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result")
    protected Object filterModelEventResults(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns/HasEvents.php");
        Object result = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(result).getBool()) {
            result =
                    function_array_filter
                            .f
                            .env(env)
                            .call(
                                    result,
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Illuminate\\Database\\Eloquent\\Concerns",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "response")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object response = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    !function_is_null
                                                            .f
                                                            .env(env)
                                                            .call(response)
                                                            .getBool());
                                        }
                                    })
                            .value();
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object getGlobalScopes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                Arr.runtimeStaticObject.get(
                        env,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Database
                                                .namespaces
                                                .Eloquent
                                                .classes
                                                .Model
                                                .RequestStaticProperties
                                                .class)
                                .globalScopes,
                        ClassConstantUtils.getConstantValueLateStatic(env, this, "class"),
                        ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    @ConvertedParameter(
        index = 1,
        name = "foreignKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "localKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasOne(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object foreignKey = assignParameter(args, 1, true);
        if (null == foreignKey) {
            foreignKey = ZVal.getNull();
        }
        Object localKey = assignParameter(args, 2, true);
        if (null == localKey) {
            localKey = ZVal.getNull();
        }
        Object instance = null;
        Object ternaryExpressionTemp = null;
        instance = this.newRelatedInstance(env, related);
        foreignKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = foreignKey)
                                ? ternaryExpressionTemp
                                : this.getForeignKey(env));
        localKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = localKey)
                                ? ternaryExpressionTemp
                                : this.getKeyName(env));
        return ZVal.assign(
                this.newHasOne(
                        env,
                        env.callMethod(instance, "newQuery", Model.class),
                        this,
                        toStringR(env.callMethod(instance, "getTable", Model.class), env)
                                + "."
                                + toStringR(foreignKey, env),
                        localKey));
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
    protected Object newHasOne(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object foreignKey = assignParameter(args, 2, false);
        Object localKey = assignParameter(args, 3, false);
        return ZVal.assign(new HasOne(env, query, parent, foreignKey, localKey));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "id",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "localKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object morphOne(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object id = assignParameter(args, 3, true);
        if (null == id) {
            id = ZVal.getNull();
        }
        Object localKey = assignParameter(args, 4, true);
        if (null == localKey) {
            localKey = ZVal.getNull();
        }
        Object instance = null;
        Object ternaryExpressionTemp = null;
        Object runtimeTempArrayResult230 = null;
        Object table = null;
        instance = this.newRelatedInstance(env, related);
        ZVal.list(
                runtimeTempArrayResult230 = this.getMorphs(env, name, type, id),
                (type = listGet(runtimeTempArrayResult230, 0, env)),
                (id = listGet(runtimeTempArrayResult230, 1, env)));
        table = env.callMethod(instance, "getTable", Model.class);
        localKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = localKey)
                                ? ternaryExpressionTemp
                                : this.getKeyName(env));
        return ZVal.assign(
                this.newMorphOne(
                        env,
                        env.callMethod(instance, "newQuery", Model.class),
                        this,
                        toStringR(table, env) + "." + toStringR(type, env),
                        toStringR(table, env) + "." + toStringR(id, env),
                        localKey));
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
    protected Object newMorphOne(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object id = assignParameter(args, 3, false);
        Object localKey = assignParameter(args, 4, false);
        return ZVal.assign(new MorphOne(env, query, parent, type, id, localKey));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    @ConvertedParameter(
        index = 1,
        name = "foreignKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "ownerKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "relation",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object belongsTo(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object foreignKey = assignParameter(args, 1, true);
        if (null == foreignKey) {
            foreignKey = ZVal.getNull();
        }
        Object ownerKey = assignParameter(args, 2, true);
        if (null == ownerKey) {
            ownerKey = ZVal.getNull();
        }
        Object relation = assignParameter(args, 3, true);
        if (null == relation) {
            relation = ZVal.getNull();
        }
        Object instance = null;
        Object ternaryExpressionTemp = null;
        if (function_is_null.f.env(env).call(relation).getBool()) {
            relation = this.guessBelongsToRelation(env);
        }

        instance = this.newRelatedInstance(env, related);
        if (function_is_null.f.env(env).call(foreignKey).getBool()) {
            foreignKey =
                    toStringR(Str.runtimeStaticObject.snake(env, relation), env)
                            + "_"
                            + toStringR(env.callMethod(instance, "getKeyName", Model.class), env);
        }

        ownerKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = ownerKey)
                                ? ternaryExpressionTemp
                                : env.callMethod(instance, "getKeyName", Model.class));
        return ZVal.assign(
                this.newBelongsTo(
                        env,
                        env.callMethod(instance, "newQuery", Model.class),
                        this,
                        foreignKey,
                        ownerKey,
                        relation));
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
    protected Object newBelongsTo(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object child = assignParameter(args, 1, false);
        Object foreignKey = assignParameter(args, 2, false);
        Object ownerKey = assignParameter(args, 3, false);
        Object relation = assignParameter(args, 4, false);
        return ZVal.assign(new BelongsTo(env, query, child, foreignKey, ownerKey, relation));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "id",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "ownerKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object morphTo(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object id = assignParameter(args, 2, true);
        if (null == id) {
            id = ZVal.getNull();
        }
        Object ownerKey = assignParameter(args, 3, true);
        if (null == ownerKey) {
            ownerKey = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        Object runtimeTempArrayResult231 = null;
        Object _pClass = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.guessBelongsToRelation(env));
        ZVal.list(
                runtimeTempArrayResult231 =
                        this.getMorphs(env, Str.runtimeStaticObject.snake(env, name), type, id),
                (type = listGet(runtimeTempArrayResult231, 0, env)),
                (id = listGet(runtimeTempArrayResult231, 1, env)));
        return ZVal.assign(
                ZVal.isEmpty(
                                _pClass =
                                        ZVal.assign(
                                                toObjectR(this)
                                                        .accessProp(this, env)
                                                        .name(type)
                                                        .value()))
                        ? this.morphEagerTo(env, name, type, id, ownerKey)
                        : this.morphInstanceTo(env, _pClass, name, type, id, ownerKey));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "id")
    @ConvertedParameter(index = 3, name = "ownerKey")
    protected Object morphEagerTo(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object id = assignParameter(args, 2, false);
        Object ownerKey = assignParameter(args, 3, false);
        return ZVal.assign(
                this.newMorphTo(
                        env,
                        env.callMethod(
                                this.newQuery(env), "setEagerLoads", Model.class, ZVal.newArray()),
                        this,
                        id,
                        ownerKey,
                        type,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "target")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "type")
    @ConvertedParameter(index = 3, name = "id")
    @ConvertedParameter(index = 4, name = "ownerKey")
    protected Object morphInstanceTo(RuntimeEnv env, Object... args) {
        ReferenceContainer target = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object name = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object id = assignParameter(args, 3, false);
        Object ownerKey = assignParameter(args, 4, false);
        Object instance = null;
        Object ternaryExpressionTemp = null;
        instance =
                this.newRelatedInstance(
                        env,
                        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                                .method("getActualClassNameForMorph")
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(0, target))
                                .call(target.getObject())
                                .value());
        return ZVal.assign(
                this.newMorphTo(
                        env,
                        env.callMethod(instance, "newQuery", Model.class),
                        this,
                        id,
                        ZVal.isDefined(ternaryExpressionTemp = ownerKey)
                                ? ternaryExpressionTemp
                                : env.callMethod(instance, "getKeyName", Model.class),
                        type,
                        name));
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
    protected Object newMorphTo(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object foreignKey = assignParameter(args, 2, false);
        Object ownerKey = assignParameter(args, 3, false);
        Object type = assignParameter(args, 4, false);
        Object relation = assignParameter(args, 5, false);
        return ZVal.assign(new MorphTo(env, query, parent, foreignKey, ownerKey, type, relation));
    }

    @ConvertedMethod
    protected Object guessBelongsToRelation(RuntimeEnv env, Object... args) {
        ReferenceContainer caller = new BasicReferenceContainer(null);
        Object one = null;
        Object runtimeTempArrayResult232 = null;
        Object two = null;
        ZVal.list(
                runtimeTempArrayResult232 =
                        NamespaceGlobal.debug_backtrace.env(env).call(2, 3).value(),
                (one = listGet(runtimeTempArrayResult232, 0, env)),
                (two = listGet(runtimeTempArrayResult232, 1, env)),
                (caller.setObject(listGet(runtimeTempArrayResult232, 2, env))));
        return ZVal.assign(caller.arrayGet(env, "function"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    @ConvertedParameter(
        index = 1,
        name = "foreignKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "localKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasMany(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object foreignKey = assignParameter(args, 1, true);
        if (null == foreignKey) {
            foreignKey = ZVal.getNull();
        }
        Object localKey = assignParameter(args, 2, true);
        if (null == localKey) {
            localKey = ZVal.getNull();
        }
        Object instance = null;
        Object ternaryExpressionTemp = null;
        instance = this.newRelatedInstance(env, related);
        foreignKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = foreignKey)
                                ? ternaryExpressionTemp
                                : this.getForeignKey(env));
        localKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = localKey)
                                ? ternaryExpressionTemp
                                : this.getKeyName(env));
        return ZVal.assign(
                this.newHasMany(
                        env,
                        env.callMethod(instance, "newQuery", Model.class),
                        this,
                        toStringR(env.callMethod(instance, "getTable", Model.class), env)
                                + "."
                                + toStringR(foreignKey, env),
                        localKey));
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
    protected Object newHasMany(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object foreignKey = assignParameter(args, 2, false);
        Object localKey = assignParameter(args, 3, false);
        return ZVal.assign(new HasMany(env, query, parent, foreignKey, localKey));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    @ConvertedParameter(index = 1, name = "through")
    @ConvertedParameter(
        index = 2,
        name = "firstKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "secondKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "localKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "secondLocalKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object hasManyThrough(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object through = assignParameter(args, 1, false);
        Object firstKey = assignParameter(args, 2, true);
        if (null == firstKey) {
            firstKey = ZVal.getNull();
        }
        Object secondKey = assignParameter(args, 3, true);
        if (null == secondKey) {
            secondKey = ZVal.getNull();
        }
        Object localKey = assignParameter(args, 4, true);
        if (null == localKey) {
            localKey = ZVal.getNull();
        }
        Object secondLocalKey = assignParameter(args, 5, true);
        if (null == secondLocalKey) {
            secondLocalKey = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        through = env.createNew(through);
        firstKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = firstKey)
                                ? ternaryExpressionTemp
                                : this.getForeignKey(env));
        secondKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = secondKey)
                                ? ternaryExpressionTemp
                                : env.callMethod(through, "getForeignKey", Model.class));
        return ZVal.assign(
                this.newHasManyThrough(
                        env,
                        env.callMethod(
                                this.newRelatedInstance(env, related), "newQuery", Model.class),
                        this,
                        through,
                        firstKey,
                        secondKey,
                        ZVal.isTrue(ternaryExpressionTemp = localKey)
                                ? ternaryExpressionTemp
                                : this.getKeyName(env),
                        ZVal.isTrue(ternaryExpressionTemp = secondLocalKey)
                                ? ternaryExpressionTemp
                                : env.callMethod(through, "getKeyName", Model.class)));
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
    protected Object newHasManyThrough(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object farParent = assignParameter(args, 1, false);
        Object throughParent = assignParameter(args, 2, false);
        Object firstKey = assignParameter(args, 3, false);
        Object secondKey = assignParameter(args, 4, false);
        Object localKey = assignParameter(args, 5, false);
        Object secondLocalKey = assignParameter(args, 6, false);
        return ZVal.assign(
                new HasManyThrough(
                        env,
                        query,
                        farParent,
                        throughParent,
                        firstKey,
                        secondKey,
                        localKey,
                        secondLocalKey));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "id",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "localKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object morphMany(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object id = assignParameter(args, 3, true);
        if (null == id) {
            id = ZVal.getNull();
        }
        Object localKey = assignParameter(args, 4, true);
        if (null == localKey) {
            localKey = ZVal.getNull();
        }
        Object instance = null;
        Object runtimeTempArrayResult233 = null;
        Object ternaryExpressionTemp = null;
        Object table = null;
        instance = this.newRelatedInstance(env, related);
        ZVal.list(
                runtimeTempArrayResult233 = this.getMorphs(env, name, type, id),
                (type = listGet(runtimeTempArrayResult233, 0, env)),
                (id = listGet(runtimeTempArrayResult233, 1, env)));
        table = env.callMethod(instance, "getTable", Model.class);
        localKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = localKey)
                                ? ternaryExpressionTemp
                                : this.getKeyName(env));
        return ZVal.assign(
                this.newMorphMany(
                        env,
                        env.callMethod(instance, "newQuery", Model.class),
                        this,
                        toStringR(table, env) + "." + toStringR(type, env),
                        toStringR(table, env) + "." + toStringR(id, env),
                        localKey));
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
    protected Object newMorphMany(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        Object id = assignParameter(args, 3, false);
        Object localKey = assignParameter(args, 4, false);
        return ZVal.assign(new MorphMany(env, query, parent, type, id, localKey));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    @ConvertedParameter(
        index = 1,
        name = "table",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "foreignPivotKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "relatedPivotKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "parentKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "relatedKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "relation",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object belongsToMany(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object table = assignParameter(args, 1, true);
        if (null == table) {
            table = ZVal.getNull();
        }
        Object foreignPivotKey = assignParameter(args, 2, true);
        if (null == foreignPivotKey) {
            foreignPivotKey = ZVal.getNull();
        }
        Object relatedPivotKey = assignParameter(args, 3, true);
        if (null == relatedPivotKey) {
            relatedPivotKey = ZVal.getNull();
        }
        Object parentKey = assignParameter(args, 4, true);
        if (null == parentKey) {
            parentKey = ZVal.getNull();
        }
        Object relatedKey = assignParameter(args, 5, true);
        if (null == relatedKey) {
            relatedKey = ZVal.getNull();
        }
        Object relation = assignParameter(args, 6, true);
        if (null == relation) {
            relation = ZVal.getNull();
        }
        Object instance = null;
        Object ternaryExpressionTemp = null;
        if (function_is_null.f.env(env).call(relation).getBool()) {
            relation = this.guessBelongsToManyRelation(env);
        }

        instance = this.newRelatedInstance(env, related);
        foreignPivotKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = foreignPivotKey)
                                ? ternaryExpressionTemp
                                : this.getForeignKey(env));
        relatedPivotKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = relatedPivotKey)
                                ? ternaryExpressionTemp
                                : env.callMethod(instance, "getForeignKey", Model.class));
        if (function_is_null.f.env(env).call(table).getBool()) {
            table = this.joiningTable(env, related);
        }

        return ZVal.assign(
                this.newBelongsToMany(
                        env,
                        env.callMethod(instance, "newQuery", Model.class),
                        this,
                        table,
                        foreignPivotKey,
                        relatedPivotKey,
                        ZVal.isTrue(ternaryExpressionTemp = parentKey)
                                ? ternaryExpressionTemp
                                : this.getKeyName(env),
                        ZVal.isTrue(ternaryExpressionTemp = relatedKey)
                                ? ternaryExpressionTemp
                                : env.callMethod(instance, "getKeyName", Model.class),
                        relation));
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
    @ConvertedParameter(index = 2, name = "table")
    @ConvertedParameter(index = 3, name = "foreignPivotKey")
    @ConvertedParameter(index = 4, name = "relatedPivotKey")
    @ConvertedParameter(index = 5, name = "parentKey")
    @ConvertedParameter(index = 6, name = "relatedKey")
    @ConvertedParameter(
        index = 7,
        name = "relationName",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object newBelongsToMany(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object parent = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, false);
        Object foreignPivotKey = assignParameter(args, 3, false);
        Object relatedPivotKey = assignParameter(args, 4, false);
        Object parentKey = assignParameter(args, 5, false);
        Object relatedKey = assignParameter(args, 6, false);
        Object relationName = assignParameter(args, 7, true);
        if (null == relationName) {
            relationName = ZVal.getNull();
        }
        return ZVal.assign(
                new BelongsToMany(
                        env,
                        query,
                        parent,
                        table,
                        foreignPivotKey,
                        relatedPivotKey,
                        parentKey,
                        relatedKey,
                        relationName));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "table",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "foreignPivotKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "relatedPivotKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "parentKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "relatedKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 7,
        name = "inverse",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object morphToMany(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, true);
        if (null == table) {
            table = ZVal.getNull();
        }
        Object foreignPivotKey = assignParameter(args, 3, true);
        if (null == foreignPivotKey) {
            foreignPivotKey = ZVal.getNull();
        }
        Object relatedPivotKey = assignParameter(args, 4, true);
        if (null == relatedPivotKey) {
            relatedPivotKey = ZVal.getNull();
        }
        Object parentKey = assignParameter(args, 5, true);
        if (null == parentKey) {
            parentKey = ZVal.getNull();
        }
        Object relatedKey = assignParameter(args, 6, true);
        if (null == relatedKey) {
            relatedKey = ZVal.getNull();
        }
        Object inverse = assignParameter(args, 7, true);
        if (null == inverse) {
            inverse = false;
        }
        Object caller = null;
        Object instance = null;
        Object ternaryExpressionTemp = null;
        caller = this.guessBelongsToManyRelation(env);
        instance = this.newRelatedInstance(env, related);
        foreignPivotKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = foreignPivotKey)
                                ? ternaryExpressionTemp
                                : toStringR(name, env) + "_id");
        relatedPivotKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = relatedPivotKey)
                                ? ternaryExpressionTemp
                                : env.callMethod(instance, "getForeignKey", Model.class));
        table =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = table)
                                ? ternaryExpressionTemp
                                : Str.runtimeStaticObject.plural(env, name));
        return ZVal.assign(
                this.newMorphToMany(
                        env,
                        env.callMethod(instance, "newQuery", Model.class),
                        this,
                        name,
                        table,
                        foreignPivotKey,
                        relatedPivotKey,
                        ZVal.isTrue(ternaryExpressionTemp = parentKey)
                                ? ternaryExpressionTemp
                                : this.getKeyName(env),
                        ZVal.isTrue(ternaryExpressionTemp = relatedKey)
                                ? ternaryExpressionTemp
                                : env.callMethod(instance, "getKeyName", Model.class),
                        caller,
                        inverse));
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
    protected Object newMorphToMany(RuntimeEnv env, Object... args) {
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
        return ZVal.assign(
                new MorphToMany(
                        env,
                        query,
                        parent,
                        name,
                        table,
                        foreignPivotKey,
                        relatedPivotKey,
                        parentKey,
                        relatedKey,
                        relationName,
                        inverse));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(
        index = 2,
        name = "table",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "foreignPivotKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "relatedPivotKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "parentKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 6,
        name = "relatedKey",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object morphedByMany(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object table = assignParameter(args, 2, true);
        if (null == table) {
            table = ZVal.getNull();
        }
        Object foreignPivotKey = assignParameter(args, 3, true);
        if (null == foreignPivotKey) {
            foreignPivotKey = ZVal.getNull();
        }
        Object relatedPivotKey = assignParameter(args, 4, true);
        if (null == relatedPivotKey) {
            relatedPivotKey = ZVal.getNull();
        }
        Object parentKey = assignParameter(args, 5, true);
        if (null == parentKey) {
            parentKey = ZVal.getNull();
        }
        Object relatedKey = assignParameter(args, 6, true);
        if (null == relatedKey) {
            relatedKey = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        foreignPivotKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = foreignPivotKey)
                                ? ternaryExpressionTemp
                                : this.getForeignKey(env));
        relatedPivotKey =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = relatedPivotKey)
                                ? ternaryExpressionTemp
                                : toStringR(name, env) + "_id");
        return ZVal.assign(
                this.morphToMany(
                        env,
                        related,
                        name,
                        table,
                        foreignPivotKey,
                        relatedPivotKey,
                        parentKey,
                        relatedKey,
                        true));
    }

    @ConvertedMethod
    protected Object guessBelongsToManyRelation(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns/HasRelationships.php");
        ReferenceContainer caller = new BasicReferenceContainer(null);
        caller.setObject(
                Arr.runtimeStaticObject.first(
                        env,
                        NamespaceGlobal.debug_backtrace.env(env).call(2).value(),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent\\Concerns",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "trace")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                ReferenceContainer trace =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 0, false));
                                return ZVal.assign(
                                        !function_in_array
                                                .f
                                                .env(env)
                                                .call(
                                                        trace.arrayGet(env, "function"),
                                                        env.getRequestStaticProperties(
                                                                        com.project
                                                                                .convertedCode
                                                                                .globalNamespace
                                                                                .namespaces
                                                                                .Illuminate
                                                                                .namespaces
                                                                                .Database
                                                                                .namespaces
                                                                                .Eloquent
                                                                                .classes
                                                                                .Model
                                                                                .RequestStaticProperties
                                                                                .class)
                                                                .manyMethods)
                                                .getBool());
                            }
                        }));
        return ZVal.assign(
                !function_is_null.f.env(env).call(caller.getObject()).getBool()
                        ? caller.arrayGet(env, "function")
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "related")
    public Object joiningTable(RuntimeEnv env, Object... args) {
        Object related = assignParameter(args, 0, false);
        Object models = null;
        models =
                ZVal.newArray(
                        new ZPair(
                                0,
                                Str.runtimeStaticObject.snake(
                                        env, class_basename.f.env(env).call(related).value())),
                        new ZPair(
                                1,
                                Str.runtimeStaticObject.snake(
                                        env, class_basename.f.env(env).call(this).value())));
        function_sort.f.env(env).call(models);
        return ZVal.assign(
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(NamespaceGlobal.implode.env(env).call("_", models).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    public Object touches(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        return ZVal.assign(function_in_array.f.env(env).call(relation, this.touches).value());
    }

    @ConvertedMethod
    public Object touchOwners(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns/HasRelationships.php");
        Object relation = null;
        for (ZPair zpairResult2297 : ZVal.getIterable(this.touches, env, true)) {
            relation = ZVal.assign(zpairResult2297.getValue());
            env.callMethod(
                    env.callMethod(this, toStringR(relation, env), Model.class),
                    "touch",
                    Model.class);
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            toObjectR(this).accessProp(this, env).name(relation).value(),
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Database
                                    .namespaces
                                    .Eloquent
                                    .classes
                                    .Model
                                    .class,
                            "Illuminate\\Database\\Eloquent\\Model"))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name(relation).value(),
                        "fireModelEvent",
                        Model.class,
                        "saved",
                        false);
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name(relation).value(),
                        "touchOwners",
                        Model.class);

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            toObjectR(this).accessProp(this, env).name(relation).value(),
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Database
                                    .namespaces
                                    .Eloquent
                                    .classes
                                    .Collection
                                    .class,
                            "Illuminate\\Database\\Eloquent\\Collection"))) {
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name(relation).value(),
                        "each",
                        Model.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent\\Concerns",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(
                                index = 0,
                                name = "relation",
                                typeHint = "Illuminate\\Database\\Eloquent\\Model"
                            )
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object relation = assignParameter(args, 0, false);
                                env.callMethod(relation, "touchOwners", Model.class);
                                return null;
                            }
                        });
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(index = 2, name = "id")
    protected Object getMorphs(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, false);
        Object id = assignParameter(args, 2, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(
                                0,
                                ZVal.isTrue(ternaryExpressionTemp = type)
                                        ? ternaryExpressionTemp
                                        : toStringR(name, env) + "_type"),
                        new ZPair(
                                1,
                                ZVal.isTrue(ternaryExpressionTemp = id)
                                        ? ternaryExpressionTemp
                                        : toStringR(name, env) + "_id")));
    }

    @ConvertedMethod
    public Object getMorphClass(RuntimeEnv env, Object... args) {
        Object morphMap = null;
        morphMap = Relation.runtimeStaticObject.morphMap(env);
        if (ZVal.toBool(!ZVal.isEmpty(morphMap))
                && ZVal.toBool(
                        function_in_array
                                .f
                                .env(env)
                                .call(
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        morphMap)
                                .value())) {
            return ZVal.assign(
                    function_array_search
                            .f
                            .env(env)
                            .call(
                                    ClassConstantUtils.getConstantValueLateStatic(
                                            env, this, "class"),
                                    morphMap,
                                    true)
                            .value());
        }

        return ZVal.assign(ClassConstantUtils.getConstantValueLateStatic(env, this, "class"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object newRelatedInstance(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns/HasRelationships.php");
        Object _pClass = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                env.createNew(_pClass),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent\\Concerns",
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
                                        if (!ZVal.isTrue(
                                                env.callMethod(
                                                        instance,
                                                        "getConnectionName",
                                                        Model.class))) {
                                            env.callMethod(
                                                    instance,
                                                    "setConnection",
                                                    Model.class,
                                                    Model.this.connection);
                                        }

                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    public Object getRelations(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.relations);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    public Object getRelation(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        return ZVal.assign(
                new ReferenceClassProperty(this, "relations", env).arrayGet(env, relation));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object relationLoaded(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(function_array_key_exists.f.env(env).call(key, this.relations).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(index = 1, name = "value")
    public Object setRelation(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "relations", env).arrayAccess(env, relation).set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    public Object unsetRelation(RuntimeEnv env, Object... args) {
        Object relation = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "relations", env),
                env,
                relation);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations", typeHint = "array")
    public Object setRelations(RuntimeEnv env, Object... args) {
        Object relations = assignParameter(args, 0, false);
        this.relations = relations;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getTouchedRelations(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.touches);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "touches", typeHint = "array")
    public Object setTouchedRelations(RuntimeEnv env, Object... args) {
        Object touches = assignParameter(args, 0, false);
        this.touches = touches;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object touch(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.usesTimestamps(env))) {
            return ZVal.assign(false);
        }

        this.updateTimestamps(env);
        return ZVal.assign(this.save(env));
    }

    @ConvertedMethod
    protected Object updateTimestamps(RuntimeEnv env, Object... args) {
        Object time = null;
        time = this.freshTimestamp(env);
        if (ZVal.toBool(
                        !function_is_null
                                .f
                                .env(env)
                                .call(
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "UPDATED_AT"))
                                .getBool())
                && ZVal.toBool(
                        !ZVal.isTrue(
                                this.isDirty(
                                        env,
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "UPDATED_AT"))))) {
            this.setUpdatedAt(env, time);
        }

        if (ZVal.toBool(
                        ZVal.toBool(!ZVal.isTrue(this.exists))
                                && ZVal.toBool(
                                        !function_is_null
                                                .f
                                                .env(env)
                                                .call(
                                                        ClassConstantUtils
                                                                .getConstantValueLateStatic(
                                                                        env, this, "CREATED_AT"))
                                                .getBool()))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                this.isDirty(
                                        env,
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "CREATED_AT"))))) {
            this.setCreatedAt(env, time);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setCreatedAt(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        toObjectR(this)
                .accessProp(this, env)
                .name(ClassConstantUtils.getConstantValueLateStatic(env, this, "CREATED_AT"))
                .set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    public Object setUpdatedAt(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        toObjectR(this)
                .accessProp(this, env)
                .name(ClassConstantUtils.getConstantValueLateStatic(env, this, "UPDATED_AT"))
                .set(value);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object freshTimestamp(RuntimeEnv env, Object... args) {
        return ZVal.assign(new Carbon(env));
    }

    @ConvertedMethod
    public Object freshTimestampString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fromDateTime(env, this.freshTimestamp(env)));
    }

    @ConvertedMethod
    public Object usesTimestamps(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.timestamps);
    }

    @ConvertedMethod
    public Object getCreatedAtColumn(RuntimeEnv env, Object... args) {
        return ZVal.assign(ClassConstantUtils.getConstantValueLateStatic(env, this, "CREATED_AT"));
    }

    @ConvertedMethod
    public Object getUpdatedAtColumn(RuntimeEnv env, Object... args) {
        return ZVal.assign(ClassConstantUtils.getConstantValueLateStatic(env, this, "UPDATED_AT"));
    }

    @ConvertedMethod
    public Object getHidden(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hidden);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hidden", typeHint = "array")
    public Object setHidden(RuntimeEnv env, Object... args) {
        Object hidden = assignParameter(args, 0, false);
        this.hidden = hidden;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addHidden(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.getNull();
        }
        this.hidden =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.hidden,
                                function_is_array.f.env(env).call(attributes).getBool()
                                        ? attributes
                                        : function_func_get_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value())
                        .value();
        return null;
    }

    @ConvertedMethod
    public Object getVisible(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.visible);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "visible", typeHint = "array")
    public Object setVisible(RuntimeEnv env, Object... args) {
        Object visible = assignParameter(args, 0, false);
        this.visible = visible;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object addVisible(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.getNull();
        }
        this.visible =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                this.visible,
                                function_is_array.f.env(env).call(attributes).getBool()
                                        ? attributes
                                        : function_func_get_args
                                                .f
                                                .env(env)
                                                .addReferenceArgs(
                                                        new RuntimeArgsWithInfo(args, this))
                                                .call()
                                                .value())
                        .value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes")
    public Object makeVisible(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        this.hidden =
                function_array_diff.f.env(env).call(this.hidden, rToArrayCast(attributes)).value();
        if (!ZVal.isEmpty(this.visible)) {
            this.addVisible(env, attributes);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes")
    public Object makeHidden(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        attributes = ZVal.assign(rToArrayCast(attributes));
        this.visible = function_array_diff.f.env(env).call(this.visible, attributes).value();
        this.hidden =
                function_array_unique
                        .f
                        .env(env)
                        .call(function_array_merge.f.env(env).call(this.hidden, attributes).value())
                        .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getFillable(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.fillable);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fillable", typeHint = "array")
    public Object fillable(RuntimeEnv env, Object... args) {
        Object fillable = assignParameter(args, 0, false);
        this.fillable = fillable;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getGuarded(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.guarded);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "guarded", typeHint = "array")
    public Object guard(RuntimeEnv env, Object... args) {
        Object guarded = assignParameter(args, 0, false);
        this.guarded = guarded;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object isFillable(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Illuminate
                                        .namespaces
                                        .Database
                                        .namespaces
                                        .Eloquent
                                        .classes
                                        .Model
                                        .RequestStaticProperties
                                        .class)
                        .unguarded)) {
            return ZVal.assign(true);
        }

        if (function_in_array.f.env(env).call(key, this.getFillable(env)).getBool()) {
            return ZVal.assign(true);
        }

        if (ZVal.isTrue(this.isGuarded(env, key))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                ZVal.toBool(ZVal.isEmpty(this.getFillable(env)))
                        && ZVal.toBool(
                                !ZVal.isTrue(Str.runtimeStaticObject.startsWith(env, key, "_"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object isGuarded(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(function_in_array.f.env(env).call(key, this.getGuarded(env)).value())
                        || ZVal.toBool(
                                ZVal.equalityCheck(this.getGuarded(env), ZVal.arrayFromList("*"))));
    }

    @ConvertedMethod
    public Object totallyGuarded(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.equalityCheck(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(this.getFillable(env))
                                                .value(),
                                        0))
                        && ZVal.toBool(
                                ZVal.equalityCheck(this.getGuarded(env), ZVal.arrayFromList("*"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    protected Object fillableFromArray(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, false);
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count.f.env(env).call(this.getFillable(env)).value(),
                                '>',
                                0))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Illuminate
                                                        .namespaces
                                                        .Database
                                                        .namespaces
                                                        .Eloquent
                                                        .classes
                                                        .Model
                                                        .RequestStaticProperties
                                                        .class)
                                        .unguarded))) {
            return ZVal.assign(
                    function_array_intersect_key
                            .f
                            .env(env)
                            .call(
                                    attributes,
                                    function_array_flip
                                            .f
                                            .env(env)
                                            .call(this.getFillable(env))
                                            .value())
                            .value());
        }

        return ZVal.assign(attributes);
    }

    public static final Object CONST_CREATED_AT = "created_at";

    public static final Object CONST_UPDATED_AT = "updated_at";

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Model";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        protected Object boot(RuntimeEnv env, Object... args) {
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("bootTraits")
                    .call()
                    .value();
            return null;
        }

        @ConvertedMethod
        protected Object bootTraits(RuntimeEnv env, Object... args) {
            Object method = null;
            Object trait = null;
            ReferenceContainer booted = new BasicReferenceContainer(null);
            Object _pClass = null;
            _pClass =
                    ZVal.assign(ClassConstantUtils.getConstantValueLateStatic(env, this, "class"));
            booted.setObject(ZVal.newArray());
            for (ZPair zpairResult289 :
                    ZVal.getIterable(
                            class_uses_recursive.f.env(env).call(_pClass).value(), env, true)) {
                trait = ZVal.assign(zpairResult289.getValue());
                method = "boot" + toStringR(class_basename.f.env(env).call(trait).value(), env);
                if (ZVal.toBool(function_method_exists.f.env(env).call(_pClass, method).value())
                        && ZVal.toBool(
                                !function_in_array
                                        .f
                                        .env(env)
                                        .call(method, booted.getObject())
                                        .getBool())) {
                    function_forward_static_call
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(ZVal.newArray(new ZPair(0, _pClass), new ZPair(1, method)));
                    booted.arrayAppend(env).set(method);
                }
            }

            return null;
        }

        @ConvertedMethod
        public Object clearBootedModels(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .booted =
                    ZVal.newArray();
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .globalScopes =
                    ZVal.newArray();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
        public Object withoutTouching(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("withoutTouchingOn")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call(
                            ZVal.newArray(
                                    new ZPair(
                                            0,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"))),
                            callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "models", typeHint = "array")
        @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
        public Object withoutTouchingOn(RuntimeEnv env, Object... args) {
            Object models = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .ignoreOnTouch =
                    function_array_values
                            .f
                            .env(env)
                            .call(
                                    function_array_merge
                                            .f
                                            .env(env)
                                            .call(
                                                    env.getRequestStaticProperties(
                                                                    com.project
                                                                            .convertedCode
                                                                            .globalNamespace
                                                                            .namespaces
                                                                            .Illuminate
                                                                            .namespaces
                                                                            .Database
                                                                            .namespaces
                                                                            .Eloquent
                                                                            .classes
                                                                            .Model
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .ignoreOnTouch,
                                                    models)
                                            .value())
                            .value();
            try {
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(callback);
            } catch (ConvertedException convertedException26) {

                throw convertedException26;
            } finally {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Database
                                                .namespaces
                                                .Eloquent
                                                .classes
                                                .Model
                                                .RequestStaticProperties
                                                .class)
                                .ignoreOnTouch =
                        function_array_values
                                .f
                                .env(env)
                                .call(
                                        function_array_diff
                                                .f
                                                .env(env)
                                                .call(
                                                        env.getRequestStaticProperties(
                                                                        com.project
                                                                                .convertedCode
                                                                                .globalNamespace
                                                                                .namespaces
                                                                                .Illuminate
                                                                                .namespaces
                                                                                .Database
                                                                                .namespaces
                                                                                .Eloquent
                                                                                .classes
                                                                                .Model
                                                                                .RequestStaticProperties
                                                                                .class)
                                                                .ignoreOnTouch,
                                                        models)
                                                .value())
                                .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "class",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object isIgnoringTouch(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, true);
            if (null == _pClass) {
                _pClass = ZVal.getNull();
            }
            Object ignoredClass = null;
            Object ternaryExpressionTemp = null;
            _pClass =
                    ZVal.assign(
                            ZVal.isTrue(ternaryExpressionTemp = _pClass)
                                    ? ternaryExpressionTemp
                                    : ClassConstantUtils.getConstantValueLateStatic(
                                            env, this, "class"));
            for (ZPair zpairResult290 :
                    ZVal.getIterable(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Database
                                                    .namespaces
                                                    .Eloquent
                                                    .classes
                                                    .Model
                                                    .RequestStaticProperties
                                                    .class)
                                    .ignoreOnTouch,
                            env,
                            true)) {
                ignoredClass = ZVal.assign(zpairResult290.getValue());
                if (ZVal.toBool(ZVal.strictEqualityCheck(_pClass, "===", ignoredClass))
                        || ZVal.toBool(
                                NamespaceGlobal.is_subclass_of
                                        .env(env)
                                        .call(_pClass, ignoredClass)
                                        .value())) {
                    return ZVal.assign(true);
                }
            }

            return ZVal.assign(false);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "connection",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object on(RuntimeEnv env, Object... args) {
            Object connection = assignParameter(args, 0, true);
            if (null == connection) {
                connection = ZVal.getNull();
            }
            Object instance = null;
            instance = env.createNewWithLateStaticBindings(this);
            env.callMethod(instance, "setConnection", Model.class, connection);
            return ZVal.assign(env.callMethod(instance, "newQuery", Model.class));
        }

        @ConvertedMethod
        public Object onWriteConnection(RuntimeEnv env, Object... args) {
            Object instance = null;
            instance = env.createNewWithLateStaticBindings(this);
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(instance, "newQuery", Model.class),
                            "useWritePdo",
                            Model.class));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "columns",
            defaultValue = "ZVal.arrayFromList(\"*\")",
            defaultValueType = "array"
        )
        public Object all(RuntimeEnv env, Object... args) {
            Object columns = assignParameter(args, 0, true);
            if (null == columns) {
                columns = ZVal.arrayFromList("*");
            }
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    env.createNewWithLateStaticBindings(this),
                                    "newQuery",
                                    Model.class),
                            "get",
                            Model.class,
                            function_is_array.f.env(env).call(columns).getBool()
                                    ? columns
                                    : function_func_get_args
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call()
                                            .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "relations")
        public Object with(RuntimeEnv env, Object... args) {
            Object relations = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.callMethod(
                            env.callMethod(
                                    env.createNewWithLateStaticBindings(this),
                                    "newQuery",
                                    Model.class),
                            "with",
                            Model.class,
                            function_is_string.f.env(env).call(relations).getBool()
                                    ? function_func_get_args
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call()
                                            .value()
                                    : relations));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "ids")
        public Object destroy(RuntimeEnv env, Object... args) {
            Object ids = assignParameter(args, 0, false);
            Object instance = null;
            ReferenceContainer count = new BasicReferenceContainer(null);
            Object model = null;
            Object key = null;
            count.setObject(0);
            ids =
                    ZVal.assign(
                            function_is_array.f.env(env).call(ids).getBool()
                                    ? ids
                                    : function_func_get_args
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call()
                                            .value());
            key =
                    env.callMethod(
                            instance = env.createNewWithLateStaticBindings(this),
                            "getKeyName",
                            Model.class);
            for (ZPair zpairResult294 :
                    ZVal.getIterable(
                            env.callMethod(
                                    env.callMethod(instance, "whereIn", Model.class, key, ids),
                                    "get",
                                    Model.class),
                            env,
                            true)) {
                model = ZVal.assign(zpairResult294.getValue());
                if (ZVal.isTrue(env.callMethod(model, "delete", Model.class))) {
                    count.setObject(ZVal.increment(count.getObject()));
                }
            }

            return ZVal.assign(count.getObject());
        }

        @ConvertedMethod
        public Object query(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.callMethod(
                            env.createNewWithLateStaticBindings(this), "newQuery", Model.class));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "connection",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object resolveConnection(RuntimeEnv env, Object... args) {
            Object connection = assignParameter(args, 0, true);
            if (null == connection) {
                connection = ZVal.getNull();
            }
            return ZVal.assign(
                    env.callMethod(
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Database
                                                    .namespaces
                                                    .Eloquent
                                                    .classes
                                                    .Model
                                                    .RequestStaticProperties
                                                    .class)
                                    .resolver,
                            "connection",
                            Model.class,
                            connection));
        }

        @ConvertedMethod
        public Object getConnectionResolver(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .resolver);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "resolver",
            typeHint = "Illuminate\\Database\\ConnectionResolverInterface"
        )
        public Object setConnectionResolver(RuntimeEnv env, Object... args) {
            Object resolver = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .resolver =
                    resolver;
            return null;
        }

        @ConvertedMethod
        public Object unsetConnectionResolver(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .resolver =
                    ZVal.getNull();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            return ZVal.assign(
                    env.callMethod(
                            env.createNewWithLateStaticBindings(this),
                            new RuntimeArgsWithReferences(),
                            toStringR(method, env),
                            Model.class,
                            PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        public Object cacheMutatedAttributes(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Concerns/HasAttributes.php");
            Object _pClass = assignParameter(args, 0, false);
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
                                    .classes
                                    .Model
                                    .RequestStaticProperties
                                    .class,
                            "mutatorCache")
                    .arrayAccess(env, _pClass)
                    .set(
                            env.callMethod(
                                    env.callMethod(
                                            collect.f
                                                    .env(env)
                                                    .call(
                                                            StaticMethodUtils
                                                                    .accessUnknownLateStaticMethod(
                                                                            env, this, Model.class)
                                                                    .method("getMutatorMethods")
                                                                    .addReferenceArgs(
                                                                            new RuntimeArgsWithReferences())
                                                                    .call(_pClass)
                                                                    .value())
                                                    .value(),
                                            "map",
                                            Model.class,
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Illuminate\\Database\\Eloquent\\Concerns",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "match")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object match = assignParameter(args, 0, false);
                                                    return ZVal.assign(
                                                            NamespaceGlobal.lcfirst
                                                                    .env(env)
                                                                    .call(
                                                                            ZVal.isTrue(
                                                                                            env
                                                                                                    .getRequestStaticProperties(
                                                                                                            com.project
                                                                                                                    .convertedCode
                                                                                                                    .globalNamespace
                                                                                                                    .namespaces
                                                                                                                    .Illuminate
                                                                                                                    .namespaces
                                                                                                                    .Database
                                                                                                                    .namespaces
                                                                                                                    .Eloquent
                                                                                                                    .classes
                                                                                                                    .Model
                                                                                                                    .RequestStaticProperties
                                                                                                                    .class)
                                                                                                    .snakeAttributes)
                                                                                    ? Str
                                                                                            .runtimeStaticObject
                                                                                            .snake(
                                                                                                    env,
                                                                                                    match)
                                                                                    : match)
                                                                    .value());
                                                }
                                            }),
                                    "all",
                                    Model.class));
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        protected Object getMutatorMethods(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            ReferenceContainer matches = new BasicReferenceContainer(null);
            function_preg_match_all
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                    .call(
                            "/(?<=^|;)get([^;]+?)Attribute(;|$)/",
                            NamespaceGlobal.implode
                                    .env(env)
                                    .call(
                                            ";",
                                            NamespaceGlobal.get_class_methods
                                                    .env(env)
                                                    .call(_pClass)
                                                    .value())
                                    .value(),
                            matches.getObject());
            return ZVal.assign(matches.arrayGet(env, 1));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "classes")
        public Object observe(RuntimeEnv env, Object... args) {
            Object classes = assignParameter(args, 0, false);
            Object instance = null;
            Object _pClass = null;
            instance = env.createNewWithLateStaticBindings(this);
            for (ZPair zpairResult2293 :
                    ZVal.getIterable(Arr.runtimeStaticObject.wrap(env, classes), env, true)) {
                _pClass = ZVal.assign(zpairResult2293.getValue());
                env.callMethod(instance, "registerObserver", Model.class, _pClass);
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "event")
        @ConvertedParameter(index = 1, name = "callback")
        protected Object registerModelEvent(RuntimeEnv env, Object... args) {
            Object event = assignParameter(args, 0, false);
            Object callback = assignParameter(args, 1, false);
            Object name = null;
            if (ZVal.isset(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .dispatcher)) {
                name =
                        ZVal.assign(
                                ClassConstantUtils.getConstantValueLateStatic(env, this, "class"));
                env.callMethod(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Database
                                                .namespaces
                                                .Eloquent
                                                .classes
                                                .Model
                                                .RequestStaticProperties
                                                .class)
                                .dispatcher,
                        "listen",
                        Model.class,
                        "eloquent." + toStringR(event, env) + ": " + toStringR(name, env),
                        callback);
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object retrieved(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("registerModelEvent")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("retrieved", callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object saving(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("registerModelEvent")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("saving", callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object saved(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("registerModelEvent")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("saved", callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object updating(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("registerModelEvent")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("updating", callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object updated(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("registerModelEvent")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("updated", callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object creating(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("registerModelEvent")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("creating", callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object created(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("registerModelEvent")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("created", callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object deleting(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("registerModelEvent")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("deleting", callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback")
        public Object deleted(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("registerModelEvent")
                    .addReferenceArgs(new RuntimeArgsWithReferences())
                    .call("deleted", callback)
                    .value();
            return null;
        }

        @ConvertedMethod
        public Object flushEventListeners(RuntimeEnv env, Object... args) {
            Object instance = null;
            Object event = null;
            if (!ZVal.isset(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .dispatcher)) {
                return null;
            }

            instance = env.createNewWithLateStaticBindings(this);
            for (ZPair zpairResult2295 :
                    ZVal.getIterable(
                            env.callMethod(instance, "getObservableEvents", Model.class),
                            env,
                            true)) {
                event = ZVal.assign(zpairResult2295.getValue());
                env.callMethod(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Database
                                                .namespaces
                                                .Eloquent
                                                .classes
                                                .Model
                                                .RequestStaticProperties
                                                .class)
                                .dispatcher,
                        "forget",
                        Model.class,
                        toStringR("eloquent." + toStringR(event, env) + ": ", env)
                                + toStringR(
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        env));
            }

            for (ZPair zpairResult2296 :
                    ZVal.getIterable(
                            function_array_values
                                    .f
                                    .env(env)
                                    .call(
                                            toObjectR(instance)
                                                    .accessProp(this, env)
                                                    .name("dispatchesEvents")
                                                    .value())
                                    .value(),
                            env,
                            true)) {
                event = ZVal.assign(zpairResult2296.getValue());
                env.callMethod(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Database
                                                .namespaces
                                                .Eloquent
                                                .classes
                                                .Model
                                                .RequestStaticProperties
                                                .class)
                                .dispatcher,
                        "forget",
                        Model.class,
                        event);
            }

            return null;
        }

        @ConvertedMethod
        public Object getEventDispatcher(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .dispatcher);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "dispatcher",
            typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
        )
        public Object setEventDispatcher(RuntimeEnv env, Object... args) {
            Object dispatcher = assignParameter(args, 0, false);
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .dispatcher =
                    dispatcher;
            return null;
        }

        @ConvertedMethod
        public Object unsetEventDispatcher(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .dispatcher =
                    ZVal.getNull();
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "scope")
        @ConvertedParameter(
            index = 1,
            name = "implementation",
            typeHint = "Closure",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object addGlobalScope(RuntimeEnv env, Object... args) {
            Object scope = assignParameter(args, 0, false);
            Object implementation = assignParameter(args, 1, true);
            if (null == implementation) {
                implementation = ZVal.getNull();
            }
            if (ZVal.toBool(function_is_string.f.env(env).call(scope).value())
                    && ZVal.toBool(!function_is_null.f.env(env).call(implementation).getBool())) {
                return ZVal.assign(
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
                                                .classes
                                                .Model
                                                .RequestStaticProperties
                                                .class,
                                        "globalScopes")
                                .arrayAccess(
                                        env,
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        scope)
                                .set(implementation));

            } else if (ZVal.isTrue(ZVal.checkInstanceType(scope, Closure.class, "Closure"))) {
                return ZVal.assign(
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
                                                .classes
                                                .Model
                                                .RequestStaticProperties
                                                .class,
                                        "globalScopes")
                                .arrayAccess(
                                        env,
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        NamespaceGlobal.spl_object_hash
                                                .env(env)
                                                .call(scope)
                                                .value())
                                .set(scope));

            } else if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            scope, Scope.class, "Illuminate\\Database\\Eloquent\\Scope"))) {
                return ZVal.assign(
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
                                                .classes
                                                .Model
                                                .RequestStaticProperties
                                                .class,
                                        "globalScopes")
                                .arrayAccess(
                                        env,
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "class"),
                                        function_get_class.f.env(env).call(scope).value())
                                .set(scope));
            }

            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Global scope must be an instance of Closure or Scope."));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "scope")
        public Object hasGlobalScope(RuntimeEnv env, Object... args) {
            Object scope = assignParameter(args, 0, false);
            return ZVal.assign(
                    !function_is_null
                            .f
                            .env(env)
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Model.class)
                                            .method("getGlobalScope")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(scope)
                                            .value())
                            .getBool());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "scope")
        public Object getGlobalScope(RuntimeEnv env, Object... args) {
            Object scope = assignParameter(args, 0, false);
            if (function_is_string.f.env(env).call(scope).getBool()) {
                return ZVal.assign(
                        Arr.runtimeStaticObject.get(
                                env,
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Illuminate
                                                        .namespaces
                                                        .Database
                                                        .namespaces
                                                        .Eloquent
                                                        .classes
                                                        .Model
                                                        .RequestStaticProperties
                                                        .class)
                                        .globalScopes,
                                toStringR(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                env)
                                        + "."
                                        + toStringR(scope, env)));
            }

            return ZVal.assign(
                    Arr.runtimeStaticObject.get(
                            env,
                            env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Database
                                                    .namespaces
                                                    .Eloquent
                                                    .classes
                                                    .Model
                                                    .RequestStaticProperties
                                                    .class)
                                    .globalScopes,
                            toStringR(
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            env)
                                    + "."
                                    + toStringR(
                                            function_get_class.f.env(env).call(scope).value(),
                                            env)));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "class")
        public Object getActualClassNameForMorph(RuntimeEnv env, Object... args) {
            Object _pClass = assignParameter(args, 0, false);
            Object ternaryExpressionTemp = null;
            return ZVal.assign(
                    Arr.runtimeStaticObject.get(
                            env,
                            ZVal.isTrue(
                                            ternaryExpressionTemp =
                                                    Relation.runtimeStaticObject.morphMap(env))
                                    ? ternaryExpressionTemp
                                    : ZVal.newArray(),
                            _pClass,
                            _pClass));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "state",
            defaultValue = "true",
            defaultValueType = "constant"
        )
        public Object unguard(RuntimeEnv env, Object... args) {
            Object state = assignParameter(args, 0, true);
            if (null == state) {
                state = true;
            }
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .unguarded =
                    state;
            return null;
        }

        @ConvertedMethod
        public Object reguard(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .unguarded =
                    false;
            return null;
        }

        @ConvertedMethod
        public Object isUnguarded(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .unguarded);
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
        public Object unguarded(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            if (ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Database
                                            .namespaces
                                            .Eloquent
                                            .classes
                                            .Model
                                            .RequestStaticProperties
                                            .class)
                            .unguarded)) {
                return ZVal.assign(
                        env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value());
            }

            StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                    .method("unguard")
                    .call()
                    .value();
            try {
                return ZVal.assign(
                        env.callFunctionDynamic(callback, new RuntimeArgsWithReferences()).value());
            } catch (ConvertedException convertedException27) {

                throw convertedException27;
            } finally {
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Model.class)
                        .method("reguard")
                        .call()
                        .value();
            }
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object resolver = null;

        public Object dispatcher = null;

        public Object booted = ZVal.newArray();

        public Object globalScopes = ZVal.newArray();

        public Object ignoreOnTouch = ZVal.newArray();

        public Object snakeAttributes = true;

        public Object mutatorCache = ZVal.newArray();

        public Object manyMethods =
                ZVal.arrayFromList(
                        "belongsToMany",
                        "morphToMany",
                        "morphedByMany",
                        "guessBelongsToManyRelation",
                        "findFirstMethodThatIsntRelation");

        public Object unguarded = false;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Model")
                    .setLookup(
                            Model.class,
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
                            "guarded",
                            "hidden",
                            "incrementing",
                            "keyType",
                            "observables",
                            "original",
                            "perPage",
                            "primaryKey",
                            "relations",
                            "table",
                            "timestamps",
                            "touches",
                            "visible",
                            "wasRecentlyCreated",
                            "with",
                            "withCount")
                    .setStaticPropertyNames(
                            "booted",
                            "dispatcher",
                            "globalScopes",
                            "ignoreOnTouch",
                            "manyMethods",
                            "mutatorCache",
                            "resolver",
                            "snakeAttributes",
                            "unguarded")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Model.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addInterface("Illuminate\\Contracts\\Queue\\QueueableEntity")
                    .addInterface("Illuminate\\Contracts\\Routing\\UrlRoutable")
                    .addTrait("Illuminate\\Database\\Eloquent\\Concerns\\HasAttributes")
                    .addTrait("Illuminate\\Database\\Eloquent\\Concerns\\HasEvents")
                    .addTrait("Illuminate\\Database\\Eloquent\\Concerns\\HasGlobalScopes")
                    .addTrait("Illuminate\\Database\\Eloquent\\Concerns\\HasRelationships")
                    .addTrait("Illuminate\\Database\\Eloquent\\Concerns\\HasTimestamps")
                    .addTrait("Illuminate\\Database\\Eloquent\\Concerns\\HidesAttributes")
                    .addTrait("Illuminate\\Database\\Eloquent\\Concerns\\GuardsAttributes")
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

    private enum SwitchEnumType23 {
        STRING_int,
        STRING_integer,
        STRING_real,
        STRING_float,
        STRING_double,
        STRING_string,
        STRING_bool,
        STRING_boolean,
        STRING_object,
        STRING_array,
        STRING_json,
        STRING_collection,
        STRING_date,
        STRING_datetime,
        STRING_custom_datetime,
        STRING_timestamp,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
