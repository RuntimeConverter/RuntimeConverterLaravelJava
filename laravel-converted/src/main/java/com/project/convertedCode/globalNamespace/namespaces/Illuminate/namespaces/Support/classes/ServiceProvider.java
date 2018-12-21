package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_key_exists;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_intersect_key;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Application;
import com.project.convertedCode.globalNamespace.functions.collect;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/ServiceProvider.php

*/

public abstract class ServiceProvider extends RuntimeClassBase {

    public Object app = null;

    public Object defer = false;

    public ServiceProvider(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ServiceProvider.class) {
            this.__construct(env, args);
        }
    }

    public ServiceProvider(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object app = assignParameter(args, 0, false);
        this.app = app;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "key")
    protected Object mergeConfigFrom(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope29 scope = new Scope29();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Support/ServiceProvider.php");
            scope.path = assignParameter(args, 0, false);
            scope.key = assignParameter(args, 1, false);
            scope.config = null;
            scope.config =
                    env.callMethod(
                            new ReferenceClassProperty(scope._thisVarAlias, "app", env)
                                    .arrayGet(env, "config"),
                            "get",
                            ServiceProvider.class,
                            scope.key,
                            ZVal.newArray());
            env.callMethod(
                    new ReferenceClassProperty(scope._thisVarAlias, "app", env)
                            .arrayGet(env, "config"),
                    "set",
                    ServiceProvider.class,
                    scope.key,
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    env.include(
                                            toStringR(scope.path, env),
                                            stack,
                                            runtimeConverterFunctionClassConstants,
                                            true,
                                            false),
                                    scope.config)
                            .value());
            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object loadRoutesFrom(RuntimeEnv env, Object... args) {
        RuntimeStack stack = new RuntimeStack();
        stack.setupGlobals(env);
        Scope30 scope = new Scope30();
        stack.pushScope(scope);
        scope._thisVarAlias = this;
        try {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Support/ServiceProvider.php");
            scope.path = assignParameter(args, 0, false);
            if (!ZVal.isTrue(env.callMethod(this.app, "routesAreCached", ServiceProvider.class))) {
                env.include(
                        toStringR(scope.path, env),
                        stack,
                        runtimeConverterFunctionClassConstants,
                        true,
                        false);
            }

            throw new IncludeEventException(null);
        } catch (IncludeEventException runtimeConverterIncludeException) {
            return runtimeConverterIncludeException.returnValue;
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "namespace")
    protected Object loadViewsFrom(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object namespace = assignParameter(args, 1, false);
        Object appPath = null;
        Object viewPath = null;
        if (function_is_array
                .f
                .env(env)
                .call(
                        new ReferenceClassProperty(this.app, "config", env)
                                .arrayGet(env, "view", "paths"))
                .getBool()) {
            for (ZPair zpairResult582 :
                    ZVal.getIterable(
                            new ReferenceClassProperty(this.app, "config", env)
                                    .arrayGet(env, "view", "paths"),
                            env,
                            true)) {
                viewPath = ZVal.assign(zpairResult582.getValue());
                if (function_is_dir
                        .f
                        .env(env)
                        .call(
                                appPath =
                                        toStringR(viewPath, env)
                                                + "/vendor/"
                                                + toStringR(namespace, env))
                        .getBool()) {
                    env.callMethod(
                            new ReferenceClassProperty(this, "app", env).arrayGet(env, "view"),
                            "addNamespace",
                            ServiceProvider.class,
                            namespace,
                            appPath);
                }
            }
        }

        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "view"),
                "addNamespace",
                ServiceProvider.class,
                namespace,
                path);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    @ConvertedParameter(index = 1, name = "namespace")
    protected Object loadTranslationsFrom(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        Object namespace = assignParameter(args, 1, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "translator"),
                "addNamespace",
                ServiceProvider.class,
                namespace,
                path);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    protected Object loadJsonTranslationsFrom(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env).arrayGet(env, "translator"),
                "addJsonPath",
                ServiceProvider.class,
                path);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths")
    protected Object loadMigrationsFrom(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/ServiceProvider.php");
        Object paths = assignParameter(args, 0, false);
        env.callMethod(
                this.app,
                "afterResolving",
                ServiceProvider.class,
                "migrator",
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Support", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "migrator")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object migrator = assignParameter(args, 0, false);
                        Object path = null;
                        Object paths = null;
                        paths = this.contextReferences.getCapturedValue("paths");
                        for (ZPair zpairResult583 :
                                ZVal.getIterable(rToArrayCast(paths), env, true)) {
                            path = ZVal.assign(zpairResult583.getValue());
                            env.callMethod(migrator, "path", ServiceProvider.class, path);
                        }

                        return null;
                    }
                }.use("paths", paths));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "group",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object publishes(RuntimeEnv env, Object... args) {
        Object paths = assignParameter(args, 0, false);
        Object group = assignParameter(args, 1, true);
        if (null == group) {
            group = ZVal.getNull();
        }
        Object _pClass = null;
        this.ensurePublishArrayInitialized(
                env,
                _pClass =
                        ZVal.assign(
                                ClassConstantUtils.getConstantValueLateStatic(env, this, "class")));
        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Support
                                .classes
                                .ServiceProvider
                                .RequestStaticProperties
                                .class,
                        "publishes")
                .arrayAccess(env, _pClass)
                .set(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Support
                                                                .classes
                                                                .ServiceProvider
                                                                .RequestStaticProperties
                                                                .class,
                                                        "publishes")
                                                .arrayGet(env, _pClass),
                                        paths)
                                .value());
        if (ZVal.isTrue(group)) {
            this.addPublishGroup(env, group, paths);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    protected Object ensurePublishArrayInitialized(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        if (!function_array_key_exists
                .f
                .env(env)
                .call(
                        _pClass,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .ServiceProvider
                                                .RequestStaticProperties
                                                .class)
                                .publishes)
                .getBool()) {
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .classes
                                    .ServiceProvider
                                    .RequestStaticProperties
                                    .class,
                            "publishes")
                    .arrayAccess(env, _pClass)
                    .set(ZVal.newArray());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "group")
    @ConvertedParameter(index = 1, name = "paths")
    protected Object addPublishGroup(RuntimeEnv env, Object... args) {
        Object group = assignParameter(args, 0, false);
        Object paths = assignParameter(args, 1, false);
        if (!function_array_key_exists
                .f
                .env(env)
                .call(
                        group,
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .ServiceProvider
                                                .RequestStaticProperties
                                                .class)
                                .publishGroups)
                .getBool()) {
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Support
                                    .classes
                                    .ServiceProvider
                                    .RequestStaticProperties
                                    .class,
                            "publishGroups")
                    .arrayAccess(env, group)
                    .set(ZVal.newArray());
        }

        env.getRequestStaticPropertiesReference(
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Support
                                .classes
                                .ServiceProvider
                                .RequestStaticProperties
                                .class,
                        "publishGroups")
                .arrayAccess(env, group)
                .set(
                        function_array_merge
                                .f
                                .env(env)
                                .call(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Support
                                                                .classes
                                                                .ServiceProvider
                                                                .RequestStaticProperties
                                                                .class,
                                                        "publishGroups")
                                                .arrayGet(env, group),
                                        paths)
                                .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commands")
    public Object commands(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Support/ServiceProvider.php");
        Object commands = assignParameter(args, 0, false);
        commands =
                ZVal.assign(
                        function_is_array.f.env(env).call(commands).getBool()
                                ? commands
                                : function_func_get_args
                                        .f
                                        .env(env)
                                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                        .call()
                                        .value());
        Application.runtimeStaticObject.starting(
                env,
                new Closure(
                        env, runtimeConverterFunctionClassConstants, "Illuminate\\Support", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "artisan")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object artisan = assignParameter(args, 0, false);
                        Object commands = null;
                        commands = this.contextReferences.getCapturedValue("commands");
                        env.callMethod(artisan, "resolveCommands", ServiceProvider.class, commands);
                        return null;
                    }
                }.use("commands", commands));
        return null;
    }

    @ConvertedMethod
    public Object provides(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object when(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object isDeferred(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.defer);
    }

    public static final Object CONST_class = "Illuminate\\Support\\ServiceProvider";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "provider",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 1,
            name = "group",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object pathsToPublish(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Support/ServiceProvider.php");
            Object provider = assignParameter(args, 0, true);
            if (null == provider) {
                provider = ZVal.getNull();
            }
            Object group = assignParameter(args, 1, true);
            if (null == group) {
                group = ZVal.getNull();
            }
            Object paths = null;
            if (!function_is_null
                    .f
                    .env(env)
                    .call(
                            paths =
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, ServiceProvider.class)
                                            .method("pathsForProviderOrGroup")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(provider, group)
                                            .value())
                    .getBool()) {
                return ZVal.assign(paths);
            }

            return ZVal.assign(
                    env.callMethod(
                            collect.f
                                    .env(env)
                                    .call(
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Support
                                                                    .classes
                                                                    .ServiceProvider
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .publishes)
                                    .value(),
                            "reduce",
                            ServiceProvider.class,
                            new Closure(
                                    env,
                                    runtimeConverterFunctionClassConstants,
                                    "Illuminate\\Support",
                                    this) {
                                @Override
                                @ConvertedMethod
                                @ConvertedParameter(index = 0, name = "paths")
                                @ConvertedParameter(index = 1, name = "p")
                                public Object run(
                                        RuntimeEnv env,
                                        Object thisvar,
                                        PassByReferenceArgs runtimePassByReferenceArgs,
                                        Object... args) {
                                    Object paths = assignParameter(args, 0, false);
                                    Object p = assignParameter(args, 1, false);
                                    return ZVal.assign(
                                            function_array_merge.f.env(env).call(paths, p).value());
                                }
                            },
                            ZVal.newArray()));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "provider")
        @ConvertedParameter(index = 1, name = "group")
        protected Object pathsForProviderOrGroup(RuntimeEnv env, Object... args) {
            Object provider = assignParameter(args, 0, false);
            Object group = assignParameter(args, 1, false);
            if (ZVal.toBool(provider) && ZVal.toBool(group)) {
                return ZVal.assign(
                        StaticMethodUtils.accessUnknownLateStaticMethod(
                                        env, this, ServiceProvider.class)
                                .method("pathsForProviderAndGroup")
                                .addReferenceArgs(new RuntimeArgsWithReferences())
                                .call(provider, group)
                                .value());

            } else if (ZVal.toBool(group)
                    && ZVal.toBool(
                            function_array_key_exists
                                    .f
                                    .env(env)
                                    .call(
                                            group,
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Support
                                                                    .classes
                                                                    .ServiceProvider
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .publishGroups)
                                    .value())) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .ServiceProvider
                                                .RequestStaticProperties
                                                .class,
                                        "publishGroups")
                                .arrayGet(env, group));

            } else if (ZVal.toBool(provider)
                    && ZVal.toBool(
                            function_array_key_exists
                                    .f
                                    .env(env)
                                    .call(
                                            provider,
                                            env.getRequestStaticProperties(
                                                            com.project
                                                                    .convertedCode
                                                                    .globalNamespace
                                                                    .namespaces
                                                                    .Illuminate
                                                                    .namespaces
                                                                    .Support
                                                                    .classes
                                                                    .ServiceProvider
                                                                    .RequestStaticProperties
                                                                    .class)
                                                    .publishes)
                                    .value())) {
                return ZVal.assign(
                        env.getRequestStaticPropertiesReference(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Support
                                                .classes
                                                .ServiceProvider
                                                .RequestStaticProperties
                                                .class,
                                        "publishes")
                                .arrayGet(env, provider));

            } else if (ZVal.toBool(group) || ZVal.toBool(provider)) {
                return ZVal.assign(ZVal.newArray());
            }

            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "provider")
        @ConvertedParameter(index = 1, name = "group")
        protected Object pathsForProviderAndGroup(RuntimeEnv env, Object... args) {
            Object provider = assignParameter(args, 0, false);
            Object group = assignParameter(args, 1, false);
            if (ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.EMPTY,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Support
                                                    .classes
                                                    .ServiceProvider
                                                    .RequestStaticProperties
                                                    .class,
                                            "publishes"),
                                    env,
                                    provider))
                    && ZVal.toBool(
                            !arrayActionR(
                                    ArrayAction.EMPTY,
                                    env.getRequestStaticPropertiesReference(
                                            com.project
                                                    .convertedCode
                                                    .globalNamespace
                                                    .namespaces
                                                    .Illuminate
                                                    .namespaces
                                                    .Support
                                                    .classes
                                                    .ServiceProvider
                                                    .RequestStaticProperties
                                                    .class,
                                            "publishGroups"),
                                    env,
                                    group))) {
                return ZVal.assign(
                        function_array_intersect_key
                                .f
                                .env(env)
                                .call(
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Support
                                                                .classes
                                                                .ServiceProvider
                                                                .RequestStaticProperties
                                                                .class,
                                                        "publishes")
                                                .arrayGet(env, provider),
                                        env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Support
                                                                .classes
                                                                .ServiceProvider
                                                                .RequestStaticProperties
                                                                .class,
                                                        "publishGroups")
                                                .arrayGet(env, group))
                                .value());
            }

            return ZVal.assign(ZVal.newArray());
        }

        @ConvertedMethod
        public Object publishableProviders(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    function_array_keys
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
                                                            .Support
                                                            .classes
                                                            .ServiceProvider
                                                            .RequestStaticProperties
                                                            .class)
                                            .publishes)
                            .value());
        }

        @ConvertedMethod
        public Object publishableGroups(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    function_array_keys
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
                                                            .Support
                                                            .classes
                                                            .ServiceProvider
                                                            .RequestStaticProperties
                                                            .class)
                                            .publishGroups)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object publishes = ZVal.newArray();

        public Object publishGroups = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Support\\ServiceProvider")
                    .setLookup(
                            ServiceProvider.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("app", "defer")
                    .setStaticPropertyNames("publishGroups", "publishes")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Support/ServiceProvider.php")
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

    private static class Scope29 implements UpdateRuntimeScopeInterface {

        Object path;
        Object _thisVarAlias;
        Object config;
        Object key;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("this", this._thisVarAlias);
            stack.setVariable("config", this.config);
            stack.setVariable("key", this.key);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this._thisVarAlias = stack.getVariable("this");
            this.config = stack.getVariable("config");
            this.key = stack.getVariable("key");
        }
    }

    private static class Scope30 implements UpdateRuntimeScopeInterface {

        Object path;
        Object _thisVarAlias;

        public void updateStack(RuntimeStack stack) {

            stack.setVariable("path", this.path);
            stack.setVariable("this", this._thisVarAlias);
        }

        public void updateScope(RuntimeStack stack) {

            this.path = stack.getVariable("path");
            this._thisVarAlias = stack.getVariable("this");
        }
    }
}
