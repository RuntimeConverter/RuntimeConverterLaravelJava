package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.Configuration;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ConsoleColorFactory;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.ReflectingCommand;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionFunction;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes.SignatureFormatter;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeFunctions.file.function_is_file;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.CodeArgument;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.project.convertedCode.globalNamespace.namespaces.JakubOnderka.namespaces.PhpConsoleHighlighter.classes.Highlighter;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.ShellOutput;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Formatter.classes.CodeFormatter;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import com.runtimeconverter.runtime.nativeFunctions.file.function_dirname;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/ShowCommand.php

*/

public class ShowCommand extends ReflectingCommand {

    public Object colorMode = null;

    public Object highlighter = null;

    public Object lastException = null;

    public Object lastExceptionIndex = null;

    public ShowCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ShowCommand.class) {
            this.__construct(env, args);
        }
    }

    public ShowCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "colorMode",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object colorMode = assignParameter(args, 0, true);
        if (null == colorMode) {
            colorMode = ZVal.getNull();
        }
        Object ternaryExpressionTemp = null;
        this.colorMode =
                ZVal.isTrue(ternaryExpressionTemp = colorMode)
                        ? ternaryExpressionTemp
                        : Configuration.CONST_COLOR_MODE_AUTO;
        super.__construct(env);
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", ShowCommand.class, "show"),
                                "setDefinition",
                                ShowCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new CodeArgument(
                                                        env,
                                                        "target",
                                                        CodeArgument.CONST_OPTIONAL,
                                                        "Function, class, instance, constant, method or property to show.")),
                                        new ZPair(
                                                1,
                                                new InputOption(
                                                        env,
                                                        "ex",
                                                        ZVal.getNull(),
                                                        InputOption.CONST_VALUE_OPTIONAL,
                                                        "Show last exception context. Optionally specify a stack index.",
                                                        1)))),
                        "setDescription",
                        ShowCommand.class,
                        "Show the code for an object, class, constant, method or property."),
                "setHelp",
                ShowCommand.class,
                "Show the code for an object, class, constant, method or property, or the context\nof the last exception.\n\n<return>cat --ex</return> defaults to showing the lines surrounding the location of the last\nexception. Invoking it more than once travels up the exception's stack trace,\nand providing a number shows the context of the given index of the trace.\n\ne.g.\n<return>>>> show $myObject</return>\n<return>>>> show Psy\\Shell::debug</return>\n<return>>>> show --ex</return>\n<return>>>> show --ex 3</return>");
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
    protected Object execute(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        ReferenceContainer opts = new BasicReferenceContainer(null);
        opts.setObject(env.callMethod(input, "getOptions", ShowCommand.class));
        if (ZVal.strictNotEqualityCheck(opts.arrayGet(env, "ex"), "!==", 1)) {
            if (ZVal.isTrue(env.callMethod(input, "getArgument", ShowCommand.class, "target"))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Too many arguments (supply either \"target\" or \"--ex\")"));
            }

            return ZVal.assign(this.writeExceptionContext(env, input, output));
        }

        if (ZVal.isTrue(env.callMethod(input, "getArgument", ShowCommand.class, "target"))) {
            return ZVal.assign(this.writeCodeContext(env, input, output));
        }

        throw ZVal.getException(
                env, new RuntimeException(env, "Not enough arguments (missing: \"target\")"));
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
    private Object writeCodeContext(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object reflector = null;
        Object e = null;
        Object runtimeTempArrayResult150 = null;
        Object target = null;
        ZVal.list(
                runtimeTempArrayResult150 =
                        env.callMethod(
                                this,
                                "getTargetAndReflector",
                                ShowCommand.class,
                                env.callMethod(input, "getArgument", ShowCommand.class, "target")),
                (target = listGet(runtimeTempArrayResult150, 0, env)),
                (reflector = listGet(runtimeTempArrayResult150, 1, env)));
        env.callMethod(this, "setCommandScopeVariables", ShowCommand.class, reflector);
        try {
            env.callMethod(
                    output,
                    "page",
                    ShowCommand.class,
                    CodeFormatter.runtimeStaticObject.format(env, reflector, this.colorMode),
                    ShellOutput.CONST_OUTPUT_RAW);
        } catch (ConvertedException convertedException179) {
            if (convertedException179.instanceOf(
                    RuntimeException.class, "Psy\\Exception\\RuntimeException")) {
                e = convertedException179.getObject();
                env.callMethod(
                        output,
                        "writeln",
                        ShowCommand.class,
                        SignatureFormatter.runtimeStaticObject.format(env, reflector));
                throw ZVal.getException(env, e);
            } else {
                throw convertedException179;
            }
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
    private Object writeExceptionContext(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object exception = null;
        ReferenceContainer trace = new BasicReferenceContainer(null);
        ReferenceContainer opts = new BasicReferenceContainer(null);
        Object index = null;
        exception =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("context").value(),
                        "getLastException",
                        ShowCommand.class);
        if (ZVal.strictNotEqualityCheck(exception, "!==", this.lastException)) {
            this.lastException = ZVal.getNull();
            this.lastExceptionIndex = ZVal.getNull();
        }

        opts.setObject(env.callMethod(input, "getOptions", ShowCommand.class));
        if (ZVal.strictEqualityCheck(opts.arrayGet(env, "ex"), "===", ZVal.getNull())) {
            if (ZVal.toBool(this.lastException)
                    && ZVal.toBool(
                            ZVal.strictNotEqualityCheck(
                                    this.lastExceptionIndex, "!==", ZVal.getNull()))) {
                index = ZVal.add(this.lastExceptionIndex, 1);

            } else {
                index = 0;
            }

        } else {
            index =
                    NamespaceGlobal.max
                            .env(env)
                            .call(
                                    0,
                                    ZVal.subtract(
                                            NamespaceGlobal.intval
                                                    .env(env)
                                                    .call(
                                                            env.callMethod(
                                                                    input,
                                                                    "getOption",
                                                                    ShowCommand.class,
                                                                    "ex"))
                                                    .value(),
                                            1))
                            .value();
        }

        trace.setObject(env.callMethod(exception, "getTrace", ShowCommand.class));
        function_array_unshift
                .f
                .env(env)
                .call(
                        trace.getObject(),
                        ZVal.newArray(
                                new ZPair(
                                        "file",
                                        env.callMethod(exception, "getFile", ShowCommand.class)),
                                new ZPair(
                                        "line",
                                        env.callMethod(exception, "getLine", ShowCommand.class))));
        if (ZVal.isGreaterThanOrEqualTo(
                index, ">=", function_count.f.env(env).call(trace.getObject()).value())) {
            index = 0;
        }

        this.lastException = exception;
        this.lastExceptionIndex = index;
        env.callMethod(
                output,
                "writeln",
                ShowCommand.class,
                env.callMethod(
                        env.callMethod(this, "getApplication", ShowCommand.class),
                        "formatException",
                        ShowCommand.class,
                        exception));
        env.callMethod(output, "writeln", ShowCommand.class, "--");
        this.writeTraceLine(env, output, trace.getObject(), index);
        this.writeTraceCodeSnippet(env, output, trace.getObject(), index);
        this.setCommandScopeVariablesFromContext(env, trace.arrayGet(env, index));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(index = 1, name = "trace", typeHint = "array")
    @ConvertedParameter(index = 2, name = "index")
    private Object writeTraceLine(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        ReferenceContainer trace = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object index = assignParameter(args, 2, false);
        Object file = null;
        Object line = null;
        file =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, trace, env, index, "file")
                                ? this.replaceCwd(env, trace.arrayGet(env, index, "file"))
                                : "n/a");
        line =
                ZVal.assign(
                        arrayActionR(ArrayAction.ISSET, trace, env, index, "line")
                                ? trace.arrayGet(env, index, "line")
                                : "n/a");
        env.callMethod(
                output,
                "writeln",
                ShowCommand.class,
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "From <info>%s:%d</info> at <strong>level %d</strong> of backtrace (of %d).",
                                OutputFormatter.runtimeStaticObject.escape(env, file),
                                OutputFormatter.runtimeStaticObject.escape(env, line),
                                ZVal.add(index, 1),
                                function_count.f.env(env).call(trace.getObject()).value())
                        .value());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    private Object replaceCwd(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        Object cwd = null;
        if (ZVal.isTrue(cwd = function_getcwd.f.env(env).call().value())) {
            cwd =
                    toStringR(function_rtrim.f.env(env).call(cwd, "/").value(), env)
                            + toStringR("/", env);
        }

        if (ZVal.strictEqualityCheck(cwd, "===", false)) {
            return ZVal.assign(file);

        } else {
            return ZVal.assign(
                    function_preg_replace
                            .f
                            .env(env)
                            .call(
                                    "/^"
                                            + toStringR(
                                                    NamespaceGlobal.preg_quote
                                                            .env(env)
                                                            .call(cwd, "/")
                                                            .value(),
                                                    env)
                                            + "/",
                                    "",
                                    file)
                            .value());
        }
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(index = 1, name = "trace", typeHint = "array")
    @ConvertedParameter(index = 2, name = "index")
    private Object writeTraceCodeSnippet(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        ReferenceContainer trace = new BasicReferenceContainer(assignParameter(args, 1, false));
        Object index = assignParameter(args, 2, false);
        Object file = null;
        Object code = null;
        Object line = null;
        Object runtimeTempArrayResult151 = null;
        Object fileAndLine = null;
        if (!arrayActionR(ArrayAction.ISSET, trace, env, index, "file")) {
            return null;
        }

        file = ZVal.assign(trace.arrayGet(env, index, "file"));
        if (ZVal.isTrue(fileAndLine = this.extractEvalFileAndLine(env, file))) {
            ZVal.list(
                    runtimeTempArrayResult151 = fileAndLine,
                    (file = listGet(runtimeTempArrayResult151, 0, env)),
                    (line = listGet(runtimeTempArrayResult151, 1, env)));

        } else {
            if (!arrayActionR(ArrayAction.ISSET, trace, env, index, "line")) {
                return null;
            }

            line = ZVal.assign(trace.arrayGet(env, index, "line"));
        }

        if (function_is_file.f.env(env).call(file).getBool()) {
            code = function_file_get_contents.f.env(env).call(file).value();
        }

        if (ZVal.isEmpty(code)) {
            return null;
        }

        env.callMethod(
                output,
                "write",
                ShowCommand.class,
                env.callMethod(
                        this.getHighlighter(env),
                        "getCodeSnippet",
                        ShowCommand.class,
                        code,
                        line,
                        5,
                        5),
                ShellOutput.CONST_OUTPUT_RAW);
        return null;
    }

    @ConvertedMethod
    private Object getHighlighter(RuntimeEnv env, Object... args) {
        Object factory = null;
        if (!ZVal.isTrue(this.highlighter)) {
            factory = new ConsoleColorFactory(env, this.colorMode);
            this.highlighter =
                    new Highlighter(
                            env, env.callMethod(factory, "getConsoleColor", ShowCommand.class));
        }

        return ZVal.assign(this.highlighter);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "array")
    private Object setCommandScopeVariablesFromContext(RuntimeEnv env, Object... args) {
        ReferenceContainer context = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object file = null;
        Object e = null;
        Object line = null;
        Object namespace = null;
        ReferenceContainer vars = new BasicReferenceContainer(null);
        Object refl = null;
        Object fileAndLine = null;
        Object runtimeTempArrayResult152 = null;
        vars.setObject(ZVal.newArray());
        if (arrayActionR(ArrayAction.ISSET, context, env, "class")) {
            vars.arrayAccess(env, "__class").set(context.arrayGet(env, "class"));
            if (arrayActionR(ArrayAction.ISSET, context, env, "function")) {
                vars.arrayAccess(env, "__method").set(context.arrayGet(env, "function"));
            }

            try {
                refl = new ReflectionClass(env, context.arrayGet(env, "class"));
                if (ZVal.isTrue(
                        namespace = env.callMethod(refl, "getNamespaceName", ShowCommand.class))) {
                    vars.arrayAccess(env, "__namespace").set(namespace);
                }

            } catch (ConvertedException convertedException180) {
                if (convertedException180.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException180.getObject();
                } else {
                    throw convertedException180;
                }
            }

        } else if (arrayActionR(ArrayAction.ISSET, context, env, "function")) {
            vars.arrayAccess(env, "__function").set(context.arrayGet(env, "function"));
            try {
                refl = new ReflectionFunction(env, context.arrayGet(env, "function"));
                if (ZVal.isTrue(
                        namespace = env.callMethod(refl, "getNamespaceName", ShowCommand.class))) {
                    vars.arrayAccess(env, "__namespace").set(namespace);
                }

            } catch (ConvertedException convertedException181) {
                if (convertedException181.instanceOf(PHPException.class, "Exception")) {
                    e = convertedException181.getObject();
                } else {
                    throw convertedException181;
                }
            }
        }

        if (arrayActionR(ArrayAction.ISSET, context, env, "file")) {
            file = ZVal.assign(context.arrayGet(env, "file"));
            if (ZVal.isTrue(fileAndLine = this.extractEvalFileAndLine(env, file))) {
                ZVal.list(
                        runtimeTempArrayResult152 = fileAndLine,
                        (file = listGet(runtimeTempArrayResult152, 0, env)),
                        (line = listGet(runtimeTempArrayResult152, 1, env)));

            } else if (arrayActionR(ArrayAction.ISSET, context, env, "line")) {
                line = ZVal.assign(context.arrayGet(env, "line"));
            }

            if (function_is_file.f.env(env).call(file).getBool()) {
                vars.arrayAccess(env, "__file").set(file);
                if (ZVal.isset(line)) {
                    vars.arrayAccess(env, "__line").set(line);
                }

                vars.arrayAccess(env, "__dir").set(function_dirname.f.env(env).call(file).value());
            }
        }

        env.callMethod(
                toObjectR(this).accessProp(this, env).name("context").value(),
                "setCommandScopeVariables",
                ShowCommand.class,
                vars.getObject());
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "file")
    private Object extractEvalFileAndLine(RuntimeEnv env, Object... args) {
        Object file = assignParameter(args, 0, false);
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (function_preg_match
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                .call("/(.*)\\((\\d+)\\) : eval\\(\\)'d code$/", file, matches.getObject())
                .getBool()) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(0, matches.arrayGet(env, 1)),
                            new ZPair(1, matches.arrayGet(env, 2))));
        }

        return null;
    }

    public static final Object CONST_class = "Psy\\Command\\ShowCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ReflectingCommand.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\ShowCommand")
                    .setLookup(
                            ShowCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "colorMode",
                            "context",
                            "definition",
                            "description",
                            "help",
                            "helperSet",
                            "hidden",
                            "highlighter",
                            "ignoreValidationErrors",
                            "lastException",
                            "lastExceptionIndex",
                            "name",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/ShowCommand.php")
                    .addInterface("Psy\\ContextAware")
                    .addExtendsClass("Psy\\Command\\ReflectingCommand")
                    .addExtendsClass("Psy\\Command\\Command")
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
