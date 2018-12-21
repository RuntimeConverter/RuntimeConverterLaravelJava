package com.project.convertedCode.globalNamespace.namespaces.Psy.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Configuration;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.ListCommand;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.SudoCommand;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_push;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.ObjectMethodsMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.FunctionsMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.HistoryCommand;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.ObjectAttributesMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.CommandsMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.VariablesMatcher;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.ExitCommand;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.HelpCommand;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.ClassMethodDefaultParametersMatcher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.ObjectMethodDefaultParametersMatcher;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ExecutionLoop;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.StringInput;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.DocCommand;
import com.runtimeconverter.runtime.nativeClasses.errors.PHPError;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.ExecutionLoop.classes.RunkitReloader;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.WhereamiCommand;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeClasses.errors.TypeError;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.ClassAttributesMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.Application;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.DumpCommand;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.TypeErrorException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.TraceCommand;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.SilentInput;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.references.GlobalVariableReference;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.ClearCommand;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.ShowCommand;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Context;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.ClassNamesMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.KeywordsMatcher;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_error_reporting;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArgvInput;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.TimeitCommand;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.ShellInput;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.BreakException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.WtfCommand;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.EditCommand;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.ThrowUpCommand;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.project.convertedCode.globalNamespace.namespaces.Psy.functions.info;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.ShellOutput;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.ConstantsMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.ThrowUpException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.BufferCommand;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ContextAware;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ExecutionClosure;
import com.runtimeconverter.runtime.nativeInterfaces.Throwable;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.VarDumper.classes.PresenterAware;
import com.runtimeconverter.runtime.nativeFunctions.http.function_php_sapi_name;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.CodeCleaner.classes.NoReturnValue;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputDefinition;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.project.convertedCode.globalNamespace.namespaces.Psy.functions.debug;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.ExecutionLoop.classes.ProcessForker;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.FunctionDefaultParametersMatcher;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.Exception;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.ClassMethodsMatcher;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Shell.php

*/

public class Shell extends Application {

    public Object config = null;

    public Object cleaner = null;

    public Object output = null;

    public Object readline = null;

    public Object inputBuffer = null;

    public Object code = null;

    public Object codeBuffer = null;

    public Object codeBufferOpen = null;

    public Object codeStack = null;

    public Object stdoutBuffer = null;

    public Object context = null;

    public Object includes = null;

    public Object loop = null;

    public Object outputWantsNewline = false;

    public Object prompt = null;

    public Object loopListeners = null;

    public Object autoCompleter = null;

    public Object matchers = ZVal.newArray();

    public Object commandsMatcher = null;

