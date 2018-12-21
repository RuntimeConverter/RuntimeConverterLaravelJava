package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.Store;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.PasswordBrokerFactory;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.project.convertedCode.globalNamespace.functions.app_path;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cookie.classes.CookieJar;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_property_exists;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.namespaces.Failed.classes.FailedJobProviderInterface;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.PackageManifest;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Router;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Events.classes.EventServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Hashing.classes.Hasher;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Mail.classes.MailQueue;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes.HttpKernelInterface;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Cookie.classes.QueueingFactory;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.HttpException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.namespaces.Passwords.classes.PasswordBrokerManager;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.Queue;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.DatabaseManager;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.Connection;
import com.project.convertedCode.globalNamespace.functions.base_path;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Filesystem.classes.FilesystemManager;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.EnvironmentDetector;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.View.namespaces.Compilers.classes.BladeCompiler;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Auth.classes.Guard;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Http.classes.Kernel;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Exception.classes.NotFoundHttpException;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.RoutingServiceProvider;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_arg;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_walk;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Queue.classes.QueueManager;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.LoadEnvironmentVariables;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.AliasLoader;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Collection;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Container.classes.ContainerInterface;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Log.classes.LogServiceProvider;
import com.project.convertedCode.globalNamespace.namespaces.Psr.namespaces.Log.classes.LoggerInterface;
import com.runtimeconverter.runtime.nativeFunctions.http.function_php_sapi_name;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes.HashManager;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Events.classes.LocaleUpdated;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.nativeFunctions.file.function_realpath;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Queue.classes.Monitor;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.Registrar;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Routing.classes.BindingRegistrar;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Cache.classes.CacheManager;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Redis.classes.RedisManager;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Auth.classes.AuthManager;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Session.classes.SessionManager;
import com.project.convertedCode.globalNamespace.functions.data_get;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.classes.ConnectionInterface;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Routing.classes.Redirector;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.classes.ProviderRepository;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Filesystem.classes.Cloud;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_num_args;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Log.classes.LogManager;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Session.classes.Session;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Application.php

*/

