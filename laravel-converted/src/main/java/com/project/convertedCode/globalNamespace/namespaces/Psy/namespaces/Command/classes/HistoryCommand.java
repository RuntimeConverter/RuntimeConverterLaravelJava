package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.FilterOptions;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.ShellOutput;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/HistoryCommand.php

*/

public class HistoryCommand extends Command {

    public Object filter = null;

    public Object readline = null;

    public HistoryCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == HistoryCommand.class) {
            this.__construct(env, args);
        }
    }

    public HistoryCommand(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "name",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = ZVal.getNull();
        }
        this.filter = new FilterOptions(env);
        super.__construct(env, name);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "readline", typeHint = "Psy\\Readline\\Readline")
    public Object setReadline(RuntimeEnv env, Object... args) {
        Object readline = assignParameter(args, 0, false);
        this.readline = readline;
        return null;
    }

    @ConvertedMethod
    protected Object configure(RuntimeEnv env, Object... args) {
        Object runtimeTempArrayResult145 = null;
        Object invert = null;
        Object grep = null;
        Object insensitive = null;
        ZVal.list(
                runtimeTempArrayResult145 = FilterOptions.runtimeStaticObject.getOptions(env),
                (grep = listGet(runtimeTempArrayResult145, 0, env)),
                (insensitive = listGet(runtimeTempArrayResult145, 1, env)),
                (invert = listGet(runtimeTempArrayResult145, 2, env)));
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(
                                        env.callMethod(
                                                this, "setName", HistoryCommand.class, "history"),
                                        "setAliases",
                                        HistoryCommand.class,
                                        ZVal.arrayFromList("hist")),
                                "setDefinition",
                                HistoryCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new InputOption(
                                                        env,
                                                        "show",
                                                        "s",
                                                        InputOption.CONST_VALUE_REQUIRED,
                                                        "Show the given range of lines.")),
                                        new ZPair(
                                                1,
                                                new InputOption(
                                                        env,
                                                        "head",
                                                        "H",
                                                        InputOption.CONST_VALUE_REQUIRED,
                                                        "Display the first N items.")),
                                        new ZPair(
                                                2,
                                                new InputOption(
                                                        env,
                                                        "tail",
                                                        "T",
                                                        InputOption.CONST_VALUE_REQUIRED,
                                                        "Display the last N items.")),
                                        new ZPair(3, grep),
                                        new ZPair(4, insensitive),
                                        new ZPair(5, invert),
                                        new ZPair(
                                                6,
                                                new InputOption(
                                                        env,
                                                        "no-numbers",
                                                        "N",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Omit line numbers.")),
                                        new ZPair(
                                                7,
                                                new InputOption(
                                                        env,
                                                        "save",
                                                        "",
                                                        InputOption.CONST_VALUE_REQUIRED,
                                                        "Save history to a file.")),
                                        new ZPair(
                                                8,
                                                new InputOption(
                                                        env,
                                                        "replay",
                                                        "",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Replay.")),
                                        new ZPair(
                                                9,
                                                new InputOption(
                                                        env,
                                                        "clear",
                                                        "",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Clear the history.")))),
                        "setDescription",
                        HistoryCommand.class,
                        "Show the Psy Shell history."),
                "setHelp",
                HistoryCommand.class,
                "Show, search, save or replay the Psy Shell history.\n\ne.g.\n<return>>>> history --grep /[bB]acon/</return>\n<return>>>> history --show 0..10 --replay</return>\n<return>>>> history --clear</return>\n<return>>>> history --tail 1000 --save somefile.txt</return>");
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
        Object glue = null;
        ReferenceContainer highlighted = new BasicReferenceContainer(null);
        Object chunks = null;
        ReferenceContainer line = new BasicReferenceContainer(null);
        Object save = null;
        Object count = null;
        Object i = null;
        Object ternaryExpressionTemp = null;
        ReferenceContainer history = new BasicReferenceContainer(null);
        Object type = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        this.validateOnlyOne(env, input, ZVal.arrayFromList("show", "head", "tail"));
        this.validateOnlyOne(env, input, ZVal.arrayFromList("save", "replay", "clear"));
        history.setObject(
                this.getHistorySlice(
                        env,
                        env.callMethod(input, "getOption", HistoryCommand.class, "show"),
                        env.callMethod(input, "getOption", HistoryCommand.class, "head"),
                        env.callMethod(input, "getOption", HistoryCommand.class, "tail")));
        highlighted.setObject(false);
        env.callMethod(this.filter, "bind", HistoryCommand.class, input);
        if (ZVal.isTrue(env.callMethod(this.filter, "hasFilter", HistoryCommand.class))) {
            matches.setObject(ZVal.newArray());
            highlighted.setObject(ZVal.newArray());
            for (ZPair zpairResult1359 : ZVal.getIterable(history.getObject(), env, false)) {
                i = ZVal.assign(zpairResult1359.getKey());
                line.setObject(ZVal.assign(zpairResult1359.getValue()));
                if (ZVal.isTrue(
                        env.callMethod(
                                this.filter,
                                new RuntimeArgsWithReferences().add(0, line).add(1, matches),
                                "match",
                                HistoryCommand.class,
                                line.getObject(),
                                matches.getObject()))) {
                    if (arrayActionR(ArrayAction.ISSET, matches, env, 0)) {
                        chunks =
                                function_explode
                                        .f
                                        .env(env)
                                        .call(matches.arrayGet(env, 0), history.arrayGet(env, i))
                                        .value();
                        chunks =
                                function_array_map
                                        .f
                                        .env(env)
                                        .call(
                                                ZVal.newArray(
                                                        new ZPair(0, "HistoryCommand"),
                                                        new ZPair(1, "escape")),
                                                chunks)
                                        .value();
                        glue =
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<urgent>%s</urgent>",
                                                runtimeStaticObject.escape(
                                                        env, matches.arrayGet(env, 0)))
                                        .value();
                        highlighted
                                .arrayAccess(env, i)
                                .set(NamespaceGlobal.implode.env(env).call(glue, chunks).value());
                    }

                } else {
                    arrayActionR(ArrayAction.UNSET, history, env, i);
                }
            }
        }

        if (ZVal.isTrue(save = env.callMethod(input, "getOption", HistoryCommand.class, "save"))) {
            env.callMethod(
                    output,
                    "writeln",
                    HistoryCommand.class,
                    function_sprintf.f.env(env).call("Saving history in %s...", save).value());
            NamespaceGlobal.file_put_contents
                    .env(env)
                    .call(
                            save,
                            toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call("\n", history.getObject())
                                                    .value(),
                                            env)
                                    + toStringR("\n", env));
            env.callMethod(output, "writeln", HistoryCommand.class, "<info>History saved.</info>");

        } else if (ZVal.isTrue(
                env.callMethod(input, "getOption", HistoryCommand.class, "replay"))) {
            if (!ZVal.toBool(
                            ZVal.toBool(
                                            env.callMethod(
                                                    input,
                                                    "getOption",
                                                    HistoryCommand.class,
                                                    "show"))
                                    || ZVal.toBool(
                                            env.callMethod(
                                                    input,
                                                    "getOption",
                                                    HistoryCommand.class,
                                                    "head")))
                    || ZVal.toBool(
                            env.callMethod(input, "getOption", HistoryCommand.class, "tail"))) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env,
                                "You must limit history via --head, --tail or --show before replaying"));
            }

            count = function_count.f.env(env).call(history.getObject()).value();
            env.callMethod(
                    output,
                    "writeln",
                    HistoryCommand.class,
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Replaying %d line%s of history",
                                    count, ZVal.strictNotEqualityCheck(count, "!==", 1) ? "s" : "")
                            .value());
            env.callMethod(
                    env.callMethod(this, "getApplication", HistoryCommand.class),
                    "addInput",
                    HistoryCommand.class,
                    history.getObject());

        } else if (ZVal.isTrue(env.callMethod(input, "getOption", HistoryCommand.class, "clear"))) {
            this.clearHistory(env);
            env.callMethod(
                    output, "writeln", HistoryCommand.class, "<info>History cleared.</info>");

        } else {
            type =
                    ZVal.assign(
                            ZVal.isTrue(
                                            env.callMethod(
                                                    input,
                                                    "getOption",
                                                    HistoryCommand.class,
                                                    "no-numbers"))
                                    ? 0
                                    : ShellOutput.CONST_NUMBER_LINES);
            if (!ZVal.isTrue(highlighted.getObject())) {
                type = ZVal.toLong(type) | ZVal.toLong(ShellOutput.CONST_OUTPUT_RAW);
            }

            env.callMethod(
                    output,
                    "page",
                    HistoryCommand.class,
                    ZVal.isTrue(ternaryExpressionTemp = highlighted.getObject())
                            ? ternaryExpressionTemp
                            : history.getObject(),
                    type);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "range")
    private Object extractRange(RuntimeEnv env, Object... args) {
        Object range = assignParameter(args, 0, false);
        Object start = null;
        Object end = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        if (function_preg_match.f.env(env).call("/^\\d+$/", range).getBool()) {
            return ZVal.assign(
                    ZVal.newArray(new ZPair(0, range), new ZPair(1, ZVal.add(range, 1))));
        }

        matches.setObject(ZVal.newArray());
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(range, "!==", ".."))
                && ZVal.toBool(
                        function_preg_match
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                                .call("/^(\\d*)\\.\\.(\\d*)$/", range, matches.getObject())
                                .value())) {
            start =
                    ZVal.assign(
                            ZVal.isTrue(matches.arrayGet(env, 1))
                                    ? NamespaceGlobal.intval
                                            .env(env)
                                            .call(matches.arrayGet(env, 1))
                                            .value()
                                    : 0);
            end =
                    ZVal.assign(
                            ZVal.isTrue(matches.arrayGet(env, 2))
                                    ? ZVal.add(
                                            NamespaceGlobal.intval
                                                    .env(env)
                                                    .call(matches.arrayGet(env, 2))
                                                    .value(),
                                            1)
                                    : 9223372036854775807L);
            return ZVal.assign(ZVal.newArray(new ZPair(0, start), new ZPair(1, end)));
        }

        throw ZVal.getException(
                env,
                new InvalidArgumentException(env, "Unexpected range: " + toStringR(range, env)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "show")
    @ConvertedParameter(index = 1, name = "head")
    @ConvertedParameter(index = 2, name = "tail")
    private Object getHistorySlice(RuntimeEnv env, Object... args) {
        Object show = assignParameter(args, 0, false);
        Object head = assignParameter(args, 1, false);
        Object tail = assignParameter(args, 2, false);
        Object runtimeTempArrayResult146 = null;
        Object start = null;
        Object length = null;
        Object end = null;
        Object history = null;
        history = env.callMethod(this.readline, "listHistory", HistoryCommand.class);
        function_array_pop.f.env(env).call(history);
        if (ZVal.isTrue(show)) {
            ZVal.list(
                    runtimeTempArrayResult146 = this.extractRange(env, show),
                    (start = listGet(runtimeTempArrayResult146, 0, env)),
                    (end = listGet(runtimeTempArrayResult146, 1, env)));
            length = ZVal.subtract(end, start);

        } else if (ZVal.isTrue(head)) {
            if (!function_preg_match.f.env(env).call("/^\\d+$/", head).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Please specify an integer argument for --head"));
            }

            start = 0;
            length = NamespaceGlobal.intval.env(env).call(head).value();

        } else if (ZVal.isTrue(tail)) {
            if (!function_preg_match.f.env(env).call("/^\\d+$/", tail).getBool()) {
                throw ZVal.getException(
                        env,
                        new InvalidArgumentException(
                                env, "Please specify an integer argument for --tail"));
            }

            start = ZVal.subtract(function_count.f.env(env).call(history).value(), tail);
            length = ZVal.add(NamespaceGlobal.intval.env(env).call(tail).value(), 1);

        } else {
            return ZVal.assign(history);
        }

        return ZVal.assign(
                function_array_slice.f.env(env).call(history, start, length, true).value());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "input",
        typeHint = "Symfony\\Component\\Console\\Input\\InputInterface"
    )
    @ConvertedParameter(index = 1, name = "options", typeHint = "array")
    private Object validateOnlyOne(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, false);
        Object opt = null;
        ReferenceContainer count = new BasicReferenceContainer(null);
        count.setObject(0);
        for (ZPair zpairResult1360 : ZVal.getIterable(options, env, true)) {
            opt = ZVal.assign(zpairResult1360.getValue());
            if (ZVal.isTrue(env.callMethod(input, "getOption", HistoryCommand.class, opt))) {
                count.setObject(ZVal.increment(count.getObject()));
            }
        }

        if (ZVal.isGreaterThan(count.getObject(), '>', 1)) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Please specify only one of --"
                                    + toStringR(
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(", --", options)
                                                    .value(),
                                            env)));
        }

        return null;
    }

    @ConvertedMethod
    private Object clearHistory(RuntimeEnv env, Object... args) {
        env.callMethod(this.readline, "clearHistory", HistoryCommand.class);
        return null;
    }

    public static final Object CONST_class = "Psy\\Command\\HistoryCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "string")
        public Object escape(RuntimeEnv env, Object... args) {
            Object string = assignParameter(args, 0, false);
            return ZVal.assign(OutputFormatter.runtimeStaticObject.escape(env, string));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\HistoryCommand")
                    .setLookup(
                            HistoryCommand.class,
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
                            "filter",
                            "help",
                            "helperSet",
                            "hidden",
                            "ignoreValidationErrors",
                            "name",
                            "processTitle",
                            "readline",
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/HistoryCommand.php")
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