    public Shell(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Shell.class) {
            this.__construct(env, args);
        }
    }

    public Shell(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "config",
        typeHint = "Psy\\Configuration",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object config = assignParameter(args, 0, true);
        if (null == config) {
            config = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.config =
                ZVal.isTrue(ternaryExpressionTemp = config)
                        ? ternaryExpressionTemp
                        : new Configuration(env);
        this.cleaner = env.callMethod(this.config, "getCodeCleaner", Shell.class);
        this.loop = new ExecutionLoop(env);
        this.context = new Context(env);
        this.includes = ZVal.newArray();
        this.readline = env.callMethod(this.config, "getReadline", Shell.class);
        this.inputBuffer = ZVal.newArray();
        this.codeStack = ZVal.newArray();
        this.stdoutBuffer = "";
        this.loopListeners = this.getDefaultLoopListeners(env);
        super.__construct(env, "Psy Shell", CONST_VERSION);
        env.callMethod(this.config, "setShell", Shell.class, this);
        info.f.env(env).call(this.config);
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
        Object ret = null;
        if (ZVal.isTrue(ret = super.add(env, command))) {
            if (ZVal.isTrue(ZVal.checkInstanceType(ret, ContextAware.class, "Psy\\ContextAware"))) {
                env.callMethod(ret, "setContext", Shell.class, this.context);
            }

            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            ret, PresenterAware.class, "Psy\\VarDumper\\PresenterAware"))) {
                env.callMethod(
                        ret,
                        "setPresenter",
                        Shell.class,
                        env.callMethod(this.config, "getPresenter", Shell.class));
            }

            if (ZVal.isset(this.commandsMatcher)) {
                env.callMethod(
                        this.commandsMatcher,
                        "setCommands",
                        Shell.class,
                        env.callMethod(this, "all", Shell.class));
            }
        }

        return ZVal.assign(ret);
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
                                                "Display this help message.")))));
    }

    @ConvertedMethod
    protected Object getDefaultCommands(RuntimeEnv env, Object... args) {
        Object hist = null;
        Object sudo = null;
        sudo = new SudoCommand(env);
        env.callMethod(sudo, "setReadline", Shell.class, this.readline);
        hist = new HistoryCommand(env);
        env.callMethod(hist, "setReadline", Shell.class, this.readline);
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, new HelpCommand(env)),
                        new ZPair(1, new ListCommand(env)),
                        new ZPair(2, new DumpCommand(env)),
                        new ZPair(3, new DocCommand(env)),
                        new ZPair(
                                4,
                                new ShowCommand(
                                        env,
                                        env.callMethod(this.config, "colorMode", Shell.class))),
                        new ZPair(
                                5,
                                new WtfCommand(
                                        env,
                                        env.callMethod(this.config, "colorMode", Shell.class))),
                        new ZPair(
                                6,
                                new WhereamiCommand(
                                        env,
                                        env.callMethod(this.config, "colorMode", Shell.class))),
                        new ZPair(7, new ThrowUpCommand(env)),
                        new ZPair(8, new TimeitCommand(env)),
                        new ZPair(9, new TraceCommand(env)),
                        new ZPair(10, new BufferCommand(env)),
                        new ZPair(11, new ClearCommand(env)),
                        new ZPair(
                                12,
                                new EditCommand(
                                        env,
                                        env.callMethod(this.config, "getRuntimeDir", Shell.class))),
                        new ZPair(13, sudo),
                        new ZPair(14, hist),
                        new ZPair(15, new ExitCommand(env))));
    }

    @ConvertedMethod
    protected Object getDefaultMatchers(RuntimeEnv env, Object... args) {
        this.commandsMatcher = new CommandsMatcher(env, env.callMethod(this, "all", Shell.class));
        return ZVal.assign(
                ZVal.newArray(
                        new ZPair(0, this.commandsMatcher),
                        new ZPair(1, new KeywordsMatcher(env)),
                        new ZPair(2, new VariablesMatcher(env)),
                        new ZPair(3, new ConstantsMatcher(env)),
                        new ZPair(4, new FunctionsMatcher(env)),
                        new ZPair(5, new ClassNamesMatcher(env)),
                        new ZPair(6, new ClassMethodsMatcher(env)),
                        new ZPair(7, new ClassAttributesMatcher(env)),
                        new ZPair(8, new ObjectMethodsMatcher(env)),
                        new ZPair(9, new ObjectAttributesMatcher(env)),
                        new ZPair(10, new ClassMethodDefaultParametersMatcher(env)),
                        new ZPair(11, new ObjectMethodDefaultParametersMatcher(env)),
                        new ZPair(12, new FunctionDefaultParametersMatcher(env))));
    }

    @ConvertedMethod
    protected Object getTabCompletionMatchers(RuntimeEnv env, Object... args) {
        NamespaceGlobal.trigger_error
                .env(env)
                .call("getTabCompletionMatchers is no longer used", 16384)
                .value();
        return null;
    }

    @ConvertedMethod
    protected Object getDefaultLoopListeners(RuntimeEnv env, Object... args) {
        ReferenceContainer listeners = new BasicReferenceContainer(null);
        listeners.setObject(ZVal.newArray());
        if (ZVal.toBool(ProcessForker.runtimeStaticObject.isSupported(env))
                && ZVal.toBool(env.callMethod(this.config, "usePcntl", Shell.class))) {
            listeners.arrayAppend(env).set(new ProcessForker(env));
        }

        if (ZVal.isTrue(RunkitReloader.runtimeStaticObject.isSupported(env))) {
            listeners.arrayAppend(env).set(new RunkitReloader(env));
        }

        return ZVal.assign(listeners.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matchers", typeHint = "array")
    public Object addMatchers(RuntimeEnv env, Object... args) {
        Object matchers = assignParameter(args, 0, false);
        this.matchers = function_array_merge.f.env(env).call(this.matchers, matchers).value();
        if (ZVal.isset(this.autoCompleter)) {
            this.addMatchersToAutoCompleter(env, matchers);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matchers", typeHint = "array")
    public Object addTabCompletionMatchers(RuntimeEnv env, Object... args) {
        Object matchers = assignParameter(args, 0, false);
        this.addMatchers(env, matchers);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    public Object setOutput(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        this.output = output;
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
        Object e = null;
        ReferenceContainer _SERVER = new GlobalVariableReference(env, "_SERVER");
        this.initializeTabCompletion(env);
        if (ZVal.toBool(ZVal.strictEqualityCheck(input, "===", ZVal.getNull()))
                && ZVal.toBool(!arrayActionR(ArrayAction.ISSET, _SERVER, env, "argv"))) {
            input = new ArgvInput(env, ZVal.newArray());
        }

        if (ZVal.strictEqualityCheck(output, "===", ZVal.getNull())) {
            output = env.callMethod(this.config, "getOutput", Shell.class);
        }

        try {
            return ZVal.assign(super.run(env, input, output));
        } catch (ConvertedException convertedException195) {
            if (convertedException195.instanceOf(PHPException.class, "Exception")) {
                e = convertedException195.getObject();
                this.writeException(env, e);
            } else {
                throw convertedException195;
            }
        }

        return 1;
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
        this.setOutput(env, output);
        this.resetCodeBuffer(env);
        env.callMethod(this, "setAutoExit", Shell.class, false);
        env.callMethod(this, "setCatchExceptions", Shell.class, false);
        env.callMethod(this.readline, "readHistory", Shell.class);
        env.callMethod(this.output, "writeln", Shell.class, this.getHeader(env));
        this.writeVersionInfo(env);
        this.writeStartupMessage(env);
        try {
            this.beforeRun(env);
            env.callMethod(this.loop, "run", Shell.class, this);
            this.afterRun(env);
        } catch (ConvertedException convertedException196) {
            if (convertedException196.instanceOf(
                    ThrowUpException.class, "Psy\\Exception\\ThrowUpException")) {
                e = convertedException196.getObject();
                throw ZVal.getException(env, env.callMethod(e, "getPrevious", Shell.class));
            } else if (convertedException196.instanceOf(
                    BreakException.class, "Psy\\Exception\\BreakException")) {
                e = convertedException196.getObject();
                return null;
            } else {
                throw convertedException196;
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object getInput(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object input = null;
        this.codeBufferOpen = false;
        runtimeConverterContinueCount = 0;
        do {
            env.callMethod(
                    this.output, "setVerbosity", Shell.class, ShellOutput.CONST_VERBOSITY_VERBOSE);
            input = this.readline(env);
            if (ZVal.strictEqualityCheck(input, "===", false)) {
                env.callMethod(this.output, "writeln", Shell.class, "");
                if (ZVal.isTrue(this.hasCode(env))) {
                    this.resetCodeBuffer(env);

                } else {
                    throw ZVal.getException(env, new BreakException(env, "Ctrl+D"));
                }
            }

            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    function_trim.f.env(env).call(input).value(), "===", ""))
                    && ZVal.toBool(!ZVal.isTrue(this.codeBufferOpen))) {
                continue;
            }

            input = this.onInput(env, input);
            if (ZVal.toBool(this.hasCommand(env, input))
                    && ZVal.toBool(!ZVal.isTrue(this.inputInOpenStringOrComment(env, input)))) {
                this.addHistory(env, input);
                this.runCommand(env, input);
                continue;
            }

            this.addCode(env, input);

        } while (!ZVal.isTrue(this.hasValidCode(env)));

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    private Object inputInOpenStringOrComment(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object code = null;
        ReferenceContainer last = new BasicReferenceContainer(null);
        Object tokens = null;
        if (!ZVal.isTrue(this.hasCode(env))) {
            return null;
        }

        code = ZVal.assign(this.codeBuffer);
        function_array_push.f.env(env).call(code, input);
        tokens =
                NamespaceGlobal.token_get_all
                        .env(env)
                        .call(
                                "<?php "
                                        + toStringR(
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call("\n", code)
                                                        .value(),
                                                env))
                        .value();
        last.setObject(function_array_pop.f.env(env).call(tokens).value());
        return ZVal.assign(
                ZVal.toBool(
                                ZVal.toBool(ZVal.strictEqualityCheck(last.getObject(), "===", "\""))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        last.getObject(), "===", "`")))
                        || ZVal.toBool(
                                ZVal.toBool(
                                                function_is_array
                                                        .f
                                                        .env(env)
                                                        .call(last.getObject())
                                                        .value())
                                        && ZVal.toBool(
                                                function_in_array
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                last.arrayGet(env, 0),
                                                                ZVal.newArray(
                                                                        new ZPair(0, 322),
                                                                        new ZPair(1, 383),
                                                                        new ZPair(2, 377)))
                                                        .value())));
    }

    @ConvertedMethod
    protected Object beforeRun(RuntimeEnv env, Object... args) {
        Object listener = null;
        for (ZPair zpairResult1409 : ZVal.getIterable(this.loopListeners, env, true)) {
            listener = ZVal.assign(zpairResult1409.getValue());
            env.callMethod(listener, "beforeRun", Shell.class, this);
        }

        return null;
    }

    @ConvertedMethod
    public Object beforeLoop(RuntimeEnv env, Object... args) {
        Object listener = null;
        for (ZPair zpairResult1410 : ZVal.getIterable(this.loopListeners, env, true)) {
            listener = ZVal.assign(zpairResult1410.getValue());
            env.callMethod(listener, "beforeLoop", Shell.class, this);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    public Object onInput(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object listeners = null;
        Object _pReturn = null;
        for (ZPair zpairResult1411 : ZVal.getIterable(this.loopListeners, env, true)) {
            listeners = ZVal.assign(zpairResult1411.getValue());
            if (ZVal.strictNotEqualityCheck(
                    _pReturn = env.callMethod(listeners, "onInput", Shell.class, this, input),
                    "!==",
                    ZVal.getNull())) {
                input = ZVal.assign(_pReturn);
            }
        }

        return ZVal.assign(input);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    public Object onExecute(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object listener = null;
        Object _pReturn = null;
        for (ZPair zpairResult1412 : ZVal.getIterable(this.loopListeners, env, true)) {
            listener = ZVal.assign(zpairResult1412.getValue());
            if (ZVal.strictNotEqualityCheck(
                    _pReturn = env.callMethod(listener, "onExecute", Shell.class, this, code),
                    "!==",
                    ZVal.getNull())) {
                code = ZVal.assign(_pReturn);
            }
        }

        return ZVal.assign(code);
    }

    @ConvertedMethod
    public Object afterLoop(RuntimeEnv env, Object... args) {
        Object listener = null;
        for (ZPair zpairResult1413 : ZVal.getIterable(this.loopListeners, env, true)) {
            listener = ZVal.assign(zpairResult1413.getValue());
            env.callMethod(listener, "afterLoop", Shell.class, this);
        }

        return null;
    }

    @ConvertedMethod
    protected Object afterRun(RuntimeEnv env, Object... args) {
        Object listener = null;
        for (ZPair zpairResult1414 : ZVal.getIterable(this.loopListeners, env, true)) {
            listener = ZVal.assign(zpairResult1414.getValue());
            env.callMethod(listener, "afterRun", Shell.class, this);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "vars", typeHint = "array")
    public Object setScopeVariables(RuntimeEnv env, Object... args) {
        Object vars = assignParameter(args, 0, false);
        env.callMethod(this.context, "setAll", Shell.class, vars);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "includeBoundObject",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getScopeVariables(RuntimeEnv env, Object... args) {
        Object includeBoundObject = assignParameter(args, 0, true);
        if (null == includeBoundObject) {
            includeBoundObject = true;
        }
        ReferenceContainer vars = new BasicReferenceContainer(null);
        vars.setObject(env.callMethod(this.context, "getAll", Shell.class));
        if (!ZVal.isTrue(includeBoundObject)) {
            arrayActionR(ArrayAction.UNSET, vars, env, "this");
        }

        return ZVal.assign(vars.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "includeBoundObject",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object getSpecialScopeVariables(RuntimeEnv env, Object... args) {
        Object includeBoundObject = assignParameter(args, 0, true);
        if (null == includeBoundObject) {
            includeBoundObject = true;
        }
        ReferenceContainer vars = new BasicReferenceContainer(null);
        vars.setObject(env.callMethod(this.context, "getSpecialVariables", Shell.class));
        if (!ZVal.isTrue(includeBoundObject)) {
            arrayActionR(ArrayAction.UNSET, vars, env, "this");
        }

        return ZVal.assign(vars.getObject());
    }

    @ConvertedMethod
    public Object getUnusedCommandScopeVariableNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(this.context, "getUnusedCommandScopeVariableNames", Shell.class));
    }

    @ConvertedMethod
    public Object getScopeVariableNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_keys
                        .f
                        .env(env)
                        .call(env.callMethod(this.context, "getAll", Shell.class))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object getScopeVariable(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.context, "get", Shell.class, name));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "boundObject")
    public Object setBoundObject(RuntimeEnv env, Object... args) {
        Object boundObject = assignParameter(args, 0, false);
        env.callMethod(this.context, "setBoundObject", Shell.class, boundObject);
        return null;
    }

    @ConvertedMethod
    public Object getBoundObject(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.context, "getBoundObject", Shell.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "boundClass")
    public Object setBoundClass(RuntimeEnv env, Object... args) {
        Object boundClass = assignParameter(args, 0, false);
        env.callMethod(this.context, "setBoundClass", Shell.class, boundClass);
        return null;
    }

    @ConvertedMethod
    public Object getBoundClass(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.context, "getBoundClass", Shell.class));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "includes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object setIncludes(RuntimeEnv env, Object... args) {
        Object includes = assignParameter(args, 0, true);
        if (null == includes) {
            includes = ZVal.newArray();
        }
        this.includes = includes;
        return null;
    }

    @ConvertedMethod
    public Object getIncludes(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_array_merge
                        .f
                        .env(env)
                        .call(
                                env.callMethod(this.config, "getDefaultIncludes", Shell.class),
                                this.includes)
                        .value());
    }

    @ConvertedMethod
    public Object hasCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isEmpty(this.codeBuffer));
    }

    @ConvertedMethod
    protected Object hasValidCode(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                ZVal.toBool(!ZVal.isTrue(this.codeBufferOpen))
                        && ZVal.toBool(ZVal.strictNotEqualityCheck(this.code, "!==", false)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(
        index = 1,
        name = "silent",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object addCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object silent = assignParameter(args, 1, true);
        if (null == silent) {
            silent = false;
        }
        Object e = null;
        try {
            if (ZVal.strictEqualityCheck(
                    function_substr
                            .f
                            .env(env)
                            .call(function_rtrim.f.env(env).call(code).value(), -1)
                            .value(),
                    "===",
                    "\\")) {
                this.codeBufferOpen = true;
                code =
                        function_substr
                                .f
                                .env(env)
                                .call(function_rtrim.f.env(env).call(code).value(), 0, -1)
                                .value();

            } else {
                this.codeBufferOpen = false;
            }

            new ReferenceClassProperty(this, "codeBuffer", env)
                    .arrayAppend(env)
                    .set(ZVal.isTrue(silent) ? new SilentInput(env, code) : code);
            this.code =
                    env.callMethod(
                            this.cleaner,
                            "clean",
                            Shell.class,
                            this.codeBuffer,
                            env.callMethod(this.config, "requireSemicolons", Shell.class));
        } catch (ConvertedException convertedException197) {
            if (convertedException197.instanceOf(PHPException.class, "Exception")) {
                e = convertedException197.getObject();
                this.addCodeBufferToHistory(env);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException197;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(
        index = 1,
        name = "silent",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object setCode(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object silent = assignParameter(args, 1, true);
        if (null == silent) {
            silent = false;
        }
        Object e = null;
        if (ZVal.isTrue(this.hasCode(env))) {
            new ReferenceClassProperty(this, "codeStack", env)
                    .arrayAppend(env)
                    .set(
                            ZVal.newArray(
                                    new ZPair(0, this.codeBuffer),
                                    new ZPair(1, this.codeBufferOpen),
                                    new ZPair(2, this.code)));
        }

        this.resetCodeBuffer(env);
        try {
            this.addCode(env, code, silent);
        } catch (ConvertedException convertedException198) {
            if (convertedException198.instanceOf(Throwable.class, "Throwable")) {
                e = convertedException198.getObject();
                this.popCodeStack(env);
                throw ZVal.getException(env, e);
            } else if (convertedException198.instanceOf(PHPException.class, "Exception")) {
                e = convertedException198.getObject();
                this.popCodeStack(env);
                throw ZVal.getException(env, e);
            } else {
                throw convertedException198;
            }
        }

        if (!ZVal.isTrue(this.hasValidCode(env))) {
            this.popCodeStack(env);
            throw ZVal.getException(
                    env, new InvalidArgumentException(env, "Unexpected end of input"));
        }

        return null;
    }

    @ConvertedMethod
    public Object getCodeBuffer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.codeBuffer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    protected Object runCommand(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object helpCommand = null;
        Object command = null;
        command = this.getCommand(env, input);
        if (ZVal.isEmpty(command)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Command not found: " + toStringR(input, env)));
        }

        input =
                new ShellInput(
                        env,
                        function_str_replace
                                .f
                                .env(env)
                                .call(
                                        "\\",
                                        "\\\\",
                                        function_rtrim
                                                .f
                                                .env(env)
                                                .call(input, " \t\n\r\u0000\u000B;")
                                                .value())
                                .value());
        if (ZVal.isTrue(
                env.callMethod(
                        input,
                        "hasParameterOption",
                        Shell.class,
                        ZVal.arrayFromList("--help", "-h")))) {
            helpCommand = env.callMethod(this, "get", Shell.class, "help");
            env.callMethod(helpCommand, "setCommand", Shell.class, command);
            return ZVal.assign(env.callMethod(helpCommand, "run", Shell.class, input, this.output));
        }

        return ZVal.assign(env.callMethod(command, "run", Shell.class, input, this.output));
    }

    @ConvertedMethod
    public Object resetCodeBuffer(RuntimeEnv env, Object... args) {
        this.codeBuffer = ZVal.newArray();
        this.code = false;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    @ConvertedParameter(
        index = 1,
        name = "silent",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object addInput(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object silent = assignParameter(args, 1, true);
        if (null == silent) {
            silent = false;
        }
        Object line = null;
        for (ZPair zpairResult1415 : ZVal.getIterable(rToArrayCast(input), env, true)) {
            line = ZVal.assign(zpairResult1415.getValue());
            new ReferenceClassProperty(this, "inputBuffer", env)
                    .arrayAppend(env)
                    .set(ZVal.isTrue(silent) ? new SilentInput(env, line) : line);
        }

        return null;
    }

    @ConvertedMethod
    public Object flushCode(RuntimeEnv env, Object... args) {
        Object code = null;
        if (ZVal.isTrue(this.hasValidCode(env))) {
            this.addCodeBufferToHistory(env);
            code = ZVal.assign(this.code);
            this.popCodeStack(env);
            return ZVal.assign(code);
        }

        return null;
    }

    @ConvertedMethod
    private Object popCodeStack(RuntimeEnv env, Object... args) {
        Object runtimeTempArrayResult157 = null;
        Object codeBuffer = null;
        Object code = null;
        Object codeBufferOpen = null;
        this.resetCodeBuffer(env);
        if (ZVal.isEmpty(this.codeStack)) {
            return null;
        }

        ZVal.list(
                runtimeTempArrayResult157 =
                        function_array_pop.f.env(env).call(this.codeStack).value(),
                (codeBuffer = listGet(runtimeTempArrayResult157, 0, env)),
                (codeBufferOpen = listGet(runtimeTempArrayResult157, 1, env)),
                (code = listGet(runtimeTempArrayResult157, 2, env)));
        this.codeBuffer = codeBuffer;
        this.codeBufferOpen = codeBufferOpen;
        this.code = code;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "line")
    private Object addHistory(RuntimeEnv env, Object... args) {
        Object line = assignParameter(args, 0, false);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(line, SilentInput.class, "Psy\\Input\\SilentInput"))) {
            return null;
        }

        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_trim.f.env(env).call(line).value(), "!==", ""))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                function_substr.f.env(env).call(line, 0, 1).value(), "!==", " "))) {
            env.callMethod(this.readline, "addHistory", Shell.class, line);
        }

        return null;
    }

    @ConvertedMethod
    private Object addCodeBufferToHistory(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/psy/psysh/src")
                        .setFile("/vendor/psy/psysh/src/Shell.php");
        Object codeBuffer = null;
        codeBuffer =
                function_array_filter
                        .f
                        .env(env)
                        .call(
                                this.codeBuffer,
                                new Closure(
                                        env, runtimeConverterFunctionClassConstants, "Psy", this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "line")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object line = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                !ZVal.isTrue(
                                                        ZVal.checkInstanceType(
                                                                line,
                                                                SilentInput.class,
                                                                "Psy\\Input\\SilentInput")));
                                    }
                                })
                        .value();
        this.addHistory(env, NamespaceGlobal.implode.env(env).call("\n", codeBuffer).value());
        return null;
    }

    @ConvertedMethod
    public Object getNamespace(RuntimeEnv env, Object... args) {
        Object namespace = null;
        if (ZVal.isTrue(namespace = env.callMethod(this.cleaner, "getNamespace", Shell.class))) {
            return ZVal.assign(NamespaceGlobal.implode.env(env).call("\\", namespace).value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "out")
    @ConvertedParameter(index = 1, name = "phase")
    public Object writeStdout(RuntimeEnv env, Object... args) {
        Object out = assignParameter(args, 0, false);
        Object phase = assignParameter(args, 1, true);
        if (null == phase) {
            phase = 8;
        }
        Object isCleaning = null;
        isCleaning = ZVal.toLong(phase) & ZVal.toLong(2);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(out, "!==", ""))
                && ZVal.toBool(!ZVal.isTrue(isCleaning))) {
            env.callMethod(
                    this.output, "write", Shell.class, out, false, ShellOutput.CONST_OUTPUT_RAW);
            this.outputWantsNewline =
                    ZVal.strictNotEqualityCheck(
                            function_substr.f.env(env).call(out, -1).value(), "!==", "\n");
            this.stdoutBuffer = toStringR(this.stdoutBuffer, env) + toStringR(out, env);
        }

        if (ZVal.isTrue(ZVal.toLong(phase) & ZVal.toLong(8))) {
            if (ZVal.isTrue(this.outputWantsNewline)) {
                env.callMethod(
                        this.output,
                        "writeln",
                        Shell.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "<aside>%s</aside>",
                                        ZVal.isTrue(
                                                        env.callMethod(
                                                                this.config,
                                                                "useUnicode",
                                                                Shell.class))
                                                ? "\u23CE"
                                                : "\\n")
                                .value());
                this.outputWantsNewline = false;
            }

            if (ZVal.strictNotEqualityCheck(this.stdoutBuffer, "!==", "")) {
                env.callMethod(this.context, "setLastStdout", Shell.class, this.stdoutBuffer);
                this.stdoutBuffer = "";
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "ret")
    public Object writeReturnValue(RuntimeEnv env, Object... args) {
        Object ret = assignParameter(args, 0, false);
        Object indent = null;
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        ret, NoReturnValue.class, "Psy\\CodeCleaner\\NoReturnValue"))) {
            return null;
        }

        env.callMethod(this.context, "setReturnValue", Shell.class, ret);
        ret = this.presentValue(env, ret);
        indent =
                function_str_repeat
                        .f
                        .env(env)
                        .call(
                                " ",
                                function_strlen
                                        .f
                                        .env(env)
                                        .call(
                                                ClassConstantUtils.getConstantValueLateStatic(
                                                        env, this, "RETVAL"))
                                        .value())
                        .value();
        env.callMethod(
                this.output,
                "writeln",
                Shell.class,
                toStringR(ClassConstantUtils.getConstantValueLateStatic(env, this, "RETVAL"), env)
                        + toStringR(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "\n",
                                                toStringR("\n", env) + toStringR(indent, env),
                                                ret)
                                        .value(),
                                env));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    public Object writeException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        env.callMethod(this.context, "setLastException", Shell.class, e);
        env.callMethod(this.output, "writeln", Shell.class, this.formatException(env, e));
        this.resetCodeBuffer(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    public Object formatException(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object severity = null;
        Object message = null;
        message = env.callMethod(e, "getMessage", Shell.class);
        if (!ZVal.isTrue(ZVal.checkInstanceType(e, Exception.class, "Psy\\Exception\\Exception"))) {
            if (ZVal.strictEqualityCheck(message, "===", "")) {
                message = function_get_class.f.env(env).call(e).value();

            } else {
                message =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "%s with message '%s'",
                                        function_get_class.f.env(env).call(e).value(), message)
                                .value();
            }
        }

        message =
                function_preg_replace
                        .f
                        .env(env)
                        .call(
                                "#(\\w:)?(/\\w+)*/src/Execution(?:Loop)?Closure.php\\(\\d+\\) : eval\\(\\)'d code#",
                                "eval()'d code",
                                function_str_replace.f.env(env).call("\\", "/", message).value())
                        .value();
        message =
                function_str_replace
                        .f
                        .env(env)
                        .call(" in eval()'d code", " in Psy Shell code", message)
                        .value();
        severity =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                e,
                                                com.runtimeconverter
                                                        .runtime
                                                        .nativeClasses
                                                        .errors
                                                        .ErrorException
                                                        .class,
                                                "ErrorException"))
                                ? this.getSeverity(env, e)
                                : "error");
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "<%s>%s</%s>",
                                severity,
                                OutputFormatter.runtimeStaticObject.escape(env, message),
                                severity)
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "ErrorException")
    protected Object getSeverity(RuntimeEnv env, Object... args) {
        Object e = assignParameter(args, 0, false);
        Object severity = null;
        severity = env.callMethod(e, "getSeverity", Shell.class);
        if (ZVal.isTrue(
                ZVal.toLong(severity)
                        & ZVal.toLong(function_error_reporting.f.env(env).call().value()))) {
            SwitchEnumType79 switchVariable79 =
                    ZVal.getEnum(
                            severity,
                            SwitchEnumType79.DEFAULT_CASE,
                            SwitchEnumType79.DYNAMIC_TYPE_289,
                            2,
                            SwitchEnumType79.DYNAMIC_TYPE_290,
                            8,
                            SwitchEnumType79.DYNAMIC_TYPE_291,
                            32,
                            SwitchEnumType79.DYNAMIC_TYPE_292,
                            128,
                            SwitchEnumType79.DYNAMIC_TYPE_293,
                            512,
                            SwitchEnumType79.DYNAMIC_TYPE_294,
                            1024,
                            SwitchEnumType79.DYNAMIC_TYPE_295,
                            2048);
            switch (switchVariable79) {
                case DYNAMIC_TYPE_289:
                case DYNAMIC_TYPE_290:
                case DYNAMIC_TYPE_291:
                case DYNAMIC_TYPE_292:
                case DYNAMIC_TYPE_293:
                case DYNAMIC_TYPE_294:
                case DYNAMIC_TYPE_295:
                    return "warning";
                case DEFAULT_CASE:
                    return "error";
            }
            ;

        } else {
            return "warning";
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "code")
    @ConvertedParameter(
        index = 1,
        name = "throwExceptions",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object execute(RuntimeEnv env, Object... args) {
        Object code = assignParameter(args, 0, false);
        Object throwExceptions = assignParameter(args, 1, true);
        if (null == throwExceptions) {
            throwExceptions = false;
        }
        Object _e = null;
        Object closure = null;
        this.setCode(env, code, true);
        closure = new ExecutionClosure(env, this);
        if (ZVal.isTrue(throwExceptions)) {
            return ZVal.assign(env.callMethod(closure, "execute", Shell.class));
        }

        try {
            return ZVal.assign(env.callMethod(closure, "execute", Shell.class));
        } catch (ConvertedException convertedException199) {
            if (convertedException199.instanceOf(TypeError.class, "TypeError")) {
                _e = convertedException199.getObject();
                this.writeException(
                        env, TypeErrorException.runtimeStaticObject.fromTypeError(env, _e));
            } else if (convertedException199.instanceOf(PHPError.class, "Error")) {
                _e = convertedException199.getObject();
                this.writeException(
                        env,
                        com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces
                                .Exception.classes.ErrorException.runtimeStaticObject.fromError(
                                env, _e));
            } else if (convertedException199.instanceOf(PHPException.class, "Exception")) {
                _e = convertedException199.getObject();
                this.writeException(env, _e);
            } else {
                throw convertedException199;
            }
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "errno")
    @ConvertedParameter(index = 1, name = "errstr")
    @ConvertedParameter(index = 2, name = "errfile")
    @ConvertedParameter(index = 3, name = "errline")
    public Object handleError(RuntimeEnv env, Object... args) {
        Object errno = assignParameter(args, 0, false);
        Object errstr = assignParameter(args, 1, false);
        Object errfile = assignParameter(args, 2, false);
        Object errline = assignParameter(args, 3, false);
        if (ZVal.isTrue(
                ZVal.toLong(errno)
                        & ZVal.toLong(function_error_reporting.f.env(env).call().value()))) {
            com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes
                    .ErrorException.runtimeStaticObject.throwException(
                    env, errno, errstr, errfile, errline);

        } else if (ZVal.isTrue(
                ZVal.toLong(errno)
                        & ZVal.toLong(
                                env.callMethod(this.config, "errorLoggingLevel", Shell.class)))) {
            this.writeException(
                    env,
                    new com.project
                            .convertedCode
                            .globalNamespace
                            .namespaces
                            .Psy
                            .namespaces
                            .Exception
                            .classes
                            .ErrorException(env, errstr, 0, errno, errfile, errline));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "val")
    protected Object presentValue(RuntimeEnv env, Object... args) {
        Object val = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.config, "getPresenter", Shell.class),
                        "present",
                        Shell.class,
                        val));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    protected Object getCommand(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object name = null;
        input = new StringInput(env, input);
        if (ZVal.isTrue(name = env.callMethod(input, "getFirstArgument", Shell.class))) {
            return ZVal.assign(env.callMethod(this, "get", Shell.class, name));
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "input")
    protected Object hasCommand(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        ReferenceContainer match = new BasicReferenceContainer(null);
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, match))
                .call(
                        "/([^\\s]+?)(?:\\s|$)/A",
                        function_ltrim.f.env(env).call(input).value(),
                        match.getObject())
                .getBool()) {
            return ZVal.assign(env.callMethod(this, "has", Shell.class, match.arrayGet(env, 1)));
        }

        return ZVal.assign(false);
    }

    @ConvertedMethod
    protected Object getPrompt(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        if (ZVal.isTrue(this.hasCode(env))) {
            return ZVal.assign(
                    ClassConstantUtils.getConstantValueLateStatic(env, this, "BUFF_PROMPT"));
        }

        return ZVal.assign(
                ZVal.isTrue(
                                ternaryExpressionTemp =
                                        env.callMethod(this.config, "getPrompt", Shell.class))
                        ? ternaryExpressionTemp
                        : ClassConstantUtils.getConstantValueLateStatic(env, this, "PROMPT"));
    }

    @ConvertedMethod
    protected Object readline(RuntimeEnv env, Object... args) {
        Object line = null;
        Object bracketedPaste = null;
        if (!ZVal.isEmpty(this.inputBuffer)) {
            line = function_array_shift.f.env(env).call(this.inputBuffer).value();
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(line, SilentInput.class, "Psy\\Input\\SilentInput"))) {
                env.callMethod(
                        this.output,
                        "writeln",
                        Shell.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "<aside>%s %s</aside>",
                                        ClassConstantUtils.getConstantValueLateStatic(
                                                env, this, "REPLAY"),
                                        OutputFormatter.runtimeStaticObject.escape(env, line))
                                .value());
            }

            return ZVal.assign(line);
        }

        if (ZVal.isTrue(
                bracketedPaste = env.callMethod(this.config, "useBracketedPaste", Shell.class))) {
            NamespaceGlobal.printf.env(env).call("\u001B[?2004h");
        }

        line = env.callMethod(this.readline, "readline", Shell.class, this.getPrompt(env));
        if (ZVal.isTrue(bracketedPaste)) {
            NamespaceGlobal.printf.env(env).call("\u001B[?2004l");
        }

        return ZVal.assign(line);
    }

    @ConvertedMethod
    protected Object getHeader(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call("<aside>%s by Justin Hileman</aside>", this.getVersion(env))
                        .value());
    }

    @ConvertedMethod
    public Object getVersion(RuntimeEnv env, Object... args) {
        Object separator = null;
        separator =
                ZVal.assign(
                        ZVal.isTrue(env.callMethod(this.config, "useUnicode", Shell.class))
                                ? "\u2014"
                                : "-");
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "Psy Shell %s (PHP %s %s %s)",
                                CONST_VERSION,
                                NamespaceGlobal.phpversion.env(env).call().value(),
                                separator,
                                function_php_sapi_name.f.env(env).call().value())
                        .value());
    }

    @ConvertedMethod
    public Object getManualDb(RuntimeEnv env, Object... args) {
        return ZVal.assign(env.callMethod(this.config, "getManualDb", Shell.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "text")
    protected Object autocomplete(RuntimeEnv env, Object... args) {
        Object text = assignParameter(args, 0, false);
        NamespaceGlobal.trigger_error
                .env(env)
                .call("Tab completion is provided by the AutoCompleter service", 16384)
                .value();
        return null;
    }

    @ConvertedMethod
    protected Object initializeTabCompletion(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(env.callMethod(this.config, "useTabCompletion", Shell.class))) {
            return null;
        }

        this.autoCompleter = env.callMethod(this.config, "getAutoCompleter", Shell.class);
        this.addMatchersToAutoCompleter(env, this.getDefaultMatchers(env));
        this.addMatchersToAutoCompleter(env, this.matchers);
        env.callMethod(this.autoCompleter, "activate", Shell.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "matchers", typeHint = "array")
    private Object addMatchersToAutoCompleter(RuntimeEnv env, Object... args) {
        Object matchers = assignParameter(args, 0, false);
        Object matcher = null;
        for (ZPair zpairResult1416 : ZVal.getIterable(matchers, env, true)) {
            matcher = ZVal.assign(zpairResult1416.getValue());
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(matcher, ContextAware.class, "Psy\\ContextAware"))) {
                env.callMethod(matcher, "setContext", Shell.class, this.context);
            }

            env.callMethod(this.autoCompleter, "addMatcher", Shell.class, matcher);
        }

        return null;
    }

    @ConvertedMethod
    protected Object writeVersionInfo(RuntimeEnv env, Object... args) {
        Object e = null;
        Object client = null;
        if (ZVal.strictNotEqualityCheck("cli", "!==", "cli")) {
            return null;
        }

        try {
            client = env.callMethod(this.config, "getChecker", Shell.class);
            if (!ZVal.isTrue(env.callMethod(client, "isLatest", Shell.class))) {
                env.callMethod(
                        this.output,
                        "writeln",
                        Shell.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "New version is available (current: %s, latest: %s)",
                                        CONST_VERSION,
                                        env.callMethod(client, "getLatest", Shell.class))
                                .value());
            }

        } catch (ConvertedException convertedException200) {
            if (convertedException200.instanceOf(
                    InvalidArgumentException.class, "InvalidArgumentException")) {
                e = convertedException200.getObject();
                env.callMethod(
                        this.output,
                        "writeln",
                        Shell.class,
                        env.callMethod(e, "getMessage", Shell.class));
            } else {
                throw convertedException200;
            }
        }

        return null;
    }

    @ConvertedMethod
    protected Object writeStartupMessage(RuntimeEnv env, Object... args) {
        Object message = null;
        message = env.callMethod(this.config, "getStartupMessage", Shell.class);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(message, "!==", ZVal.getNull()))
                && ZVal.toBool(ZVal.strictNotEqualityCheck(message, "!==", ""))) {
            env.callMethod(this.output, "writeln", Shell.class, message);
        }

        return null;
    }

    public static final Object CONST_VERSION = "v0.9.6";

    public static final Object CONST_PROMPT = ">>> ";

    public static final Object CONST_BUFF_PROMPT = "... ";

    public static final Object CONST_REPLAY = "--> ";

    public static final Object CONST_RETVAL = "=> ";

    public static final Object CONST_class = "Psy\\Shell";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Application.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "trace", typeHint = "array")
        public Object isIncluded(RuntimeEnv env, Object... args) {
            ReferenceContainer trace = new BasicReferenceContainer(assignParameter(args, 0, false));
            return ZVal.assign(
                    ZVal.toBool(arrayActionR(ArrayAction.ISSET, trace, env, 0, "function"))
                            && ZVal.toBool(
                                    function_in_array
                                            .f
                                            .env(env)
                                            .call(
                                                    trace.arrayGet(env, 0, "function"),
                                                    ZVal.arrayFromList(
                                                            "require",
                                                            "include",
                                                            "require_once",
                                                            "include_once"))
                                            .value()));
        }

        @ConvertedMethod
        @ConvertedParameter(
            index = 0,
            name = "vars",
            typeHint = "array",
            defaultValue = "",
            defaultValueType = "array"
        )
        @ConvertedParameter(
            index = 1,
            name = "bindTo",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object debug(RuntimeEnv env, Object... args) {
            Object vars = assignParameter(args, 0, true);
            if (null == vars) {
                vars = ZVal.newArray();
            }
            Object bindTo = assignParameter(args, 1, true);
            if (null == bindTo) {
                bindTo = ZVal.getNull();
            }
            return ZVal.assign(debug.f.env(env).call(vars, bindTo).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Shell")
                    .setLookup(
                            Shell.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "autoCompleter",
                            "autoExit",
                            "catchExceptions",
                            "cleaner",
                            "code",
                            "codeBuffer",
                            "codeBufferOpen",
                            "codeStack",
                            "commandLoader",
                            "commands",
                            "commandsMatcher",
                            "config",
                            "context",
                            "defaultCommand",
                            "definition",
                            "dispatcher",
                            "helperSet",
                            "includes",
                            "initialized",
                            "inputBuffer",
                            "loop",
                            "loopListeners",
                            "matchers",
                            "name",
                            "output",
                            "outputWantsNewline",
                            "prompt",
                            "readline",
                            "runningCommand",
                            "singleCommand",
                            "stdoutBuffer",
                            "terminal",
                            "version",
                            "wantHelps")
                    .setFilename("vendor/psy/psysh/src/Shell.php")
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

    private enum SwitchEnumType79 {
        DYNAMIC_TYPE_289,
        DYNAMIC_TYPE_290,
        DYNAMIC_TYPE_291,
        DYNAMIC_TYPE_292,
        DYNAMIC_TYPE_293,
        DYNAMIC_TYPE_294,
        DYNAMIC_TYPE_295,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
