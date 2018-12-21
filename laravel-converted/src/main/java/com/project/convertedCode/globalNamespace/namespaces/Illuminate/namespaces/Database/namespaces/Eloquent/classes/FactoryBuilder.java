package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.array.function_range;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Eloquent.classes.Model;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Eloquent/FactoryBuilder.php

*/

public class FactoryBuilder extends RuntimeClassBase {

    public Object definitions = null;

    public Object _pClass = null;

    public Object name = "default";

    public Object connection = null;

    public Object states = null;

    public Object afterMaking = ZVal.newArray();

    public Object afterCreating = ZVal.newArray();

    public Object activeStates = ZVal.newArray();

    public Object faker = null;

    public Object amount = ZVal.getNull();

    public FactoryBuilder(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == FactoryBuilder.class) {
            this.__construct(env, args);
        }
    }

    public FactoryBuilder(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "name")
    @ConvertedParameter(index = 2, name = "definitions", typeHint = "array")
    @ConvertedParameter(index = 3, name = "states", typeHint = "array")
    @ConvertedParameter(index = 4, name = "afterMaking", typeHint = "array")
    @ConvertedParameter(index = 5, name = "afterCreating", typeHint = "array")
    @ConvertedParameter(index = 6, name = "faker", typeHint = "Faker\\Generator")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object definitions = assignParameter(args, 2, false);
        Object states = assignParameter(args, 3, false);
        Object afterMaking = assignParameter(args, 4, false);
        Object afterCreating = assignParameter(args, 5, false);
        Object faker = assignParameter(args, 6, false);
        this.name = name;
        this._pClass = _pClass;
        this.faker = faker;
        this.states = states;
        this.definitions = definitions;
        this.afterMaking = afterMaking;
        this.afterCreating = afterCreating;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "amount")
    public Object times(RuntimeEnv env, Object... args) {
        Object amount = assignParameter(args, 0, false);
        this.amount = amount;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "states")
    public Object states(RuntimeEnv env, Object... args) {
        Object states = assignParameter(args, 0, false);
        this.activeStates =
                function_is_array.f.env(env).call(states).getBool()
                        ? states
                        : function_func_get_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value();
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object connection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.connection = name;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object lazy(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/FactoryBuilder.php");
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
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
                        attributes = this.contextReferences.getCapturedValue("attributes");
                        return ZVal.assign(FactoryBuilder.this.create(env, attributes));
                    }
                }.use("attributes", attributes));
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
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object results = null;
        results = this.make(env, attributes);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        results, Model.class, "Illuminate\\Database\\Eloquent\\Model"))) {
            this.store(env, collect.f.env(env).call(ZVal.newArray(new ZPair(0, results))).value());
            this.callAfterCreating(
                    env, collect.f.env(env).call(ZVal.newArray(new ZPair(0, results))).value());

        } else {
            this.store(env, results);
            this.callAfterCreating(env, results);
        }

        return ZVal.assign(results);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "results")
    protected Object store(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/FactoryBuilder.php");
        Object results = assignParameter(args, 0, false);
        env.callMethod(
                results,
                "each",
                FactoryBuilder.class,
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
                        Object _closureThisVar = this.getClosureThisVar();
                        Object model = assignParameter(args, 0, false);
                        if (!ZVal.isset(FactoryBuilder.this.connection)) {
                            env.callMethod(
                                    model,
                                    "setConnection",
                                    FactoryBuilder.class,
                                    env.callMethod(
                                            env.callMethod(
                                                    env.callMethod(
                                                            model,
                                                            "newQueryWithoutScopes",
                                                            FactoryBuilder.class),
                                                    "getConnection",
                                                    FactoryBuilder.class),
                                            "getName",
                                            FactoryBuilder.class));
                        }

                        env.callMethod(model, "save", FactoryBuilder.class);
                        return null;
                    }
                });
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
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/FactoryBuilder.php");
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object instances = null;
        if (ZVal.strictEqualityCheck(this.amount, "===", ZVal.getNull())) {
            return ZVal.assign(
                    tap.f
                            .env(env)
                            .call(
                                    this.makeInstance(env, attributes),
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
                                            FactoryBuilder.this.callAfterMaking(
                                                    env,
                                                    collect.f
                                                            .env(env)
                                                            .call(
                                                                    ZVal.newArray(
                                                                            new ZPair(0, instance)))
                                                            .value());
                                            return null;
                                        }
                                    })
                            .value());
        }

        if (ZVal.isLessThan(this.amount, '<', 1)) {
            return ZVal.assign(
                    env.callMethod(
                            env.createNew(this._pClass), "newCollection", FactoryBuilder.class));
        }

        instances =
                env.callMethod(
                        env.createNew(this._pClass),
                        "newCollection",
                        FactoryBuilder.class,
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
                                                return ZVal.assign(
                                                        FactoryBuilder.this.makeInstance(
                                                                env, attributes));
                                            }
                                        }.use("attributes", attributes),
                                        function_range.f.env(env).call(1, this.amount).value())
                                .value());
        this.callAfterMaking(env, instances);
        return ZVal.assign(instances);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object raw(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/FactoryBuilder.php");
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        if (ZVal.strictEqualityCheck(this.amount, "===", ZVal.getNull())) {
            return ZVal.assign(this.getRawAttributes(env, attributes));
        }

        if (ZVal.isLessThan(this.amount, '<', 1)) {
            return ZVal.assign(ZVal.newArray());
        }

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
                                        return ZVal.assign(
                                                FactoryBuilder.this.getRawAttributes(
                                                        env, attributes));
                                    }
                                }.use("attributes", attributes),
                                function_range.f.env(env).call(1, this.amount).value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object getRawAttributes(RuntimeEnv env, Object... args) {
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object definition = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "definitions", env),
                env,
                this._pClass,
                this.name)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Unable to locate factory with name ["
                                    + toStringR(this.name, env)
                                    + "] ["
                                    + toStringR(this._pClass, env)
                                    + "]."));
        }

        definition =
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "definitions", env)
                                        .arrayGet(env, this._pClass, this.name),
                                this.faker,
                                attributes)
                        .value();
        return ZVal.assign(
                this.expandAttributes(
                        env,
                        function_array_merge
                                .f
                                .env(env)
                                .call(this.applyStates(env, definition, attributes), attributes)
                                .value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object makeInstance(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/FactoryBuilder.php");
        Object attributes = assignParameter(args, 0, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        return ZVal.assign(
                Model.runtimeStaticObject.unguarded(
                        env,
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
                                Object instance = null;
                                Object attributes = null;
                                attributes = this.contextReferences.getCapturedValue("attributes");
                                instance =
                                        env.createNew(
                                                FactoryBuilder.this._pClass,
                                                FactoryBuilder.this.getRawAttributes(
                                                        env, attributes));
                                if (ZVal.isset(FactoryBuilder.this.connection)) {
                                    env.callMethod(
                                            instance,
                                            "setConnection",
                                            FactoryBuilder.class,
                                            FactoryBuilder.this.connection);
                                }

                                return ZVal.assign(instance);
                            }
                        }.use("attributes", attributes)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "definition", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object applyStates(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object definition = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object state = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult285 : ZVal.getIterable(this.activeStates, env, true)) {
            state = ZVal.assign(zpairResult285.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "states", env),
                    env,
                    this._pClass,
                    state)) {
                if (ZVal.isTrue(this.stateHasAfterCallback(env, state))) {
                    continue;
                }

                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Unable to locate ["
                                        + toStringR(state, env)
                                        + "] state for ["
                                        + toStringR(this._pClass, env)
                                        + "]."));
            }

            definition =
                    function_array_merge
                            .f
                            .env(env)
                            .call(definition, this.stateAttributes(env, state, attributes))
                            .value();
        }

        return ZVal.assign(definition);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "state")
    @ConvertedParameter(index = 1, name = "attributes", typeHint = "array")
    protected Object stateAttributes(RuntimeEnv env, Object... args) {
        Object state = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, false);
        Object stateAttributes = null;
        stateAttributes =
                ZVal.assign(
                        new ReferenceClassProperty(this, "states", env)
                                .arrayGet(env, this._pClass, state));
        if (!function_is_callable.f.env(env).call(stateAttributes).getBool()) {
            return ZVal.assign(stateAttributes);
        }

        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(stateAttributes, this.faker, attributes)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attributes", typeHint = "array")
    protected Object expandAttributes(RuntimeEnv env, Object... args) {
        ReferenceContainer attributes =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer attribute = new BasicReferenceContainer(null);
        for (ZPair zpairResult286 : ZVal.getIterable(attributes.getObject(), env, true)) {
            attribute = zpairResult286;
            if (ZVal.toBool(
                            ZVal.toBool(
                                            function_is_callable
                                                    .f
                                                    .env(env)
                                                    .call(attribute.getObject())
                                                    .value())
                                    && ZVal.toBool(
                                            !function_is_string
                                                    .f
                                                    .env(env)
                                                    .call(attribute.getObject())
                                                    .getBool()))
                    && ZVal.toBool(
                            !function_is_array.f.env(env).call(attribute.getObject()).getBool())) {
                attribute.setObject(
                        env.callFunctionDynamic(
                                        attribute.getObject(),
                                        new RuntimeArgsWithReferences().add(0, attributes),
                                        attributes.getObject())
                                .value());
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            attribute.getObject(),
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
                                    .FactoryBuilder
                                    .class,
                            "Illuminate\\Database\\Eloquent\\FactoryBuilder"))) {
                attribute.setObject(
                        env.callMethod(
                                env.callMethod(
                                        attribute.getObject(), "create", FactoryBuilder.class),
                                "getKey",
                                FactoryBuilder.class));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            attribute.getObject(),
                            Model.class,
                            "Illuminate\\Database\\Eloquent\\Model"))) {
                attribute.setObject(
                        env.callMethod(attribute.getObject(), "getKey", FactoryBuilder.class));
            }
        }

        return ZVal.assign(attributes.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models")
    public Object callAfterMaking(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        this.callAfter(env, this.afterMaking, models);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "models")
    public Object callAfterCreating(RuntimeEnv env, Object... args) {
        Object models = assignParameter(args, 0, false);
        this.callAfter(env, this.afterCreating, models);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "afterCallbacks", typeHint = "array")
    @ConvertedParameter(index = 1, name = "models")
    protected Object callAfter(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Database/Eloquent")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Eloquent/FactoryBuilder.php");
        Object afterCallbacks = assignParameter(args, 0, false);
        Object models = assignParameter(args, 1, false);
        Object states = null;
        states =
                function_array_merge
                        .f
                        .env(env)
                        .call(ZVal.newArray(new ZPair(0, this.name)), this.activeStates)
                        .value();
        env.callMethod(
                models,
                "each",
                FactoryBuilder.class,
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
                        Object _closureThisVar = this.getClosureThisVar();
                        Object model = assignParameter(args, 0, false);
                        Object afterCallbacks = null;
                        Object state = null;
                        Object states = null;
                        afterCallbacks = this.contextReferences.getCapturedValue("afterCallbacks");
                        states = this.contextReferences.getCapturedValue("states");
                        for (ZPair zpairResult287 : ZVal.getIterable(states, env, true)) {
                            state = ZVal.assign(zpairResult287.getValue());
                            FactoryBuilder.this.callAfterCallbacks(
                                    env, afterCallbacks, model, state);
                        }

                        return null;
                    }
                }.use("afterCallbacks", afterCallbacks).use("states", states));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "afterCallbacks", typeHint = "array")
    @ConvertedParameter(index = 1, name = "model")
    @ConvertedParameter(index = 2, name = "state")
    protected Object callAfterCallbacks(RuntimeEnv env, Object... args) {
        ReferenceContainer afterCallbacks =
                new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer model = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object state = assignParameter(args, 2, false);
        Object callback = null;
        if (!arrayActionR(ArrayAction.ISSET, afterCallbacks, env, this._pClass, state)) {
            return null;
        }

        for (ZPair zpairResult288 :
                ZVal.getIterable(afterCallbacks.arrayGet(env, this._pClass, state), env, true)) {
            callback = ZVal.assign(zpairResult288.getValue());
            env.callFunctionDynamic(
                    callback,
                    new RuntimeArgsWithReferences()
                            .add(0, model)
                            .add(1, new ReferenceClassProperty(this, "faker", env)),
                    model.getObject(),
                    this.faker);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "state")
    protected Object stateHasAfterCallback(RuntimeEnv env, Object... args) {
        Object state = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "afterMaking", env),
                                        env,
                                        this._pClass,
                                        state))
                        || ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "afterCreating", env),
                                        env,
                                        this._pClass,
                                        state)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, FactoryBuilder.class)
                        .method("hasMacro")
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(0, method))
                        .call(method.getObject())
                        .value())) {
            throw ZVal.getException(
                    env,
                    new BadMethodCallException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method %s::%s does not exist.",
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class"),
                                            method.getObject())
                                    .value()));
        }

        macro =
                ZVal.assign(
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
                                                .FactoryBuilder
                                                .RequestStaticProperties
                                                .class,
                                        "macros")
                                .arrayGet(env, method.getObject()));
        if (ZVal.isTrue(ZVal.checkInstanceType(macro, Closure.class, "Closure"))) {
            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    env.callMethod(
                                            macro,
                                            "bindTo",
                                            FactoryBuilder.class,
                                            this,
                                            ClassConstantUtils.getConstantValueLateStatic(
                                                    env, this, "class")),
                                    parameters)
                            .value());
        }

        return ZVal.assign(
                function_call_user_func_array
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(macro, parameters)
                        .value());
    }

    public static final Object CONST_class = "Illuminate\\Database\\Eloquent\\FactoryBuilder";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        @ConvertedParameter(index = 1, name = "macro")
        public Object macro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object macro = assignParameter(args, 1, false);
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
                                    .FactoryBuilder
                                    .RequestStaticProperties
                                    .class,
                            "macros")
                    .arrayAccess(env, name)
                    .set(macro);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "mixin")
        public Object mixin(RuntimeEnv env, Object... args) {
            Object mixin = assignParameter(args, 0, false);
            Object method = null;
            Object methods = null;
            methods =
                    env.callMethod(
                            new ReflectionClass(env, mixin),
                            "getMethods",
                            FactoryBuilder.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2284 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2284.getValue());
                env.callMethod(method, "setAccessible", FactoryBuilder.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, FactoryBuilder.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", FactoryBuilder.class, mixin))
                        .value();
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name")
        public Object hasMacro(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            return ZVal.assign(
                    arrayActionR(
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
                                            .FactoryBuilder
                                            .RequestStaticProperties
                                            .class,
                                    "macros"),
                            env,
                            name));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "method")
        @ConvertedParameter(index = 1, name = "parameters")
        public Object __callStatic(RuntimeEnv env, Object... args) {
            Object method = assignParameter(args, 0, false);
            Object parameters = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, FactoryBuilder.class)
                            .method("hasMacro")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(method)
                            .value())) {
                throw ZVal.getException(
                        env,
                        new BadMethodCallException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Method %s::%s does not exist.",
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class"),
                                                method)
                                        .value()));
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
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
                                                    .FactoryBuilder
                                                    .RequestStaticProperties
                                                    .class,
                                            "macros")
                                    .arrayGet(env, method),
                            Closure.class,
                            "Closure"))) {
                return ZVal.assign(
                        function_call_user_func_array
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        Closure.runtimeStaticObject.bind(
                                                env,
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
                                                                        .FactoryBuilder
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "macros")
                                                        .arrayGet(env, method),
                                                ZVal.getNull(),
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "class")),
                                        parameters)
                                .value());
            }

            return ZVal.assign(
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
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
                                                            .FactoryBuilder
                                                            .RequestStaticProperties
                                                            .class,
                                                    "macros")
                                            .arrayGet(env, method),
                                    parameters)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object macros = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Eloquent\\FactoryBuilder")
                    .setLookup(
                            FactoryBuilder.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "activeStates",
                            "afterCreating",
                            "afterMaking",
                            "amount",
                            "class",
                            "connection",
                            "definitions",
                            "faker",
                            "name",
                            "states")
                    .setStaticPropertyNames("macros")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Eloquent/FactoryBuilder.php")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
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
