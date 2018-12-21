package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.TokenGuard;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.Factory;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.RequestGuard;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.SessionGuard;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.DatabaseUserProvider;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.tools.PackedVaradicArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.EloquentUserProvider;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Auth/AuthManager.php

*/

public class AuthManager extends RuntimeClassBase implements Factory {

    public Object app = null;

    public Object customCreators = ZVal.newArray();

    public Object guards = ZVal.newArray();

    public Object userResolver = null;

    public Object customProviderCreators = ZVal.newArray();

    public AuthManager(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AuthManager.class) {
            this.__construct(env, args);
        }
    }

    public AuthManager(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "app")
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Auth/AuthManager.php");
        Object app = assignParameter(args, 0, false);
        this.app = app;
        this.userResolver =
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Auth", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "guard",
                        defaultValue = "NULL",
                        defaultValueType = "constant"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object guard = assignParameter(args, 0, true);
                        if (null == guard) {
                            guard = ZVal.getNull();
                        }
                        return ZVal.assign(
                                env.callMethod(
                                        AuthManager.this.guard(env, guard),
                                        "user",
                                        AuthManager.class));
                    }
                };
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object guard(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.getDefaultDriver(env));
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        new ReferenceClassProperty(this, "guards", env)
                                                .arrayGet(env, name))
                        ? ternaryExpressionTemp
                        : new ReferenceClassProperty(this, "guards", env)
                                .arrayAccess(env, name)
                                .set(this.resolve(env, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object resolve(RuntimeEnv env, Object... args) {
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object driverMethod = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        config.setObject(this.getConfig(env, name.getObject()));
        if (function_is_null.f.env(env).call(config.getObject()).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Auth guard ["
                                    + toStringR(name.getObject(), env)
                                    + "] is not defined."));
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "customCreators", env),
                env,
                config.arrayGet(env, "driver"))) {
            return ZVal.assign(this.callCustomCreator(env, name.getObject(), config.getObject()));
        }

        driverMethod =
                "create"
                        + toStringR(
                                NamespaceGlobal.ucfirst
                                        .env(env)
                                        .call(config.arrayGet(env, "driver"))
                                        .value(),
                                env)
                        + "Driver";
        if (function_method_exists.f.env(env).call(this, driverMethod).getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            new RuntimeArgsWithReferences().add(0, name).add(1, config),
                            toStringR(driverMethod, env),
                            AuthManager.class,
                            name.getObject(),
                            config.getObject()));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(
                        env,
                        "Auth driver ["
                                + toStringR(config.arrayGet(env, "driver"), env)
                                + "] for guard ["
                                + toStringR(name.getObject(), env)
                                + "] is not defined."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "config", typeHint = "array")
    protected Object callCustomCreator(RuntimeEnv env, Object... args) {
        ReferenceContainer name = new BasicReferenceContainer(assignParameter(args, 0, false));
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        return ZVal.assign(
                env.callFunctionDynamic(
                                new ReferenceClassProperty(this, "customCreators", env)
                                        .arrayGet(env, config.arrayGet(env, "driver")),
                                new RuntimeArgsWithReferences()
                                        .add(0, new ReferenceClassProperty(this, "app", env))
                                        .add(1, name)
                                        .add(2, config),
                                this.app,
                                name.getObject(),
                                config.getObject())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "config")
    public Object createSessionDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object provider = null;
        Object guard = null;
        Object ternaryExpressionTemp = null;
        provider =
                this.createUserProvider(
                        env,
                        ZVal.isDefined(ternaryExpressionTemp = config.arrayGet(env, "provider"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        guard =
                new SessionGuard(
                        env,
                        name,
                        provider,
                        new ReferenceClassProperty(this, "app", env)
                                .arrayGet(env, "session.store"));
        if (function_method_exists.f.env(env).call(guard, "setCookieJar").getBool()) {
            env.callMethod(
                    guard,
                    "setCookieJar",
                    AuthManager.class,
                    new ReferenceClassProperty(this, "app", env).arrayGet(env, "cookie"));
        }

        if (function_method_exists.f.env(env).call(guard, "setDispatcher").getBool()) {
            env.callMethod(
                    guard,
                    "setDispatcher",
                    AuthManager.class,
                    new ReferenceClassProperty(this, "app", env).arrayGet(env, "events"));
        }

        if (function_method_exists.f.env(env).call(guard, "setRequest").getBool()) {
            env.callMethod(
                    guard,
                    "setRequest",
                    AuthManager.class,
                    env.callMethod(
                            this.app,
                            "refresh",
                            AuthManager.class,
                            "request",
                            guard,
                            "setRequest"));
        }

        return ZVal.assign(guard);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "config")
    public Object createTokenDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object guard = null;
        Object ternaryExpressionTemp = null;
        guard =
                new TokenGuard(
                        env,
                        this.createUserProvider(
                                env,
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        config.arrayGet(env, "provider"))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()),
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "request"));
        env.callMethod(this.app, "refresh", AuthManager.class, "request", guard, "setRequest");
        return ZVal.assign(guard);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    protected Object getConfig(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "auth.guards." + toStringR(name, env)));
    }

    @ConvertedMethod
    public Object getDefaultDriver(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "auth.defaults.guard"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object shouldUse(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Auth/AuthManager.php");
        Object name = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        name =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = name)
                                ? ternaryExpressionTemp
                                : this.getDefaultDriver(env));
        this.setDefaultDriver(env, name);
        this.userResolver =
                new Closure(env, runtimeConverterFunctionClassConstants, "Illuminate\\Auth", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(
                        index = 0,
                        name = "name",
                        defaultValue = "NULL",
                        defaultValueType = "constant"
                    )
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object name = assignParameter(args, 0, true);
                        if (null == name) {
                            name = ZVal.getNull();
                        }
                        return ZVal.assign(
                                env.callMethod(
                                        AuthManager.this.guard(env, name),
                                        "user",
                                        AuthManager.class));
                    }
                };
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setDefaultDriver(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "app", env)
                .arrayAccess(env, "config", "auth.defaults.guard")
                .set(name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "callable")
    public Object viaRequest(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Auth")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Auth/AuthManager.php");
        Object driver = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        return ZVal.assign(
                this.extend(
                        env,
                        driver,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Auth",
                                this) {
                            @Override
                            @ConvertedMethod
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object guard = null;
                                Object callback = null;
                                callback = this.contextReferences.getCapturedValue("callback");
                                guard =
                                        new RequestGuard(
                                                env,
                                                callback,
                                                new ReferenceClassProperty(
                                                                _closureThisVar, "app", env)
                                                        .arrayGet(env, "request"),
                                                AuthManager.this.createUserProvider(env));
                                env.callMethod(
                                        AuthManager.this.app,
                                        "refresh",
                                        AuthManager.class,
                                        "request",
                                        guard,
                                        "setRequest");
                                return ZVal.assign(guard);
                            }
                        }.use("callback", callback)));
    }

    @ConvertedMethod
    public Object userResolver(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.userResolver);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "userResolver", typeHint = "Closure")
    public Object resolveUsersUsing(RuntimeEnv env, Object... args) {
        Object userResolver = assignParameter(args, 0, false);
        this.userResolver = userResolver;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "driver")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object extend(RuntimeEnv env, Object... args) {
        Object driver = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "customCreators", env)
                .arrayAccess(env, driver)
                .set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object provider(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        new ReferenceClassProperty(this, "customProviderCreators", env)
                .arrayAccess(env, name)
                .set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        Object method = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.guard(env),
                        new RuntimeArgsWithReferences(),
                        toStringR(method, env),
                        AuthManager.class,
                        PackedVaradicArgs.unpack(new PackedVaradicArgs(parameters))));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "provider",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object createUserProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, true);
        if (null == provider) {
            provider = ZVal.getNull();
        }
        Object driver = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer config = new BasicReferenceContainer(null);
        if (function_is_null
                .f
                .env(env)
                .call(config.setObject(this.getProviderConfiguration(env, provider)))
                .getBool()) {
            return null;
        }

        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "customProviderCreators", env),
                env,
                driver =
                        ZVal.assign(
                                ZVal.isDefined(
                                                ternaryExpressionTemp =
                                                        config.arrayGet(env, "driver"))
                                        ? ternaryExpressionTemp
                                        : ZVal.getNull()))) {
            return ZVal.assign(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    new ReferenceClassProperty(this, "customProviderCreators", env)
                                            .arrayGet(env, driver),
                                    this.app,
                                    config.getObject())
                            .value());
        }

        SwitchEnumType20 switchVariable20 =
                ZVal.getEnum(
                        driver,
                        SwitchEnumType20.DEFAULT_CASE,
                        SwitchEnumType20.STRING_database,
                        "database",
                        SwitchEnumType20.STRING_eloquent,
                        "eloquent");
        switch (switchVariable20) {
            case STRING_database:
                return ZVal.assign(this.createDatabaseProvider(env, config.getObject()));
            case STRING_eloquent:
                return ZVal.assign(this.createEloquentProvider(env, config.getObject()));
            case DEFAULT_CASE:
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "Authentication user provider ["
                                        + toStringR(driver, env)
                                        + "] is not defined."));
        }
        ;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    protected Object getProviderConfiguration(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        if (ZVal.isTrue(
                provider =
                        ZVal.assign(
                                ZVal.isTrue(ternaryExpressionTemp = provider)
                                        ? ternaryExpressionTemp
                                        : this.getDefaultUserProvider(env)))) {
            return ZVal.assign(
                    new ReferenceClassProperty(this, "app", env)
                            .arrayGet(env, "config", "auth.providers." + toStringR(provider, env)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config")
    protected Object createDatabaseProvider(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object connection = null;
        connection =
                env.callMethod(
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "db"),
                        "connection",
                        AuthManager.class);
        return ZVal.assign(
                new DatabaseUserProvider(
                        env,
                        connection,
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "hash"),
                        config.arrayGet(env, "table")));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "config")
    protected Object createEloquentProvider(RuntimeEnv env, Object... args) {
        ReferenceContainer config = new BasicReferenceContainer(assignParameter(args, 0, false));
        return ZVal.assign(
                new EloquentUserProvider(
                        env,
                        new ReferenceClassProperty(this, "app", env).arrayGet(env, "hash"),
                        config.arrayGet(env, "model")));
    }

    @ConvertedMethod
    public Object getDefaultUserProvider(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, "config", "auth.defaults.provider"));
    }

    public static final Object CONST_class = "Illuminate\\Auth\\AuthManager";

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
                    .setName("Illuminate\\Auth\\AuthManager")
                    .setLookup(
                            AuthManager.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "app",
                            "customCreators",
                            "customProviderCreators",
                            "guards",
                            "userResolver")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Auth/AuthManager.php")
                    .addInterface("Illuminate\\Contracts\\Auth\\Factory")
                    .addTrait("Illuminate\\Auth\\CreatesUserProviders")
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

    private enum SwitchEnumType20 {
        STRING_database,
        STRING_eloquent,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
