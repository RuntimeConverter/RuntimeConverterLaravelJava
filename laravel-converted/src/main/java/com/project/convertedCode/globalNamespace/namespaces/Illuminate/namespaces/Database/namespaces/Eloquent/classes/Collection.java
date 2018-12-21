package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_splice;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_combine;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.QueueableCollection;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.namespaces.Relations.classes.Pivot;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php

*/

public class Collection
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Support
                .classes
                .Collection
        implements QueueableCollection {

    public Collection(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Collection.class) {
            this.__construct(env, args);
        }
    }

    public Collection(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object find(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object key = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        key, Model.class, "Illuminate\\Database\\Eloquent\\Model"))) {
            key = env.callMethod(key, "getKey", Collection.class);
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        key, Arrayable.class, "Illuminate\\Contracts\\Support\\Arrayable"))) {
            key = env.callMethod(key, "toArray", Collection.class);
        }

        if (function_is_array.f.env(env).call(key).getBool()) {
            if (ZVal.isTrue(env.callMethod(this, "isEmpty", Collection.class))) {
                return ZVal.assign(env.createNewWithLateStaticBindings(this));
            }

            return ZVal.assign(
                    env.callMethod(
                            this,
                            "whereIn",
                            Collection.class,
                            env.callMethod(
                                    env.callMethod(this, "first", Collection.class),
                                    "getKeyName",
                                    Collection.class),
                            key));
        }

        return ZVal.assign(
                Arr.runtimeStaticObject.first(
                        env,
                        toObjectR(this).accessProp(this, env).name("items").value(),
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "model")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object model = assignParameter(args, 0, false);
                                Object key = null;
                                key = this.contextReferences.getCapturedValue("key");
                                return ZVal.assign(
                                        ZVal.equalityCheck(
                                                env.callMethod(model, "getKey", Collection.class),
                                                key));
                            }
                        }.use("key", key),
                        _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations")
    public Object load(RuntimeEnv env, Object... args) {
        Object relations = assignParameter(args, 0, false);
        Object query = null;
        if (ZVal.isTrue(env.callMethod(this, "isNotEmpty", Collection.class))) {
            if (function_is_string.f.env(env).call(relations).getBool()) {
                relations =
                        function_func_get_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value();
            }

            query =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(this, "first", Collection.class),
                                    "newQueryWithoutRelationships",
                                    Collection.class),
                            "with",
                            Collection.class,
                            relations);
            toObjectR(this)
                    .accessProp(this, env)
                    .name("items")
                    .set(
                            env.callMethod(
                                    query,
                                    "eagerLoadRelations",
                                    Collection.class,
                                    toObjectR(this).accessProp(this, env).name("items").value()));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relations")
    public Object loadMissing(RuntimeEnv env, Object... args) {
        Object relations = assignParameter(args, 0, false);
        ReferenceContainer path = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        ReferenceContainer segments = new BasicReferenceContainer(null);
        if (function_is_string.f.env(env).call(relations).getBool()) {
            relations =
                    function_func_get_args
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call()
                            .value();
        }

        for (ZPair zpairResult265 : ZVal.getIterable(relations, env, false)) {
            key = ZVal.assign(zpairResult265.getKey());
            value = ZVal.assign(zpairResult265.getValue());
            if (function_is_numeric.f.env(env).call(key).getBool()) {
                key = ZVal.assign(value);
            }

            segments.setObject(
                    function_explode
                            .f
                            .env(env)
                            .call(
                                    ".",
                                    handleReturnReference(
                                                    function_explode
                                                            .f
                                                            .env(env)
                                                            .call(":", key)
                                                            .value())
                                            .arrayGet(env, 0))
                            .value());
            if (ZVal.isTrue(Str.runtimeStaticObject.contains(env, key, ":"))) {
                segments.arrayAccess(
                                env,
                                ZVal.subtract(
                                        function_count
                                                .f
                                                .env(env)
                                                .call(segments.getObject())
                                                .value(),
                                        1))
                        .set(
                                toStringR(
                                                segments.arrayGet(
                                                        env,
                                                        ZVal.subtract(
                                                                function_count
                                                                        .f
                                                                        .env(env)
                                                                        .call(segments.getObject())
                                                                        .value(),
                                                                1)),
                                                env)
                                        + ":"
                                        + toStringR(
                                                handleReturnReference(
                                                                function_explode
                                                                        .f
                                                                        .env(env)
                                                                        .call(":", key)
                                                                        .value())
                                                        .arrayGet(env, 1),
                                                env));
            }

            path.setObject(
                    function_array_combine
                            .f
                            .env(env)
                            .call(segments.getObject(), segments.getObject())
                            .value());
            if (function_is_callable.f.env(env).call(value).getBool()) {
                path.arrayAccess(env, function_end.f.env(env).call(segments.getObject()).value())
                        .set(value);
            }

            this.loadMissingRelation(env, this, path.getObject());
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "models",
        typeHint = "Illuminate\\Database\\Eloquent\\Collection"
    )
    @ConvertedParameter(index = 1, name = "path", typeHint = "array")
    protected Object loadMissingRelation(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object models = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object name = null;
        Object relation = null;
        relation = function_array_splice.f.env(env).call(path, 0, 1).value();
        name =
                ZVal.assign(
                        handleReturnReference(
                                        function_explode
                                                .f
                                                .env(env)
                                                .call(
                                                        ":",
                                                        function_key
                                                                .f
                                                                .env(env)
                                                                .call(relation)
                                                                .value())
                                                .value())
                                .arrayGet(env, 0));
        if (function_is_string
                .f
                .env(env)
                .call(function_reset.f.env(env).call(relation).value())
                .getBool()) {
            relation = function_reset.f.env(env).call(relation).value();
        }

        env.callMethod(
                env.callMethod(
                        models,
                        "filter",
                        Collection.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "model")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object model = assignParameter(args, 0, false);
                                Object name = null;
                                name = this.contextReferences.getCapturedValue("name");
                                return ZVal.assign(
                                        ZVal.toBool(
                                                        !function_is_null
                                                                .f
                                                                .env(env)
                                                                .call(model)
                                                                .getBool())
                                                && ZVal.toBool(
                                                        !ZVal.isTrue(
                                                                env.callMethod(
                                                                        model,
                                                                        "relationLoaded",
                                                                        Collection.class,
                                                                        name))));
                            }
                        }.use("name", name)),
                "load",
                Collection.class,
                relation);
        if (ZVal.isEmpty(path)) {
            return null;
        }

        models = env.callMethod(models, "pluck", Collection.class, name);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        env.callMethod(models, "first", Collection.class),
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Support
                                .classes
                                .Collection
                                .class,
                        "Illuminate\\Support\\Collection"))) {
            models = env.callMethod(models, "collapse", Collection.class);
        }

        this.loadMissingRelation(env, env.createNewWithLateStaticBindings(this, models), path);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "relation")
    @ConvertedParameter(index = 1, name = "relations")
    public Object loadMorph(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object relation = assignParameter(args, 0, false);
        Object relations = assignParameter(args, 1, false);
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        this.pluck(env, relation), "filter", Collection.class),
                                "groupBy",
                                Collection.class,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "model")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object model = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                function_get_class.f.env(env).call(model).value());
                                    }
                                }),
                        "filter",
                        Collection.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "models")
                            @ConvertedParameter(index = 1, name = "className")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object models = assignParameter(args, 0, false);
                                Object className = assignParameter(args, 1, false);
                                Object relations = null;
                                relations = this.contextReferences.getCapturedValue("relations");
                                return ZVal.assign(
                                        Arr.runtimeStaticObject.has(env, relations, className));
                            }
                        }.use("relations", relations)),
                "each",
                Collection.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Eloquent",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "models")
                    @ConvertedParameter(index = 1, name = "className")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object models = assignParameter(args, 0, false);
                        Object className = assignParameter(args, 1, false);
                        ReferenceContainer relations = new BasicReferenceContainer(null);
                        relations = this.contextReferences.getReferenceContainer("relations");
                        env.callMethod(
                                StaticMethodUtils.getStaticBaseClass(className, env)
                                        .callUnknownStaticMethod(
                                                env,
                                                "with",
                                                new RuntimeArgsWithReferences()
                                                        .add(
                                                                0,
                                                                new ArrayDimensionReference(
                                                                        relations.getObject(),
                                                                        className)),
                                                relations.arrayGet(env, className)),
                                "eagerLoadRelations",
                                Collection.class,
                                env.callMethod(models, "all", Collection.class));
                        return null;
                    }
                }.use("relations", relations));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object add(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "items", env).arrayAppend(env).set(item);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(
        index = 1,
        name = "operator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "value",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object contains(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object key = assignParameter(args, 0, false);
        Object operator = assignParameter(args, 1, true);
        if (null == operator) {
            operator = ZVal.getNull();
        }
        Object value = assignParameter(args, 2, true);
        if (null == value) {
            value = ZVal.getNull();
        }
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_func_num_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value(),
                                '>',
                                1))
                || ZVal.toBool(env.callMethod(this, "useAsCallable", Collection.class, key))) {
            return ZVal.assign(
                    super.contains(
                            env,
                            PackedVaradicArgs.unpack(
                                    new PackedVaradicArgs(
                                            function_func_get_args
                                                    .f
                                                    .env(env)
                                                    .addReferenceArgs(
                                                            new RuntimeArgsWithInfo(args, this))
                                                    .call()
                                                    .value()))));
        }

        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        key, Model.class, "Illuminate\\Database\\Eloquent\\Model"))) {
            return ZVal.assign(
                    super.contains(
                            env,
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Illuminate\\Database\\Eloquent",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "model")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object model = assignParameter(args, 0, false);
                                    Object key = null;
                                    key = this.contextReferences.getCapturedValue("key");
                                    return ZVal.assign(
                                            env.callMethod(model, "is", Collection.class, key));
                                }
                            }.use("key", key)));
        }

        return ZVal.assign(
                super.contains(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "model")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object model = assignParameter(args, 0, false);
                                Object key = null;
                                key = this.contextReferences.getCapturedValue("key");
                                return ZVal.assign(
                                        ZVal.equalityCheck(
                                                env.callMethod(model, "getKey", Collection.class),
                                                key));
                            }
                        }.use("key", key)));
    }

    @ConvertedMethod
    public Object modelKeys(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Eloquent",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "model")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object model = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                env.callMethod(model, "getKey", Collection.class));
                                    }
                                },
                                toObjectR(this).accessProp(this, env).name("items").value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object merge(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        Object item = null;
        ReferenceContainer dictionary = new BasicReferenceContainer(null);
        dictionary.setObject(this.getDictionary(env));
        for (ZPair zpairResult266 : ZVal.getIterable(items, env, true)) {
            item = ZVal.assign(zpairResult266.getValue());
            dictionary.arrayAccess(env, env.callMethod(item, "getKey", Collection.class)).set(item);
        }

        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_values.f.env(env).call(dictionary.getObject()).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object map(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object callback = assignParameter(args, 0, false);
        Object result = null;
        result = super.map(env, callback);
        return ZVal.assign(
                ZVal.isTrue(
                                env.callMethod(
                                        result,
                                        new RuntimeArgsWithReferences(),
                                        "contains",
                                        Collection.class,
                                        new Closure(
                                                env,
                                                runtimeConverterFunctionClassConstants,
                                                "Illuminate\\Database\\Eloquent",
                                                this) {
                                            @Override
                                            @ConvertedMethod
                                            @ConvertedParameter(index = 0, name = "item")
                                            public Object run(
                                                    RuntimeEnv env,
                                                    Object thisvar,
                                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                                    Object... args) {
                                                Object item = assignParameter(args, 0, false);
                                                return ZVal.assign(
                                                        !ZVal.isTrue(
                                                                ZVal.checkInstanceType(
                                                                        item,
                                                                        Model.class,
                                                                        "Illuminate\\Database\\Eloquent\\Model")));
                                            }
                                        }))
                        ? env.callMethod(result, "toBase", Collection.class)
                        : result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "with", defaultValue = "", defaultValueType = "array")
    public Object fresh(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object with = assignParameter(args, 0, true);
        if (null == with) {
            with = ZVal.newArray();
        }
        Object model = null;
        Object freshModels = null;
        if (ZVal.isTrue(env.callMethod(this, "isEmpty", Collection.class))) {
            return ZVal.assign(env.createNewWithLateStaticBindings(this));
        }

        model = env.callMethod(this, "first", Collection.class);
        freshModels =
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                env.callMethod(
                                                        model,
                                                        "newQueryWithoutScopes",
                                                        Collection.class),
                                                "with",
                                                Collection.class,
                                                function_is_string.f.env(env).call(with).getBool()
                                                        ? function_func_get_args
                                                                .f
                                                                .env(env)
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithInfo(
                                                                                args, this))
                                                                .call()
                                                                .value()
                                                        : with),
                                        "whereIn",
                                        Collection.class,
                                        env.callMethod(model, "getKeyName", Collection.class),
                                        this.modelKeys(env)),
                                "get",
                                Collection.class),
                        "getDictionary",
                        Collection.class);
        return ZVal.assign(
                this.map(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "model")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object model = assignParameter(args, 0, false);
                                ReferenceContainer freshModels = new BasicReferenceContainer(null);
                                freshModels =
                                        this.contextReferences.getReferenceContainer("freshModels");
                                return ZVal.assign(
                                        ZVal.toBool(
                                                                toObjectR(model)
                                                                        .accessProp(this, env)
                                                                        .name("exists")
                                                                        .value())
                                                        && ZVal.toBool(
                                                                arrayActionR(
                                                                        ArrayAction.ISSET,
                                                                        freshModels,
                                                                        env,
                                                                        env.callMethod(
                                                                                model,
                                                                                "getKey",
                                                                                Collection.class)))
                                                ? freshModels.arrayGet(
                                                        env,
                                                        env.callMethod(
                                                                model, "getKey", Collection.class))
                                                : ZVal.getNull());
                            }
                        }.use("freshModels", freshModels)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object diff(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        ReferenceContainer item = new BasicReferenceContainer(null);
        ReferenceContainer dictionary = new BasicReferenceContainer(null);
        Object diff = null;
        diff = env.createNewWithLateStaticBindings(this);
        dictionary.setObject(this.getDictionary(env, items));
        for (ZPair zpairResult267 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("items").value(), env, true)) {
            item.setObject(ZVal.assign(zpairResult267.getValue()));
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    dictionary,
                    env,
                    env.callMethod(item.getObject(), "getKey", Collection.class))) {
                env.callMethod(
                        diff,
                        new RuntimeArgsWithReferences().add(0, item),
                        "add",
                        Collection.class,
                        item.getObject());
            }
        }

        return ZVal.assign(diff);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object intersect(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        ReferenceContainer item = new BasicReferenceContainer(null);
        ReferenceContainer dictionary = new BasicReferenceContainer(null);
        Object intersect = null;
        intersect = env.createNewWithLateStaticBindings(this);
        dictionary.setObject(this.getDictionary(env, items));
        for (ZPair zpairResult268 :
                ZVal.getIterable(
                        toObjectR(this).accessProp(this, env).name("items").value(), env, true)) {
            item.setObject(ZVal.assign(zpairResult268.getValue()));
            if (arrayActionR(
                    ArrayAction.ISSET,
                    dictionary,
                    env,
                    env.callMethod(item.getObject(), "getKey", Collection.class))) {
                env.callMethod(
                        intersect,
                        new RuntimeArgsWithReferences().add(0, item),
                        "add",
                        Collection.class,
                        item.getObject());
            }
        }

        return ZVal.assign(intersect);
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
        name = "strict",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object unique(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        Object strict = assignParameter(args, 1, true);
        if (null == strict) {
            strict = false;
        }
        if (!function_is_null.f.env(env).call(key).getBool()) {
            return ZVal.assign(super.unique(env, key, strict));
        }

        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        function_array_values.f.env(env).call(this.getDictionary(env)).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object only(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object dictionary = null;
        if (function_is_null.f.env(env).call(keys).getBool()) {
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this, toObjectR(this).accessProp(this, env).name("items").value()));
        }

        dictionary = Arr.runtimeStaticObject.only(env, this.getDictionary(env), keys);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, function_array_values.f.env(env).call(dictionary).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "keys")
    public Object except(RuntimeEnv env, Object... args) {
        Object keys = assignParameter(args, 0, false);
        Object dictionary = null;
        dictionary = Arr.runtimeStaticObject.except(env, this.getDictionary(env), keys);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this, function_array_values.f.env(env).call(dictionary).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes")
    public Object makeHidden(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object attributes = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "each",
                        Collection.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "model")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object model = assignParameter(args, 0, false);
                                Object attributes = null;
                                attributes = this.contextReferences.getCapturedValue("attributes");
                                env.callMethod(model, "addHidden", Collection.class, attributes);
                                return null;
                            }
                        }.use("attributes", attributes)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes")
    public Object makeVisible(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object attributes = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        this,
                        "each",
                        Collection.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Database\\Eloquent",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "model")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object model = assignParameter(args, 0, false);
                                Object attributes = null;
                                attributes = this.contextReferences.getCapturedValue("attributes");
                                env.callMethod(model, "makeVisible", Collection.class, attributes);
                                return null;
                            }
                        }.use("attributes", attributes)));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "items",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object getDictionary(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, true);
        if (null == items) {
            items = ZVal.getNull();
        }
        ReferenceContainer dictionary = new BasicReferenceContainer(null);
        Object value = null;
        items =
                ZVal.assign(
                        function_is_null.f.env(env).call(items).getBool()
                                ? toObjectR(this).accessProp(this, env).name("items").value()
                                : items);
        dictionary.setObject(ZVal.newArray());
        for (ZPair zpairResult269 : ZVal.getIterable(items, env, true)) {
            value = ZVal.assign(zpairResult269.getValue());
            dictionary
                    .arrayAccess(env, env.callMethod(value, "getKey", Collection.class))
                    .set(value);
        }

        return ZVal.assign(dictionary.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object pluck(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object key = assignParameter(args, 1, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "toBase", Collection.class),
                        "pluck",
                        Collection.class,
                        value,
                        key));
    }

    @ConvertedMethod
    public Object keys(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "toBase", Collection.class),
                        "keys",
                        Collection.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "items")
    public Object zip(RuntimeEnv env, Object... args) {
        Object items = assignParameter(args, 0, false);
        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                env.callMethod(this, "toBase", Collection.class)),
                                        new ZPair(1, "zip")),
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value())
                        .value());
    }

    @ConvertedMethod
    public Object collapse(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "toBase", Collection.class),
                        "collapse",
                        Collection.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "depth")
    public Object flatten(RuntimeEnv env, Object... args) {
        ReferenceContainer depth = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == depth.getObject()) {
            depth.setObject(function_constant.get(env, "INF"));
        }
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "toBase", Collection.class),
                        new RuntimeArgsWithReferences().add(0, depth),
                        "flatten",
                        Collection.class,
                        depth.getObject()));
    }

    @ConvertedMethod
    public Object flip(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "toBase", Collection.class),
                        "flip",
                        Collection.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "size")
    @ConvertedParameter(index = 1, name = "value")
    public Object pad(RuntimeEnv env, Object... args) {
        Object size = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this, "toBase", Collection.class),
                        "pad",
                        Collection.class,
                        size,
                        value));
    }

    @ConvertedMethod
    public Object getQueueableClass(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object _pClass = null;
        if (ZVal.isTrue(env.callMethod(this, "isEmpty", Collection.class))) {
            return null;
        }

        _pClass =
                function_get_class
                        .f
                        .env(env)
                        .call(env.callMethod(this, "first", Collection.class))
                        .value();
        env.callMethod(
                this,
                "each",
                Collection.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Eloquent",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "model")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object model = assignParameter(args, 0, false);
                        Object _pClass = null;
                        _pClass = this.contextReferences.getCapturedValue("class");
                        if (ZVal.strictNotEqualityCheck(
                                function_get_class.f.env(env).call(model).value(),
                                "!==",
                                _pClass)) {
                            throw ZVal.getException(
                                    env,
                                    new LogicException(
                                            env,
                                            "Queueing collections with multiple model types is not supported."));
                        }

                        return null;
                    }
                }.use("class", _pClass));
        return ZVal.assign(_pClass);
    }

    @ConvertedMethod
    public Object getQueueableIds(RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(env.callMethod(this, "isEmpty", Collection.class))) {
            return ZVal.assign(ZVal.newArray());
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        env.callMethod(this, "first", Collection.class),
                                        Pivot.class,
                                        "Illuminate\\Database\\Eloquent\\Relations\\Pivot"))
                        ? env.callMethod(
                                env.callMethod(
                                        toObjectR(this).accessProp(this, env).name("map").value(),
                                        "getQueueableId",
                                        Collection.class),
                                "all",
                                Collection.class)
                        : this.modelKeys(env));
    }

    @ConvertedMethod
    public Object getQueueableRelations(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.isTrue(env.callMethod(this, "isNotEmpty", Collection.class))
                        ? env.callMethod(
                                env.callMethod(this, "first", Collection.class),
                                "getQueueableRelations",
                                Collection.class)
                        : ZVal.newArray());
    }

    @ConvertedMethod
    public Object getQueueableConnection(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php");
        Object connection = null;
        if (ZVal.isTrue(env.callMethod(this, "isEmpty", Collection.class))) {
            return null;
        }

        connection =
                env.callMethod(
                        env.callMethod(this, "first", Collection.class),
                        "getConnectionName",
                        Collection.class);
        env.callMethod(
                this,
                "each",
                Collection.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Database\\Eloquent",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "model")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object model = assignParameter(args, 0, false);
                        Object connection = null;
                        connection = this.contextReferences.getCapturedValue("connection");
                        if (ZVal.strictNotEqualityCheck(
                                env.callMethod(model, "getConnectionName", Collection.class),
                                "!==",
                                connection)) {
                            throw ZVal.getException(
                                    env,
                                    new LogicException(
                                            env,
                                            "Queueing collections with multiple model connections is not supported."));
                        }

                        return null;
                    }
                }.use("connection", connection));
        return ZVal.assign(connection);
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\Collection";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Illuminate
                    .namespaces
                    .Support
                    .classes
                    .Collection
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\Collection")
                    .setLookup(
                            Collection.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("items")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/Collection.php")
                    .addInterface("Illuminate\\Contracts\\Queue\\QueueableCollection")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Support\\Arrayable")
                    .addInterface("Countable")
                    .addInterface("IteratorAggregate")
                    .addInterface("Traversable")
                    .addInterface("Illuminate\\Contracts\\Support\\Jsonable")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("Illuminate\\Support\\Collection")
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
