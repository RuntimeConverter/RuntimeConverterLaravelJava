package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.OutputInterface;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import com.runtimeconverter.runtime.nativeFunctions.math.function_round;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleSectionOutput;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.Terminal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutputInterface;
import com.runtimeconverter.runtime.nativeFunctions.math.function_floor;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/ProgressBar.php

*/

public final class ProgressBar extends RuntimeClassBase {

    public Object barWidth = 28;

    public Object barChar = null;

    public Object emptyBarChar = "-";

    public Object progressChar = ">";

    public Object format = null;

    public Object internalFormat = null;

    public Object redrawFreq = 1;

    public Object output = null;

    public Object step = 0;

    public Object max = null;

    public Object startTime = null;

    public Object stepWidth = null;

    public Object percent = 0.0;

    public Object formatLineCount = null;

    public Object messages = ZVal.newArray();

    public Object overwrite = true;

    public Object terminal = null;

    public Object firstRun = true;

    public ProgressBar(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ProgressBar.class) {
            this.__construct(env, args);
        }
    }

    public ProgressBar(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "max",
        typeHint = "int",
        defaultValue = "0",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object max = assignParameter(args, 1, true);
        if (null == max) {
            max = 0;
        }
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        output,
                        ConsoleOutputInterface.class,
                        "Symfony\\Component\\Console\\Output\\ConsoleOutputInterface"))) {
            output = env.callMethod(output, "getErrorOutput", ProgressBar.class);
        }

        this.output = output;
        this.setMaxSteps(env, max);
        this.terminal = new Terminal(env);
        if (!ZVal.isTrue(env.callMethod(this.output, "isDecorated", ProgressBar.class))) {
            this.overwrite = false;
            this.setRedrawFrequency(env, ZVal.divide(max, 10));
        }

        this.startTime = NamespaceGlobal.time.env(env).call().value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    public Object setMessage(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, true);
        if (null == name) {
            name = "message";
        }
        new ReferenceClassProperty(this, "messages", env).arrayAccess(env, name).set(message);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    public Object getMessage(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = "message";
        }
        return ZVal.assign(new ReferenceClassProperty(this, "messages", env).arrayGet(env, name));
    }

    @ConvertedMethod
    public Object getStartTime(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.startTime);
    }

    @ConvertedMethod
    public Object getMaxSteps(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.max);
    }

    @ConvertedMethod
    public Object getProgress(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.step);
    }

    @ConvertedMethod
    private Object getStepWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.stepWidth);
    }

    @ConvertedMethod
    public Object getProgressPercent(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.percent);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "size", typeHint = "int")
    public Object setBarWidth(RuntimeEnv env, Object... args) {
        Object size = assignParameter(args, 0, false);
        this.barWidth = NamespaceGlobal.max.env(env).call(1, size).value();
        return null;
    }

    @ConvertedMethod
    public Object getBarWidth(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.barWidth);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "char", typeHint = "string")
    public Object setBarCharacter(RuntimeEnv env, Object... args) {
        Object _pChar = assignParameter(args, 0, false);
        this.barChar = _pChar;
        return null;
    }

    @ConvertedMethod
    public Object getBarCharacter(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.barChar)) {
            return ZVal.assign(ZVal.isTrue(this.max) ? "=" : this.emptyBarChar);
        }

        return ZVal.assign(this.barChar);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "char", typeHint = "string")
    public Object setEmptyBarCharacter(RuntimeEnv env, Object... args) {
        Object _pChar = assignParameter(args, 0, false);
        this.emptyBarChar = _pChar;
        return null;
    }

    @ConvertedMethod
    public Object getEmptyBarCharacter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.emptyBarChar);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "char", typeHint = "string")
    public Object setProgressCharacter(RuntimeEnv env, Object... args) {
        Object _pChar = assignParameter(args, 0, false);
        this.progressChar = _pChar;
        return null;
    }

    @ConvertedMethod
    public Object getProgressCharacter(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.progressChar);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format", typeHint = "string")
    public Object setFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        this.format = ZVal.getNull();
        this.internalFormat = format;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "freq", typeHint = "int")
    public Object setRedrawFrequency(RuntimeEnv env, Object... args) {
        Object freq = assignParameter(args, 0, false);
        this.redrawFreq = NamespaceGlobal.max.env(env).call(freq, 1).value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "max",
        typeHint = "int",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object start(RuntimeEnv env, Object... args) {
        Object max = assignParameter(args, 0, true);
        if (null == max) {
            max = ZVal.getNull();
        }
        this.startTime = NamespaceGlobal.time.env(env).call().value();
        this.step = 0;
        this.percent = 0.0;
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", max)) {
            this.setMaxSteps(env, max);
        }

        this.display(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "step",
        typeHint = "int",
        defaultValue = "1",
        defaultValueType = "number"
    )
    public Object advance(RuntimeEnv env, Object... args) {
        Object step = assignParameter(args, 0, true);
        if (null == step) {
            step = 1;
        }
        this.setProgress(env, ZVal.add(this.step, step));
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "overwrite", typeHint = "bool")
    public Object setOverwrite(RuntimeEnv env, Object... args) {
        Object overwrite = assignParameter(args, 0, false);
        this.overwrite = overwrite;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "step", typeHint = "int")
    public Object setProgress(RuntimeEnv env, Object... args) {
        Object step = assignParameter(args, 0, false);
        Object currPeriod = null;
        Object prevPeriod = null;
        if (ZVal.toBool(this.max) && ZVal.toBool(ZVal.isGreaterThan(step, '>', this.max))) {
            this.max = step;

        } else if (ZVal.isLessThan(step, '<', 0)) {
            step = 0;
        }

        prevPeriod = ZVal.assign(ZVal.toLong(ZVal.divide(this.step, this.redrawFreq)));
        currPeriod = ZVal.assign(ZVal.toLong(ZVal.divide(step, this.redrawFreq)));
        this.step = step;
        this.percent = ZVal.isTrue(this.max) ? ZVal.divide(ZVal.toDouble(this.step), this.max) : 0;
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(prevPeriod, "!==", currPeriod))
                || ZVal.toBool(ZVal.strictEqualityCheck(this.max, "===", step))) {
            this.display(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "max", typeHint = "int")
    public Object setMaxSteps(RuntimeEnv env, Object... args) {
        Object max = assignParameter(args, 0, false);
        this.format = ZVal.getNull();
        this.max = NamespaceGlobal.max.env(env).call(0, max).value();
        this.stepWidth =
                ZVal.isTrue(this.max)
                        ? Helper.runtimeStaticObject.strlen(env, toStringR(this.max, env))
                        : 4;
        return null;
    }

    @ConvertedMethod
    public Object finish(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.max)) {
            this.max = this.step;
        }

        if (ZVal.toBool(ZVal.strictEqualityCheck(this.step, "===", this.max))
                && ZVal.toBool(!ZVal.isTrue(this.overwrite))) {
            return null;
        }

        this.setProgress(env, this.max);
        return null;
    }

    @ConvertedMethod
    public Object display(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        if (ZVal.strictEqualityCheck(
                OutputInterface.CONST_VERBOSITY_QUIET,
                "===",
                env.callMethod(this.output, "getVerbosity", ProgressBar.class))) {
            return null;
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.format)) {
            this.setRealFormat(
                    env,
                    ZVal.isTrue(ternaryExpressionTemp = this.internalFormat)
                            ? ternaryExpressionTemp
                            : this.determineBestFormat(env));
        }

        this.overwrite(env, this.buildLine(env));
        return null;
    }

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        if (!ZVal.isTrue(this.overwrite)) {
            return null;
        }

        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.format)) {
            this.setRealFormat(
                    env,
                    ZVal.isTrue(ternaryExpressionTemp = this.internalFormat)
                            ? ternaryExpressionTemp
                            : this.determineBestFormat(env));
        }

        this.overwrite(env, "");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "format", typeHint = "string")
    private Object setRealFormat(RuntimeEnv env, Object... args) {
        Object format = assignParameter(args, 0, false);
        if (ZVal.toBool(!ZVal.isTrue(this.max))
                && ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                runtimeStaticObject.getFormatDefinition(
                                        env, toStringR(format, env) + "_nomax")))) {
            this.format =
                    runtimeStaticObject.getFormatDefinition(env, toStringR(format, env) + "_nomax");

        } else if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(), "!==", runtimeStaticObject.getFormatDefinition(env, format))) {
            this.format = runtimeStaticObject.getFormatDefinition(env, format);

        } else {
            this.format = format;
        }

        this.formatLineCount =
                NamespaceGlobal.substr_count.env(env).call(this.format, "\n").value();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    private Object overwrite(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object lines = null;
        if (ZVal.isTrue(this.overwrite)) {
            if (!ZVal.isTrue(this.firstRun)) {
                if (ZVal.isTrue(
                        ZVal.checkInstanceType(
                                this.output,
                                ConsoleSectionOutput.class,
                                "Symfony\\Component\\Console\\Output\\ConsoleSectionOutput"))) {
                    lines =
                            ZVal.add(
                                    ZVal.add(
                                            function_floor
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            ZVal.divide(
                                                                    Helper.runtimeStaticObject
                                                                            .strlen(env, message),
                                                                    env.callMethod(
                                                                            this.terminal,
                                                                            "getWidth",
                                                                            ProgressBar.class)))
                                                    .value(),
                                            this.formatLineCount),
                                    1);
                    env.callMethod(this.output, "clear", ProgressBar.class, lines);

                } else {
                    env.callMethod(this.output, "write", ProgressBar.class, "\r");
                    env.callMethod(this.output, "write", ProgressBar.class, "\u001B[2K");
                    if (ZVal.isGreaterThan(this.formatLineCount, '>', 0)) {
                        env.callMethod(
                                this.output,
                                "write",
                                ProgressBar.class,
                                function_str_repeat
                                        .f
                                        .env(env)
                                        .call("\u001B[1A\u001B[2K", this.formatLineCount)
                                        .value());
                    }
                }
            }

        } else if (ZVal.isGreaterThan(this.step, '>', 0)) {
            env.callMethod(this.output, "writeln", ProgressBar.class, "");
        }

        this.firstRun = false;
        env.callMethod(this.output, "write", ProgressBar.class, message);
        return null;
    }

    @ConvertedMethod
    private Object determineBestFormat(RuntimeEnv env, Object... args) {
        SwitchEnumType111 switchVariable111 =
                ZVal.getEnum(
                        env.callMethod(this.output, "getVerbosity", ProgressBar.class),
                        SwitchEnumType111.DEFAULT_CASE,
                        SwitchEnumType111.DYNAMIC_TYPE_363,
                        OutputInterface.CONST_VERBOSITY_VERBOSE,
                        SwitchEnumType111.DYNAMIC_TYPE_364,
                        OutputInterface.CONST_VERBOSITY_VERY_VERBOSE,
                        SwitchEnumType111.DYNAMIC_TYPE_365,
                        OutputInterface.CONST_VERBOSITY_DEBUG);
        switch (switchVariable111) {
            case DYNAMIC_TYPE_363:
                return ZVal.assign(ZVal.isTrue(this.max) ? "verbose" : "verbose_nomax");
            case DYNAMIC_TYPE_364:
                return ZVal.assign(ZVal.isTrue(this.max) ? "very_verbose" : "very_verbose_nomax");
            case DYNAMIC_TYPE_365:
                return ZVal.assign(ZVal.isTrue(this.max) ? "debug" : "debug_nomax");
            case DEFAULT_CASE:
                return ZVal.assign(ZVal.isTrue(this.max) ? "normal" : "normal_nomax");
        }
        ;
        return null;
    }

    @ConvertedMethod
    private Object buildLine(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Helper")
                        .setFile("/vendor/symfony/console/Helper/ProgressBar.php");
        Object regex = null;
        Object line = null;
        Object callback = null;
        Object linesWidth = null;
        Object linesLength = null;
        Object terminalWidth = null;
        regex = "{%([a-z\\-_]+)(?:\\:([^%]+))?%}i";
        callback =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\Console\\Helper",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "matches")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        ReferenceContainer matches =
                                new BasicReferenceContainer(assignParameter(args, 0, false));
                        Object formatter = null;
                        Object text = null;
                        if (ZVal.isTrue(
                                formatter =
                                        StaticMethodUtils.getStaticBaseClass(_closureThisVar, env)
                                                .callUnknownStaticMethod(
                                                        env,
                                                        "getPlaceholderFormatterDefinition",
                                                        new RuntimeArgsWithReferences()
                                                                .add(
                                                                        0,
                                                                        new ArrayDimensionReference(
                                                                                matches.getObject(),
                                                                                1)),
                                                        matches.arrayGet(env, 1)))) {
                            text =
                                    function_call_user_func
                                            .f
                                            .env(env)
                                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                            .call(
                                                    formatter,
                                                    _closureThisVar,
                                                    ProgressBar.this.output)
                                            .value();

                        } else if (arrayActionR(
                                ArrayAction.ISSET,
                                new ReferenceClassProperty(_closureThisVar, "messages", env),
                                env,
                                matches.arrayGet(env, 1))) {
                            text =
                                    ZVal.assign(
                                            new ReferenceClassProperty(
                                                            _closureThisVar, "messages", env)
                                                    .arrayGet(env, matches.arrayGet(env, 1)));

                        } else {
                            return ZVal.assign(matches.arrayGet(env, 0));
                        }

                        if (arrayActionR(ArrayAction.ISSET, matches, env, 2)) {
                            text =
                                    function_sprintf
                                            .f
                                            .env(env)
                                            .call(
                                                    "%" + toStringR(matches.arrayGet(env, 2), env),
                                                    text)
                                            .value();
                        }

                        return ZVal.assign(text);
                    }
                };
        line =
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(regex, callback, this.format)
                        .value();
        linesLength =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Console\\Helper",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "subLine")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object _closureThisVar = this.getClosureThisVar();
                                        Object subLine = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                Helper.runtimeStaticObject.strlenWithoutDecoration(
                                                        env,
                                                        env.callMethod(
                                                                ProgressBar.this.output,
                                                                "getFormatter",
                                                                ProgressBar.class),
                                                        function_rtrim
                                                                .f
                                                                .env(env)
                                                                .call(subLine, "\r")
                                                                .value()));
                                    }
                                },
                                function_explode.f.env(env).call("\n", line).value())
                        .value();
        linesWidth = NamespaceGlobal.max.env(env).call(linesLength).value();
        terminalWidth = env.callMethod(this.terminal, "getWidth", ProgressBar.class);
        if (ZVal.isLessThanOrEqualTo(linesWidth, "<=", terminalWidth)) {
            return ZVal.assign(line);
        }

        this.setBarWidth(env, ZVal.add(ZVal.subtract(this.barWidth, linesWidth), terminalWidth));
        return ZVal.assign(
                NamespaceGlobal.preg_replace_callback
                        .env(env)
                        .call(regex, callback, this.format)
                        .value());
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\ProgressBar";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name", typeHint = "string")
        @ConvertedParameter(index = 1, name = "callable", typeHint = "callable")
        public Object setPlaceholderFormatterDefinition(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object callable = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
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
                                            .Helper
                                            .classes
                                            .ProgressBar
                                            .RequestStaticProperties
                                            .class)
                            .formatters)) {
                env.getRequestStaticProperties(
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
                                                .Helper
                                                .classes
                                                .ProgressBar
                                                .RequestStaticProperties
                                                .class)
                                .formatters =
                        runtimeStaticObject.initPlaceholderFormatters(env);
            }

            env.getRequestStaticPropertiesReference(
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
                                    .Helper
                                    .classes
                                    .ProgressBar
                                    .RequestStaticProperties
                                    .class,
                            "formatters")
                    .arrayAccess(env, name)
                    .set(callable);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name", typeHint = "string")
        public Object getPlaceholderFormatterDefinition(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
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
                                            .Helper
                                            .classes
                                            .ProgressBar
                                            .RequestStaticProperties
                                            .class)
                            .formatters)) {
                env.getRequestStaticProperties(
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
                                                .Helper
                                                .classes
                                                .ProgressBar
                                                .RequestStaticProperties
                                                .class)
                                .formatters =
                        runtimeStaticObject.initPlaceholderFormatters(env);
            }

            return ZVal.assign(
                    arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
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
                                                    .Helper
                                                    .classes
                                                    .ProgressBar
                                                    .RequestStaticProperties
                                                    .class,
                                            "formatters"),
                                    env,
                                    name)
                            ? env.getRequestStaticPropertiesReference(
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
                                                    .Helper
                                                    .classes
                                                    .ProgressBar
                                                    .RequestStaticProperties
                                                    .class,
                                            "formatters")
                                    .arrayGet(env, name)
                            : ZVal.getNull());
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name", typeHint = "string")
        @ConvertedParameter(index = 1, name = "format", typeHint = "string")
        public Object setFormatDefinition(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            Object format = assignParameter(args, 1, false);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
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
                                            .Helper
                                            .classes
                                            .ProgressBar
                                            .RequestStaticProperties
                                            .class)
                            .formats)) {
                env.getRequestStaticProperties(
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
                                                .Helper
                                                .classes
                                                .ProgressBar
                                                .RequestStaticProperties
                                                .class)
                                .formats =
                        runtimeStaticObject.initFormats(env);
            }

            env.getRequestStaticPropertiesReference(
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
                                    .Helper
                                    .classes
                                    .ProgressBar
                                    .RequestStaticProperties
                                    .class,
                            "formats")
                    .arrayAccess(env, name)
                    .set(format);
            return null;
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "name", typeHint = "string")
        public Object getFormatDefinition(RuntimeEnv env, Object... args) {
            Object name = assignParameter(args, 0, false);
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
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
                                            .Helper
                                            .classes
                                            .ProgressBar
                                            .RequestStaticProperties
                                            .class)
                            .formats)) {
                env.getRequestStaticProperties(
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
                                                .Helper
                                                .classes
                                                .ProgressBar
                                                .RequestStaticProperties
                                                .class)
                                .formats =
                        runtimeStaticObject.initFormats(env);
            }

            return ZVal.assign(
                    arrayActionR(
                                    ArrayAction.ISSET,
                                    env.getRequestStaticPropertiesReference(
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
                                                    .Helper
                                                    .classes
                                                    .ProgressBar
                                                    .RequestStaticProperties
                                                    .class,
                                            "formats"),
                                    env,
                                    name)
                            ? env.getRequestStaticPropertiesReference(
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
                                                    .Helper
                                                    .classes
                                                    .ProgressBar
                                                    .RequestStaticProperties
                                                    .class,
                                            "formats")
                                    .arrayGet(env, name)
                            : ZVal.getNull());
        }

        @ConvertedMethod
        private Object initPlaceholderFormatters(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/symfony/console/Helper")
                            .setFile("/vendor/symfony/console/Helper/ProgressBar.php");
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair(
                                    "bar",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "bar",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressBar"
                                        )
                                        @ConvertedParameter(
                                            index = 1,
                                            name = "output",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Output\\OutputInterface"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object bar = assignParameter(args, 0, false);
                                            Object output = assignParameter(args, 1, false);
                                            Object display = null;
                                            Object emptyBars = null;
                                            Object completeBars = null;
                                            completeBars =
                                                    function_floor
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    ZVal.isGreaterThan(
                                                                                    env.callMethod(
                                                                                            bar,
                                                                                            "getMaxSteps",
                                                                                            ProgressBar
                                                                                                    .class),
                                                                                    '>',
                                                                                    0)
                                                                            ? ZVal.multiply(
                                                                                    env.callMethod(
                                                                                            bar,
                                                                                            "getProgressPercent",
                                                                                            ProgressBar
                                                                                                    .class),
                                                                                    env.callMethod(
                                                                                            bar,
                                                                                            "getBarWidth",
                                                                                            ProgressBar
                                                                                                    .class))
                                                                            : ZVal.modulus(
                                                                                    env.callMethod(
                                                                                            bar,
                                                                                            "getProgress",
                                                                                            ProgressBar
                                                                                                    .class),
                                                                                    env.callMethod(
                                                                                            bar,
                                                                                            "getBarWidth",
                                                                                            ProgressBar
                                                                                                    .class)))
                                                            .value();
                                            display =
                                                    function_str_repeat
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            bar,
                                                                            "getBarCharacter",
                                                                            ProgressBar.class),
                                                                    completeBars)
                                                            .value();
                                            if (ZVal.isLessThan(
                                                    completeBars,
                                                    '<',
                                                    env.callMethod(
                                                            bar,
                                                            "getBarWidth",
                                                            ProgressBar.class))) {
                                                emptyBars =
                                                        ZVal.subtract(
                                                                ZVal.subtract(
                                                                        env.callMethod(
                                                                                bar,
                                                                                "getBarWidth",
                                                                                ProgressBar.class),
                                                                        completeBars),
                                                                Helper.runtimeStaticObject
                                                                        .strlenWithoutDecoration(
                                                                                env,
                                                                                env.callMethod(
                                                                                        output,
                                                                                        "getFormatter",
                                                                                        ProgressBar
                                                                                                .class),
                                                                                env.callMethod(
                                                                                        bar,
                                                                                        "getProgressCharacter",
                                                                                        ProgressBar
                                                                                                .class)));
                                                display =
                                                        toStringR(display, env)
                                                                + toStringR(
                                                                        env.callMethod(
                                                                                bar,
                                                                                "getProgressCharacter",
                                                                                ProgressBar.class),
                                                                        env)
                                                                + toStringR(
                                                                        function_str_repeat
                                                                                .f
                                                                                .env(env)
                                                                                .call(
                                                                                        env
                                                                                                .callMethod(
                                                                                                        bar,
                                                                                                        "getEmptyBarCharacter",
                                                                                                        ProgressBar
                                                                                                                .class),
                                                                                        emptyBars)
                                                                                .value(),
                                                                        env);
                                            }

                                            return ZVal.assign(display);
                                        }
                                    }),
                            new ZPair(
                                    "elapsed",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "bar",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressBar"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object bar = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    Helper.runtimeStaticObject.formatTime(
                                                            env,
                                                            ZVal.subtract(
                                                                    NamespaceGlobal.time
                                                                            .env(env)
                                                                            .call()
                                                                            .value(),
                                                                    env.callMethod(
                                                                            bar,
                                                                            "getStartTime",
                                                                            ProgressBar.class))));
                                        }
                                    }),
                            new ZPair(
                                    "remaining",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "bar",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressBar"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object bar = assignParameter(args, 0, false);
                                            Object remaining = null;
                                            if (!ZVal.isTrue(
                                                    env.callMethod(
                                                            bar,
                                                            "getMaxSteps",
                                                            ProgressBar.class))) {
                                                throw ZVal.getException(
                                                        env,
                                                        new LogicException(
                                                                env,
                                                                "Unable to display the remaining time if the maximum number of steps is not set."));
                                            }

                                            if (!ZVal.isTrue(
                                                    env.callMethod(
                                                            bar,
                                                            "getProgress",
                                                            ProgressBar.class))) {
                                                remaining = 0;

                                            } else {
                                                remaining =
                                                        function_round
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        ZVal.multiply(
                                                                                ZVal.divide(
                                                                                        ZVal
                                                                                                .subtract(
                                                                                                        NamespaceGlobal
                                                                                                                .time
                                                                                                                .env(
                                                                                                                        env)
                                                                                                                .call()
                                                                                                                .value(),
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        bar,
                                                                                                                        "getStartTime",
                                                                                                                        ProgressBar
                                                                                                                                .class)),
                                                                                        env
                                                                                                .callMethod(
                                                                                                        bar,
                                                                                                        "getProgress",
                                                                                                        ProgressBar
                                                                                                                .class)),
                                                                                ZVal.subtract(
                                                                                        env
                                                                                                .callMethod(
                                                                                                        bar,
                                                                                                        "getMaxSteps",
                                                                                                        ProgressBar
                                                                                                                .class),
                                                                                        env
                                                                                                .callMethod(
                                                                                                        bar,
                                                                                                        "getProgress",
                                                                                                        ProgressBar
                                                                                                                .class))))
                                                                .value();
                                            }

                                            return ZVal.assign(
                                                    Helper.runtimeStaticObject.formatTime(
                                                            env, remaining));
                                        }
                                    }),
                            new ZPair(
                                    "estimated",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "bar",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressBar"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object bar = assignParameter(args, 0, false);
                                            Object estimated = null;
                                            if (!ZVal.isTrue(
                                                    env.callMethod(
                                                            bar,
                                                            "getMaxSteps",
                                                            ProgressBar.class))) {
                                                throw ZVal.getException(
                                                        env,
                                                        new LogicException(
                                                                env,
                                                                "Unable to display the estimated time if the maximum number of steps is not set."));
                                            }

                                            if (!ZVal.isTrue(
                                                    env.callMethod(
                                                            bar,
                                                            "getProgress",
                                                            ProgressBar.class))) {
                                                estimated = 0;

                                            } else {
                                                estimated =
                                                        function_round
                                                                .f
                                                                .env(env)
                                                                .call(
                                                                        ZVal.multiply(
                                                                                ZVal.divide(
                                                                                        ZVal
                                                                                                .subtract(
                                                                                                        NamespaceGlobal
                                                                                                                .time
                                                                                                                .env(
                                                                                                                        env)
                                                                                                                .call()
                                                                                                                .value(),
                                                                                                        env
                                                                                                                .callMethod(
                                                                                                                        bar,
                                                                                                                        "getStartTime",
                                                                                                                        ProgressBar
                                                                                                                                .class)),
                                                                                        env
                                                                                                .callMethod(
                                                                                                        bar,
                                                                                                        "getProgress",
                                                                                                        ProgressBar
                                                                                                                .class)),
                                                                                env.callMethod(
                                                                                        bar,
                                                                                        "getMaxSteps",
                                                                                        ProgressBar
                                                                                                .class)))
                                                                .value();
                                            }

                                            return ZVal.assign(
                                                    Helper.runtimeStaticObject.formatTime(
                                                            env, estimated));
                                        }
                                    }),
                            new ZPair(
                                    "memory",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "bar",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressBar"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object bar = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    Helper.runtimeStaticObject.formatMemory(
                                                            env,
                                                            NamespaceGlobal.memory_get_usage
                                                                    .env(env)
                                                                    .call(true)
                                                                    .value()));
                                        }
                                    }),
                            new ZPair(
                                    "current",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "bar",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressBar"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object bar = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    NamespaceGlobal.str_pad
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            bar,
                                                                            "getProgress",
                                                                            ProgressBar.class),
                                                                    env.callMethod(
                                                                            bar,
                                                                            "getStepWidth",
                                                                            ProgressBar.class),
                                                                    " ",
                                                                    0)
                                                            .value());
                                        }
                                    }),
                            new ZPair(
                                    "max",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "bar",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressBar"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object bar = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    env.callMethod(
                                                            bar, "getMaxSteps", ProgressBar.class));
                                        }
                                    }),
                            new ZPair(
                                    "percent",
                                    new Closure(
                                            env,
                                            runtimeConverterFunctionClassConstants,
                                            "Symfony\\Component\\Console\\Helper",
                                            this) {
                                        @Override
                                        @ConvertedMethod
                                        @ConvertedParameter(
                                            index = 0,
                                            name = "bar",
                                            typeHint =
                                                    "Symfony\\Component\\Console\\Helper\\ProgressBar"
                                        )
                                        public Object run(
                                                RuntimeEnv env,
                                                Object thisvar,
                                                PassByReferenceArgs runtimePassByReferenceArgs,
                                                Object... args) {
                                            Object bar = assignParameter(args, 0, false);
                                            return ZVal.assign(
                                                    function_floor
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    ZVal.multiply(
                                                                            env.callMethod(
                                                                                    bar,
                                                                                    "getProgressPercent",
                                                                                    ProgressBar
                                                                                            .class),
                                                                            100))
                                                            .value());
                                        }
                                    })));
        }

        @ConvertedMethod
        private Object initFormats(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    ZVal.newArray(
                            new ZPair("normal", " %current%/%max% [%bar%] %percent:3s%%"),
                            new ZPair("normal_nomax", " %current% [%bar%]"),
                            new ZPair(
                                    "verbose",
                                    " %current%/%max% [%bar%] %percent:3s%% %elapsed:6s%"),
                            new ZPair("verbose_nomax", " %current% [%bar%] %elapsed:6s%"),
                            new ZPair(
                                    "very_verbose",
                                    " %current%/%max% [%bar%] %percent:3s%% %elapsed:6s%/%estimated:-6s%"),
                            new ZPair("very_verbose_nomax", " %current% [%bar%] %elapsed:6s%"),
                            new ZPair(
                                    "debug",
                                    " %current%/%max% [%bar%] %percent:3s%% %elapsed:6s%/%estimated:-6s% %memory:6s%"),
                            new ZPair(
                                    "debug_nomax", " %current% [%bar%] %elapsed:6s% %memory:6s%")));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object formatters = null;

        public Object formats = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\ProgressBar")
                    .setLookup(
                            ProgressBar.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "barChar",
                            "barWidth",
                            "emptyBarChar",
                            "firstRun",
                            "format",
                            "formatLineCount",
                            "internalFormat",
                            "max",
                            "messages",
                            "output",
                            "overwrite",
                            "percent",
                            "progressChar",
                            "redrawFreq",
                            "startTime",
                            "step",
                            "stepWidth",
                            "terminal")
                    .setStaticPropertyNames("formats", "formatters")
                    .setFilename("vendor/symfony/console/Helper/ProgressBar.php")
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

    private enum SwitchEnumType111 {
        DYNAMIC_TYPE_363,
        DYNAMIC_TYPE_364,
        DYNAMIC_TYPE_365,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
