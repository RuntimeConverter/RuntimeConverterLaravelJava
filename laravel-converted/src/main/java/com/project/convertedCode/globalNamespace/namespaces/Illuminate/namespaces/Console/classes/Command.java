package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.BadMethodCallException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.ArrayInput;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.OutputStyle;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatterStyle;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.Question;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.ChoiceQuestion;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Support.classes.Arrayable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Table;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Console.classes.Parser;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_int;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.NullOutput;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Console/Command.php

*/

public class Command
        extends com.project
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
                .Command {

    public Object laravel = null;

    public Object input = null;

    public Object output = null;

    public Object signature = null;

    public Object verbosity = OutputInterface.CONST_VERBOSITY_NORMAL;

    public Object verbosityMap =
            ZVal.newArray(
                    new ZPair("v", OutputInterface.CONST_VERBOSITY_VERBOSE),
                    new ZPair("vv", OutputInterface.CONST_VERBOSITY_VERY_VERBOSE),
                    new ZPair("vvv", OutputInterface.CONST_VERBOSITY_DEBUG),
                    new ZPair("quiet", OutputInterface.CONST_VERBOSITY_QUIET),
                    new ZPair("normal", OutputInterface.CONST_VERBOSITY_NORMAL));

    public Command(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = null;
        this.description = null;
        this.hidden = false;
        if (this.getClass() == Command.class) {
            this.__construct(env, args);
        }
    }

    public Command(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        if (ZVal.isset(this.signature)) {
            this.configureUsingFluentDefinition(env);

        } else {
            super.__construct(env, this.name);
        }

        env.callMethod(this, "setDescription", Command.class, this.description);
        env.callMethod(this, "setHidden", Command.class, this.hidden);
        if (!ZVal.isset(this.signature)) {
            this.specifyParameters(env);
        }

        return null;
    }

    @ConvertedMethod
    protected Object configureUsingFluentDefinition(RuntimeEnv env, Object... args) {
        Object argument = null;
        Object name = null;
        Object options = null;
        Object runtimeTempArrayResult13 = null;
        Object arguments = null;
        Object option = null;
        ZVal.list(
                runtimeTempArrayResult13 = Parser.runtimeStaticObject.parse(env, this.signature),
                (name = listGet(runtimeTempArrayResult13, 0, env)),
                (arguments = listGet(runtimeTempArrayResult13, 1, env)),
                (options = listGet(runtimeTempArrayResult13, 2, env)));
        super.__construct(env, this.name = name);
        for (ZPair zpairResult221 : ZVal.getIterable(arguments, env, true)) {
            argument = ZVal.assign(zpairResult221.getValue());
            env.callMethod(
                    env.callMethod(this, "getDefinition", Command.class),
                    "addArgument",
                    Command.class,
                    argument);
        }

        for (ZPair zpairResult222 : ZVal.getIterable(options, env, true)) {
            option = ZVal.assign(zpairResult222.getValue());
            env.callMethod(
                    env.callMethod(this, "getDefinition", Command.class),
                    "addOption",
                    Command.class,
                    option);
        }

        return null;
    }

    @ConvertedMethod
    protected Object specifyParameters(RuntimeEnv env, Object... args) {
        Object options = null;
        Object arguments = null;
        for (ZPair zpairResult223 : ZVal.getIterable(this.getArguments(env), env, true)) {
            arguments = ZVal.assign(zpairResult223.getValue());
            function_call_user_func_array
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(
                            ZVal.newArray(new ZPair(0, this), new ZPair(1, "addArgument")),
                            arguments);
        }

        for (ZPair zpairResult224 : ZVal.getIterable(this.getOptions(env), env, true)) {
            options = ZVal.assign(zpairResult224.getValue());
            function_call_user_func_array
                    .f
                    .env(env)
                    .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                    .call(ZVal.newArray(new ZPair(0, this), new ZPair(1, "addOption")), options);
        }

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
    public Object run(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        return ZVal.assign(
                super.run(
                        env,
                        this.input = input,
                        this.output = new OutputStyle(env, input, output)));
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
    protected Object execute(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        return ZVal.assign(
                env.callMethod(
                        this.laravel,
                        "call",
                        Command.class,
                        ZVal.newArray(new ZPair(0, this), new ZPair(1, "handle"))));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object call(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        ReferenceContainer arguments = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == arguments.getObject()) {
            arguments.setObject(ZVal.newArray());
        }
        arguments.arrayAccess(env, "command").set(command);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "getApplication", Command.class),
                                "find",
                                Command.class,
                                command),
                        "run",
                        Command.class,
                        this.createInputFromArguments(env, arguments.getObject()),
                        this.output));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "command")
    @ConvertedParameter(
        index = 1,
        name = "arguments",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object callSilent(RuntimeEnv env, Object... args) {
        Object command = assignParameter(args, 0, false);
        ReferenceContainer arguments = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == arguments.getObject()) {
            arguments.setObject(ZVal.newArray());
        }
        arguments.arrayAccess(env, "command").set(command);
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "getApplication", Command.class),
                                "find",
                                Command.class,
                                command),
                        "run",
                        Command.class,
                        this.createInputFromArguments(env, arguments.getObject()),
                        new NullOutput(env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "arguments", typeHint = "array")
    protected Object createInputFromArguments(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/laravel/framework/src/Illuminate/Console")
                        .setFile("/vendor/laravel/framework/src/Illuminate/Console/Command.php");
        Object arguments = assignParameter(args, 0, false);
        return ZVal.assign(
                tap.f
                        .env(env)
                        .call(
                                new ArrayInput(env, arguments),
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Console",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "input")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object input = assignParameter(args, 0, false);
                                        if (ZVal.isTrue(
                                                env.callMethod(
                                                        input,
                                                        "hasParameterOption",
                                                        Command.class,
                                                        ZVal.arrayFromList("--no-interaction"),
                                                        true))) {
                                            env.callMethod(
                                                    input, "setInteractive", Command.class, false);
                                        }

                                        return null;
                                    }
                                })
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasArgument(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.input, "hasArgument", Command.class, name));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object argument(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(key).getBool()) {
            return ZVal.assign(env.callMethod(this.input, "getArguments", Command.class));
        }

        return ZVal.assign(env.callMethod(this.input, "getArgument", Command.class, key));
    }

    @ConvertedMethod
    public Object arguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.argument(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public Object hasOption(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        return ZVal.assign(env.callMethod(this.input, "hasOption", Command.class, name));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "key",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object option(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, true);
        if (null == key) {
            key = ZVal.getNull();
        }
        if (function_is_null.f.env(env).call(key).getBool()) {
            return ZVal.assign(env.callMethod(this.input, "getOptions", Command.class));
        }

        return ZVal.assign(env.callMethod(this.input, "getOption", Command.class, key));
    }

    @ConvertedMethod
    public Object options(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.option(env));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    public Object confirm(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = false;
        }
        return ZVal.assign(
                env.callMethod(this.output, "confirm", Command.class, question, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object ask(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(env.callMethod(this.output, "ask", Command.class, question, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(index = 1, name = "choices", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object anticipate(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object choices = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        return ZVal.assign(this.askWithCompletion(env, question, choices, _pDefault));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(index = 1, name = "choices", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object askWithCompletion(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object choices = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        question = new Question(env, question, _pDefault);
        env.callMethod(question, "setAutocompleterValues", Command.class, choices);
        return ZVal.assign(env.callMethod(this.output, "askQuestion", Command.class, question));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(
        index = 1,
        name = "fallback",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object secret(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object fallback = assignParameter(args, 1, true);
        if (null == fallback) {
            fallback = true;
        }
        question = new Question(env, question);
        env.callMethod(
                env.callMethod(question, "setHidden", Command.class, true),
                "setHiddenFallback",
                Command.class,
                fallback);
        return ZVal.assign(env.callMethod(this.output, "askQuestion", Command.class, question));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(index = 1, name = "choices", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "attempts",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 4,
        name = "multiple",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object choice(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object choices = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object attempts = assignParameter(args, 3, true);
        if (null == attempts) {
            attempts = ZVal.getNull();
        }
        Object multiple = assignParameter(args, 4, true);
        if (null == multiple) {
            multiple = ZVal.getNull();
        }
        question = new ChoiceQuestion(env, question, choices, _pDefault);
        env.callMethod(
                env.callMethod(question, "setMaxAttempts", Command.class, attempts),
                "setMultiselect",
                Command.class,
                multiple);
        return ZVal.assign(env.callMethod(this.output, "askQuestion", Command.class, question));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers")
    @ConvertedParameter(index = 1, name = "rows")
    @ConvertedParameter(index = 2, name = "tableStyle")
    @ConvertedParameter(
        index = 3,
        name = "columnStyles",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object table(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object rows = assignParameter(args, 1, false);
        Object tableStyle = assignParameter(args, 2, true);
        if (null == tableStyle) {
            tableStyle = "default";
        }
        Object columnStyles = assignParameter(args, 3, true);
        if (null == columnStyles) {
            columnStyles = ZVal.newArray();
        }
        Object columnIndex = null;
        Object table = null;
        Object columnStyle = null;
        table = new Table(env, this.output);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        rows, Arrayable.class, "Illuminate\\Contracts\\Support\\Arrayable"))) {
            rows = env.callMethod(rows, "toArray", Command.class);
        }

        env.callMethod(
                env.callMethod(
                        env.callMethod(table, "setHeaders", Command.class, rToArrayCast(headers)),
                        "setRows",
                        Command.class,
                        rows),
                "setStyle",
                Command.class,
                tableStyle);
        for (ZPair zpairResult225 : ZVal.getIterable(columnStyles, env, false)) {
            columnIndex = ZVal.assign(zpairResult225.getKey());
            columnStyle = ZVal.assign(zpairResult225.getValue());
            env.callMethod(table, "setColumnStyle", Command.class, columnIndex, columnStyle);
        }

        env.callMethod(table, "render", Command.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "verbosity",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object info(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object verbosity = assignParameter(args, 1, true);
        if (null == verbosity) {
            verbosity = ZVal.getNull();
        }
        this.line(env, string, "info", verbosity);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "style",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "verbosity",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object line(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object style = assignParameter(args, 1, true);
        if (null == style) {
            style = ZVal.getNull();
        }
        Object verbosity = assignParameter(args, 2, true);
        if (null == verbosity) {
            verbosity = ZVal.getNull();
        }
        Object styled = null;
        styled =
                ZVal.assign(
                        ZVal.isTrue(style)
                                ? "<"
                                        + toStringR(style, env)
                                        + ">"
                                        + toStringR(string, env)
                                        + "</"
                                        + toStringR(style, env)
                                        + ">"
                                : string);
        env.callMethod(
                this.output, "writeln", Command.class, styled, this.parseVerbosity(env, verbosity));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "verbosity",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object comment(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object verbosity = assignParameter(args, 1, true);
        if (null == verbosity) {
            verbosity = ZVal.getNull();
        }
        this.line(env, string, "comment", verbosity);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "verbosity",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object question(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object verbosity = assignParameter(args, 1, true);
        if (null == verbosity) {
            verbosity = ZVal.getNull();
        }
        this.line(env, string, "question", verbosity);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "verbosity",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object error(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object verbosity = assignParameter(args, 1, true);
        if (null == verbosity) {
            verbosity = ZVal.getNull();
        }
        this.line(env, string, "error", verbosity);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    @ConvertedParameter(
        index = 1,
        name = "verbosity",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object warn(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object verbosity = assignParameter(args, 1, true);
        if (null == verbosity) {
            verbosity = ZVal.getNull();
        }
        Object style = null;
        if (!ZVal.isTrue(
                env.callMethod(
                        env.callMethod(this.output, "getFormatter", Command.class),
                        "hasStyle",
                        Command.class,
                        "warning"))) {
            style = new OutputFormatterStyle(env, "yellow");
            env.callMethod(
                    env.callMethod(this.output, "getFormatter", Command.class),
                    "setStyle",
                    Command.class,
                    "warning",
                    style);
        }

        this.line(env, string, "warning", verbosity);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "string")
    public Object alert(RuntimeEnv env, Object... args) {
        Object string = assignParameter(args, 0, false);
        Object length = null;
        length =
                ZVal.add(
                        Str.runtimeStaticObject.length(
                                env, NamespaceGlobal.strip_tags.env(env).call(string).value()),
                        12);
        this.comment(env, function_str_repeat.f.env(env).call("*", length).value());
        this.comment(env, "*     " + toStringR(string, env) + "     *");
        this.comment(env, function_str_repeat.f.env(env).call("*", length).value());
        env.callMethod(this.output, "newLine", Command.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "level")
    protected Object setVerbosity(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, false);
        this.verbosity = this.parseVerbosity(env, level);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "level",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    protected Object parseVerbosity(RuntimeEnv env, Object... args) {
        Object level = assignParameter(args, 0, true);
        if (null == level) {
            level = ZVal.getNull();
        }
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "verbosityMap", env),
                env,
                level)) {
            level =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "verbosityMap", env)
                                    .arrayGet(env, level));

        } else if (!function_is_int.f.env(env).call(level).getBool()) {
            level = ZVal.assign(this.verbosity);
        }

        return ZVal.assign(level);
    }

    @ConvertedMethod
    protected Object getArguments(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    protected Object getOptions(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    public Object getOutput(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.output);
    }

    @ConvertedMethod
    public Object getLaravel(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.laravel);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "laravel")
    public Object setLaravel(RuntimeEnv env, Object... args) {
        Object laravel = assignParameter(args, 0, false);
        this.laravel = laravel;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "method")
    @ConvertedParameter(index = 1, name = "parameters")
    public Object __call(RuntimeEnv env, Object... args) {
        ReferenceContainer method = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object parameters = assignParameter(args, 1, false);
        Object macro = null;
        if (!ZVal.isTrue(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Command.class)
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
                                                .Console
                                                .classes
                                                .Command
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
                                            Command.class,
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

    public static final Object CONST_class = "Illuminate\\Console\\Command";

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
                    .namespaces
                    .Command
                    .classes
                    .Command
                    .RuntimeStaticCompanion {

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
                                    .Console
                                    .classes
                                    .Command
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
                            Command.class,
                            ZVal.toLong(256) | ZVal.toLong(512));
            for (ZPair zpairResult2280 : ZVal.getIterable(methods, env, true)) {
                method = ZVal.assign(zpairResult2280.getValue());
                env.callMethod(method, "setAccessible", Command.class, true);
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Command.class)
                        .method("macro")
                        .addReferenceArgs(new RuntimeArgsWithReferences())
                        .call(
                                toObjectR(method).accessProp(this, env).name("name").value(),
                                env.callMethod(method, "invoke", Command.class, mixin))
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
                                            .Console
                                            .classes
                                            .Command
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
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Command.class)
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
                                                    .Console
                                                    .classes
                                                    .Command
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
                                                                        .Console
                                                                        .classes
                                                                        .Command
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
                                                            .Console
                                                            .classes
                                                            .Command
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
                    .setName("Illuminate\\Console\\Command")
                    .setLookup(
                            Command.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "definition",
                            "description",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "hidden",
                            "ignoreValidationErrors",
                            "input",
                            "laravel",
                            "name",
                            "name",
                            "output",
                            "processTitle",
                            "signature",
                            "synopsis",
                            "usages",
                            "verbosity",
                            "verbosityMap")
                    .setStaticPropertyNames("macros")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Console/Command.php")
                    .addTrait("Illuminate\\Support\\Traits\\Macroable")
                    .addExtendsClass("Symfony\\Component\\Console\\Command\\Command")
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
