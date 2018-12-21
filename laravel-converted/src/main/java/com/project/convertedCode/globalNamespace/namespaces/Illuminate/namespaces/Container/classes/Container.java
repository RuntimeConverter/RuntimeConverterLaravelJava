package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.ContextualBindingBuilder;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeInterfaces.ArrayAccess;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.EntryNotFoundException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_compact;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Container.classes.BoundMethod;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Container.classes.BindingResolutionException;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Container/Container.php

*/

public class Container extends RuntimeClassBase
        implements ArrayAccess,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Container
                        .classes
                        .Container {

    public Object resolved = ZVal.newArray();

    public Object bindings = ZVal.newArray();

    public Object methodBindings = ZVal.newArray();

    public Object instances = ZVal.newArray();

    public Object aliases = ZVal.newArray();

    public Object abstractAliases = ZVal.newArray();

    public Object extenders = ZVal.newArray();

    public Object tags = ZVal.newArray();

    public Object buildStack = ZVal.newArray();

    public Object with = ZVal.newArray();

    public Object contextual = ZVal.newArray();

    public Object reboundCallbacks = ZVal.newArray();

    public Object globalResolvingCallbacks = ZVal.newArray();

    public Object globalAfterResolvingCallbacks = ZVal.newArray();

    public Object resolvingCallbacks = ZVal.newArray();

    public Object afterResolvingCallbacks = ZVal.newArray();

    public Container(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Container(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "concrete")
    public Object when(RuntimeEnv env, Object... args) {
        Object concrete = assignParameter(args, 0, false);
        return ZVal.assign(new ContextualBindingBuilder(env, this, this.getAlias(env, concrete)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    public Object bound(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        new ReferenceClassProperty(
                                                                this, "bindings", env),
                                                        env,
                                                        _pAbstract))
                                        || ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        new ReferenceClassProperty(
                                                                this, "instances", env),
                                                        env,
                                                        _pAbstract)))
                        || ZVal.toBool(this.isAlias(env, _pAbstract)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object has(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        return ZVal.assign(this.bound(env, id));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    public Object resolved(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.isAlias(env, _pAbstract))) {
            _pAbstract = this.getAlias(env, _pAbstract);
        }

        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "resolved", env),
                                        env,
                                        _pAbstract))
                        || ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "instances", env),
                                        env,
                                        _pAbstract)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    public Object isShared(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "instances", env),
                                        env,
                                        _pAbstract))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                arrayActionR(
                                                        ArrayAction.ISSET,
                                                        new ReferenceClassProperty(
                                                                this, "bindings", env),
                                                        env,
                                                        _pAbstract,
                                                        "shared"))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        new ReferenceClassProperty(
                                                                        this, "bindings", env)
                                                                .arrayGet(
                                                                        env, _pAbstract, "shared"),
                                                        "===",
                                                        true))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object isAlias(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "aliases", env),
                        env,
                        name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(
        index = 1,
        name = "concrete",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "shared",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object bind(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope80 scope = new Scope80();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Container")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Container/Container.php");
            scope._pAbstract = assignParameter(args, 0, false);
            scope.concrete = assignParameter(args, 1, true);
            if (null == scope.concrete) {
                scope.concrete = ZVal.getNull();
            }
            scope.shared = assignParameter(args, 2, true);
            if (null == scope.shared) {
                scope.shared = false;
            }
            this.dropStaleInstances(env, scope._pAbstract);
            if (function_is_null.f.env(env).call(scope.concrete).getBool()) {
                scope.concrete = ZVal.assign(scope._pAbstract);
            }

            if (!ZVal.isTrue(ZVal.checkInstanceType(scope.concrete, Closure.class, "Closure"))) {
                scope.concrete = this.getClosure(env, scope._pAbstract, scope.concrete);
            }

            new ReferenceClassProperty(scope._thisVarAlias, "bindings", env)
                    .arrayAccess(env, scope._pAbstract)
                    .set(function_compact.f.env(env).call(stack, "concrete", "shared").value());
            if (ZVal.isTrue(this.resolved(env, scope._pAbstract))) {
                this.rebound(env, scope._pAbstract);
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "concrete")
    protected Object getClosure(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Container")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Container/Container.php");
        Object _pAbstract = assignParameter(args, 0, false);
        Object concrete = assignParameter(args, 1, false);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Container",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "container")
                    @ConvertedParameter(
                        index = 1,
                        name = "parameters",
                        defaultValue = "",
                        defaultValueType = "array"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object container = assignParameter(args, 0, false);
                        Object parameters = assignParameter(args, 1, true);
                        if (null == parameters) {
                            parameters = ZVal.newArray();
                        }
                        Object concrete = null;
                        Object _pAbstract = null;
                        concrete = this.contextReferences.getCapturedValue("concrete");
                        _pAbstract = this.contextReferences.getCapturedValue("abstract");
                        if (ZVal.equalityCheck(_pAbstract, concrete)) {
                            return ZVal.assign(
                                    env.callMethod(container, "build", Container.class, concrete));
                        }

                        return ZVal.assign(
                                env.callMethod(
                                        container, "make", Container.class, concrete, parameters));
                    }
                }.use("concrete", concrete).use("abstract", _pAbstract));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    public Object hasMethodBinding(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "methodBindings", env),
                        env,
                        method));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "callback")
    public Object bindMethod(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "methodBindings", env)
                .arrayAccess(env, this.parseBindMethod(env, method))
                .set(callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    protected Object parseBindMethod(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (function_is_array.f.env(env).call(method.getObject()).getBool()) {
            return ZVal.assign(
                    toStringR(method.arrayGet(env, 0), env)
                            + "@"
                            + toStringR(method.arrayGet(env, 1), env));
        }

        return ZVal.assign(method.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "instance")
    public Object callMethodBinding(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object instance = assignParameter(args, 1, false);
        return ZVal.assign(
                function_call_user_func
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call(
                                new ReferenceClassProperty(this, "methodBindings", env)
                                        .arrayGet(env, method),
                                instance,
                                this)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "concrete")
    @ConvertedParameter(index = 1, name = "abstract")
    @ConvertedParameter(index = 2, name = "implementation")
    public Object addContextualBinding(RuntimeEnv env, Object... args) {
        Object concrete = assignParameter(args, 0, false);
        Object _pAbstract = assignParameter(args, 1, false);
        Object implementation = assignParameter(args, 2, false);
        new ReferenceClassProperty(this, "contextual", env)
                .arrayAccess(env, concrete, this.getAlias(env, _pAbstract))
                .set(implementation);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(
        index = 1,
        name = "concrete",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "shared",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object bindIf(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object concrete = assignParameter(args, 1, true);
        if (null == concrete) {
            concrete = ZVal.getNull();
        }
        Object shared = assignParameter(args, 2, true);
        if (null == shared) {
            shared = false;
        }
        if (!ZVal.isTrue(this.bound(env, _pAbstract))) {
            this.bind(env, _pAbstract, concrete, shared);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(
        index = 1,
        name = "concrete",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object singleton(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object concrete = assignParameter(args, 1, true);
        if (null == concrete) {
            concrete = ZVal.getNull();
        }
        this.bind(env, _pAbstract, concrete, true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "closure", typeHint = "Closure")
    public Object extend(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object closure = assignParameter(args, 1, false);
        _pAbstract = this.getAlias(env, _pAbstract);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "instances", env),
                env,
                _pAbstract)) {
            new ReferenceClassProperty(this, "instances", env)
                    .arrayAccess(env, _pAbstract)
                    .set(
                            env.callFunctionDynamic(
                                            closure,
                                            new RuntimeArgsWithReferences()
                                                    .add(
                                                            0,
                                                            new ArrayDimensionReference(
                                                                    this.instances, _pAbstract))
                                                    .add(1, new ReadOnlyReferenceContainer(this)),
                                            new ReferenceClassProperty(this, "instances", env)
                                                    .arrayGet(env, _pAbstract),
                                            this)
                                    .value());
            this.rebound(env, _pAbstract);

        } else {
            new ReferenceClassProperty(this, "extenders", env)
                    .arrayAppend(env, _pAbstract)
                    .set(closure);
            if (ZVal.isTrue(this.resolved(env, _pAbstract))) {
                this.rebound(env, _pAbstract);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "instance")
    public Object instance(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object instance = assignParameter(args, 1, false);
        Object isBound = null;
        this.removeAbstractAlias(env, _pAbstract);
        isBound = this.bound(env, _pAbstract);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "aliases", env),
                env,
                _pAbstract);
        new ReferenceClassProperty(this, "instances", env)
                .arrayAccess(env, _pAbstract)
                .set(instance);
        if (ZVal.isTrue(isBound)) {
            this.rebound(env, _pAbstract);
        }

        return ZVal.assign(instance);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "searched")
    protected Object removeAbstractAlias(RuntimeEnv env, Object... args) {
        Object searched = assignParameter(args, 0, false);
        Object aliases = null;
        Object index = null;
        Object alias = null;
        Object _pAbstract = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "aliases", env),
                env,
                searched)) {
            return null;
        }

        for (ZPair zpairResult233 : ZVal.getIterable(this.abstractAliases, env, false)) {
            _pAbstract = ZVal.assign(zpairResult233.getKey());
            aliases = ZVal.assign(zpairResult233.getValue());
            for (ZPair zpairResult234 : ZVal.getIterable(aliases, env, false)) {
                index = ZVal.assign(zpairResult234.getKey());
                alias = ZVal.assign(zpairResult234.getValue());
                if (ZVal.equalityCheck(alias, searched)) {
                    arrayActionR(
                            ArrayAction.UNSET,
                            new ReferenceClassProperty(this, "abstractAliases", env),
                            env,
                            _pAbstract,
                            index);
                }
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstracts")
    @ConvertedParameter(index = 1, name = "tags")
    public Object tag(RuntimeEnv env, Object... args) {
        Object abstracts = assignParameter(args, 0, false);
        Object tags = assignParameter(args, 1, false);
        Object tag = null;
        Object _pAbstract = null;
        tags =
                ZVal.assign(
                        function_is_array.f.env(env).call(tags).getBool()
                                ? tags
                                : function_array_slice
                                        .f
                                        .env(env)
                                        .call(
                                                function_func_get_args
                                                        .f
                                                        .env(env)
                                                        .addReferenceArgs(
                                                                new RuntimeArgsWithInfo(args, this))
                                                        .call()
                                                        .value(),
                                                1)
                                        .value());
        for (ZPair zpairResult235 : ZVal.getIterable(tags, env, true)) {
            tag = ZVal.assign(zpairResult235.getValue());
            if (!arrayActionR(
                    ArrayAction.ISSET, new ReferenceClassProperty(this, "tags", env), env, tag)) {
                new ReferenceClassProperty(this, "tags", env)
                        .arrayAccess(env, tag)
                        .set(ZVal.newArray());
            }

            for (ZPair zpairResult236 : ZVal.getIterable(rToArrayCast(abstracts), env, true)) {
                _pAbstract = ZVal.assign(zpairResult236.getValue());
                new ReferenceClassProperty(this, "tags", env).arrayAppend(env, tag).set(_pAbstract);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tag")
    public Object tagged(RuntimeEnv env, Object... args) {
        Object tag = assignParameter(args, 0, false);
        Object _pAbstract = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        results.setObject(ZVal.newArray());
        if (arrayActionR(
                ArrayAction.ISSET, new ReferenceClassProperty(this, "tags", env), env, tag)) {
            for (ZPair zpairResult237 :
                    ZVal.getIterable(
                            new ReferenceClassProperty(this, "tags", env).arrayGet(env, tag),
                            env,
                            true)) {
                _pAbstract = ZVal.assign(zpairResult237.getValue());
                results.arrayAppend(env).set(this.make(env, _pAbstract));
            }
        }

        return ZVal.assign(results.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "alias")
    public Object alias(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object alias = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "aliases", env).arrayAccess(env, alias).set(_pAbstract);
        new ReferenceClassProperty(this, "abstractAliases", env)
                .arrayAppend(env, _pAbstract)
                .set(alias);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object rebinding(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "reboundCallbacks", env)
                .arrayAppend(env, _pAbstract = this.getAlias(env, _pAbstract))
                .set(callback);
        if (ZVal.isTrue(this.bound(env, _pAbstract))) {
            return ZVal.assign(this.make(env, _pAbstract));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "target")
    @ConvertedParameter(index = 2, name = "method")
    public Object refresh(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Container")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Container/Container.php");
        Object _pAbstract = assignParameter(args, 0, false);
        Object target = assignParameter(args, 1, false);
        Object method = assignParameter(args, 2, false);
        return ZVal.assign(
                this.rebinding(
                        env,
                        _pAbstract,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Container",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "app")
                            @ConvertedParameter(index = 1, name = "instance")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object app = assignParameter(args, 0, false);
                                ReferenceContainer instance =
                                        new BasicReferenceContainer(
                                                assignParameter(args, 1, false));
                                Object method = null;
                                Object target = null;
                                method = this.contextReferences.getCapturedValue("method");
                                target = this.contextReferences.getCapturedValue("target");
                                env.callMethod(
                                        target,
                                        new RuntimeArgsWithReferences().add(0, instance),
                                        toStringR(method, env),
                                        Container.class,
                                        instance.getObject());
                                return null;
                            }
                        }.use("method", method).use("target", target)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    protected Object rebound(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object instance = null;
        Object callback = null;
        instance = this.make(env, _pAbstract);
        for (ZPair zpairResult238 :
                ZVal.getIterable(this.getReboundCallbacks(env, _pAbstract), env, true)) {
            callback = ZVal.assign(zpairResult238.getValue());
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(callback, this, instance);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    protected Object getReboundCallbacks(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "reboundCallbacks", env),
                env,
                _pAbstract)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "reboundCallbacks", env)
                            .arrayGet(env, _pAbstract));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object wrap(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Container")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Container/Container.php");
        Object callback = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Container",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object callback = null;
                        Object parameters = null;
                        callback = this.contextReferences.getCapturedValue("callback");
                        parameters = this.contextReferences.getCapturedValue("parameters");
                        return ZVal.assign(Container.this.call(env, callback, parameters));
                    }
                }.use("callback", callback).use("parameters", parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "defaultMethod",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object defaultMethod = assignParameter(args, 2, true);
        if (null == defaultMethod) {
            defaultMethod = ZVal.getNull();
        }
        return ZVal.assign(
                BoundMethod.runtimeStaticObject.call(
                        env, this, callback, parameters, defaultMethod));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    public Object factory(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Container")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Container/Container.php");
        Object _pAbstract = assignParameter(args, 0, false);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Container",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object _pAbstract = null;
                        _pAbstract = this.contextReferences.getCapturedValue("abstract");
                        return ZVal.assign(Container.this.make(env, _pAbstract));
                    }
                }.use("abstract", _pAbstract));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object makeWith(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        return ZVal.assign(this.make(env, _pAbstract, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        return ZVal.assign(this.resolve(env, _pAbstract, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "id")
    public Object get(RuntimeEnv env, Object... args) {
        Object id = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.has(env, id))) {
            return ZVal.assign(this.resolve(env, id));
        }

        throw ZVal.getException(env, new EntryNotFoundException(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object resolve(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object concrete = null;
        Object extender = null;
        Object needsContextualBuild = null;
        ReferenceContainer _object = new BasicReferenceContainer(null);
        _pAbstract = this.getAlias(env, _pAbstract);
        needsContextualBuild =
                ZVal.toBool(!ZVal.isEmpty(parameters))
                        || ZVal.toBool(
                                !function_is_null
                                        .f
                                        .env(env)
                                        .call(this.getContextualConcrete(env, _pAbstract))
                                        .getBool());
        if (ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "instances", env),
                                env,
                                _pAbstract))
                && ZVal.toBool(!ZVal.isTrue(needsContextualBuild))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "instances", env).arrayGet(env, _pAbstract));
        }

        new ReferenceClassProperty(this, "with", env).arrayAppend(env).set(parameters);
        concrete = this.getConcrete(env, _pAbstract);
        if (ZVal.isTrue(this.isBuildable(env, concrete, _pAbstract))) {
            _object.setObject(this.build(env, concrete));

        } else {
            _object.setObject(this.make(env, concrete));
        }

        for (ZPair zpairResult239 :
                ZVal.getIterable(this.getExtenders(env, _pAbstract), env, true)) {
            extender = ZVal.assign(zpairResult239.getValue());
            _object.setObject(
                    env.callFunctionDynamic(
                                    extender,
                                    new RuntimeArgsWithReferences()
                                            .add(0, _object)
                                            .add(1, new ReadOnlyReferenceContainer(this)),
                                    _object.getObject(),
                                    this)
                            .value());
        }

        if (ZVal.toBool(this.isShared(env, _pAbstract))
                && ZVal.toBool(!ZVal.isTrue(needsContextualBuild))) {
            new ReferenceClassProperty(this, "instances", env)
                    .arrayAccess(env, _pAbstract)
                    .set(_object.getObject());
        }

        this.fireResolvingCallbacks(env, _pAbstract, _object.getObject());
        new ReferenceClassProperty(this, "resolved", env).arrayAccess(env, _pAbstract).set(true);
        function_array_pop.f.env(env).call(this.with);
        return ZVal.assign(_object.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    protected Object getConcrete(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object concrete = null;
        if (!function_is_null
                .f
                .env(env)
                .call(concrete = this.getContextualConcrete(env, _pAbstract))
                .getBool()) {
            return ZVal.assign(concrete);
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "bindings", env),
                env,
                _pAbstract)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "bindings", env)
                            .arrayGet(env, _pAbstract, "concrete"));
        }

        return ZVal.assign(_pAbstract);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    protected Object getContextualConcrete(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object binding = null;
        Object alias = null;
        if (!function_is_null
                .f
                .env(env)
                .call(binding = this.findInContextualBindings(env, _pAbstract))
                .getBool()) {
            return ZVal.assign(binding);
        }

        if (arrayActionR(
                ArrayAction.EMPTY,
                new ReferenceClassProperty(this, "abstractAliases", env),
                env,
                _pAbstract)) {
            return null;
        }

        for (ZPair zpairResult240 :
                ZVal.getIterable(
                        new ReferenceClassProperty(this, "abstractAliases", env)
                                .arrayGet(env, _pAbstract),
                        env,
                        true)) {
            alias = ZVal.assign(zpairResult240.getValue());
            if (!function_is_null
                    .f
                    .env(env)
                    .call(binding = this.findInContextualBindings(env, alias))
                    .getBool()) {
                return ZVal.assign(binding);
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    protected Object findInContextualBindings(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "contextual", env),
                env,
                function_end.f.env(env).call(this.buildStack).value(),
                _pAbstract)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "contextual", env)
                            .arrayGet(
                                    env,
                                    function_end.f.env(env).call(this.buildStack).value(),
                                    _pAbstract));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "concrete")
    @ConvertedParameter(index = 1, name = "abstract")
    protected Object isBuildable(RuntimeEnv env, Object... args) {
        Object concrete = assignParameter(args, 0, false);
        Object _pAbstract = assignParameter(args, 1, false);
        return ZVal.assign(
                ZVal.toBool(ZVal.strictEqualityCheck(concrete, "===", _pAbstract))
                        || ZVal.toBool(ZVal.checkInstanceType(concrete, Closure.class, "Closure")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "concrete")
    public Object build(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object concrete = assignParameter(args, 0, false);
        Object reflector = null;
        Object instances = null;
        Object constructor = null;
        Object dependencies = null;
        if (ZVal.isTrue(ZVal.checkInstanceType(concrete, Closure.class, "Closure"))) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    concrete,
                                    rLastRefArgs =
                                            new RuntimeArgsWithReferences()
                                                    .add(0, new ReadOnlyReferenceContainer(this))
                                                    .add(
                                                            1,
                                                            handleReturnReference(
                                                                    this.getLastParameterOverride(
                                                                            env))),
                                    this,
                                    rLastRefArgs.get(1))
                            .value());
        }

        reflector = new ReflectionClass(env, concrete);
        if (!ZVal.isTrue(env.callMethod(reflector, "isInstantiable", Container.class))) {
            return ZVal.assign(this.notInstantiable(env, concrete));
        }

        new ReferenceClassProperty(this, "buildStack", env).arrayAppend(env).set(concrete);
        constructor = env.callMethod(reflector, "getConstructor", Container.class);
        if (function_is_null.f.env(env).call(constructor).getBool()) {
            function_array_pop.f.env(env).call(this.buildStack);
            return ZVal.assign(env.createNew(concrete));
        }

        dependencies = env.callMethod(constructor, "getParameters", Container.class);
        instances = this.resolveDependencies(env, dependencies);
        function_array_pop.f.env(env).call(this.buildStack);
        return ZVal.assign(
                env.callMethod(reflector, "newInstanceArgs", Container.class, instances));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dependencies", typeHint = "array")
    protected Object resolveDependencies(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object dependencies = assignParameter(args, 0, false);
        Object dependency = null;
        ReferenceContainer results = new BasicReferenceContainer(null);
        results.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult241 : ZVal.getIterable(dependencies, env, true)) {
            dependency = ZVal.assign(zpairResult241.getValue());
            if (ZVal.isTrue(this.hasParameterOverride(env, dependency))) {
                results.arrayAppend(env).set(this.getParameterOverride(env, dependency));
                continue;
            }

            results.arrayAppend(env)
                    .set(
                            function_is_null
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            dependency,
                                                            "getClass",
                                                            Container.class))
                                            .getBool()
                                    ? this.resolvePrimitive(env, dependency)
                                    : this.resolveClass(env, dependency));
        }

        return ZVal.assign(results.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dependency")
    protected Object hasParameterOverride(RuntimeEnv env, Object... args) {
        Object dependency = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_key_exists
                        .f
                        .env(env)
                        .call(
                                toObjectR(dependency).accessProp(this, env).name("name").value(),
                                this.getLastParameterOverride(env))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "dependency")
    protected Object getParameterOverride(RuntimeEnv env, Object... args) {
        Object dependency = assignParameter(args, 0, false);
        return ZVal.assign(
                handleReturnReference(this.getLastParameterOverride(env))
                        .arrayGet(
                                env,
                                toObjectR(dependency).accessProp(this, env).name("name").value()));
    }

    @ConvertedMethod
    protected Object getLastParameterOverride(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_count.f.env(env).call(this.with).getBool()
                        ? function_end.f.env(env).call(this.with).value()
                        : ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    protected Object resolvePrimitive(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object concrete = null;
        if (!function_is_null
                .f
                .env(env)
                .call(
                        concrete =
                                this.getContextualConcrete(
                                        env,
                                        "$"
                                                + toStringR(
                                                        toObjectR(parameter)
                                                                .accessProp(this, env)
                                                                .name("name")
                                                                .value(),
                                                        env)))
                .getBool()) {
            return ZVal.assign(
                    ZVal.isTrue(ZVal.checkInstanceType(concrete, Closure.class, "Closure"))
                            ? env.callFunctionDynamic(
                                            concrete,
                                            new RuntimeArgsWithReferences()
                                                    .add(0, new ReadOnlyReferenceContainer(this)),
                                            this)
                                    .value()
                            : concrete);
        }

        if (ZVal.isTrue(env.callMethod(parameter, "isDefaultValueAvailable", Container.class))) {
            return ZVal.assign(env.callMethod(parameter, "getDefaultValue", Container.class));
        }

        this.unresolvablePrimitive(env, parameter);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    protected Object resolveClass(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object e = null;
        try {
            return ZVal.assign(
                    this.make(
                            env,
                            toObjectR(env.callMethod(parameter, "getClass", Container.class))
                                    .accessProp(this, env)
                                    .name("name")
                                    .value()));
        } catch (ConvertedException convertedException17) {
            if (convertedException17.instanceOf(
                    BindingResolutionException.class,
                    "Illuminate\\Contracts\\Container\\BindingResolutionException")) {
                e = convertedException17.getObject();
                if (ZVal.isTrue(env.callMethod(parameter, "isOptional", Container.class))) {
                    return ZVal.assign(
                            env.callMethod(parameter, "getDefaultValue", Container.class));
                }

                throw ZVal.getException(env, e);
            } else {
                throw convertedException17;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "concrete")
    protected Object notInstantiable(RuntimeEnv env, Object... args) {
        Object concrete = assignParameter(args, 0, false);
        Object previous = null;
        Object message = null;
        if (!ZVal.isEmpty(this.buildStack)) {
            previous = NamespaceGlobal.implode.env(env).call(", ", this.buildStack).value();
            message =
                    ZVal.assign(
                            "Target ["
                                    + toStringR(concrete, env)
                                    + "] is not instantiable while building ["
                                    + toStringR(previous, env)
                                    + "].");

        } else {
            message = ZVal.assign("Target [" + toStringR(concrete, env) + "] is not instantiable.");
        }

        throw ZVal.getException(env, new BindingResolutionException(env, message));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameter", typeHint = "ReflectionParameter")
    protected Object unresolvablePrimitive(RuntimeEnv env, Object... args) {
        Object parameter = assignParameter(args, 0, false);
        Object message = null;
        message =
                ZVal.assign(
                        "Unresolvable dependency resolving ["
                                + toStringR(parameter, env)
                                + "] in class "
                                + toStringR(
                                        env.callMethod(
                                                env.callMethod(
                                                        parameter,
                                                        "getDeclaringClass",
                                                        Container.class),
                                                "getName",
                                                Container.class),
                                        env));
        throw ZVal.getException(env, new BindingResolutionException(env, message));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object resolving(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (function_is_string.f.env(env).call(_pAbstract).getBool()) {
            _pAbstract = this.getAlias(env, _pAbstract);
        }

        if (ZVal.toBool(function_is_null.f.env(env).call(callback).value())
                && ZVal.toBool(ZVal.checkInstanceType(_pAbstract, Closure.class, "Closure"))) {
            new ReferenceClassProperty(this, "globalResolvingCallbacks", env)
                    .arrayAppend(env)
                    .set(_pAbstract);

        } else {
            new ReferenceClassProperty(this, "resolvingCallbacks", env)
                    .arrayAppend(env, _pAbstract)
                    .set(callback);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(
        index = 1,
        name = "callback",
        typeHint = "Closure",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object afterResolving(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, true);
        if (null == callback) {
            callback = ZVal.getNull();
        }
        if (function_is_string.f.env(env).call(_pAbstract).getBool()) {
            _pAbstract = this.getAlias(env, _pAbstract);
        }

        if (ZVal.toBool(ZVal.checkInstanceType(_pAbstract, Closure.class, "Closure"))
                && ZVal.toBool(function_is_null.f.env(env).call(callback).value())) {
            new ReferenceClassProperty(this, "globalAfterResolvingCallbacks", env)
                    .arrayAppend(env)
                    .set(_pAbstract);

        } else {
            new ReferenceClassProperty(this, "afterResolvingCallbacks", env)
                    .arrayAppend(env, _pAbstract)
                    .set(callback);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "object")
    protected Object fireResolvingCallbacks(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object _object = assignParameter(args, 1, false);
        this.fireCallbackArray(env, _object, this.globalResolvingCallbacks);
        this.fireCallbackArray(
                env,
                _object,
                this.getCallbacksForType(env, _pAbstract, _object, this.resolvingCallbacks));
        this.fireAfterResolvingCallbacks(env, _pAbstract, _object);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "object")
    protected Object fireAfterResolvingCallbacks(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object _object = assignParameter(args, 1, false);
        this.fireCallbackArray(env, _object, this.globalAfterResolvingCallbacks);
        this.fireCallbackArray(
                env,
                _object,
                this.getCallbacksForType(env, _pAbstract, _object, this.afterResolvingCallbacks));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    @ConvertedParameter(index = 1, name = "object")
    @ConvertedParameter(index = 2, name = "callbacksPerType", typeHint = "array")
    protected Object getCallbacksForType(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        Object _object = assignParameter(args, 1, false);
        Object callbacksPerType = assignParameter(args, 2, false);
        Object callbacks = null;
        Object type = null;
        Object results = null;
        results = ZVal.newArray();
        for (ZPair zpairResult242 : ZVal.getIterable(callbacksPerType, env, false)) {
            type = ZVal.assign(zpairResult242.getKey());
            callbacks = ZVal.assign(zpairResult242.getValue());
            if (ZVal.toBool(ZVal.strictEqualityCheck(type, "===", _pAbstract))
                    || ZVal.toBool(ZVal.checkInstanceTypeMatch(_object, type))) {
                results = function_array_merge.f.env(env).call(results, callbacks).value();
            }
        }

        return ZVal.assign(results);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "object")
    @ConvertedParameter(index = 1, name = "callbacks", typeHint = "array")
    protected Object fireCallbackArray(RuntimeEnv env, Object... args) {
        ReferenceContainer _object = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object callbacks = assignParameter(args, 1, false);
        Object callback = null;
        for (ZPair zpairResult243 : ZVal.getIterable(callbacks, env, true)) {
            callback = ZVal.assign(zpairResult243.getValue());
            env.callFunctionDynamic(
                    callback,
                    new RuntimeArgsWithReferences()
                            .add(0, _object)
                            .add(1, new ReadOnlyReferenceContainer(this)),
                    _object.getObject(),
                    this);
        }

        return null;
    }

    @ConvertedMethod
    public Object getBindings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bindings);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    public Object getAlias(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "aliases", env),
                env,
                _pAbstract)) {
            return ZVal.assign(_pAbstract);
        }

        if (ZVal.strictEqualityCheck(
                new ReferenceClassProperty(this, "aliases", env).arrayGet(env, _pAbstract),
                "===",
                _pAbstract)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "[" + toStringR(_pAbstract, env) + "] is aliased to itself."));
        }

        return ZVal.assign(
                this.getAlias(
                        env,
                        new ReferenceClassProperty(this, "aliases", env)
                                .arrayGet(env, _pAbstract)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    protected Object getExtenders(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        _pAbstract = this.getAlias(env, _pAbstract);
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "extenders", env),
                env,
                _pAbstract)) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "extenders", env).arrayGet(env, _pAbstract));
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    public Object forgetExtenders(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "extenders", env),
                env,
                this.getAlias(env, _pAbstract));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    protected Object dropStaleInstances(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "instances", env),
                env,
                _pAbstract);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "aliases", env),
                env,
                _pAbstract);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    public Object forgetInstance(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET,
                new ReferenceClassProperty(this, "instances", env),
                env,
                _pAbstract);
        return null;
    }

    @ConvertedMethod
    public Object forgetInstances(RuntimeEnv env, Object... args) {
        this.instances = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        this.aliases = ZVal.newArray();
        this.resolved = ZVal.newArray();
        this.bindings = ZVal.newArray();
        this.instances = ZVal.newArray();
        this.abstractAliases = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetExists(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.bound(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetGet(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.make(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object offsetSet(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Container")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Container/Container.php");
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.bind(
                env,
                key,
                ZVal.isTrue(ZVal.checkInstanceType(value, Closure.class, "Closure"))
                        ? value
                        : new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Container",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = null;
                                value = this.contextReferences.getCapturedValue("value");
                                return ZVal.assign(value);
                            }
                        }.use("value", value));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object offsetUnset(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "bindings", env), env, key);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "instances", env), env, key);
        arrayActionR(
                ArrayAction.UNSET, new ReferenceClassProperty(this, "resolved", env), env, key);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    public Object __get(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        return ZVal.assign(this.asArray().arrayGet(env, key));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    public Object __set(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        this.asArray().arrayAccess(env, key).set(value);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Container\\Container";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object getInstance(RuntimeEnv env, Object... args) {
            if (function_is_null
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
                                                    .Container
                                                    .classes
                                                    .Container
                                                    .RequestStaticProperties
                                                    .class)
                                    .instance)
                    .getBool()) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Container
                                                .classes
                                                .Container
                                                .RequestStaticProperties
                                                .class)
                                .instance =
                        env.createNewWithLateStaticBindings(this);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Container
                                            .classes
                                            .Container
                                            .RequestStaticProperties
                                            .class)
                            .instance);
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "container",
            typeHint = "Illuminate\\Contracts\\Container\\Container",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object setInstance(RuntimeEnv env, Object... args) {
            Object container = assignParameter(args, 0, true);
            if (null == container) {
                container = ZVal.getNull();
            }
            return ZVal.assign(
                    env.getRequestStaticProperties(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Container
                                                    .classes
                                                    .Container
                                                    .RequestStaticProperties
                                                    .class)
                                    .instance =
                            container);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object instance = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Container\\Container")
                    .setLookup(
                            Container.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "abstractAliases",
                            "afterResolvingCallbacks",
                            "aliases",
                            "bindings",
                            "buildStack",
                            "contextual",
                            "extenders",
                            "globalAfterResolvingCallbacks",
                            "globalResolvingCallbacks",
                            "instances",
                            "methodBindings",
                            "reboundCallbacks",
                            "resolved",
                            "resolvingCallbacks",
                            "tags",
                            "with")
                    .setStaticPropertyNames("instance")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Container/Container.php")
                    .addInterface("ArrayAccess")
                    .addInterface("Illuminate\\Contracts\\Container\\Container")
                    .addInterface("Psr\\Container\\ContainerInterface")
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

    private static class Scope80 implements UpdateRuntimeScopeInterface {

        Object concrete;
        Object shared;
        Object _thisVarAlias;
        Object _pAbstract;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("concrete", this.concrete);
            stack.setVariable("shared", this.shared);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("abstract", this._pAbstract);
        }

        public void updateScope(RuntimeStack stack) {

            this.concrete = stack.getVariable("concrete");
            this.shared = stack.getVariable("shared");
            this._thisVarAlias = stack.getVariable("this");
            this._pAbstract = stack.getVariable("abstract");
        }
    }
}
