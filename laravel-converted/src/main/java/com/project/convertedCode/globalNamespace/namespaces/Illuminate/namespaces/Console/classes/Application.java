package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.BufferedOutput;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArrayInput;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Events.classes.CommandStarting;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Process.classes.PhpExecutableFinder;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutput;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Events.classes.CommandFinished;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_method_exists;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReadOnlyReferenceContainer;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_func_get_args;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.ProcessUtils;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_defined;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArgvInput;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.CommandNotFoundException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.namespaces.Events.classes.ArtisanStarting;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Application.php

*/

public class Application
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Symfony
                .namespaces
                .Component
                .namespaces
                .Console
                .classes
                .Application
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
                .Application {

    public Object laravel = null;

    public Object lastOutput = null;

    public Object events = null;

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
        name = "laravel",
        typeHint = "Illuminate\\Contracts\\Container\\Container"
    )
    @ConvertedParameter(
        index = 1,
        name = "events",
        typeHint = "Illuminate\\Contracts\\Events\\Dispatcher"
    )
    @ConvertedParameter(index = 2, name = "version")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object laravel = assignParameter(args, 0, false);
        Object events = assignParameter(args, 1, false);
        Object version = assignParameter(args, 2, false);
        super.__construct(env, "Laravel Framework", version);
        this.laravel = laravel;
        this.events = events;
        env.callMethod(this, "setAutoExit", Application.class, false);
        env.callMethod(this, "setCatchExceptions", Application.class, false);
        env.callMethod(this.events, "dispatch", Application.class, new ArtisanStarting(env, this));
        this.bootstrap(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object run(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, true);
        if (null == input) {
            input = ZVal.getNull();
        }
        Object output = assignParameter(args, 1, true);
        if (null == output) {
            output = ZVal.getNull();
        }
        Object commandName = null;
        Object exitCode = null;
        Object ternaryExpressionTemp = null;
        commandName =
                env.callMethod(
                        this,
                        "getCommandName",
                        Application.class,
                        input =
                                ZVal.assign(
                                        ZVal.isTrue(ternaryExpressionTemp = input)
                                                ? ternaryExpressionTemp
                                                : new ArgvInput(env)));
        env.callMethod(
                this.events,
                "fire",
                Application.class,
                new CommandStarting(
                        env,
                        commandName,
                        input,
                        output =
                                ZVal.assign(
                                        ZVal.isTrue(ternaryExpressionTemp = output)
                                                ? ternaryExpressionTemp
                                                : new ConsoleOutput(env))));
        exitCode = super.run(env, input, output);
        env.callMethod(
                this.events,
                "fire",
                Application.class,
                new CommandFinished(env, commandName, input, output, exitCode));
        return ZVal.assign(exitCode);
    }

    @ConvertedMethod
    protected Object bootstrap(RuntimeEnv env, Object... args) {
        Object bootstrapper = null;
        for (ZPair zpairResult219 :
                ZVal.getIterable(
                        env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Illuminate
                                                .namespaces
                                                .Console
                                                .classes
                                                .Application
                                                .RequestStaticProperties
                                                .class)
                                .bootstrappers,
                        env,
                        true)) {
            bootstrapper = ZVal.assign(zpairResult219.getValue());
            env.callFunctionDynamic(
                    bootstrapper,
                    new RuntimeArgsWithReferences().add(0, new ReadOnlyReferenceContainer(this)),
                    this);
        }

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
        Object result = null;
        Object ternaryExpressionTemp = null;
        if (NamespaceGlobal.is_subclass_of
                .env(env)
                .call(
                        command,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Symfony
                                .namespaces
                                .Component
                                .namespaces
                                .Console
                                .namespaces
                                .Command
                                .classes
                                .Command
                                .CONST_class)
                .getBool()) {
            command =
                    env.callMethod(
                            env.callMethod(this.laravel, "make", Application.class, command),
                            "getName",
                            Application.class);
        }

        if (!ZVal.isTrue(env.callMethod(this, "has", Application.class, command))) {
            throw ZVal.getException(
                    env,
                    new CommandNotFoundException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The command \"%s\" does not exist.", command)
                                    .value()));
        }

        function_array_unshift.f.env(env).call(parameters, command);
        this.lastOutput =
                ZVal.isTrue(ternaryExpressionTemp = outputBuffer)
                        ? ternaryExpressionTemp
                        : new BufferedOutput(env);
        env.callMethod(this, "setCatchExceptions", Application.class, false);
        result = this.run(env, new ArrayInput(env, parameters), this.lastOutput);
        env.callMethod(this, "setCatchExceptions", Application.class, true);
        return ZVal.assign(result);
    }

    @ConvertedMethod
    public Object output(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(this.lastOutput)
                                && ZVal.toBool(
                                        function_method_exists
                                                .f
                                                .env(env)
                                                .call(this.lastOutput, "fetch")
                                                .value())
                        ? env.callMethod(this.lastOutput, "fetch", Application.class)
                        : "");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        command,
                        com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Illuminate
                                .namespaces
                                .Console
                                .classes
                                .Command
                                .class,
                        "Illuminate\\Console\\Command"))) {
            env.callMethod(command, "setLaravel", Application.class, this.laravel);
        }

        return ZVal.assign(this.addToParent(env, command));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
    )
    protected Object addToParent(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        return ZVal.assign(super.add(env, command));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    public Object resolve(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        return ZVal.assign(
                this.add(env, env.callMethod(this.laravel, "make", Application.class, command)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commands")
    public Object resolveCommands(RuntimeEnv env, Object... args) {
        Object commands = assignParameter(args, 0, false);
        Object command = null;
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
        for (ZPair zpairResult220 : ZVal.getIterable(commands, env, true)) {
            command = ZVal.assign(zpairResult220.getValue());
            this.resolve(env, command);
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    protected Object getDefaultInputDefinition(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Console/Application.php");
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                super.getDefaultInputDefinition(env),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Console",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "definition")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object definition = assignParameter(args, 0, false);
                                        env.callMethod(
                                                definition,
                                                "addOption",
                                                Application.class,
                                                Application.this.getEnvironmentOption(env));
                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    protected Object getEnvironmentOption(RuntimeEnv env, Object... args) {
        Object message = null;
        message = "The environment the command should run under";
        return ZVal.assign(
                new InputOption(
                        env, "--env", ZVal.getNull(), InputOption.CONST_VALUE_OPTIONAL, message));
    }

    @ConvertedMethod
    public Object getLaravel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.laravel);
    }

    public static final Object CONST_class = "Illuminate\\Console\\Application";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Symfony
                    .namespaces
                    .Component
                    .namespaces
                    .Console
                    .classes
                    .Application
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object phpBinary(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ProcessUtils.runtimeStaticObject.escapeArgument(
                            env,
                            env.callMethod(
                                    new PhpExecutableFinder(env),
                                    "find",
                                    Application.class,
                                    false)));
        }

        @ConvertedMethod
        public Object artisanBinary(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    function_defined.f.env(env).call("ARTISAN_BINARY").getBool()
                            ? ProcessUtils.runtimeStaticObject.escapeArgument(
                                    env, function_constant.get(env, "ARTISAN_BINARY"))
                            : "artisan");
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object formatCommandString(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            return ZVal.assign(
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "%s %s %s",
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Application.class)
                                            .method("phpBinary")
                                            .call()
                                            .value(),
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Application.class)
                                            .method("artisanBinary")
                                            .call()
                                            .value(),
                                    string)
                            .value());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "callback", typeHint = "Closure")
        public Object starting(RuntimeEnv env, Object... args) {
            Object callback = assignParameter(args, 0, false);
            env.getRequestStaticPropertiesReference(
                            com.project
                                    .convertedCode
                                    .globalNamespace
                                    .namespaces
                                    .Illuminate
                                    .namespaces
                                    .Console
                                    .classes
                                    .Application
                                    .RequestStaticProperties
                                    .class,
                            "bootstrappers")
                    .arrayAppend(env)
                    .set(callback);
            return null;
        }

        @ConvertedMethod
        public Object forgetBootstrappers(RuntimeEnv env, Object... args) {
            env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Illuminate
                                            .namespaces
                                            .Console
                                            .classes
                                            .Application
                                            .RequestStaticProperties
                                            .class)
                            .bootstrappers =
                    ZVal.newArray();
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object bootstrappers = ZVal.newArray();
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Console\\Application")
                    .setLookup(
                            Application.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "autoExit",
                            "catchExceptions",
                            "commandLoader",
                            "commands",
                            "defaultCommand",
                            "definition",
                            "dispatcher",
                            "events",
                            "helperSet",
                            "initialized",
                            "laravel",
                            "lastOutput",
                            "name",
                            "runningCommand",
                            "singleCommand",
                            "terminal",
                            "version",
                            "wantHelps")
                    .setStaticPropertyNames("bootstrappers")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Console/Application.php")
                    .addInterface("Illuminate\\Contracts\\Console\\Application")
                    .addExtendsClass("Symfony\\Component\\Console\\Application")
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
