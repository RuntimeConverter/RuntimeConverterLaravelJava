package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes.ListCommand;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.ExceptionInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Event.classes.ConsoleErrorEvent;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.ProcessHelper;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutput;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.DebugFormatterHelper;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_restore_exception_handler;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.nativeClasses.errors.ErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.namespaces.Exception.classes.FatalThrowableError;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Debug.classes.ErrorHandler;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.LogicException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes.HelpCommand;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputAwareInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_reset;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.HelperSet;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.ConsoleEvents;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_function_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.StreamableInputInterface;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.QuestionHelper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutputInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputDefinition;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArrayInput;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_set_exception_handler;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Event.classes.ConsoleCommandEvent;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Event.classes.ConsoleTerminateEvent;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.FormatterHelper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.Terminal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.NamespaceNotFoundException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArgvInput;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes.SymfonyStyle;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.CommandNotFoundException;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Application.php

*/

public class Application extends RuntimeClassBase {

    public Object commands = ZVal.newArray();

    public Object wantHelps = false;

    public Object runningCommand = null;

    public Object name = null;

    public Object version = null;

    public Object commandLoader = null;

    public Object catchExceptions = true;

    public Object autoExit = true;

    public Object definition = null;

    public Object helperSet = null;

    public Object dispatcher = null;

    public Object terminal = null;

    public Object defaultCommand = null;

    public Object singleCommand = null;

