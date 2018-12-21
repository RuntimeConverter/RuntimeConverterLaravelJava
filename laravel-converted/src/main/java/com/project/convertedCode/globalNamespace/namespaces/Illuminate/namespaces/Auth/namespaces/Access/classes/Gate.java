package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Access.classes;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Access.classes.AuthorizationException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Access.classes.Response;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/Access/Gate.php

*/

public class Gate extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Auth
                .namespaces
                .Access
                .classes
                .Gate {

    public Object container = null;

    public Object userResolver = null;

    public Object abilities = ZVal.newArray();

    public Object policies = ZVal.newArray();

    public Object beforeCallbacks = ZVal.newArray();

    public Object afterCallbacks = ZVal.newArray();

    public Gate(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Gate.class) {
            this.__construct(env, args);
        }
    }

    public Gate(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "container",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    @ConvertedParameter(index = 1, name = "userResolver", typeHint = "callable")
    @ConvertedParameter(
        index = 2,
        name = "abilities",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 3,
        name = "policies",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 4,
        name = "beforeCallbacks",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 5,
        name = "afterCallbacks",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object container = assignParameter(args, 0, false);
        Object userResolver = assignParameter(args, 1, false);
        Object abilities = assignParameter(args, 2, true);
        if (null == abilities) {
            abilities = ZVal.newArray();
        }
        Object policies = assignParameter(args, 3, true);
        if (null == policies) {
            policies = ZVal.newArray();
        }
        Object beforeCallbacks = assignParameter(args, 4, true);
        if (null == beforeCallbacks) {
            beforeCallbacks = ZVal.newArray();
        }
        Object afterCallbacks = assignParameter(args, 5, true);
        if (null == afterCallbacks) {
            afterCallbacks = ZVal.newArray();
        }
        this.policies = policies;
        this.container = container;
        this.abilities = abilities;
        this.userResolver = userResolver;
        this.afterCallbacks = afterCallbacks;
        this.beforeCallbacks = beforeCallbacks;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    public Object has(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object abilities = null;
        abilities =
                ZVal.assign(
                        function_is_array.f.env(env).call(ability).getBool()
                                ? ability
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        for (ZPair zpairResult190 : ZVal.getIterable(abilities, env, true)) {
            ability = ZVal.assign(zpairResult190.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(this, "abilities", env),
                    env,
                    ability)) {
                return ZVal.assign(false);
            }
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(index = 1, name = "callback")
    public Object define(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        if (function_is_callable.f.env(env).call(callback).getBool()) {
            new ReferenceClassProperty(this, "abilities", env)
                    .arrayAccess(env, ability)
                    .set(callback);

        } else if (ZVal.toBool(function_is_string.f.env(env).call(callback).value())
                && ZVal.toBool(Str.runtimeStaticObject.contains(env, callback, "@"))) {
            new ReferenceClassProperty(this, "abilities", env)
                    .arrayAccess(env, ability)
                    .set(this.buildAbilityCallback(env, ability, callback));

        } else {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Callback must be a callable or a 'Class@method' string."));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "class")
    @ConvertedParameter(
        index = 2,
        name = "abilities",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object resource(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object _pClass = assignParameter(args, 1, false);
        Object abilities = assignParameter(args, 2, true);
        if (null == abilities) {
            abilities = ZVal.getNull();
        }
        Object method = null;
        Object ternaryExpressionTemp = null;
        Object ability = null;
        abilities =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = abilities)
                                ? ternaryExpressionTemp
                                : ZVal.newArray(
                                        new ZPair("view", "view"),
                                        new ZPair("create", "create"),
                                        new ZPair("update", "update"),
                                        new ZPair("delete", "delete")));
        for (ZPair zpairResult191 : ZVal.getIterable(abilities, env, false)) {
            ability = ZVal.assign(zpairResult191.getKey());
            method = ZVal.assign(zpairResult191.getValue());
            this.define(
                    env,
                    toStringR(name, env) + "." + toStringR(ability, env),
                    toStringR(_pClass, env) + "@" + toStringR(method, env));
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(index = 1, name = "callback")
    protected Object buildAbilityCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Access")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Auth/Access/Gate.php");
        Object ability = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Auth\\Access",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object result = null;
                        Object runtimeTempArrayResult8 = null;
                        Object method = null;
                        Object callback = null;
                        Object arguments = null;
                        Object ability = null;
                        Object _pClass = null;
                        Object user = null;
                        Object policy = null;
                        callback = this.contextReferences.getCapturedValue("callback");
                        ability = this.contextReferences.getCapturedValue("ability");
                        ZVal.list(
                                runtimeTempArrayResult8 =
                                        Str.runtimeStaticObject.parseCallback(env, callback),
                                (_pClass = listGet(runtimeTempArrayResult8, 0, env)),
                                (method = listGet(runtimeTempArrayResult8, 1, env)));
                        policy = Gate.this.resolvePolicy(env, _pClass);
                        arguments =
                                function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value();
                        user = function_array_shift.f.env(env).call(arguments).value();
                        result = Gate.this.callPolicyBefore(env, policy, user, ability, arguments);
                        if (!function_is_null.f.env(env).call(result).getBool()) {
                            return ZVal.assign(result);
                        }

                        return ZVal.assign(
                                env.callMethod(
                                        policy,
                                        new RuntimeArgsWithReferences(),
                                        toStringR(method, env),
                                        Gate.class,
                                        PackedVaradicArgs.unpack(
                                                new PackedVaradicArgs(
                                                        function_func_get_args
                                                                .f
                                                                .env(env)
                                                                .addReferenceArgs(
                                                                        new RuntimeArgsWithInfo(
                                                                                args, this))
                                                                .call()
                                                                .value()))));
                    }
                }.use("callback", callback).use("ability", ability));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(index = 1, name = "policy")
    public Object policy(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object policy = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "policies", env).arrayAccess(env, _pClass).set(policy);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object before(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "beforeCallbacks", env).arrayAppend(env).set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "callable")
    public Object after(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "afterCallbacks", env).arrayAppend(env).set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object allows(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        return ZVal.assign(this.check(env, ability, arguments));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object denies(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        return ZVal.assign(!ZVal.isTrue(this.allows(env, ability, arguments)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abilities")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object check(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Access")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Auth/Access/Gate.php");
        Object abilities = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        collect.f.env(env).call(abilities).value(),
                        "every",
                        Gate.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Auth\\Access",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "ability")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object ability = assignParameter(args, 0, false);
                                Object e = null;
                                Object arguments = null;
                                arguments = this.contextReferences.getCapturedValue("arguments");
                                try {
                                    return ZVal.assign(
                                            ZVal.toBool(Gate.this.raw(env, ability, arguments)));
                                } catch (ConvertedException convertedException13) {
                                    if (convertedException13.instanceOf(
                                            AuthorizationException.class,
                                            "Illuminate\\Auth\\Access\\AuthorizationException")) {
                                        e = convertedException13.getObject();
                                        return ZVal.assign(false);
                                    } else {
                                        throw convertedException13;
                                    }
                                }
                            }
                        }.use("arguments", arguments)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abilities")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object any(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Access")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Auth/Access/Gate.php");
        Object abilities = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        return ZVal.assign(
                env.callMethod(
                        collect.f.env(env).call(abilities).value(),
                        new RuntimeArgsWithReferences(),
                        "contains",
                        Gate.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Auth\\Access",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "ability")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object ability = assignParameter(args, 0, false);
                                Object arguments = null;
                                arguments = this.contextReferences.getCapturedValue("arguments");
                                return ZVal.assign(Gate.this.check(env, ability, arguments));
                            }
                        }.use("arguments", arguments)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object authorize(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object result = null;
        result = this.raw(env, ability, arguments);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        result, Response.class, "Illuminate\\Auth\\Access\\Response"))) {
            return ZVal.assign(result);
        }

        return ZVal.assign(ZVal.isTrue(result) ? this.allow(env) : this.deny(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object raw(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, true);
        if (null == arguments) {
            arguments = ZVal.newArray();
        }
        Object result = null;
        Object user = null;
        if (!ZVal.isTrue(user = this.resolveUser(env))) {
            return ZVal.assign(false);
        }

        arguments = Arr.runtimeStaticObject.wrap(env, arguments);
        result = this.callBeforeCallbacks(env, user, ability, arguments);
        if (function_is_null.f.env(env).call(result).getBool()) {
            result = this.callAuthCallback(env, user, ability, arguments);
        }

        this.callAfterCallbacks(env, user, ability, arguments, result);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(index = 1, name = "ability")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    protected Object callAuthCallback(RuntimeEnv env, Object... args) {
        ReferenceContainer user = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object ability = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, false);
        Object callback = null;
        callback = this.resolveAuthCallback(env, user.getObject(), ability, arguments);
        return ZVal.assign(
                env.callFunctionDynamic(
                                callback,
                                new RuntimeArgsWithReferences().add(0, user),
                                PackedVaradicArgs.unpack(
                                        user.getObject(), new PackedVaradicArgs(arguments)))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(index = 1, name = "ability")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    protected Object callBeforeCallbacks(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object ability = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, false);
        Object result = null;
        Object before = null;
        arguments =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(new ZPair(0, user), new ZPair(1, ability)),
                                ZVal.newArray(new ZPair(0, arguments)))
                        .value();
        for (ZPair zpairResult192 : ZVal.getIterable(this.beforeCallbacks, env, true)) {
            before = ZVal.assign(zpairResult192.getValue());
            if (!function_is_null
                    .f
                    .env(env)
                    .call(
                            result =
                                    env.callFunctionDynamic(
                                                    before,
                                                    new RuntimeArgsWithReferences(),
                                                    PackedVaradicArgs.unpack(
                                                            new PackedVaradicArgs(arguments)))
                                            .value())
                    .getBool()) {
                return ZVal.assign(result);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(index = 1, name = "ability")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    @ConvertedParameter(index = 3, name = "result")
    protected Object callAfterCallbacks(RuntimeEnv env, Object... args) {
        Object user = assignParameter(args, 0, false);
        Object ability = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, false);
        Object result = assignParameter(args, 3, false);
        Object after = null;
        arguments =
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                ZVal.newArray(
                                        new ZPair(0, user),
                                        new ZPair(1, ability),
                                        new ZPair(2, result)),
                                ZVal.newArray(new ZPair(0, arguments)))
                        .value();
        for (ZPair zpairResult193 : ZVal.getIterable(this.afterCallbacks, env, true)) {
            after = ZVal.assign(zpairResult193.getValue());
            env.callFunctionDynamic(
                    after,
                    new RuntimeArgsWithReferences(),
                    PackedVaradicArgs.unpack(new PackedVaradicArgs(arguments)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(index = 1, name = "ability")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    protected Object resolveAuthCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Access")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Auth/Access/Gate.php");
        Object user = assignParameter(args, 0, false);
        Object ability = assignParameter(args, 1, false);
        ReferenceContainer arguments = new BasicReferenceContainer(assignParameter(args, 2, false));
        Object callback = null;
        Object policy = null;
        if (ZVal.toBool(
                        ZVal.toBool(arrayActionR(ArrayAction.ISSET, arguments, env, 0))
                                && ZVal.toBool(
                                        !function_is_null
                                                .f
                                                .env(env)
                                                .call(
                                                        policy =
                                                                this.getPolicyFor(
                                                                        env,
                                                                        arguments.arrayGet(env, 0)))
                                                .getBool()))
                && ZVal.toBool(
                        callback =
                                this.resolvePolicyCallback(
                                        env, user, ability, arguments.getObject(), policy))) {
            return ZVal.assign(callback);
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "abilities", env),
                env,
                ability)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "abilities", env).arrayGet(env, ability));
        }

        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Auth\\Access",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        return ZVal.assign(false);
                    }
                });
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object getPolicyFor(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object expected = null;
        Object policy = null;
        if (function_is_object.f.env(env).call(_pClass).getBool()) {
            _pClass = function_get_class.f.env(env).call(_pClass).value();
        }

        if (!function_is_string.f.env(env).call(_pClass).getBool()) {
            return null;
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "policies", env),
                env,
                _pClass)) {
            return ZVal.assign(
                    this.resolvePolicy(
                            env,
                            new ReferenceClassProperty(this, "policies", env)
                                    .arrayGet(env, _pClass)));
        }

        for (ZPair zpairResult194 : ZVal.getIterable(this.policies, env, false)) {
            expected = ZVal.assign(zpairResult194.getKey());
            policy = ZVal.assign(zpairResult194.getValue());
            if (NamespaceGlobal.is_subclass_of.env(env).call(_pClass, expected).getBool()) {
                return ZVal.assign(this.resolvePolicy(env, policy));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    public Object resolvePolicy(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.container, "make", Gate.class, _pClass));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    @ConvertedParameter(index = 1, name = "ability")
    @ConvertedParameter(index = 2, name = "arguments", typeHint = "array")
    @ConvertedParameter(index = 3, name = "policy")
    protected Object resolvePolicyCallback(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Access")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Auth/Access/Gate.php");
        Object user = assignParameter(args, 0, false);
        Object ability = assignParameter(args, 1, false);
        Object arguments = assignParameter(args, 2, false);
        Object policy = assignParameter(args, 3, false);
        if (!function_is_callable
                .f
                .env(env)
                .call(
                        ZVal.newArray(
                                new ZPair(0, policy),
                                new ZPair(1, this.formatAbilityToMethod(env, ability))))
                .getBool()) {
            return ZVal.assign(false);
        }

        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Auth\\Access",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object result = null;
                        ReferenceContainer arguments = new BasicReferenceContainer(null);
                        Object ability = null;
                        ReferenceContainer user = new BasicReferenceContainer(null);
                        Object policy = null;
                        arguments = this.contextReferences.getReferenceContainer("arguments");
                        ability = this.contextReferences.getCapturedValue("ability");
                        user = this.contextReferences.getReferenceContainer("user");
                        policy = this.contextReferences.getCapturedValue("policy");
                        result =
                                Gate.this.callPolicyBefore(
                                        env,
                                        policy,
                                        user.getObject(),
                                        ability,
                                        arguments.getObject());
                        if (!function_is_null.f.env(env).call(result).getBool()) {
                            return ZVal.assign(result);
                        }

                        ability = Gate.this.formatAbilityToMethod(env, ability);
                        if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, arguments, env, 0))
                                && ZVal.toBool(
                                        function_is_string
                                                .f
                                                .env(env)
                                                .call(arguments.arrayGet(env, 0))
                                                .value())) {
                            function_array_shift.f.env(env).call(arguments.getObject());
                        }

                        return ZVal.assign(
                                function_is_callable
                                                .f
                                                .env(env)
                                                .call(
                                                        ZVal.newArray(
                                                                new ZPair(0, policy),
                                                                new ZPair(1, ability)))
                                                .getBool()
                                        ? env.callMethod(
                                                policy,
                                                new RuntimeArgsWithReferences().add(0, user),
                                                toStringR(ability, env),
                                                Gate.class,
                                                PackedVaradicArgs.unpack(
                                                        user.getObject(),
                                                        new PackedVaradicArgs(
                                                                arguments.getObject())))
                                        : false);
                    }
                }.use("arguments", arguments)
                        .use("ability", ability)
                        .use("user", user)
                        .use("policy", policy));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "policy")
    @ConvertedParameter(index = 1, name = "user")
    @ConvertedParameter(index = 2, name = "ability")
    @ConvertedParameter(index = 3, name = "arguments")
    protected Object callPolicyBefore(RuntimeEnv env, Object... args) {
        Object policy = assignParameter(args, 0, false);
        Object user = assignParameter(args, 1, false);
        Object ability = assignParameter(args, 2, false);
        Object arguments = assignParameter(args, 3, false);
        if (function_method_exists.f.env(env).call(policy, "before").getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            policy,
                            "before",
                            Gate.class,
                            PackedVaradicArgs.unpack(
                                    user, ability, new PackedVaradicArgs(arguments))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ability")
    protected Object formatAbilityToMethod(RuntimeEnv env, Object... args) {
        Object ability = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.strictNotEqualityCheck(
                                function_strpos.f.env(env).call(ability, "-").value(), "!==", false)
                        ? Str.runtimeStaticObject.camel(env, ability)
                        : ability);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "user")
    public Object forUser(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth/Access")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Auth/Access/Gate.php");
        Object user = assignParameter(args, 0, false);
        Object callback = null;
        callback =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Auth\\Access",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object user = null;
                        user = this.contextReferences.getCapturedValue("user");
                        return ZVal.assign(user);
                    }
                }.use("user", user);
        return ZVal.assign(
                env.createNewWithLateStaticBindings(
                        this,
                        this.container,
                        callback,
                        this.abilities,
                        this.policies,
                        this.beforeCallbacks,
                        this.afterCallbacks));
    }

    @ConvertedMethod
    protected Object resolveUser(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(this.userResolver)
                        .value());
    }

    @ConvertedMethod
    public Object abilities(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.abilities);
    }

    @ConvertedMethod
    public Object policies(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.policies);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "message",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object allow(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, true);
        if (null == message) {
            message = ZVal.getNull();
        }
        return ZVal.assign(new Response(env, message));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    protected Object deny(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, true);
        if (null == message) {
            message = "This action is unauthorized.";
        }
        throw ZVal.getException(env, new AuthorizationException(env, message));
    }

    public static final Object CONST_class = "Illuminate\\Auth\\Access\\Gate";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Auth\\Access\\Gate")
                    .setLookup(
                            Gate.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "abilities",
                            "afterCallbacks",
                            "beforeCallbacks",
                            "container",
                            "policies",
                            "userResolver")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Auth/Access/Gate.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\Access\\Gate")
                    .addTrait("Illuminate\\Auth\\Access\\HandlesAuthorization")
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
