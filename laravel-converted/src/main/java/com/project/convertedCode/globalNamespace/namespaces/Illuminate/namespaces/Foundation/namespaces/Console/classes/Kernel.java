package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Debug.classes.ExceptionHandler;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.SetRequestForConsole;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.RegisterFacades;
import com.project.convertedCode.globalNamespace.functions.app_path;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.HandleExceptions;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Finder.classes.Finder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_dir;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.LoadEnvironmentVariables;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.BootProviders;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Application;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_define;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.RegisterProviders;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Bootstrap.classes.LoadConfiguration;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes.ClosureCommand;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Scheduling.classes.Schedule;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Console.classes.QueuedCommand;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Console/Kernel.php

*/

public class Kernel extends RuntimeClassBase
        implements com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Illuminate
                .namespaces
                .Contracts
                .namespaces
                .Console
                .classes
                .Kernel {

    public Object app = null;

    public Object events = null;

    public Object artisan = null;

    public Object commands = ZVal.newArray();

    public Object commandsLoaded = false;

    public Object bootstrappers =
            ZVal.newArray(
                    new ZPair(0, LoadEnvironmentVariables.CONST_class),
                    new ZPair(1, LoadConfiguration.CONST_class),
                    new ZPair(2, HandleExceptions.CONST_class),
                    new ZPair(3, RegisterFacades.CONST_class),
                    new ZPair(4, SetRequestForConsole.CONST_class),
                    new ZPair(5, RegisterProviders.CONST_class),
                    new ZPair(6, BootProviders.CONST_class));

    public Kernel(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Kernel.class) {
            this.__construct(env, args);
        }
    }

    public Kernel(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "app",
        typeHint = "Illuminate\\Contracts\\Foundation\\Application"
    )
    @ConvertedParameter(
        index = 1,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Kernel.php");
        Object app = assignParameter(args, 0, false);
        Object events = assignParameter(args, 1, false);
        if (!function_defined.f.env(env).call("ARTISAN_BINARY").getBool()) {
            function_define.f.env(env).call("ARTISAN_BINARY", "artisan");
        }

        this.app = app;
        this.events = events;
        env.callMethod(
                this.app,
                "booted",
                Kernel.class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Console",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Kernel.this.defineConsoleSchedule(env);
                        return null;
                    }
                });
        return null;
    }

    @ConvertedMethod
    protected Object defineConsoleSchedule(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Kernel.php");
        Object schedule = null;
        env.callMethod(
                this.app,
                "singleton",
                Kernel.class,
                Schedule.CONST_class,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Console",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "app")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object app = assignParameter(args, 0, false);
                        return ZVal.assign(new Schedule(env));
                    }
                });
        schedule = env.callMethod(this.app, "make", Kernel.class, Schedule.CONST_class);
        this.schedule(env, schedule);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    @ConvertedParameter(
        index = 1,
        name = "output",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object handle(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, true);
        if (null == output) {
            output = ZVal.getNull();
        }
        Object e = null;
        try {
            this.bootstrap(env);
            return ZVal.assign(
                    env.callMethod(this.getArtisan(env), "run", Kernel.class, input, output));
        } catch (ConvertedException convertedException39) {
            if (convertedException39.instanceOf(PHPException.class, "Exception")) {
                e = convertedException39.getObject();
                this.reportException(env, e);
                this.renderException(env, output, e);
                return 1;
            } else if (convertedException39.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException39.getObject();
                e = new FatalThrowableError(env, e);
                this.reportException(env, e);
                this.renderException(env, output, e);
                return 1;
            } else {
                throw convertedException39;
            }
        }
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    @ConvertedParameter(index = 1, name = "status")
    public Object terminate(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object status = assignParameter(args, 1, false);
        env.callMethod(this.app, "terminate", Kernel.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "schedule",
        typeHint = "Illuminate\\Console\\Scheduling\\Schedule"
    )
    protected Object schedule(RuntimeEnv env, Object... args) {
        Object schedule = assignParameter(args, 0, false);
        return null;
    }

    @ConvertedMethod
    protected Object commands(RuntimeEnv env, Object... args) {
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "signature")
    @ConvertedParameter(index = 1, name = "callback", typeHint = "Closure")
    public Object command(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Kernel.php");
        Object signature = assignParameter(args, 0, false);
        Object callback = assignParameter(args, 1, false);
        Object command = null;
        command = new ClosureCommand(env, signature, callback);
        Application.runtimeStaticObject.starting(
                env,
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Illuminate\\Foundation\\Console",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "artisan")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object artisan = assignParameter(args, 0, false);
                        ReferenceContainer command = new BasicReferenceContainer(null);
                        command = this.contextReferences.getReferenceContainer("command");
                        env.callMethod(
                                artisan,
                                new RuntimeArgsWithReferences().add(0, command),
                                "add",
                                Kernel.class,
                                command.getObject());
                        return null;
                    }
                }.use("command", command));
        return ZVal.assign(command);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "paths")
    protected Object load(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Foundation/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Foundation/Console/Kernel.php");
        Object paths = assignParameter(args, 0, false);
        Object namespace = null;
        Object command = null;
        paths =
                function_array_unique
                        .f
                        .env(env)
                        .call(Arr.runtimeStaticObject.wrap(env, paths))
                        .value();
        paths =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                paths,
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Foundation\\Console",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "path")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object path = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                function_is_dir.f.env(env).call(path).value());
                                    }
                                })
                        .value();
        if (ZVal.isEmpty(paths)) {
            return null;
        }

        namespace = env.callMethod(this.app, "getNamespace", Kernel.class);
        for (ZPair zpairResult407 :
                ZVal.getIterable(
                        env.callMethod(
                                env.callMethod(new Finder(env), "in", Kernel.class, paths),
                                "files",
                                Kernel.class),
                        env,
                        true)) {
            command = ZVal.assign(zpairResult407.getValue());
            command =
                    toStringR(namespace, env)
                            + toStringR(
                                    function_str_replace
                                            .f
                                            .env(env)
                                            .call(
                                                    ZVal.arrayFromList("/", ".php"),
                                                    ZVal.arrayFromList("\\", ""),
                                                    Str.runtimeStaticObject.after(
                                                            env,
                                                            env.callMethod(
                                                                    command,
                                                                    "getPathname",
                                                                    Kernel.class),
                                                            toStringR(
                                                                            app_path.f
                                                                                    .env(env)
                                                                                    .call()
                                                                                    .value(),
                                                                            env)
                                                                    + toStringR("/", env)))
                                            .value(),
                                    env);
            if (ZVal.toBool(
                            NamespaceGlobal.is_subclass_of
                                    .env(env)
                                    .call(command, Command.CONST_class)
                                    .value())
                    && ZVal.toBool(
                            !ZVal.isTrue(
                                    env.callMethod(
                                            new ReflectionClass(env, command),
                                            "isAbstract",
                                            Kernel.class)))) {
                Application.runtimeStaticObject.starting(
                        env,
                        new Closure(
                                env,
                                runtimeConverterFunctionClassConstants,
                                "Illuminate\\Foundation\\Console",
                                this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "artisan")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object artisan = assignParameter(args, 0, false);
                                Object command = null;
                                command = this.contextReferences.getCapturedValue("command");
                                env.callMethod(artisan, "resolve", Kernel.class, command);
                                return null;
                            }
                        }.use("command", command));
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object registerCommand(RuntimeEnv env, Object... args) {
        ReferenceContainer command = new BasicReferenceContainer(assignParameter(args, 0, false));
        env.callMethod(
                this.getArtisan(env),
                new RuntimeArgsWithReferences().add(0, command),
                "add",
                Kernel.class,
                command.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "outputBuffer",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        Object outputBuffer = assignParameter(args, 2, true);
        if (null == outputBuffer) {
            outputBuffer = ZVal.getNull();
        }
        this.bootstrap(env);
        return ZVal.assign(
                env.callMethod(
                        this.getArtisan(env),
                        "call",
                        Kernel.class,
                        command,
                        parameters,
                        outputBuffer));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "parameters",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object queue(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object parameters = assignParameter(args, 1, true);
        if (null == parameters) {
            parameters = ZVal.newArray();
        }
        return ZVal.assign(
                QueuedCommand.runtimeStaticObject.dispatch(
                        env,
                        function_func_get_args
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call()
                                .value()));
    }

    @ConvertedMethod
    public Object all(RuntimeEnv env, Object... args) {
        this.bootstrap(env);
        return ZVal.assign(env.callMethod(this.getArtisan(env), "all", Kernel.class));
    }

    @ConvertedMethod
    public Object output(RuntimeEnv env, Object... args) {
        this.bootstrap(env);
        return ZVal.assign(env.callMethod(this.getArtisan(env), "output", Kernel.class));
    }

    @ConvertedMethod
    public Object bootstrap(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(env.callMethod(this.app, "hasBeenBootstrapped", Kernel.class))) {
            env.callMethod(this.app, "bootstrapWith", Kernel.class, this.bootstrappers(env));
        }

        env.callMethod(this.app, "loadDeferredProviders", Kernel.class);
        if (!ZVal.isTrue(this.commandsLoaded)) {
            this.commands(env);
            this.commandsLoaded = true;
        }

        return null;
    }

    @ConvertedMethod
    protected Object getArtisan(RuntimeEnv env, Object... args) {
        if (function_is_null.f.env(env).call(this.artisan).getBool()) {
            return ZVal.assign(
                    this.artisan =
                            env.callMethod(
                                    new Application(
                                            env,
                                            this.app,
                                            this.events,
                                            env.callMethod(this.app, "version", Kernel.class)),
                                    "resolveCommands",
                                    Kernel.class,
                                    this.commands));
        }

        return ZVal.assign(this.artisan);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "artisan")
    public Object setArtisan(RuntimeEnv env, Object... args) {
        Object artisan = assignParameter(args, 0, false);
        this.artisan = artisan;
        return null;
    }

    @ConvertedMethod
    protected Object bootstrappers(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.bootstrappers);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    protected Object reportException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, ExceptionHandler.CONST_class),
                "report",
                Kernel.class,
                e);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "output")
    @ConvertedParameter(index = 1, name = "e", typeHint = "Exception")
    protected Object renderException(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object e = assignParameter(args, 1, false);
        env.callMethod(
                new ReferenceClassProperty(this, "app", env)
                        .arrayGet(env, ExceptionHandler.CONST_class),
                "renderForConsole",
                Kernel.class,
                output,
                e);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Foundation\\Console\\Kernel";

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
                    .setName("Illuminate\\Foundation\\Console\\Kernel")
                    .setLookup(
                            Kernel.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "app",
                            "artisan",
                            "bootstrappers",
                            "commands",
                            "commandsLoaded",
                            "events")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Console/Kernel.php")
                    .addInterface("Illuminate\\Contracts\\Console\\Kernel")
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
