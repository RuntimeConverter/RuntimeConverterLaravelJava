package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.file.function_getcwd;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_slice;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Input.classes.FilterOptions;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.InputOption;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Output.classes.ShellOutput;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_replace;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.Command.classes.Command;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.listGet;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/Command/TraceCommand.php

*/

public class TraceCommand extends Command {

    public Object filter = null;

    public TraceCommand(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == TraceCommand.class) {
            this.__construct(env, args);
        }
    }

    public TraceCommand(NoConstructor n) {
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
    protected Object configure(RuntimeEnv env, Object... args) {
        Object invert = null;
        Object grep = null;
        Object insensitive = null;
        Object runtimeTempArrayResult153 = null;
        ZVal.list(
                runtimeTempArrayResult153 = FilterOptions.runtimeStaticObject.getOptions(env),
                (grep = listGet(runtimeTempArrayResult153, 0, env)),
                (insensitive = listGet(runtimeTempArrayResult153, 1, env)),
                (invert = listGet(runtimeTempArrayResult153, 2, env)));
        env.callMethod(
                env.callMethod(
                        env.callMethod(
                                env.callMethod(this, "setName", TraceCommand.class, "trace"),
                                "setDefinition",
                                TraceCommand.class,
                                ZVal.newArray(
                                        new ZPair(
                                                0,
                                                new InputOption(
                                                        env,
                                                        "include-psy",
                                                        "p",
                                                        InputOption.CONST_VALUE_NONE,
                                                        "Include Psy in the call stack.")),
                                        new ZPair(
                                                1,
                                                new InputOption(
                                                        env,
                                                        "num",
                                                        "n",
                                                        InputOption.CONST_VALUE_REQUIRED,
                                                        "Only include NUM lines.")),
                                        new ZPair(2, grep),
                                        new ZPair(3, insensitive),
                                        new ZPair(4, invert))),
                        "setDescription",
                        TraceCommand.class,
                        "Show the current call stack."),
                "setHelp",
                TraceCommand.class,
                "Show the current call stack.\n\nOptionally, include PsySH in the call stack by passing the <info>--include-psy</info> option.\n\ne.g.\n<return>> trace -n10</return>\n<return>> trace --include-psy</return>");
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
        Object trace = null;
        env.callMethod(this.filter, "bind", TraceCommand.class, input);
        trace =
                this.getBacktrace(
                        env,
                        new PHPException(env),
                        env.callMethod(input, "getOption", TraceCommand.class, "num"),
                        env.callMethod(input, "getOption", TraceCommand.class, "include-psy"));
        env.callMethod(output, "page", TraceCommand.class, trace, ShellOutput.CONST_NUMBER_LINES);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "e", typeHint = "Exception")
    @ConvertedParameter(
        index = 1,
        name = "count",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "includePsy",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    protected Object getBacktrace(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        PassByReferenceArgs rLastRefArgs;
        Object e = assignParameter(args, 0, false);
        Object count = assignParameter(args, 1, true);
        if (null == count) {
            count = ZVal.getNull();
        }
        Object includePsy = assignParameter(args, 2, true);
        if (null == includePsy) {
            includePsy = true;
        }
        Object line = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object type = null;
        Object cwd = null;
        ReferenceContainer trace = new BasicReferenceContainer(null);
        Object file = null;
        Object function = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        Object thing = null;
        Object _pClass = null;
        if (ZVal.isTrue(cwd = function_getcwd.f.env(env).call().value())) {
            cwd =
                    toStringR(function_rtrim.f.env(env).call(cwd, "/").value(), env)
                            + toStringR("/", env);
        }

        if (ZVal.strictEqualityCheck(count, "===", ZVal.getNull())) {
            count = 9223372036854775807L;
        }

        lines.setObject(ZVal.newArray());
        trace.setObject(env.callMethod(e, "getTrace", TraceCommand.class));
        function_array_unshift
                .f
                .env(env)
                .call(
                        trace.getObject(),
                        ZVal.newArray(
                                new ZPair("function", ""),
                                new ZPair(
                                        "file",
                                        ZVal.strictNotEqualityCheck(
                                                        env.callMethod(
                                                                e, "getFile", TraceCommand.class),
                                                        "!==",
                                                        ZVal.getNull())
                                                ? env.callMethod(e, "getFile", TraceCommand.class)
                                                : "n/a"),
                                new ZPair(
                                        "line",
                                        ZVal.strictNotEqualityCheck(
                                                        env.callMethod(
                                                                e, "getLine", TraceCommand.class),
                                                        "!==",
                                                        ZVal.getNull())
                                                ? env.callMethod(e, "getLine", TraceCommand.class)
                                                : "n/a"),
                                new ZPair("args", ZVal.newArray())));
        if (!ZVal.isTrue(includePsy)) {
            runtimeConverterBreakCount = 0;
            runtimeConverterContinueCount = 0;
            for (i.setObject(
                            ZVal.subtract(
                                    function_count.f.env(env).call(trace.getObject()).value(), 1));
                    ZVal.isGreaterThanOrEqualTo(i.getObject(), ">=", 0);
                    i.setObject(ZVal.decrement(i.getObject()))) {
                thing =
                        ZVal.assign(
                                arrayActionR(ArrayAction.ISSET, trace, env, i.getObject(), "class")
                                        ? trace.arrayGet(env, i.getObject(), "class")
                                        : trace.arrayGet(env, i.getObject(), "function"));
                if (function_preg_match.f.env(env).call("/\\\\?Psy\\\\/", thing).getBool()) {
                    trace.setObject(
                            function_array_slice
                                    .f
                                    .env(env)
                                    .call(trace.getObject(), ZVal.add(i.getObject(), 1))
                                    .value());
                    break;
                }
            }
        }

        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        for (i.setObject(0),
                        count =
                                NamespaceGlobal.min
                                        .env(env)
                                        .call(
                                                count,
                                                function_count
                                                        .f
                                                        .env(env)
                                                        .call(trace.getObject())
                                                        .value())
                                        .value();
                ZVal.isLessThan(i.getObject(), '<', count);
                i.setObject(ZVal.increment(i.getObject()))) {
            _pClass =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, trace, env, i.getObject(), "class")
                                    ? trace.arrayGet(env, i.getObject(), "class")
                                    : "");
            type =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, trace, env, i.getObject(), "type")
                                    ? trace.arrayGet(env, i.getObject(), "type")
                                    : "");
            function = ZVal.assign(trace.arrayGet(env, i.getObject(), "function"));
            file =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, trace, env, i.getObject(), "file")
                                    ? this.replaceCwd(
                                            env, cwd, trace.arrayGet(env, i.getObject(), "file"))
                                    : "n/a");
            line =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, trace, env, i.getObject(), "line")
                                    ? trace.arrayGet(env, i.getObject(), "line")
                                    : "n/a");
            if (function_preg_match
                    .f
                    .env(env)
                    .call(
                            "#/src/Execution(?:Loop)?Closure.php\\(\\d+\\) : eval\\(\\)'d code$#",
                            function_str_replace.f.env(env).call("\\", "/", file).value())
                    .getBool()) {
                file = "eval()'d code";
            }

            if (!ZVal.isTrue(
                    env.callMethod(
                            this.filter,
                            rLastRefArgs =
                                    new RuntimeArgsWithReferences()
                                            .add(
                                                    0,
                                                    handleReturnReference(
                                                            function_sprintf
                                                                    .f
                                                                    .env(env)
                                                                    .call(
                                                                            "%s%s%s() at %s:%s",
                                                                            _pClass, type, function,
                                                                            file, line)
                                                                    .value())),
                            "match",
                            TraceCommand.class,
                            rLastRefArgs.get(0)))) {
                continue;
            }

            lines.arrayAppend(env)
                    .set(
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            " <class>%s</class>%s%s() at <info>%s:%s</info>",
                                            OutputFormatter.runtimeStaticObject.escape(
                                                    env, _pClass),
                                            OutputFormatter.runtimeStaticObject.escape(env, type),
                                            OutputFormatter.runtimeStaticObject.escape(
                                                    env, function),
                                            OutputFormatter.runtimeStaticObject.escape(env, file),
                                            OutputFormatter.runtimeStaticObject.escape(env, line))
                                    .value());
        }

        return ZVal.assign(lines.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "cwd")
    @ConvertedParameter(index = 1, name = "file")
    private Object replaceCwd(RuntimeEnv env, Object... args) {
        Object cwd = assignParameter(args, 0, false);
        Object file = assignParameter(args, 1, false);
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

    public static final Object CONST_class = "Psy\\Command\\TraceCommand";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Command.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\Command\\TraceCommand")
                    .setLookup(
                            TraceCommand.class,
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
                            "synopsis",
                            "usages")
                    .setFilename("vendor/psy/psysh/src/Command/TraceCommand.php")
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
