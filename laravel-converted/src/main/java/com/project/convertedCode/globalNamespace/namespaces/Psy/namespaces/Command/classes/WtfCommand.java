package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.ShellOutput;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.TraceCommand;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputArgument;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Psy.classes.ContextAware;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.FilterOptions;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/WtfCommand.php

*/

public class WtfCommand extends TraceCommand implements ContextAware {

    public Object context = null;

    public WtfCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == WtfCommand.class) {
            this.__construct(env, args);
        }
    }

    public WtfCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "context", typeHint = "Psy\\Context")
    public Object setContext(RuntimeEnv env, Object... args) {
        Object context = assignParameter(args, 0, false);
        this.context = context;
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        Object invert = null;
        Object grep = null;
        Object insensitive = null;
        Object runtimeTempArrayResult154 = null;
        ZVal.list(
                runtimeTempArrayResult154 = FilterOptions.runtimeStaticObject.getOptions(env),
                (grep = listGet(runtimeTempArrayResult154, 0, env)),
                (insensitive = listGet(runtimeTempArrayResult154, 1, env)),
                (invert = listGet(runtimeTempArrayResult154, 2, env)));
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(this, "setName", WtfCommand.class, "wtf"),
                                        "setAliases",
                                        WtfCommand.class,
                                        ZVal.arrayFromList("last-exception", "wtf?")),
                                "setDefinition",
                                WtfCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new InputArgument(
                                                        env,
                                                        "incredulity",
                                                        ZVal.toLong(InputArgument.CONST_OPTIONAL)
                                                                | ZVal.toLong(
                                                                        InputArgument
                                                                                .CONST_IS_ARRAY),
                                                        "Number of lines to show.")),
                                        new ZPair(
                                                1,
                                                new InputOption(
                                                        env,
                                                        "all",
                                                        "a",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Show entire backtrace.")),
                                        new ZPair(2, grep),
                                        new ZPair(3, insensitive),
                                        new ZPair(4, invert))),
                        "setDescription",
                        WtfCommand.class,
                        "Show the backtrace of the most recent exception."),
                "setHelp",
                WtfCommand.class,
                "Shows a few lines of the backtrace of the most recent exception.\n\nIf you want to see more lines, add more question marks or exclamation marks:\n\ne.g.\n<return>>>> wtf ?</return>\n<return>>>> wtf ?!???!?!?</return>\n\nTo see the entire backtrace, pass the -a/--all flag:\n\ne.g.\n<return>>>> wtf -a</return>");
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
        Object exception = null;
        Object incredulity = null;
        Object trace = null;
        Object traceCount = null;
        Object shell = null;
        Object count = null;
        Object showLines = null;
        Object moreLines = null;
        env.callMethod(
                toObjectR(this).accessProp(this, env).name("filter").value(),
                "bind",
                WtfCommand.class,
                input);
        incredulity =
                NamespaceGlobal.implode
                        .env(env)
                        .call(
                                "",
                                env.callMethod(
                                        input, "getArgument", WtfCommand.class, "incredulity"))
                        .value();
        if (function_strlen
                .f
                .env(env)
                .call(function_preg_replace.f.env(env).call("/[\\?!]/", "", incredulity).value())
                .getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Incredulity must include only \"?\" and \"!\""));
        }

        exception = env.callMethod(this.context, "getLastException", WtfCommand.class);
        count =
                ZVal.assign(
                        ZVal.isTrue(env.callMethod(input, "getOption", WtfCommand.class, "all"))
                                ? 9223372036854775807L
                                : NamespaceGlobal.max
                                        .env(env)
                                        .call(
                                                3,
                                                NamespaceGlobal.pow
                                                        .env(env)
                                                        .call(
                                                                2,
                                                                ZVal.add(
                                                                        function_strlen
                                                                                .f
                                                                                .env(env)
                                                                                .call(incredulity)
                                                                                .value(),
                                                                        1))
                                                        .value())
                                        .value());
        shell = env.callMethod(this, "getApplication", WtfCommand.class);
        env.callMethod(output, "startPaging", WtfCommand.class);
        do {
            traceCount =
                    function_count
                            .f
                            .env(env)
                            .call(env.callMethod(exception, "getTrace", WtfCommand.class))
                            .value();
            showLines = ZVal.assign(count);
            if (ZVal.isLessThan(
                    traceCount,
                    '<',
                    NamespaceGlobal.max
                            .env(env)
                            .call(ZVal.multiply(count, 1.2), ZVal.add(count, 2))
                            .value())) {
                showLines = 9223372036854775807L;
            }

            trace = env.callMethod(this, "getBacktrace", WtfCommand.class, exception, showLines);
            moreLines = ZVal.subtract(traceCount, function_count.f.env(env).call(trace).value());
            env.callMethod(
                    output,
                    "writeln",
                    WtfCommand.class,
                    env.callMethod(shell, "formatException", WtfCommand.class, exception));
            env.callMethod(output, "writeln", WtfCommand.class, "--");
            env.callMethod(
                    output, "write", WtfCommand.class, trace, true, ShellOutput.CONST_NUMBER_LINES);
            env.callMethod(output, "writeln", WtfCommand.class, "");
            if (ZVal.isGreaterThan(moreLines, '>', 0)) {
                env.callMethod(
                        output,
                        "writeln",
                        WtfCommand.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "<aside>Use <return>wtf -a</return> to see %d more lines</aside>",
                                        moreLines)
                                .value());
                env.callMethod(output, "writeln", WtfCommand.class, "");
            }

        } while (ZVal.isTrue(
                exception = env.callMethod(exception, "getPrevious", WtfCommand.class)));

        env.callMethod(output, "stopPaging", WtfCommand.class);
        return null;
    }

    public static final Object CONST_class = "Psy\\Command\\WtfCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TraceCommand.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\WtfCommand")
                    .setLookup(
                            WtfCommand.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "aliases",
                            "application",
                            "applicationDefinitionMerged",
                            "applicationDefinitionMergedWithArgs",
                            "code",
                            "context",
                            "definition",
                            "description",
                            "filter",
                            "help",
                            "helperSet",
                            "hidden",
                            "ignoreValidationErrors",
                            "name",
                            "processTitle",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/WtfCommand.php")
                    .addInterface("Psy\\ContextAware")
                    .addExtendsClass("Psy\\Command\\TraceCommand")
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