    public Object initialized = null;

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
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "version", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = "UNKNOWN";
        }
        Object version = assignParameter(args, 1, true);
        if (null == version) {
            version = "UNKNOWN";
        }
        this.name = name;
        this.version = version;
        this.terminal = new Terminal(env);
        this.defaultCommand = "list";
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "dispatcher",
        typeHint = "Symfony\\Component\\EventDispatcher\\EventDispatcherInterface"
    )
    public Object setDispatcher(RuntimeEnv env, Object... args) {
        Object dispatcher = assignParameter(args, 0, false);
        this.dispatcher = dispatcher;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "commandLoader",
        typeHint = "Symfony\\Component\\Console\\CommandLoader\\CommandLoaderInterface"
    )
    public Object setCommandLoader(RuntimeEnv env, Object... args) {
        Object commandLoader = assignParameter(args, 0, false);
        this.commandLoader = commandLoader;
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
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console")
                        .setFile("/vendor/symfony/console/Application.php");
        Object input = assignParameter(args, 0, true);
        if (null == input) {
            input = ZVal.getNull();
        }
        Object output = assignParameter(args, 1, true);
        if (null == output) {
            output = ZVal.getNull();
        }
        Object finalHandler = null;
        Object renderException = null;
        ReferenceContainer phpHandler = new BasicReferenceContainer(null);
        ReferenceContainer e = new BasicReferenceContainer(null);
        Object debugHandler = null;
        Object exitCode = null;
        NamespaceGlobal.putenv
                .env(env)
                .call(
                        "LINES="
                                + toStringR(
                                        env.callMethod(
                                                this.terminal, "getHeight", Application.class),
                                        env));
        NamespaceGlobal.putenv
                .env(env)
                .call(
                        "COLUMNS="
                                + toStringR(
                                        env.callMethod(
                                                this.terminal, "getWidth", Application.class),
                                        env));
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", input)) {
            input = new ArgvInput(env);
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", output)) {
            output = new ConsoleOutput(env);
        }

        renderException =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\Console",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "e")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object e = assignParameter(args, 0, false);
                        Object output = null;
                        output = this.contextReferences.getCapturedValue("output");
                        if (!ZVal.isTrue(
                                ZVal.checkInstanceType(e, PHPException.class, "Exception"))) {
                            e =
                                    ZVal.assign(
                                            function_class_exists
                                                            .f
                                                            .env(env)
                                                            .call(FatalThrowableError.CONST_class)
                                                            .getBool()
                                                    ? new FatalThrowableError(env, e)
                                                    : new ErrorException(
                                                            env,
                                                            env.callMethod(
                                                                    e,
                                                                    "getMessage",
                                                                    Application.class),
                                                            env.callMethod(
                                                                    e,
                                                                    "getCode",
                                                                    Application.class),
                                                            1,
                                                            env.callMethod(
                                                                    e,
                                                                    "getFile",
                                                                    Application.class),
                                                            env.callMethod(
                                                                    e,
                                                                    "getLine",
                                                                    Application.class)));
                        }

                        if (ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        output,
                                        ConsoleOutputInterface.class,
                                        "Symfony\\Component\\Console\\Output\\ConsoleOutputInterface"))) {
                            Application.this.renderException(
                                    env,
                                    e,
                                    env.callMethod(output, "getErrorOutput", Application.class));

                        } else {
                            Application.this.renderException(env, e, output);
                        }

                        return null;
                    }
                }.use("output", output);
        if (ZVal.isTrue(
                phpHandler.setObject(
                        function_set_exception_handler.f.env(env).call(renderException).value()))) {
            function_restore_exception_handler.f.env(env).call();
            if (ZVal.toBool(!function_is_array.f.env(env).call(phpHandler.getObject()).getBool())
                    || ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            phpHandler.arrayGet(env, 0),
                                            ErrorHandler.class,
                                            "Symfony\\Component\\Debug\\ErrorHandler")))) {
                debugHandler = true;

            } else if (ZVal.isTrue(
                    debugHandler =
                            env.callMethod(
                                    phpHandler.arrayGet(env, 0),
                                    "setExceptionHandler",
                                    Application.class,
                                    renderException))) {
                env.callMethod(
                        phpHandler.arrayGet(env, 0),
                        "setExceptionHandler",
                        Application.class,
                        debugHandler);
            }
        }

        this.configureIO(env, input, output);
        try {
            exitCode = this.doRun(env, input, output);
        } catch (ConvertedException convertedException238) {
            if (convertedException238.instanceOf(PHPException.class, "Exception")) {
                e.setObject(convertedException238.getObject());
                if (!ZVal.isTrue(this.catchExceptions)) {
                    throw ZVal.getException(env, e.getObject());
                }

                env.callFunctionDynamic(
                        renderException, new RuntimeArgsWithReferences().add(0, e), e.getObject());
                exitCode = env.callMethod(e.getObject(), "getCode", Application.class);
                if (function_is_numeric.f.env(env).call(exitCode).getBool()) {
                    exitCode = ZVal.assign(ZVal.toLong(exitCode));
                    if (ZVal.strictEqualityCheck(0, "===", exitCode)) {
                        exitCode = 1;
                    }

                } else {
                    exitCode = 1;
                }

            } else {
                throw convertedException238;
            }
        } finally {
            if (!ZVal.isTrue(phpHandler.getObject())) {
                if (ZVal.strictEqualityCheck(
                        function_set_exception_handler.f.env(env).call(renderException).value(),
                        "===",
                        renderException)) {
                    function_restore_exception_handler.f.env(env).call();
                }

                function_restore_exception_handler.f.env(env).call();

            } else if (!ZVal.isTrue(debugHandler)) {
                finalHandler =
                        env.callMethod(
                                phpHandler.arrayGet(env, 0),
                                "setExceptionHandler",
                                Application.class,
                                ZVal.getNull());
                if (ZVal.strictNotEqualityCheck(finalHandler, "!==", renderException)) {
                    env.callMethod(
                            phpHandler.arrayGet(env, 0),
                            "setExceptionHandler",
                            Application.class,
                            finalHandler);
                }
            }
        }

        if (ZVal.isTrue(this.autoExit)) {
            if (ZVal.isGreaterThan(exitCode, '>', 255)) {
                exitCode = 255;
            }

            env.exit(exitCode);
        }

        return ZVal.assign(exitCode);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object doRun(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object e = null;
        Object name = null;
        Object alternative = null;
        ReferenceContainer alternatives = new BasicReferenceContainer(null);
        Object exitCode = null;
        Object definition = null;
        Object style = null;
        Object event = null;
        Object command = null;
        if (ZVal.strictEqualityCheck(
                true,
                "===",
                env.callMethod(
                        input,
                        "hasParameterOption",
                        Application.class,
                        ZVal.arrayFromList("--version", "-V"),
                        true))) {
            env.callMethod(output, "writeln", Application.class, this.getLongVersion(env));
            return 0;
        }

        name = this.getCommandName(env, input);
        if (ZVal.strictEqualityCheck(
                true,
                "===",
                env.callMethod(
                        input,
                        "hasParameterOption",
                        Application.class,
                        ZVal.arrayFromList("--help", "-h"),
                        true))) {
            if (!ZVal.isTrue(name)) {
                name = "help";
                input =
                        new ArrayInput(
                                env, ZVal.newArray(new ZPair("command_name", this.defaultCommand)));

            } else {
                this.wantHelps = true;
            }
        }

        if (!ZVal.isTrue(name)) {
            name = ZVal.assign(this.defaultCommand);
            definition = this.getDefinition(env);
            env.callMethod(
                    definition,
                    "setArguments",
                    Application.class,
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    env.callMethod(definition, "getArguments", Application.class),
                                    ZVal.newArray(
                                            new ZPair(
                                                    "command",
                                                    new InputArgument(
                                                            env,
                                                            "command",
                                                            InputArgument.CONST_OPTIONAL,
                                                            env.callMethod(
                                                                    env.callMethod(
                                                                            definition,
                                                                            "getArgument",
                                                                            Application.class,
                                                                            "command"),
                                                                    "getDescription",
                                                                    Application.class),
                                                            name))))
                            .value());
        }

        try {
            this.runningCommand = ZVal.getNull();
            command = this.find(env, name);
        } catch (ConvertedException convertedException239) {
            if (convertedException239.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException239.getObject();
                if (ZVal.toBool(
                                ZVal.toBool(
                                                !ZVal.toBool(
                                                                ZVal.checkInstanceType(
                                                                        e,
                                                                        CommandNotFoundException
                                                                                .class,
                                                                        "Symfony\\Component\\Console\\Exception\\CommandNotFoundException"))
                                                        && ZVal.toBool(
                                                                !ZVal.isTrue(
                                                                        ZVal.checkInstanceType(
                                                                                e,
                                                                                NamespaceNotFoundException
                                                                                        .class,
                                                                                "Symfony\\Component\\Console\\Exception\\NamespaceNotFoundException"))))
                                        || ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        1,
                                                        "!==",
                                                        function_count
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        alternatives.setObject(
                                                                                env.callMethod(
                                                                                        e,
                                                                                        "getAlternatives",
                                                                                        Application
                                                                                                .class)))
                                                                .value())))
                        || ZVal.toBool(
                                !ZVal.isTrue(
                                        env.callMethod(
                                                input, "isInteractive", Application.class)))) {
                    if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.dispatcher)) {
                        event = new ConsoleErrorEvent(env, input, output, e);
                        env.callMethod(
                                this.dispatcher,
                                "dispatch",
                                Application.class,
                                ConsoleEvents.CONST_ERROR,
                                event);
                        if (ZVal.strictEqualityCheck(
                                0,
                                "===",
                                env.callMethod(event, "getExitCode", Application.class))) {
                            return 0;
                        }

                        e = env.callMethod(event, "getError", Application.class);
                    }

                    throw ZVal.getException(env, e);
                }

                alternative = ZVal.assign(alternatives.arrayGet(env, 0));
                style = new SymfonyStyle(env, input, output);
                env.callMethod(
                        style,
                        "block",
                        Application.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call("\nCommand \"%s\" is not defined.\n", name)
                                .value(),
                        ZVal.getNull(),
                        "error");
                if (!ZVal.isTrue(
                        env.callMethod(
                                style,
                                "confirm",
                                Application.class,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call("Do you want to run \"%s\" instead? ", alternative)
                                        .value(),
                                false))) {
                    if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.dispatcher)) {
                        event = new ConsoleErrorEvent(env, input, output, e);
                        env.callMethod(
                                this.dispatcher,
                                "dispatch",
                                Application.class,
                                ConsoleEvents.CONST_ERROR,
                                event);
                        return ZVal.assign(env.callMethod(event, "getExitCode", Application.class));
                    }

                    return 1;
                }

                command = this.find(env, alternative);
            } else {
                throw convertedException239;
            }
        }

        this.runningCommand = command;
        exitCode = this.doRunCommand(env, command, input, output);
        this.runningCommand = ZVal.getNull();
        return ZVal.assign(exitCode);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "helperSet",
        typeHint = "Symfony\\Component\\Console\\Helper\\HelperSet"
    )
    public Object setHelperSet(RuntimeEnv env, Object... args) {
        Object helperSet = assignParameter(args, 0, false);
        this.helperSet = helperSet;
        return null;
    }

    @ConvertedMethod
    public Object getHelperSet(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.helperSet)) {
            this.helperSet = this.getDefaultHelperSet(env);
        }

        return ZVal.assign(this.helperSet);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "definition",
        typeHint = "Symfony\\Component\\Console\\Input\\InputDefinition"
    )
    public Object setDefinition(RuntimeEnv env, Object... args) {
        Object definition = assignParameter(args, 0, false);
        this.definition = definition;
        return null;
    }

    @ConvertedMethod
    public Object getDefinition(RuntimeEnv env, Object... args) {
        Object inputDefinition = null;
        if (!ZVal.isTrue(this.definition)) {
            this.definition = this.getDefaultInputDefinition(env);
        }

        if (ZVal.isTrue(this.singleCommand)) {
            inputDefinition = ZVal.assign(this.definition);
            env.callMethod(inputDefinition, "setArguments", Application.class);
            return ZVal.assign(inputDefinition);
        }

        return ZVal.assign(this.definition);
    }

    @ConvertedMethod
    public Object getHelp(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.getLongVersion(env));
    }

    @ConvertedMethod
    public Object areExceptionsCaught(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.catchExceptions);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "boolean")
    public Object setCatchExceptions(RuntimeEnv env, Object... args) {
        Object _pBoolean = assignParameter(args, 0, false);
        this.catchExceptions = ZVal.toBool(_pBoolean);
        return null;
    }

    @ConvertedMethod
    public Object isAutoExitEnabled(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.autoExit);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "boolean")
    public Object setAutoExit(RuntimeEnv env, Object... args) {
        Object _pBoolean = assignParameter(args, 0, false);
        this.autoExit = ZVal.toBool(_pBoolean);
        return null;
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.name);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object setName(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.name = name;
        return null;
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.version);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "version")
    public Object setVersion(RuntimeEnv env, Object... args) {
        Object version = assignParameter(args, 0, false);
        this.version = version;
        return null;
    }

    @ConvertedMethod
    public Object getLongVersion(RuntimeEnv env, Object... args) {
        if (ZVal.strictNotEqualityCheck("UNKNOWN", "!==", this.getName(env))) {
            if (ZVal.strictNotEqualityCheck("UNKNOWN", "!==", this.getVersion(env))) {
                return ZVal.assign(
                        function_sprintf
                                .f
                                .env(env)
                                .call("%s <info>%s</info>", this.getName(env), this.getVersion(env))
                                .value());
            }

            return ZVal.assign(this.getName(env));
        }

        return "Console Tool";
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object register(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(this.add(env, new Command(env, name)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commands", typeHint = "array")
    public Object addCommands(RuntimeEnv env, Object... args) {
        Object commands = assignParameter(args, 0, false);
        Object command = null;
        for (ZPair zpairResult1625 : ZVal.getIterable(commands, env, true)) {
            command = ZVal.assign(zpairResult1625.getValue());
            this.add(env, command);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
    )
    public Object add(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object alias = null;
        this.init(env);
        env.callMethod(command, "setApplication", Application.class, this);
        if (!ZVal.isTrue(env.callMethod(command, "isEnabled", Application.class))) {
            env.callMethod(command, "setApplication", Application.class, ZVal.getNull());
            return null;
        }

        if (ZVal.strictEqualityCheck(
                ZVal.getNull(),
                "===",
                env.callMethod(command, "getDefinition", Application.class))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Command class \"%s\" is not correctly initialized. You probably forgot to call the parent constructor.",
                                            function_get_class.f.env(env).call(command).value())
                                    .value()));
        }

        if (!ZVal.isTrue(env.callMethod(command, "getName", Application.class))) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The command defined in \"%s\" cannot have an empty name.",
                                            function_get_class.f.env(env).call(command).value())
                                    .value()));
        }

        new ReferenceClassProperty(this, "commands", env)
                .arrayAccess(env, env.callMethod(command, "getName", Application.class))
                .set(command);
        for (ZPair zpairResult1626 :
                ZVal.getIterable(
                        env.callMethod(command, "getAliases", Application.class), env, true)) {
            alias = ZVal.assign(zpairResult1626.getValue());
            new ReferenceClassProperty(this, "commands", env).arrayAccess(env, alias).set(command);
        }

        return ZVal.assign(command);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object get(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object helpCommand = null;
        Object command = null;
        this.init(env);
        if (!ZVal.isTrue(this.has(env, name))) {
            throw ZVal.getException(
                    env,
                    new CommandNotFoundException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call("The command \"%s\" does not exist.", name)
                                    .value()));
        }

        command =
                ZVal.assign(new ReferenceClassProperty(this, "commands", env).arrayGet(env, name));
        if (ZVal.isTrue(this.wantHelps)) {
            this.wantHelps = false;
            helpCommand = this.get(env, "help");
            env.callMethod(helpCommand, "setCommand", Application.class, command);
            return ZVal.assign(helpCommand);
        }

        return ZVal.assign(command);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object has(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        this.init(env);
        return ZVal.assign(
                ZVal.toBool(
                                arrayActionR(
                                        ArrayAction.ISSET,
                                        new ReferenceClassProperty(this, "commands", env),
                                        env,
                                        name))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.toBool(this.commandLoader)
                                                        && ZVal.toBool(
                                                                env.callMethod(
                                                                        this.commandLoader,
                                                                        "has",
                                                                        Application.class,
                                                                        name)))
                                        && ZVal.toBool(
                                                this.add(
                                                        env,
                                                        env.callMethod(
                                                                this.commandLoader,
                                                                "get",
                                                                Application.class,
                                                                name)))));
    }

    @ConvertedMethod
    public Object getNamespaces(RuntimeEnv env, Object... args) {
        Object alias = null;
        Object command = null;
        Object namespaces = null;
        namespaces = ZVal.newArray();
        for (ZPair zpairResult1627 : ZVal.getIterable(this.all(env), env, true)) {
            command = ZVal.assign(zpairResult1627.getValue());
            namespaces =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    namespaces,
                                    this.extractAllNamespaces(
                                            env,
                                            env.callMethod(command, "getName", Application.class)))
                            .value();
            for (ZPair zpairResult1628 :
                    ZVal.getIterable(
                            env.callMethod(command, "getAliases", Application.class), env, true)) {
                alias = ZVal.assign(zpairResult1628.getValue());
                namespaces =
                        function_array_merge
                                .f
                                .env(env)
                                .call(namespaces, this.extractAllNamespaces(env, alias))
                                .value();
            }
        }

        return ZVal.assign(
                function_array_values
                        .f
                        .env(env)
                        .call(
                                function_array_unique
                                        .f
                                        .env(env)
                                        .call(
                                                function_array_filter
                                                        .f
                                                        .env(env)
                                                        .call(namespaces)
                                                        .value())
                                        .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "namespace")
    public Object findNamespace(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console")
                        .setFile("/vendor/symfony/console/Application.php");
        Object namespace = assignParameter(args, 0, false);
        Object allNamespaces = null;
        Object exact = null;
        Object alternatives = null;
        Object expr = null;
        Object message = null;
        Object namespaces = null;
        allNamespaces = this.getNamespaces(env);
        expr =
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "{([^:]+|)}",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Console",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "matches")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer matches =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        return ZVal.assign(
                                                toStringR(
                                                                NamespaceGlobal.preg_quote
                                                                        .env(env)
                                                                        .call(
                                                                                matches.arrayGet(
                                                                                        env, 1))
                                                                        .value(),
                                                                env)
                                                        + "[^:]*");
                                    }
                                },
                                namespace)
                        .value();
        namespaces =
                NamespaceGlobal.preg_grep
                        .env(env)
                        .call("{^" + toStringR(expr, env) + "}", allNamespaces)
                        .value();
        if (ZVal.isEmpty(namespaces)) {
            message =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "There are no commands defined in the \"%s\" namespace.",
                                    namespace)
                            .value();
            if (ZVal.isTrue(alternatives = this.findAlternatives(env, namespace, allNamespaces))) {
                if (ZVal.equalityCheck(1, function_count.f.env(env).call(alternatives).value())) {
                    message = toStringR(message, env) + "\n\nDid you mean this?\n    ";

                } else {
                    message = toStringR(message, env) + "\n\nDid you mean one of these?\n    ";
                }

                message =
                        toStringR(message, env)
                                + toStringR(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call("\n    ", alternatives)
                                                .value(),
                                        env);
            }

            throw ZVal.getException(
                    env, new NamespaceNotFoundException(env, message, alternatives));
        }

        exact = function_in_array.f.env(env).call(namespace, namespaces, true).value();
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count.f.env(env).call(namespaces).value(), '>', 1))
                && ZVal.toBool(!ZVal.isTrue(exact))) {
            throw ZVal.getException(
                    env,
                    new NamespaceNotFoundException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The namespace \"%s\" is ambiguous.\nDid you mean one of these?\n%s",
                                            namespace,
                                            this.getAbbreviationSuggestions(
                                                    env,
                                                    function_array_values
                                                            .f
                                                            .env(env)
                                                            .call(namespaces)
                                                            .value()))
                                    .value(),
                            function_array_values.f.env(env).call(namespaces).value()));
        }

        return ZVal.assign(
                ZVal.isTrue(exact)
                        ? namespace
                        : function_reset.f.env(env).call(namespaces).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object find(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console")
                        .setFile("/vendor/symfony/console/Application.php");
        Object name = assignParameter(args, 0, false);
        Object abbrevs = null;
        ReferenceContainer aliases = new BasicReferenceContainer(null);
        Object commandList = null;
        Object message = null;
        Object usableWidth = null;
        Object pos = null;
        Object exact = null;
        Object alternatives = null;
        Object expr = null;
        Object suggestions = null;
        Object allCommands = null;
        Object abbrev = null;
        Object commands = null;
        Object maxLen = null;
        this.init(env);
        aliases.setObject(ZVal.newArray());
        allCommands =
                ZVal.assign(
                        ZVal.isTrue(this.commandLoader)
                                ? function_array_merge
                                        .f
                                        .env(env)
                                        .call(
                                                env.callMethod(
                                                        this.commandLoader,
                                                        "getNames",
                                                        Application.class),
                                                function_array_keys
                                                        .f
                                                        .env(env)
                                                        .call(this.commands)
                                                        .value())
                                        .value()
                                : function_array_keys.f.env(env).call(this.commands).value());
        expr =
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(
                                "{([^:]+|)}",
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Console",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "matches")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        ReferenceContainer matches =
                                                new BasicReferenceContainer(
                                                        assignParameter(args, 0, false));
                                        return ZVal.assign(
                                                toStringR(
                                                                NamespaceGlobal.preg_quote
                                                                        .env(env)
                                                                        .call(
                                                                                matches.arrayGet(
                                                                                        env, 1))
                                                                        .value(),
                                                                env)
                                                        + "[^:]*");
                                    }
                                },
                                name)
                        .value();
        commands =
                NamespaceGlobal.preg_grep
                        .env(env)
                        .call("{^" + toStringR(expr, env) + "}", allCommands)
                        .value();
        if (ZVal.isEmpty(commands)) {
            commands =
                    NamespaceGlobal.preg_grep
                            .env(env)
                            .call("{^" + toStringR(expr, env) + "}i", allCommands)
                            .value();
        }

        if (ZVal.toBool(ZVal.isEmpty(commands))
                || ZVal.toBool(
                        ZVal.isLessThan(
                                function_count
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.preg_grep
                                                        .env(env)
                                                        .call(
                                                                "{^" + toStringR(expr, env) + "$}i",
                                                                commands)
                                                        .value())
                                        .value(),
                                '<',
                                1))) {
            if (ZVal.strictNotEqualityCheck(
                    false, "!==", pos = NamespaceGlobal.strrpos.env(env).call(name, ":").value())) {
                this.findNamespace(env, function_substr.f.env(env).call(name, 0, pos).value());
            }

            message =
                    function_sprintf
                            .f
                            .env(env)
                            .call("Command \"%s\" is not defined.", name)
                            .value();
            if (ZVal.isTrue(alternatives = this.findAlternatives(env, name, allCommands))) {
                if (ZVal.equalityCheck(1, function_count.f.env(env).call(alternatives).value())) {
                    message = toStringR(message, env) + "\n\nDid you mean this?\n    ";

                } else {
                    message = toStringR(message, env) + "\n\nDid you mean one of these?\n    ";
                }

                message =
                        toStringR(message, env)
                                + toStringR(
                                        NamespaceGlobal.implode
                                                .env(env)
                                                .call("\n    ", alternatives)
                                                .value(),
                                        env);
            }

            throw ZVal.getException(env, new CommandNotFoundException(env, message, alternatives));
        }

        if (ZVal.isGreaterThan(function_count.f.env(env).call(commands).value(), '>', 1)) {
            commandList =
                    ZVal.assign(
                            ZVal.isTrue(this.commandLoader)
                                    ? function_array_merge
                                            .f
                                            .env(env)
                                            .call(
                                                    function_array_flip
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            this.commandLoader,
                                                                            "getNames",
                                                                            Application.class))
                                                            .value(),
                                                    this.commands)
                                            .value()
                                    : this.commands);
            commands =
                    function_array_unique
                            .f
                            .env(env)
                            .call(
                                    function_array_filter
                                            .f
                                            .env(env)
                                            .call(
                                                    commands,
                                                    new Closure(
                                                            env,
                                                            runtimeConverterFunctionClassConstants,
                                                            "Symfony\\Component\\Console",
                                                            this) {
                                                        @Override
                                                        @ConvertedMethod
                                                        @ConvertedParameter(
                                                            index = 0,
                                                            name = "nameOrAlias"
                                                        )
                                                        public Object run(
                                                                RuntimeEnv env,
                                                                Object thisvar,
                                                                PassByReferenceArgs
                                                                        runtimePassByReferenceArgs,
                                                                Object... args) {
                                                            Object nameOrAlias =
                                                                    assignParameter(args, 0, false);
                                                            Object commandName = null;
                                                            ReferenceContainer aliases =
                                                                    new BasicReferenceContainer(
                                                                            null);
                                                            ReferenceContainer commandList =
                                                                    new BasicReferenceContainer(
                                                                            null);
                                                            Object commands = null;
                                                            aliases =
                                                                    this.contextReferences
                                                                            .getReferenceContainer(
                                                                                    "aliases");
                                                            commandList =
                                                                    this.contextReferences
                                                                            .getReferenceContainer(
                                                                                    "commandList");
                                                            commands =
                                                                    this.contextReferences
                                                                            .getCapturedValue(
                                                                                    "commands");
                                                            commandName =
                                                                    ZVal.assign(
                                                                            ZVal.isTrue(
                                                                                            ZVal
                                                                                                    .checkInstanceType(
                                                                                                            commandList
                                                                                                                    .arrayGet(
                                                                                                                            env,
                                                                                                                            nameOrAlias),
                                                                                                            Command
                                                                                                                    .class,
                                                                                                            "Symfony\\Component\\Console\\Command\\Command"))
                                                                                    ? env
                                                                                            .callMethod(
                                                                                                    commandList
                                                                                                            .arrayGet(
                                                                                                                    env,
                                                                                                                    nameOrAlias),
                                                                                                    "getName",
                                                                                                    Application
                                                                                                            .class)
                                                                                    : nameOrAlias);
                                                            aliases.arrayAccess(env, nameOrAlias)
                                                                    .set(commandName);
                                                            return ZVal.assign(
                                                                    ZVal.toBool(
                                                                                    ZVal
                                                                                            .strictEqualityCheck(
                                                                                                    commandName,
                                                                                                    "===",
                                                                                                    nameOrAlias))
                                                                            || ZVal.toBool(
                                                                                    !function_in_array
                                                                                            .f
                                                                                            .env(
                                                                                                    env)
                                                                                            .call(
                                                                                                    commandName,
                                                                                                    commands)
                                                                                            .getBool()));
                                                        }
                                                    }.useRef("aliases", aliases)
                                                            .use("commandList", commandList)
                                                            .use("commands", commands))
                                            .value())
                            .value();
        }

        exact =
                ZVal.toBool(function_in_array.f.env(env).call(name, commands, true).value())
                        || ZVal.toBool(arrayActionR(ArrayAction.ISSET, aliases, env, name));
        if (ZVal.toBool(
                        ZVal.isGreaterThan(
                                function_count.f.env(env).call(commands).value(), '>', 1))
                && ZVal.toBool(!ZVal.isTrue(exact))) {
            usableWidth =
                    ZVal.subtract(env.callMethod(this.terminal, "getWidth", Application.class), 10);
            abbrevs = function_array_values.f.env(env).call(commands).value();
            maxLen = 0;
            for (ZPair zpairResult1629 : ZVal.getIterable(abbrevs, env, true)) {
                abbrev = ZVal.assign(zpairResult1629.getValue());
                maxLen =
                        NamespaceGlobal.max
                                .env(env)
                                .call(Helper.runtimeStaticObject.strlen(env, abbrev), maxLen)
                                .value();
            }

            abbrevs =
                    function_array_map
                            .f
                            .env(env)
                            .call(
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(index = 0, name = "cmd")
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object cmd = assignParameter(args, 0, false);
                                            Object usableWidth = null;
                                            ReferenceContainer commandList =
                                                    new BasicReferenceContainer(null);
                                            Object abbrev = null;
                                            Object maxLen = null;
                                            usableWidth =
                                                    this.contextReferences.getCapturedValue(
                                                            "usableWidth");
                                            commandList =
                                                    this.contextReferences.getReferenceContainer(
                                                            "commandList");
                                            maxLen =
                                                    this.contextReferences.getCapturedValue(
                                                            "maxLen");
                                            if (!ZVal.isTrue(
                                                    ZVal.checkInstanceType(
                                                            commandList.arrayGet(env, cmd),
                                                            Command.class,
                                                            "Symfony\\Component\\Console\\Command\\Command"))) {
                                                return ZVal.assign(cmd);
                                            }

                                            abbrev =
                                                    toStringR(
                                                                    NamespaceGlobal.str_pad
                                                                            .env(env)
                                                                            .call(cmd, maxLen, " ")
                                                                            .value(),
                                                                    env)
                                                            + " "
                                                            + toStringR(
                                                                    env.callMethod(
                                                                            commandList.arrayGet(
                                                                                    env, cmd),
                                                                            "getDescription",
                                                                            Application.class),
                                                                    env);
                                            return ZVal.assign(
                                                    ZVal.isGreaterThan(
                                                                    Helper.runtimeStaticObject
                                                                            .strlen(env, abbrev),
                                                                    '>',
                                                                    usableWidth)
                                                            ? toStringR(
                                                                            Helper
                                                                                    .runtimeStaticObject
                                                                                    .substr(
                                                                                            env,
                                                                                            abbrev,
                                                                                            0,
                                                                                            ZVal
                                                                                                    .subtract(
                                                                                                            usableWidth,
                                                                                                            3)),
                                                                            env)
                                                                    + "..."
                                                            : abbrev);
                                        }
                                    }.use("usableWidth", usableWidth)
                                            .use("commandList", commandList)
                                            .use("maxLen", maxLen),
                                    function_array_values.f.env(env).call(commands).value())
                            .value();
            suggestions = this.getAbbreviationSuggestions(env, abbrevs);
            throw ZVal.getException(
                    env,
                    new CommandNotFoundException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Command \"%s\" is ambiguous.\nDid you mean one of these?\n%s",
                                            name, suggestions)
                                    .value(),
                            function_array_values.f.env(env).call(commands).value()));
        }

        return ZVal.assign(
                this.get(
                        env,
                        ZVal.isTrue(exact)
                                ? name
                                : function_reset.f.env(env).call(commands).value()));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "namespace",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object all(RuntimeEnv env, Object... args) {
        Object namespace = assignParameter(args, 0, true);
        if (null == namespace) {
            namespace = ZVal.getNull();
        }
        Object name = null;
        ReferenceContainer commands = new BasicReferenceContainer(null);
        Object command = null;
        this.init(env);
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", namespace)) {
            if (!ZVal.isTrue(this.commandLoader)) {
                return ZVal.assign(this.commands);
            }

            commands.setObject(ZVal.assign(this.commands));
            for (ZPair zpairResult1630 :
                    ZVal.getIterable(
                            env.callMethod(this.commandLoader, "getNames", Application.class),
                            env,
                            true)) {
                name = ZVal.assign(zpairResult1630.getValue());
                if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, commands, env, name))
                        && ZVal.toBool(this.has(env, name))) {
                    commands.arrayAccess(env, name).set(this.get(env, name));
                }
            }

            return ZVal.assign(commands.getObject());
        }

        commands.setObject(ZVal.newArray());
        for (ZPair zpairResult1631 : ZVal.getIterable(this.commands, env, false)) {
            name = ZVal.assign(zpairResult1631.getKey());
            command = ZVal.assign(zpairResult1631.getValue());
            if (ZVal.strictEqualityCheck(
                    namespace,
                    "===",
                    this.extractNamespace(
                            env,
                            name,
                            ZVal.add(
                                    NamespaceGlobal.substr_count
                                            .env(env)
                                            .call(namespace, ":")
                                            .value(),
                                    1)))) {
                commands.arrayAccess(env, name).set(command);
            }
        }

        if (ZVal.isTrue(this.commandLoader)) {
            for (ZPair zpairResult1632 :
                    ZVal.getIterable(
                            env.callMethod(this.commandLoader, "getNames", Application.class),
                            env,
                            true)) {
                name = ZVal.assign(zpairResult1632.getValue());
                if (ZVal.toBool(
                                ZVal.toBool(!arrayActionR(ArrayAction.ISSET, commands, env, name))
                                        && ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        namespace,
                                                        "===",
                                                        this.extractNamespace(
                                                                env,
                                                                name,
                                                                ZVal.add(
                                                                        NamespaceGlobal.substr_count
                                                                                .env(env)
                                                                                .call(
                                                                                        namespace,
                                                                                        ":")
                                                                                .value(),
                                                                        1)))))
                        && ZVal.toBool(this.has(env, name))) {
                    commands.arrayAccess(env, name).set(this.get(env, name));
                }
            }
        }

        return ZVal.assign(commands.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object renderException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        env.callMethod(
                output, "writeln", Application.class, "", OutputInterface.CONST_VERBOSITY_QUIET);
        this.doRenderException(env, e, output);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.runningCommand)) {
            env.callMethod(
                    output,
                    "writeln",
                    Application.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "<info>%s</info>",
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    env.callMethod(
                                                            this.runningCommand,
                                                            "getSynopsis",
                                                            Application.class),
                                                    this.getName(env))
                                            .value())
                            .value(),
                    OutputInterface.CONST_VERBOSITY_QUIET);
            env.callMethod(
                    output,
                    "writeln",
                    Application.class,
                    "",
                    OutputInterface.CONST_VERBOSITY_QUIET);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    protected Object doRenderException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object code = null;
        ReferenceContainer line = new BasicReferenceContainer(null);
        Object count = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object ternaryExpressionTemp = null;
        Object message = null;
        Object title = null;
        Object type = null;
        Object lineLength = null;
        ReferenceContainer trace = new BasicReferenceContainer(null);
        Object file = null;
        Object len = null;
        Object function = null;
        Object width = null;
        Object emptyLine = null;
        ReferenceContainer messages = new BasicReferenceContainer(null);
        ReferenceContainer lines = new BasicReferenceContainer(null);
        Object _pClass = null;
        do {
            message =
                    function_trim
                            .f
                            .env(env)
                            .call(env.callMethod(e, "getMessage", Application.class))
                            .value();
            if (ZVal.toBool(ZVal.strictEqualityCheck("", "===", message))
                    || ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    OutputInterface.CONST_VERBOSITY_VERBOSE,
                                    "<=",
                                    env.callMethod(output, "getVerbosity", Application.class)))) {
                title =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "  [%s%s]  ",
                                        function_get_class.f.env(env).call(e).value(),
                                        ZVal.strictNotEqualityCheck(
                                                        0,
                                                        "!==",
                                                        code =
                                                                env.callMethod(
                                                                        e,
                                                                        "getCode",
                                                                        Application.class))
                                                ? " (" + toStringR(code, env) + ")"
                                                : "")
                                .value();
                len = Helper.runtimeStaticObject.strlen(env, title);

            } else {
                len = 0;
            }

            width =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    this.terminal, "getWidth", Application.class))
                                    ? ZVal.subtract(
                                            env.callMethod(
                                                    this.terminal, "getWidth", Application.class),
                                            1)
                                    : 9223372036854775807L);
            lines.setObject(ZVal.newArray());
            for (ZPair zpairResult1634 :
                    ZVal.getIterable(
                            ZVal.strictNotEqualityCheck("", "!==", message)
                                    ? NamespaceGlobal.preg_split
                                            .env(env)
                                            .call("/\\r?\\n/", message)
                                            .value()
                                    : ZVal.newArray(),
                            env,
                            true)) {
                line.setObject(ZVal.assign(zpairResult1634.getValue()));
                for (ZPair zpairResult1635 :
                        ZVal.getIterable(
                                this.splitStringByWidth(
                                        env, line.getObject(), ZVal.subtract(width, 4)),
                                env,
                                true)) {
                    line.setObject(ZVal.assign(zpairResult1635.getValue()));
                    lineLength =
                            ZVal.add(Helper.runtimeStaticObject.strlen(env, line.getObject()), 4);
                    lines.arrayAppend(env)
                            .set(
                                    ZVal.newArray(
                                            new ZPair(0, line.getObject()),
                                            new ZPair(1, lineLength)));
                    len = NamespaceGlobal.max.env(env).call(lineLength, len).value();
                }
            }

            messages.setObject(ZVal.newArray());
            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    ZVal.checkInstanceType(
                                            e,
                                            ExceptionInterface.class,
                                            "Symfony\\Component\\Console\\Exception\\ExceptionInterface")))
                    || ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    OutputInterface.CONST_VERBOSITY_VERBOSE,
                                    "<=",
                                    env.callMethod(output, "getVerbosity", Application.class)))) {
                messages.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<comment>%s</comment>",
                                                OutputFormatter.runtimeStaticObject.escape(
                                                        env,
                                                        function_sprintf
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        "In %s line %s:",
                                                                        ZVal.isTrue(
                                                                                        ternaryExpressionTemp =
                                                                                                NamespaceGlobal
                                                                                                        .basename
                                                                                                        .env(
                                                                                                                env)
                                                                                                        .call(
                                                                                                                env
                                                                                                                        .callMethod(
                                                                                                                                e,
                                                                                                                                "getFile",
                                                                                                                                Application
                                                                                                                                        .class))
                                                                                                        .value())
                                                                                ? ternaryExpressionTemp
                                                                                : "n/a",
                                                                        ZVal.isTrue(
                                                                                        ternaryExpressionTemp =
                                                                                                env
                                                                                                        .callMethod(
                                                                                                                e,
                                                                                                                "getLine",
                                                                                                                Application
                                                                                                                        .class))
                                                                                ? ternaryExpressionTemp
                                                                                : "n/a")
                                                                .value()))
                                        .value());
            }

            messages.arrayAppend(env)
                    .set(
                            emptyLine =
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "<error>%s</error>",
                                                    function_str_repeat
                                                            .f
                                                            .env(env)
                                                            .call(" ", len)
                                                            .value())
                                            .value());
            if (ZVal.toBool(ZVal.strictEqualityCheck("", "===", message))
                    || ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    OutputInterface.CONST_VERBOSITY_VERBOSE,
                                    "<=",
                                    env.callMethod(output, "getVerbosity", Application.class)))) {
                messages.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<error>%s%s</error>",
                                                title,
                                                function_str_repeat
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                " ",
                                                                NamespaceGlobal.max
                                                                        .env(env)
                                                                        .call(
                                                                                0,
                                                                                ZVal.subtract(
                                                                                        len,
                                                                                        Helper
                                                                                                .runtimeStaticObject
                                                                                                .strlen(
                                                                                                        env,
                                                                                                        title)))
                                                                        .value())
                                                        .value())
                                        .value());
            }

            for (ZPair zpairResult1636 : ZVal.getIterable(lines.getObject(), env, true)) {
                line.setObject(ZVal.assign(zpairResult1636.getValue()));
                messages.arrayAppend(env)
                        .set(
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<error>  %s  %s</error>",
                                                OutputFormatter.runtimeStaticObject.escape(
                                                        env, line.arrayGet(env, 0)),
                                                function_str_repeat
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                " ",
                                                                ZVal.subtract(
                                                                        len, line.arrayGet(env, 1)))
                                                        .value())
                                        .value());
            }

            messages.arrayAppend(env).set(emptyLine);
            messages.arrayAppend(env).set("");
            env.callMethod(
                    output,
                    "writeln",
                    Application.class,
                    messages.getObject(),
                    OutputInterface.CONST_VERBOSITY_QUIET);
            if (ZVal.isLessThanOrEqualTo(
                    OutputInterface.CONST_VERBOSITY_VERBOSE,
                    "<=",
                    env.callMethod(output, "getVerbosity", Application.class))) {
                env.callMethod(
                        output,
                        "writeln",
                        Application.class,
                        "<comment>Exception trace:</comment>",
                        OutputInterface.CONST_VERBOSITY_QUIET);
                trace.setObject(env.callMethod(e, "getTrace", Application.class));
                for (i.setObject(0),
                                count = function_count.f.env(env).call(trace.getObject()).value();
                        ZVal.isLessThan(i.getObject(), '<', count);
                        i.setObject(ZVal.increment(i.getObject()))) {
                    _pClass =
                            ZVal.assign(
                                    arrayActionR(
                                                    ArrayAction.ISSET,
                                                    trace,
                                                    env,
                                                    i.getObject(),
                                                    "class")
                                            ? trace.arrayGet(env, i.getObject(), "class")
                                            : "");
                    type =
                            ZVal.assign(
                                    arrayActionR(
                                                    ArrayAction.ISSET,
                                                    trace,
                                                    env,
                                                    i.getObject(),
                                                    "type")
                                            ? trace.arrayGet(env, i.getObject(), "type")
                                            : "");
                    function = ZVal.assign(trace.arrayGet(env, i.getObject(), "function"));
                    file =
                            ZVal.assign(
                                    arrayActionR(
                                                    ArrayAction.ISSET,
                                                    trace,
                                                    env,
                                                    i.getObject(),
                                                    "file")
                                            ? trace.arrayGet(env, i.getObject(), "file")
                                            : "n/a");
                    line.setObject(
                            ZVal.assign(
                                    arrayActionR(
                                                    ArrayAction.ISSET,
                                                    trace,
                                                    env,
                                                    i.getObject(),
                                                    "line")
                                            ? trace.arrayGet(env, i.getObject(), "line")
                                            : "n/a"));
                    env.callMethod(
                            output,
                            "writeln",
                            Application.class,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            " %s%s%s() at <info>%s:%s</info>",
                                            _pClass, type, function, file, line.getObject())
                                    .value(),
                            OutputInterface.CONST_VERBOSITY_QUIET);
                }

                env.callMethod(
                        output,
                        "writeln",
                        Application.class,
                        "",
                        OutputInterface.CONST_VERBOSITY_QUIET);
            }

        } while (ZVal.isTrue(e = env.callMethod(e, "getPrevious", Application.class)));

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    protected Object configureIO(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        ReferenceContainer _ENV = new BasicReferenceContainer(null);
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        Object inputStream = null;
        Object shellVerbosity = null;
        if (ZVal.strictEqualityCheck(
                true,
                "===",
                env.callMethod(
                        input,
                        "hasParameterOption",
                        Application.class,
                        ZVal.arrayFromList("--ansi"),
                        true))) {
            env.callMethod(output, "setDecorated", Application.class, true);

        } else if (ZVal.strictEqualityCheck(
                true,
                "===",
                env.callMethod(
                        input,
                        "hasParameterOption",
                        Application.class,
                        ZVal.arrayFromList("--no-ansi"),
                        true))) {
            env.callMethod(output, "setDecorated", Application.class, false);
        }

        if (ZVal.strictEqualityCheck(
                true,
                "===",
                env.callMethod(
                        input,
                        "hasParameterOption",
                        Application.class,
                        ZVal.arrayFromList("--no-interaction", "-n"),
                        true))) {
            env.callMethod(input, "setInteractive", Application.class, false);

        } else if (function_function_exists.f.env(env).call("posix_isatty").getBool()) {
            inputStream = ZVal.getNull();
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            input,
                            StreamableInputInterface.class,
                            "Symfony\\Component\\Console\\Input\\StreamableInputInterface"))) {
                inputStream = env.callMethod(input, "getStream", Application.class);
            }

            if (ZVal.toBool(
                            !ZVal.isTrue(
                                    NamespaceGlobal.posix_isatty
                                            .env(env)
                                            .call(inputStream)
                                            .value()))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    false,
                                    "===",
                                    NamespaceGlobal.getenv
                                            .env(env)
                                            .call("SHELL_INTERACTIVE")
                                            .value()))) {
                env.callMethod(input, "setInteractive", Application.class, false);
            }
        }

        SwitchEnumType109 switchVariable109 =
                ZVal.getEnum(
                        shellVerbosity =
                                ZVal.assign(
                                        ZVal.toLong(
                                                NamespaceGlobal.getenv
                                                        .env(env)
                                                        .call("SHELL_VERBOSITY")
                                                        .value())),
                        SwitchEnumType109.DEFAULT_CASE,
                        SwitchEnumType109.MINUS_INTEGER_1,
                        -1,
                        SwitchEnumType109.INTEGER_1,
                        1,
                        SwitchEnumType109.INTEGER_2,
                        2,
                        SwitchEnumType109.INTEGER_3,
                        3);
        switch (switchVariable109) {
            case MINUS_INTEGER_1:
                env.callMethod(
                        output,
                        "setVerbosity",
                        Application.class,
                        OutputInterface.CONST_VERBOSITY_QUIET);
                break;
            case INTEGER_1:
                env.callMethod(
                        output,
                        "setVerbosity",
                        Application.class,
                        OutputInterface.CONST_VERBOSITY_VERBOSE);
                break;
            case INTEGER_2:
                env.callMethod(
                        output,
                        "setVerbosity",
                        Application.class,
                        OutputInterface.CONST_VERBOSITY_VERY_VERBOSE);
                break;
            case INTEGER_3:
                env.callMethod(
                        output,
                        "setVerbosity",
                        Application.class,
                        OutputInterface.CONST_VERBOSITY_DEBUG);
                break;
            case DEFAULT_CASE:
                shellVerbosity = 0;
                break;
        }
        ;
        if (ZVal.strictEqualityCheck(
                true,
                "===",
                env.callMethod(
                        input,
                        "hasParameterOption",
                        Application.class,
                        ZVal.arrayFromList("--quiet", "-q"),
                        true))) {
            env.callMethod(
                    output,
                    "setVerbosity",
                    Application.class,
                    OutputInterface.CONST_VERBOSITY_QUIET);
            shellVerbosity = -1;

        } else {
            if (ZVal.toBool(
                            ZVal.toBool(
                                            env.callMethod(
                                                    input,
                                                    "hasParameterOption",
                                                    Application.class,
                                                    "-vvv",
                                                    true))
                                    || ZVal.toBool(
                                            env.callMethod(
                                                    input,
                                                    "hasParameterOption",
                                                    Application.class,
                                                    "--verbose=3",
                                                    true)))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    3,
                                    "===",
                                    env.callMethod(
                                            input,
                                            "getParameterOption",
                                            Application.class,
                                            "--verbose",
                                            false,
                                            true)))) {
                env.callMethod(
                        output,
                        "setVerbosity",
                        Application.class,
                        OutputInterface.CONST_VERBOSITY_DEBUG);
                shellVerbosity = 3;

            } else if (ZVal.toBool(
                            ZVal.toBool(
                                            env.callMethod(
                                                    input,
                                                    "hasParameterOption",
                                                    Application.class,
                                                    "-vv",
                                                    true))
                                    || ZVal.toBool(
                                            env.callMethod(
                                                    input,
                                                    "hasParameterOption",
                                                    Application.class,
                                                    "--verbose=2",
                                                    true)))
                    || ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    2,
                                    "===",
                                    env.callMethod(
                                            input,
                                            "getParameterOption",
                                            Application.class,
                                            "--verbose",
                                            false,
                                            true)))) {
                env.callMethod(
                        output,
                        "setVerbosity",
                        Application.class,
                        OutputInterface.CONST_VERBOSITY_VERY_VERBOSE);
                shellVerbosity = 2;

            } else if (ZVal.toBool(
                            ZVal.toBool(
                                            ZVal.toBool(
                                                            env.callMethod(
                                                                    input,
                                                                    "hasParameterOption",
                                                                    Application.class,
                                                                    "-v",
                                                                    true))
                                                    || ZVal.toBool(
                                                            env.callMethod(
                                                                    input,
                                                                    "hasParameterOption",
                                                                    Application.class,
                                                                    "--verbose=1",
                                                                    true)))
                                    || ZVal.toBool(
                                            env.callMethod(
                                                    input,
                                                    "hasParameterOption",
                                                    Application.class,
                                                    "--verbose",
                                                    true)))
                    || ZVal.toBool(
                            env.callMethod(
                                    input,
                                    "getParameterOption",
                                    Application.class,
                                    "--verbose",
                                    false,
                                    true))) {
                env.callMethod(
                        output,
                        "setVerbosity",
                        Application.class,
                        OutputInterface.CONST_VERBOSITY_VERBOSE);
                shellVerbosity = 1;
            }
        }

        if (ZVal.strictEqualityCheck(-1, "===", shellVerbosity)) {
            env.callMethod(input, "setInteractive", Application.class, false);
        }

        NamespaceGlobal.putenv.env(env).call("SHELL_VERBOSITY=" + toStringR(shellVerbosity, env));
        _ENV.arrayAccess(env, "SHELL_VERBOSITY").set(shellVerbosity);
        _SERVER.arrayAccess(env, "SHELL_VERBOSITY").set(shellVerbosity);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "command",
        typeHint = "Symfony\\Component\\Console\\Command\\Command"
    )
    @ConvertedParameter(
        index = 1,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    protected Object doRunCommand(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        Object input = assignParameter(args, 1, false);
        Object output = assignParameter(args, 2, false);
        Object helper = null;
        Object e = null;
        Object exitCode = null;
        Object event = null;
        for (ZPair zpairResult1637 :
                ZVal.getIterable(
                        env.callMethod(command, "getHelperSet", Application.class), env, true)) {
            helper = ZVal.assign(zpairResult1637.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            helper,
                            InputAwareInterface.class,
                            "Symfony\\Component\\Console\\Input\\InputAwareInterface"))) {
                env.callMethod(helper, "setInput", Application.class, input);
            }
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.dispatcher)) {
            return ZVal.assign(env.callMethod(command, "run", Application.class, input, output));
        }

        try {
            env.callMethod(command, "mergeApplicationDefinition", Application.class);
            env.callMethod(
                    input,
                    "bind",
                    Application.class,
                    env.callMethod(command, "getDefinition", Application.class));
        } catch (ConvertedException convertedException240) {
            if (convertedException240.instanceOf(
                    ExceptionInterface.class,
                    "Symfony\\Component\\Console\\Exception\\ExceptionInterface")) {
                e = convertedException240.getObject();
            } else {
                throw convertedException240;
            }
        }

        event = new ConsoleCommandEvent(env, command, input, output);
        e = ZVal.getNull();
        try {
            env.callMethod(
                    this.dispatcher,
                    "dispatch",
                    Application.class,
                    ConsoleEvents.CONST_COMMAND,
                    event);
            if (ZVal.isTrue(env.callMethod(event, "commandShouldRun", Application.class))) {
                exitCode = env.callMethod(command, "run", Application.class, input, output);

            } else {
                exitCode = ZVal.assign(ConsoleCommandEvent.CONST_RETURN_CODE_DISABLED);
            }

        } catch (ConvertedException convertedException241) {
            if (convertedException241.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException241.getObject();
                event = new ConsoleErrorEvent(env, input, output, e, command);
                env.callMethod(
                        this.dispatcher,
                        "dispatch",
                        Application.class,
                        ConsoleEvents.CONST_ERROR,
                        event);
                e = env.callMethod(event, "getError", Application.class);
                if (ZVal.strictEqualityCheck(
                        0,
                        "===",
                        exitCode = env.callMethod(event, "getExitCode", Application.class))) {
                    e = ZVal.getNull();
                }

            } else {
                throw convertedException241;
            }
        }

        event = new ConsoleTerminateEvent(env, command, input, output, exitCode);
        env.callMethod(
                this.dispatcher,
                "dispatch",
                Application.class,
                ConsoleEvents.CONST_TERMINATE,
                event);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", e)) {
            throw ZVal.getException(env, e);
        }

        return ZVal.assign(env.callMethod(event, "getExitCode", Application.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    protected Object getCommandName(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.isTrue(this.singleCommand)
                        ? this.defaultCommand
                        : env.callMethod(input, "getFirstArgument", Application.class));
    }

    @ConvertedMethod
    protected Object getDefaultInputDefinition(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new InputDefinition(
                        env,
                        ZVal.newArray(
                                new ZPair(
                                        0,
                                        new InputArgument(
                                                env,
                                                "command",
                                                InputArgument.CONST_REQUIRED,
                                                "The command to execute")),
                                new ZPair(
                                        1,
                                        new InputOption(
                                                env,
                                                "--help",
                                                "-h",
                                                InputOption.CONST_VALUE_NONE,
                                                "Display this help message")),
                                new ZPair(
                                        2,
                                        new InputOption(
                                                env,
                                                "--quiet",
                                                "-q",
                                                InputOption.CONST_VALUE_NONE,
                                                "Do not output any message")),
                                new ZPair(
                                        3,
                                        new InputOption(
                                                env,
                                                "--verbose",
                                                "-v|vv|vvv",
                                                InputOption.CONST_VALUE_NONE,
                                                "Increase the verbosity of messages: 1 for normal output, 2 for more verbose output and 3 for debug")),
                                new ZPair(
                                        4,
                                        new InputOption(
                                                env,
                                                "--version",
                                                "-V",
                                                InputOption.CONST_VALUE_NONE,
                                                "Display this application version")),
                                new ZPair(
                                        5,
                                        new InputOption(
                                                env,
                                                "--ansi",
                                                "",
                                                InputOption.CONST_VALUE_NONE,
                                                "Force ANSI output")),
                                new ZPair(
                                        6,
                                        new InputOption(
                                                env,
                                                "--no-ansi",
                                                "",
                                                InputOption.CONST_VALUE_NONE,
                                                "Disable ANSI output")),
                                new ZPair(
                                        7,
                                        new InputOption(
                                                env,
                                                "--no-interaction",
                                                "-n",
                                                InputOption.CONST_VALUE_NONE,
                                                "Do not ask any interactive question")))));
    }

    @ConvertedMethod
    protected Object getDefaultCommands(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, new HelpCommand(env)), new ZPair(1, new ListCommand(env))));
    }

    @ConvertedMethod
    protected Object getDefaultHelperSet(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new HelperSet(
                        env,
                        ZVal.newArray(
                                new ZPair(0, new FormatterHelper(env)),
                                new ZPair(1, new DebugFormatterHelper(env)),
                                new ZPair(2, new ProcessHelper(env)),
                                new ZPair(3, new QuestionHelper(env)))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "abbrevs")
    private Object getAbbreviationSuggestions(RuntimeEnv env, Object... args) {
        Object abbrevs = assignParameter(args, 0, false);
        return ZVal.assign(
                "    "
                        + toStringR(
                                NamespaceGlobal.implode.env(env).call("\n    ", abbrevs).value(),
                                env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "limit",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object extractNamespace(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object limit = assignParameter(args, 1, true);
        if (null == limit) {
            limit = ZVal.getNull();
        }
        Object parts = null;
        parts = function_explode.f.env(env).call(":", name).value();
        function_array_pop.f.env(env).call(parts);
        return ZVal.assign(
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                ":",
                                ZVal.strictEqualityCheck(ZVal.getNull(), "===", limit)
                                        ? parts
                                        : function_array_slice
                                                .f
                                                .env(env)
                                                .call(parts, 0, limit)
                                                .value())
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "collection")
    private Object findAlternatives(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console")
                        .setFile("/vendor/symfony/console/Application.php");
        int runtimeConverterContinueCount;
        Object name = assignParameter(args, 0, false);
        Object collection = assignParameter(args, 1, false);
        Object item = null;
        Object subname = null;
        ReferenceContainer parts = new BasicReferenceContainer(null);
        ReferenceContainer alternatives = new BasicReferenceContainer(null);
        Object exists = null;
        Object i = null;
        Object threshold = null;
        ReferenceContainer collectionParts = new BasicReferenceContainer(null);
        Object lev = null;
        Object collectionName = null;
        threshold = 1000.0;
        alternatives.setObject(ZVal.newArray());
        collectionParts.setObject(ZVal.newArray());
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1638 : ZVal.getIterable(collection, env, true)) {
            item = ZVal.assign(zpairResult1638.getValue());
            collectionParts
                    .arrayAccess(env, item)
                    .set(function_explode.f.env(env).call(":", item).value());
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1639 :
                ZVal.getIterable(function_explode.f.env(env).call(":", name).value(), env, false)) {
            i = ZVal.assign(zpairResult1639.getKey());
            subname = ZVal.assign(zpairResult1639.getValue());
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1640 :
                    ZVal.getIterable(collectionParts.getObject(), env, false)) {
                collectionName = ZVal.assign(zpairResult1640.getKey());
                parts.setObject(ZVal.assign(zpairResult1640.getValue()));
                exists =
                        ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, alternatives, env, collectionName));
                if (ZVal.toBool(!arrayActionR(ArrayAction.ISSET, parts, env, i))
                        && ZVal.toBool(exists)) {
                    alternatives
                            .arrayAccess(env, collectionName)
                            .set(
                                    ZAssignment.add(
                                            "+=",
                                            alternatives.arrayGet(env, collectionName),
                                            threshold));
                    continue;

                } else if (!arrayActionR(ArrayAction.ISSET, parts, env, i)) {
                    continue;
                }

                lev =
                        NamespaceGlobal.levenshtein
                                .env(env)
                                .call(subname, parts.arrayGet(env, i))
                                .value();
                if (ZVal.toBool(
                                ZVal.isLessThanOrEqualTo(
                                        lev,
                                        "<=",
                                        ZVal.divide(
                                                function_strlen.f.env(env).call(subname).value(),
                                                3)))
                        || ZVal.toBool(
                                ZVal.toBool(ZVal.strictNotEqualityCheck("", "!==", subname))
                                        && ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        false,
                                                        "!==",
                                                        function_strpos
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        parts.arrayGet(env, i),
                                                                        subname)
                                                                .value())))) {
                    alternatives
                            .arrayAccess(env, collectionName)
                            .set(
                                    ZVal.isTrue(exists)
                                            ? ZVal.add(
                                                    alternatives.arrayGet(env, collectionName), lev)
                                            : lev);

                } else if (ZVal.isTrue(exists)) {
                    alternatives
                            .arrayAccess(env, collectionName)
                            .set(
                                    ZAssignment.add(
                                            "+=",
                                            alternatives.arrayGet(env, collectionName),
                                            threshold));
                }
            }
        }

        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1641 : ZVal.getIterable(collection, env, true)) {
            item = ZVal.assign(zpairResult1641.getValue());
            lev = NamespaceGlobal.levenshtein.env(env).call(name, item).value();
            if (ZVal.toBool(
                            ZVal.isLessThanOrEqualTo(
                                    lev,
                                    "<=",
                                    ZVal.divide(function_strlen.f.env(env).call(name).value(), 3)))
                    || ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    false,
                                    "!==",
                                    function_strpos.f.env(env).call(item, name).value()))) {
                alternatives
                        .arrayAccess(env, item)
                        .set(
                                arrayActionR(ArrayAction.ISSET, alternatives, env, item)
                                        ? ZVal.subtract(alternatives.arrayGet(env, item), lev)
                                        : lev);
            }
        }

        alternatives.setObject(
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                alternatives.getObject(),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Console",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "lev")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object lev = assignParameter(args, 0, false);
                                        Object threshold = null;
                                        threshold =
                                                this.contextReferences.getCapturedValue(
                                                        "threshold");
                                        return ZVal.assign(
                                                ZVal.isLessThan(
                                                        lev, '<', ZVal.multiply(2, threshold)));
                                    }
                                }.use("threshold", threshold))
                        .value());
        function_ksort.f.env(env).call(alternatives.getObject(), ZVal.toLong(6) | ZVal.toLong(8));
        return ZVal.assign(function_array_keys.f.env(env).call(alternatives.getObject()).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "commandName")
    @ConvertedParameter(
        index = 1,
        name = "isSingleCommand",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object setDefaultCommand(RuntimeEnv env, Object... args) {
        Object commandName = assignParameter(args, 0, false);
        Object isSingleCommand = assignParameter(args, 1, true);
        if (null == isSingleCommand) {
            isSingleCommand = false;
        }
        this.defaultCommand = commandName;
        if (ZVal.isTrue(isSingleCommand)) {
            this.find(env, commandName);
            this.singleCommand = true;
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(index = 1, name = "width")
    private Object splitStringByWidth(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object string = assignParameter(args, 0, false);
        Object width = assignParameter(args, 1, false);
        Object utf8String = null;
        Object line = null;
        Object _pChar = null;
        Object encoding = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        if (ZVal.strictEqualityCheck(
                false,
                "===",
                encoding =
                        NamespaceGlobal.mb_detect_encoding
                                .env(env)
                                .call(string, ZVal.getNull(), true)
                                .value())) {
            return ZVal.assign(NamespaceGlobal.str_split.env(env).call(string, width).value());
        }

        utf8String =
                NamespaceGlobal.mb_convert_encoding.env(env).call(string, "utf8", encoding).value();
        lines.setObject(ZVal.newArray());
        line = "";
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1642 :
                ZVal.getIterable(
                        NamespaceGlobal.preg_split.env(env).call("//u", utf8String).value(),
                        env,
                        true)) {
            _pChar = ZVal.assign(zpairResult1642.getValue());
            if (ZVal.isLessThanOrEqualTo(
                    NamespaceGlobal.mb_strwidth
                            .env(env)
                            .call(toStringR(line, env) + toStringR(_pChar, env), "utf8")
                            .value(),
                    "<=",
                    width)) {
                line = toStringR(line, env) + toStringR(_pChar, env);
                continue;
            }

            lines.arrayAppend(env).set(NamespaceGlobal.str_pad.env(env).call(line, width).value());
            line = ZVal.assign(_pChar);
        }

        lines.arrayAppend(env)
                .set(
                        function_count.f.env(env).call(lines.getObject()).getBool()
                                ? NamespaceGlobal.str_pad.env(env).call(line, width).value()
                                : line);
        NamespaceGlobal.mb_convert_variables
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, lines))
                .call(encoding, "utf8", lines.getObject());
        return ZVal.assign(lines.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    private Object extractAllNamespaces(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object part = null;
        Object parts = null;
        ReferenceContainer namespaces = new BasicReferenceContainer(null);
        parts = function_explode.f.env(env).call(":", name, -1).value();
        namespaces.setObject(ZVal.newArray());
        for (ZPair zpairResult1643 : ZVal.getIterable(parts, env, true)) {
            part = ZVal.assign(zpairResult1643.getValue());
            if (function_count.f.env(env).call(namespaces.getObject()).getBool()) {
                namespaces
                        .arrayAppend(env)
                        .set(
                                toStringR(
                                                function_end
                                                        .f
                                                        .env(env)
                                                        .call(namespaces.getObject())
                                                        .value(),
                                                env)
                                        + ":"
                                        + toStringR(part, env));

            } else {
                namespaces.arrayAppend(env).set(part);
            }
        }

        return ZVal.assign(namespaces.getObject());
    }

    @ConvertedMethod
    private Object init(RuntimeEnv env, Object... args) {
        Object command = null;
        if (ZVal.isTrue(this.initialized)) {
            return null;
        }

        this.initialized = true;
        for (ZPair zpairResult1644 : ZVal.getIterable(this.getDefaultCommands(env), env, true)) {
            command = ZVal.assign(zpairResult1644.getValue());
            this.add(env, command);
        }

        return null;
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Application";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "names")
        public Object getAbbreviations(RuntimeEnv env, Object... args) {
            Object names = assignParameter(args, 0, false);
            ReferenceContainer abbrevs = new BasicReferenceContainer(null);
            ReferenceContainer len = new BasicReferenceContainer(null);
            Object name = null;
            Object abbrev = null;
            abbrevs.setObject(ZVal.newArray());
            for (ZPair zpairResult1633 : ZVal.getIterable(names, env, true)) {
                name = ZVal.assign(zpairResult1633.getValue());
                for (len.setObject(function_strlen.f.env(env).call(name).value());
                        ZVal.isGreaterThan(len.getObject(), '>', 0);
                        len.setObject(ZVal.decrement(len.getObject()))) {
                    abbrev = function_substr.f.env(env).call(name, 0, len.getObject()).value();
                    abbrevs.arrayAppend(env, abbrev).set(name);
                }
            }

            return ZVal.assign(abbrevs.getObject());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Application")
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
                            "helperSet",
                            "initialized",
                            "name",
                            "runningCommand",
                            "singleCommand",
                            "terminal",
                            "version",
                            "wantHelps")
                    .setFilename("vendor/symfony/console/Application.php")
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

    private enum SwitchEnumType109 {
        MINUS_INTEGER_1,
        INTEGER_1,
        INTEGER_2,
        INTEGER_3,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