public class Application
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Container
                .classes
                .Container
        implements com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Contracts
                        .namespaces
                        .Foundation
                        .classes
                        .Application,
                HttpKernelInterface {

    public Object basePath = null;

    public Object hasBeenBootstrapped = false;

    public Object booted = false;

    public Object bootingCallbacks = ZVal.newArray();

    public Object bootedCallbacks = ZVal.newArray();

    public Object terminatingCallbacks = ZVal.newArray();

    public Object serviceProviders = ZVal.newArray();

    public Object loadedProviders = ZVal.newArray();

    public Object deferredServices = ZVal.newArray();

    public Object databasePath = null;

    public Object storagePath = null;

    public Object environmentPath = null;

    public Object environmentFile = ".env";

    public Object namespace = null;

    public Application(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Application.class) {
            this.__construct(env, args);
        }
    }

    public Application(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "basePath",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object basePath = assignParameter(args, 0, true);
        if (null == basePath) {
            basePath = ZVal.getNull();
        }
        if (ZVal.isTrue(basePath)) {
            this.setBasePath(env, basePath);
        }

        this.registerBaseBindings(env);
        this.registerBaseServiceProviders(env);
        this.registerCoreContainerAliases(env);
        return null;
    }

    @ConvertedMethod
    public Object version(RuntimeEnv env, Object... args) {
        return ZVal.assign(ClassConstantUtils.getConstantValueLateStatic(env, this, "VERSION"));
    }

    @ConvertedMethod
    protected Object registerBaseBindings(RuntimeEnv env, Object... args) {
        StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Application.class)
                .method("setInstance")
                .addReferenceArgs(
                        new RuntimeArgsWithReferences()
                                .add(0, new ReadOnlyReferenceContainer(this)))
                .call(this)
                .value();
        env.callMethod(this, "instance", Application.class, "app", this);
        env.callMethod(
                this,
                "instance",
                Application.class,
                com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Illuminate
                        .namespaces
                        .Container
                        .classes
                        .Container
                        .CONST_class,
                this);
        env.callMethod(
                this,
                "instance",
                Application.class,
                PackageManifest.CONST_class,
                new PackageManifest(
                        env,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Filesystem
                                .classes
                                .Filesystem(env),
                        this.basePath(env),
                        this.getCachedPackagesPath(env)));
        return null;
    }

    @ConvertedMethod
    protected Object registerBaseServiceProviders(RuntimeEnv env, Object... args) {
        this.register(env, new EventServiceProvider(env, this));
        this.register(env, new LogServiceProvider(env, this));
        this.register(env, new RoutingServiceProvider(env, this));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bootstrappers", typeHint = "array")
    public Object bootstrapWith(RuntimeEnv env, Object... args) {
        Object bootstrappers = assignParameter(args, 0, false);
        Object bootstrapper = null;
        this.hasBeenBootstrapped = true;
        for (ZPair zpairResult387 : ZVal.getIterable(bootstrappers, env, true)) {
            bootstrapper = ZVal.assign(zpairResult387.getValue());
            env.callMethod(
                    this.asArray().arrayGet(env, "events"),
                    "fire",
                    Application.class,
                    "bootstrapping: " + toStringR(bootstrapper, env),
                    ZVal.newArray(new ZPair(0, this)));
            env.callMethod(this.make(env, bootstrapper), "bootstrap", Application.class, this);
            env.callMethod(
                    this.asArray().arrayGet(env, "events"),
                    "fire",
                    Application.class,
                    "bootstrapped: " + toStringR(bootstrapper, env),
                    ZVal.newArray(new ZPair(0, this)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object afterLoadingEnvironment(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        return ZVal.assign(
                this.afterBootstrapping(env, LoadEnvironmentVariables.CONST_class, callback));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bootstrapper")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object beforeBootstrapping(RuntimeEnv env, Object... args) {
        Object bootstrapper = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        env.callMethod(
                this.asArray().arrayGet(env, "events"),
                "listen",
                Application.class,
                "bootstrapping: " + toStringR(bootstrapper, env),
                callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "bootstrapper")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object afterBootstrapping(RuntimeEnv env, Object... args) {
        Object bootstrapper = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        env.callMethod(
                this.asArray().arrayGet(env, "events"),
                "listen",
                Application.class,
                "bootstrapped: " + toStringR(bootstrapper, env),
                callback);
        return null;
    }

    @ConvertedMethod
    public Object hasBeenBootstrapped(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hasBeenBootstrapped);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "basePath")
    public Object setBasePath(RuntimeEnv env, Object... args) {
        Object basePath = assignParameter(args, 0, false);
        this.basePath = function_rtrim.f.env(env).call(basePath, "\\/").value();
        this.bindPathsInContainer(env);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object bindPathsInContainer(RuntimeEnv env, Object... args) {
        env.callMethod(this, "instance", Application.class, "path", this.path(env));
        env.callMethod(this, "instance", Application.class, "path.base", this.basePath(env));
        env.callMethod(this, "instance", Application.class, "path.lang", this.langPath(env));
        env.callMethod(this, "instance", Application.class, "path.config", this.configPath(env));
        env.callMethod(this, "instance", Application.class, "path.public", this.publicPath(env));
        env.callMethod(this, "instance", Application.class, "path.storage", this.storagePath(env));
        env.callMethod(
                this, "instance", Application.class, "path.database", this.databasePath(env));
        env.callMethod(
                this, "instance", Application.class, "path.resources", this.resourcePath(env));
        env.callMethod(
                this, "instance", Application.class, "path.bootstrap", this.bootstrapPath(env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object path(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = "";
        }
        return ZVal.assign(
                toStringR(this.basePath, env)
                        + toStringR("/", env)
                        + "app"
                        + toStringR(
                                ZVal.isTrue(path)
                                        ? toStringR("/", env) + toStringR(path, env)
                                        : path,
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object basePath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = "";
        }
        return ZVal.assign(
                toStringR(this.basePath, env)
                        + toStringR(
                                ZVal.isTrue(path)
                                        ? toStringR("/", env) + toStringR(path, env)
                                        : path,
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object bootstrapPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = "";
        }
        return ZVal.assign(
                toStringR(this.basePath, env)
                        + toStringR("/", env)
                        + "bootstrap"
                        + toStringR(
                                ZVal.isTrue(path)
                                        ? toStringR("/", env) + toStringR(path, env)
                                        : path,
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object configPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = "";
        }
        return ZVal.assign(
                toStringR(this.basePath, env)
                        + toStringR("/", env)
                        + "config"
                        + toStringR(
                                ZVal.isTrue(path)
                                        ? toStringR("/", env) + toStringR(path, env)
                                        : path,
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object databasePath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = "";
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                toStringR(
                                ZVal.isTrue(ternaryExpressionTemp = this.databasePath)
                                        ? ternaryExpressionTemp
                                        : toStringR(this.basePath, env)
                                                + toStringR("/", env)
                                                + "database",
                                env)
                        + toStringR(
                                ZVal.isTrue(path)
                                        ? toStringR("/", env) + toStringR(path, env)
                                        : path,
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object useDatabasePath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.databasePath = path;
        env.callMethod(this, "instance", Application.class, "path.database", path);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object langPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.resourcePath(env), env) + toStringR("/", env) + "lang");
    }

    @ConvertedMethod
    public Object publicPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.basePath, env) + toStringR("/", env) + "public");
    }

    @ConvertedMethod
    public Object storagePath(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.storagePath)
                        ? ternaryExpressionTemp
                        : toStringR(this.basePath, env) + toStringR("/", env) + "storage");
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object useStoragePath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.storagePath = path;
        env.callMethod(this, "instance", Application.class, "path.storage", path);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object resourcePath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = "";
        }
        return ZVal.assign(
                toStringR(this.basePath, env)
                        + toStringR("/", env)
                        + "resources"
                        + toStringR(
                                ZVal.isTrue(path)
                                        ? toStringR("/", env) + toStringR(path, env)
                                        : path,
                                env));
    }

    @ConvertedMethod
    public Object environmentPath(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.environmentPath)
                        ? ternaryExpressionTemp
                        : this.basePath);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object useEnvironmentPath(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        this.environmentPath = path;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    public Object loadEnvironmentFrom(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        this.environmentFile = file;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object environmentFile(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.environmentFile)
                        ? ternaryExpressionTemp
                        : ".env");
    }

    @ConvertedMethod
    public Object environmentFilePath(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.environmentPath(env), env)
                        + toStringR("/", env)
                        + toStringR(this.environmentFile(env), env));
    }

    @ConvertedMethod
    public Object environment(RuntimeEnv env, Object... args) {
        Object patterns = null;
        if (ZVal.isGreaterThan(
                function_func_num_args
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                        .call()
                        .value(),
                '>',
                0)) {
            patterns =
                    ZVal.assign(
                            function_is_array
                                            .f
                                            .env(env)
                                            .call(
                                                    function_func_get_arg
                                                            .f
                                                            .env(env)
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithInfo(
                                                                            args, this))
                                                            .call(0)
                                                            .value())
                                            .getBool()
                                    ? function_func_get_arg
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(0)
                                            .value()
                                    : function_func_get_args
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call()
                                            .value());
            return ZVal.assign(
                    Str.runtimeStaticObject.is(env, patterns, this.asArray().arrayGet(env, "env")));
        }

        return ZVal.assign(this.asArray().arrayGet(env, "env"));
    }

    @ConvertedMethod
    public Object isLocal(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.equalityCheck(this.asArray().arrayGet(env, "env"), "local"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object detectEnvironment(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object ___args = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object ternaryExpressionTemp = null;
        ___args =
                ZVal.assign(
                        ZVal.isDefined(ternaryExpressionTemp = _SERVER.arrayGet(env, "argv"))
                                ? ternaryExpressionTemp
                                : ZVal.getNull());
        return ZVal.assign(
                this.asArray()
                        .arrayAccess(env, "env")
                        .set(
                                env.callMethod(
                                        new EnvironmentDetector(env),
                                        "detect",
                                        Application.class,
                                        callback,
                                        ___args)));
    }

    @ConvertedMethod
    public Object runningInConsole(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_php_sapi_name.f.env(env).call().value(),
                                        "===",
                                        "cli"))
                        || ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        function_php_sapi_name.f.env(env).call().value(),
                                        "===",
                                        "phpdbg")));
    }

    @ConvertedMethod
    public Object runningUnitTests(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.strictEqualityCheck(this.asArray().arrayGet(env, "env"), "===", "testing"));
    }

    @ConvertedMethod
    public Object registerConfiguredProviders(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Application.php");
        Object providers = null;
        providers =
                env.callMethod(
                        Collection.runtimeStaticObject.make(
                                env,
                                new ReferenceClassProperty(this, "config", env)
                                        .arrayGet(env, "app.providers")),
                        "partition",
                        Application.class,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Foundation",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "provider")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object provider = assignParameter(args, 0, false);
                                return ZVal.assign(
                                        Str.runtimeStaticObject.startsWith(
                                                env, provider, "Illuminate\\"));
                            }
                        });
        env.callMethod(
                providers,
                "splice",
                Application.class,
                1,
                0,
                ZVal.newArray(
                        new ZPair(
                                0,
                                env.callMethod(
                                        this.make(env, PackageManifest.CONST_class),
                                        "providers",
                                        Application.class))));
        env.callMethod(
                new ProviderRepository(
                        env,
                        this,
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Filesystem
                                .classes
                                .Filesystem(env),
                        this.getCachedServicesPath(env)),
                "load",
                Application.class,
                env.callMethod(
                        env.callMethod(providers, "collapse", Application.class),
                        "toArray",
                        Application.class));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    @ConvertedParameter(index = 1, name = "options", defaultValue = "", defaultValueType = "array")
    @ConvertedParameter(
        index = 2,
        name = "force",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object register(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object force = assignParameter(args, 2, true);
        if (null == force) {
            force = false;
        }
        Object registered = null;
        Object value = null;
        Object key = null;
        if (ZVal.toBool(registered = this.getProvider(env, provider))
                && ZVal.toBool(!ZVal.isTrue(force))) {
            return ZVal.assign(registered);
        }

        if (function_is_string.f.env(env).call(provider).getBool()) {
            provider = this.resolveProvider(env, provider);
        }

        if (function_method_exists.f.env(env).call(provider, "register").getBool()) {
            env.callMethod(provider, "register", Application.class);
        }

        if (function_property_exists.f.env(env).call(provider, "bindings").getBool()) {
            for (ZPair zpairResult388 :
                    ZVal.getIterable(
                            toObjectR(provider).accessProp(this, env).name("bindings").value(),
                            env,
                            false)) {
                key = ZVal.assign(zpairResult388.getKey());
                value = ZVal.assign(zpairResult388.getValue());
                env.callMethod(this, "bind", Application.class, key, value);
            }
        }

        if (function_property_exists.f.env(env).call(provider, "singletons").getBool()) {
            for (ZPair zpairResult389 :
                    ZVal.getIterable(
                            toObjectR(provider).accessProp(this, env).name("singletons").value(),
                            env,
                            false)) {
                key = ZVal.assign(zpairResult389.getKey());
                value = ZVal.assign(zpairResult389.getValue());
                env.callMethod(this, "singleton", Application.class, key, value);
            }
        }

        this.markAsRegistered(env, provider);
        if (ZVal.isTrue(this.booted)) {
            this.bootProvider(env, provider);
        }

        return ZVal.assign(provider);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    public Object getProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(
                                ternaryExpressionTemp =
                                        handleReturnReference(
                                                        function_array_values
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        this.getProviders(
                                                                                env, provider))
                                                                .value())
                                                .arrayGet(env, 0))
                        ? ternaryExpressionTemp
                        : ZVal.getNull());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    public Object getProviders(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Application.php");
        Object provider = assignParameter(args, 0, false);
        Object name = null;
        name =
                ZVal.assign(
                        function_is_string.f.env(env).call(provider).getBool()
                                ? provider
                                : function_get_class.f.env(env).call(provider).value());
        return ZVal.assign(
                Arr.runtimeStaticObject.where(
                        env,
                        this.serviceProviders,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Foundation",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                Object name = null;
                                name = this.contextReferences.getCapturedValue("name");
                                return ZVal.assign(ZVal.checkInstanceTypeMatch(value, name));
                            }
                        }.use("name", name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    public Object resolveProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        return ZVal.assign(env.createNew(provider, this));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    protected Object markAsRegistered(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "serviceProviders", env).arrayAppend(env).set(provider);
        new ReferenceClassProperty(this, "loadedProviders", env)
                .arrayAccess(env, function_get_class.f.env(env).call(provider).value())
                .set(true);
        return null;
    }

    @ConvertedMethod
    public Object loadDeferredProviders(RuntimeEnv env, Object... args) {
        Object provider = null;
        Object service = null;
        for (ZPair zpairResult390 : ZVal.getIterable(this.deferredServices, env, false)) {
            service = ZVal.assign(zpairResult390.getKey());
            provider = ZVal.assign(zpairResult390.getValue());
            this.loadDeferredProvider(env, service);
        }

        this.deferredServices = ZVal.newArray();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "service")
    public Object loadDeferredProvider(RuntimeEnv env, Object... args) {
        Object service = assignParameter(args, 0, false);
        Object provider = null;
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "deferredServices", env),
                env,
                service)) {
            return null;
        }

        provider =
                ZVal.assign(
                        new ReferenceClassProperty(this, "deferredServices", env)
                                .arrayGet(env, service));
        if (!arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "loadedProviders", env),
                env,
                provider)) {
            this.registerDeferredProvider(env, provider, service);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "provider")
    @ConvertedParameter(
        index = 1,
        name = "service",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object registerDeferredProvider(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Application.php");
        Object provider = assignParameter(args, 0, false);
        Object service = assignParameter(args, 1, true);
        if (null == service) {
            service = ZVal.getNull();
        }
        Object instance = null;
        if (ZVal.isTrue(service)) {
            arrayActionR(
                    ArrayAction.UNSET,
                    new ReferenceClassProperty(this, "deferredServices", env),
                    env,
                    service);
        }

        this.register(env, instance = env.createNew(provider, this));
        if (!ZVal.isTrue(this.booted)) {
            this.booting(
                    env,
                    new Closure(
                            env,
                            runtimeConverterFunctionClassConstants,
                            "Illuminate\\Foundation",
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
                            instance = this.contextReferences.getCapturedValue("instance");
                            Application.this.bootProvider(env, instance);
                            return null;
                        }
                    }.use("instance", instance));
        }

        return null;
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
        _pAbstract = env.callMethod(this, "getAlias", Application.class, _pAbstract);
        if (ZVal.toBool(
                        arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "deferredServices", env),
                                env,
                                _pAbstract))
                && ZVal.toBool(
                        !arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(this, "instances", env),
                                env,
                                _pAbstract))) {
            this.loadDeferredProvider(env, _pAbstract);
        }

        return ZVal.assign(super.make(env, _pAbstract, parameters));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abstract")
    public Object bound(RuntimeEnv env, Object... args) {
        Object _pAbstract = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "deferredServices", env),
                                        env,
                                        _pAbstract))
                        || ZVal.toBool(super.bound(env, _pAbstract)));
    }

    @ConvertedMethod
    public Object isBooted(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.booted);
    }

    @ConvertedMethod
    public Object boot(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Application.php");
        if (ZVal.isTrue(this.booted)) {
            return null;
        }

        this.fireAppCallbacks(env, this.bootingCallbacks);
        function_array_walk
                .f
                .env(env)
                .call(
                        this.serviceProviders,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Foundation",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "p")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object _closureThisVar = this.getClosureThisVar();
                                Object p = assignParameter(args, 0, false);
                                Application.this.bootProvider(env, p);
                                return null;
                            }
                        });
        this.booted = true;
        this.fireAppCallbacks(env, this.bootedCallbacks);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "provider",
        typeHint = "Illuminate\\Support\\ServiceProvider"
    )
    protected Object bootProvider(RuntimeEnv env, Object... args) {
        Object provider = assignParameter(args, 0, false);
        if (function_method_exists.f.env(env).call(provider, "boot").getBool()) {
            return ZVal.assign(
                    env.callMethod(
                            this,
                            "call",
                            Application.class,
                            ZVal.newArray(new ZPair(0, provider), new ZPair(1, "boot"))));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object booting(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "bootingCallbacks", env).arrayAppend(env).set(callback);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    public Object booted(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "bootedCallbacks", env).arrayAppend(env).set(callback);
        if (ZVal.isTrue(this.isBooted(env))) {
            this.fireAppCallbacks(env, ZVal.newArray(new ZPair(0, callback)));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callbacks", typeHint = "array")
    protected Object fireAppCallbacks(RuntimeEnv env, Object... args) {
        Object callbacks = assignParameter(args, 0, false);
        Object callback = null;
        for (ZPair zpairResult391 : ZVal.getIterable(callbacks, env, true)) {
            callback = ZVal.assign(zpairResult391.getValue());
            function_call_user_func
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(callback, this);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "request",
        typeHint = "Symfony\\Component\\HttpFoundation\\Request"
    )
    @ConvertedParameter(index = 1, name = "type")
    @ConvertedParameter(
        index = 2,
        name = "catch",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object request = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = CONST_MASTER_REQUEST;
        }
        Object _pCatch = assignParameter(args, 2, true);
        if (null == _pCatch) {
            _pCatch = true;
        }
        return ZVal.assign(
                env.callMethod(
                        this.asArray().arrayGet(env, Kernel.CONST_class),
                        "handle",
                        Application.class,
                        com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces
                                .Http.classes.Request.runtimeStaticObject.createFromBase(
                                env, request)));
    }

    @ConvertedMethod
    public Object shouldSkipMiddleware(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(this.bound(env, "middleware.disable"))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(
                                        this.make(env, "middleware.disable"), "===", true)));
    }

    @ConvertedMethod
    public Object getCachedServicesPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.bootstrapPath(env), env) + "/cache/services.php");
    }

    @ConvertedMethod
    public Object getCachedPackagesPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.bootstrapPath(env), env) + "/cache/packages.php");
    }

    @ConvertedMethod
    public Object configurationIsCached(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_file_exists.f.env(env).call(this.getCachedConfigPath(env)).value());
    }

    @ConvertedMethod
    public Object getCachedConfigPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.bootstrapPath(env), env) + "/cache/config.php");
    }

    @ConvertedMethod
    public Object routesAreCached(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.asArray().arrayGet(env, "files"),
                        "exists",
                        Application.class,
                        this.getCachedRoutesPath(env)));
    }

    @ConvertedMethod
    public Object getCachedRoutesPath(RuntimeEnv env, Object... args) {
        return ZVal.assign(toStringR(this.bootstrapPath(env), env) + "/cache/routes.php");
    }

    @ConvertedMethod
    public Object isDownForMaintenance(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_file_exists
                        .f
                        .env(env)
                        .call(toStringR(this.storagePath(env), env) + "/framework/down")
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(index = 1, name = "message")
    @ConvertedParameter(
        index = 2,
        name = "headers",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object abort(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, true);
        if (null == message) {
            message = "";
        }
        Object headers = assignParameter(args, 2, true);
        if (null == headers) {
            headers = ZVal.newArray();
        }
        if (ZVal.equalityCheck(code, 404)) {
            throw ZVal.getException(env, new NotFoundHttpException(env, message));
        }

        throw ZVal.getException(
                env, new HttpException(env, code, message, ZVal.getNull(), headers));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
    public Object terminating(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "terminatingCallbacks", env)
                .arrayAppend(env)
                .set(callback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object terminate(RuntimeEnv env, Object... args) {
        Object terminating = null;
        for (ZPair zpairResult392 : ZVal.getIterable(this.terminatingCallbacks, env, true)) {
            terminating = ZVal.assign(zpairResult392.getValue());
            env.callMethod(this, "call", Application.class, terminating);
        }

        return null;
    }

    @ConvertedMethod
    public Object getLoadedProviders(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.loadedProviders);
    }

    @ConvertedMethod
    public Object getDeferredServices(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.deferredServices);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "services", typeHint = "array")
    public Object setDeferredServices(RuntimeEnv env, Object... args) {
        Object services = assignParameter(args, 0, false);
        this.deferredServices = services;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "services", typeHint = "array")
    public Object addDeferredServices(RuntimeEnv env, Object... args) {
        Object services = assignParameter(args, 0, false);
        this.deferredServices =
                function_array_merge.f.env(env).call(this.deferredServices, services).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "service")
    public Object isDeferredService(RuntimeEnv env, Object... args) {
        Object service = assignParameter(args, 0, false);
        return ZVal.assign(
                arrayActionR(
                        ArrayAction.ISSET,
                        new ReferenceClassProperty(this, "deferredServices", env),
                        env,
                        service));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    public Object provideFacades(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, false);
        AliasLoader.runtimeStaticObject.setFacadeNamespace(env, namespace);
        return null;
    }

    @ConvertedMethod
    public Object getLocale(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        this.asArray().arrayGet(env, "config"),
                        "get",
                        Application.class,
                        "app.locale"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object setLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        env.callMethod(
                this.asArray().arrayGet(env, "config"),
                "set",
                Application.class,
                "app.locale",
                locale);
        env.callMethod(
                this.asArray().arrayGet(env, "translator"), "setLocale", Application.class, locale);
        env.callMethod(
                this.asArray().arrayGet(env, "events"),
                "dispatch",
                Application.class,
                new LocaleUpdated(env, locale));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "locale")
    public Object isLocale(RuntimeEnv env, Object... args) {
        Object locale = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.equalityCheck(this.getLocale(env), locale));
    }

    @ConvertedMethod
    public Object registerCoreContainerAliases(RuntimeEnv env, Object... args) {
        Object aliases = null;
        Object alias = null;
        Object key = null;
        for (ZPair zpairResult393 :
                ZVal.getIterable(
                        ZVal.newArray(
                                new ZPair(
                                        "app",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Foundation
                                                                .classes
                                                                .Application
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
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
                                                                .Container
                                                                .CONST_class),
                                                new ZPair(
                                                        2,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Foundation
                                                                .classes
                                                                .Application
                                                                .CONST_class),
                                                new ZPair(3, ContainerInterface.CONST_class))),
                                new ZPair(
                                        "auth",
                                        ZVal.newArray(
                                                new ZPair(0, AuthManager.CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Auth
                                                                .classes
                                                                .Factory
                                                                .CONST_class))),
                                new ZPair(
                                        "auth.driver",
                                        ZVal.newArray(new ZPair(0, Guard.CONST_class))),
                                new ZPair(
                                        "blade.compiler",
                                        ZVal.newArray(new ZPair(0, BladeCompiler.CONST_class))),
                                new ZPair(
                                        "cache",
                                        ZVal.newArray(
                                                new ZPair(0, CacheManager.CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Cache
                                                                .classes
                                                                .Factory
                                                                .CONST_class))),
                                new ZPair(
                                        "cache.store",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Cache
                                                                .classes
                                                                .Repository
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Cache
                                                                .classes
                                                                .Repository
                                                                .CONST_class))),
                                new ZPair(
                                        "config",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Config
                                                                .classes
                                                                .Repository
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Config
                                                                .classes
                                                                .Repository
                                                                .CONST_class))),
                                new ZPair(
                                        "cookie",
                                        ZVal.newArray(
                                                new ZPair(0, CookieJar.CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Cookie
                                                                .classes
                                                                .Factory
                                                                .CONST_class),
                                                new ZPair(2, QueueingFactory.CONST_class))),
                                new ZPair(
                                        "encrypter",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Encryption
                                                                .classes
                                                                .Encrypter
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Encryption
                                                                .classes
                                                                .Encrypter
                                                                .CONST_class))),
                                new ZPair(
                                        "db",
                                        ZVal.newArray(new ZPair(0, DatabaseManager.CONST_class))),
                                new ZPair(
                                        "db.connection",
                                        ZVal.newArray(
                                                new ZPair(0, Connection.CONST_class),
                                                new ZPair(1, ConnectionInterface.CONST_class))),
                                new ZPair(
                                        "events",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Events
                                                                .classes
                                                                .Dispatcher
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Events
                                                                .classes
                                                                .Dispatcher
                                                                .CONST_class))),
                                new ZPair(
                                        "files",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Filesystem
                                                                .classes
                                                                .Filesystem
                                                                .CONST_class))),
                                new ZPair(
                                        "filesystem",
                                        ZVal.newArray(
                                                new ZPair(0, FilesystemManager.CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Filesystem
                                                                .classes
                                                                .Factory
                                                                .CONST_class))),
                                new ZPair(
                                        "filesystem.disk",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Filesystem
                                                                .classes
                                                                .Filesystem
                                                                .CONST_class))),
                                new ZPair(
                                        "filesystem.cloud",
                                        ZVal.newArray(new ZPair(0, Cloud.CONST_class))),
                                new ZPair(
                                        "hash",
                                        ZVal.newArray(new ZPair(0, HashManager.CONST_class))),
                                new ZPair(
                                        "hash.driver",
                                        ZVal.newArray(new ZPair(0, Hasher.CONST_class))),
                                new ZPair(
                                        "translator",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Translation
                                                                .classes
                                                                .Translator
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Translation
                                                                .classes
                                                                .Translator
                                                                .CONST_class))),
                                new ZPair(
                                        "log",
                                        ZVal.newArray(
                                                new ZPair(0, LogManager.CONST_class),
                                                new ZPair(1, LoggerInterface.CONST_class))),
                                new ZPair(
                                        "mailer",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Mail
                                                                .classes
                                                                .Mailer
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Mail
                                                                .classes
                                                                .Mailer
                                                                .CONST_class),
                                                new ZPair(2, MailQueue.CONST_class))),
                                new ZPair(
                                        "auth.password",
                                        ZVal.newArray(
                                                new ZPair(0, PasswordBrokerManager.CONST_class),
                                                new ZPair(1, PasswordBrokerFactory.CONST_class))),
                                new ZPair(
                                        "auth.password.broker",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Auth
                                                                .namespaces
                                                                .Passwords
                                                                .classes
                                                                .PasswordBroker
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Auth
                                                                .classes
                                                                .PasswordBroker
                                                                .CONST_class))),
                                new ZPair(
                                        "queue",
                                        ZVal.newArray(
                                                new ZPair(0, QueueManager.CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Queue
                                                                .classes
                                                                .Factory
                                                                .CONST_class),
                                                new ZPair(2, Monitor.CONST_class))),
                                new ZPair(
                                        "queue.connection",
                                        ZVal.newArray(new ZPair(0, Queue.CONST_class))),
                                new ZPair(
                                        "queue.failer",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        FailedJobProviderInterface.CONST_class))),
                                new ZPair(
                                        "redirect",
                                        ZVal.newArray(new ZPair(0, Redirector.CONST_class))),
                                new ZPair(
                                        "redis",
                                        ZVal.newArray(
                                                new ZPair(0, RedisManager.CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Redis
                                                                .classes
                                                                .Factory
                                                                .CONST_class))),
                                new ZPair(
                                        "request",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Http
                                                                .classes
                                                                .Request
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Symfony
                                                                .namespaces
                                                                .Component
                                                                .namespaces
                                                                .HttpFoundation
                                                                .classes
                                                                .Request
                                                                .CONST_class))),
                                new ZPair(
                                        "router",
                                        ZVal.newArray(
                                                new ZPair(0, Router.CONST_class),
                                                new ZPair(1, Registrar.CONST_class),
                                                new ZPair(2, BindingRegistrar.CONST_class))),
                                new ZPair(
                                        "session",
                                        ZVal.newArray(new ZPair(0, SessionManager.CONST_class))),
                                new ZPair(
                                        "session.store",
                                        ZVal.newArray(
                                                new ZPair(0, Store.CONST_class),
                                                new ZPair(1, Session.CONST_class))),
                                new ZPair(
                                        "url",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Routing
                                                                .classes
                                                                .UrlGenerator
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Routing
                                                                .classes
                                                                .UrlGenerator
                                                                .CONST_class))),
                                new ZPair(
                                        "validator",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Validation
                                                                .classes
                                                                .Factory
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .Validation
                                                                .classes
                                                                .Factory
                                                                .CONST_class))),
                                new ZPair(
                                        "view",
                                        ZVal.newArray(
                                                new ZPair(
                                                        0,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .View
                                                                .classes
                                                                .Factory
                                                                .CONST_class),
                                                new ZPair(
                                                        1,
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Illuminate
                                                                .namespaces
                                                                .Contracts
                                                                .namespaces
                                                                .View
                                                                .classes
                                                                .Factory
                                                                .CONST_class)))),
                        env,
                        false)) {
            key = ZVal.assign(zpairResult393.getKey());
            aliases = ZVal.assign(zpairResult393.getValue());
            for (ZPair zpairResult394 : ZVal.getIterable(aliases, env, true)) {
                alias = ZVal.assign(zpairResult394.getValue());
                env.callMethod(this, "alias", Application.class, key, alias);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object flush(RuntimeEnv env, Object... args) {
        super.flush(env);
        toObjectR(this).accessProp(this, env).name("buildStack").set(ZVal.newArray());
        this.loadedProviders = ZVal.newArray();
        this.bootedCallbacks = ZVal.newArray();
        this.bootingCallbacks = ZVal.newArray();
        this.deferredServices = ZVal.newArray();
        toObjectR(this).accessProp(this, env).name("reboundCallbacks").set(ZVal.newArray());
        this.serviceProviders = ZVal.newArray();
        toObjectR(this).accessProp(this, env).name("resolvingCallbacks").set(ZVal.newArray());
        toObjectR(this).accessProp(this, env).name("afterResolvingCallbacks").set(ZVal.newArray());
        toObjectR(this).accessProp(this, env).name("globalResolvingCallbacks").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        Object path = null;
        Object pathChoice = null;
        Object composer = null;
        Object namespace = null;
        if (!function_is_null.f.env(env).call(this.namespace).getBool()) {
            return ZVal.assign(this.namespace);
        }

        composer =
                NamespaceGlobal.json_decode
                        .env(env)
                        .call(
                                function_file_get_contents
                                        .f
                                        .env(env)
                                        .call(base_path.f.env(env).call("composer.json").value())
                                        .value(),
                                true)
                        .value();
        for (ZPair zpairResult395 :
                ZVal.getIterable(
                        rToArrayCast(data_get.f.env(env).call(composer, "autoload.psr-4").value()),
                        env,
                        false)) {
            namespace = ZVal.assign(zpairResult395.getKey());
            path = ZVal.assign(zpairResult395.getValue());
            for (ZPair zpairResult396 : ZVal.getIterable(rToArrayCast(path), env, true)) {
                pathChoice = ZVal.assign(zpairResult396.getValue());
                if (ZVal.equalityCheck(
                        function_realpath
                                .f
                                .env(env)
                                .call(app_path.f.env(env).call().value())
                                .value(),
                        function_realpath
                                .f
                                .env(env)
                                .call(
                                        toStringR(base_path.f.env(env).call().value(), env)
                                                + "/"
                                                + toStringR(pathChoice, env))
                                .value())) {
                    return ZVal.assign(this.namespace = namespace);
                }
            }
        }

        throw ZVal.getException(
                env, new RuntimeException(env, "Unable to detect application namespace."));
    }

    public static final Object CONST_VERSION = "5.6.27";

    public static final Object CONST_class = "Illuminate\\Foundation\\Application";

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
                    .Container
                    .classes
                    .Container
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Application")
                    .setLookup(
                            Application.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "abstractAliases",
                            "afterResolvingCallbacks",
                            "aliases",
                            "basePath",
                            "bindings",
                            "booted",
                            "bootedCallbacks",
                            "bootingCallbacks",
                            "buildStack",
                            "contextual",
                            "databasePath",
                            "deferredServices",
                            "environmentFile",
                            "environmentPath",
                            "extenders",
                            "globalAfterResolvingCallbacks",
                            "globalResolvingCallbacks",
                            "hasBeenBootstrapped",
                            "instances",
                            "loadedProviders",
                            "methodBindings",
                            "namespace",
                            "reboundCallbacks",
                            "resolved",
                            "resolvingCallbacks",
                            "serviceProviders",
                            "storagePath",
                            "tags",
                            "terminatingCallbacks",
                            "with")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Application.php")
                    .addInterface("Illuminate\\Contracts\\Foundation\\Application")
                    .addInterface("Illuminate\\Contracts\\Container\\Container")
                    .addInterface("Psr\\Container\\ContainerInterface")
                    .addInterface("Symfony\\Component\\HttpKernel\\HttpKernelInterface")
                    .addInterface("ArrayAccess")
                    .addExtendsClass("Illuminate\\Container\\Container")
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
