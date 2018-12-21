package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.ConfirmationQuestion;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.BufferedOutput;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_flip;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes.OutputStyle;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.Question;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.ChoiceQuestion;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Table;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.classes.Terminal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.SymfonyQuestionHelper;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unshift;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Style/SymfonyStyle.php

*/

public class SymfonyStyle extends OutputStyle {

    public Object input = null;

    public Object questionHelper = null;

    public Object progressBar = null;

    public Object lineLength = null;

    public Object bufferedOutput = null;

    public SymfonyStyle(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SymfonyStyle.class) {
            this.__construct(env, args);
        }
    }

    public SymfonyStyle(NoConstructor n) {
        super(n);
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
    public Object __construct(RuntimeEnv env, Object... args) {
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object width = null;
        Object ternaryExpressionTemp = null;
        this.input = input;
        this.bufferedOutput =
                new BufferedOutput(
                        env,
                        env.callMethod(output, "getVerbosity", SymfonyStyle.class),
                        false,
                        ((RuntimeClassInterface)
                                        env.callMethod(output, "getFormatter", SymfonyStyle.class))
                                .phpClone(env));
        width =
                ZVal.assign(
                        ZVal.isTrue(
                                        ternaryExpressionTemp =
                                                env.callMethod(
                                                        new Terminal(env),
                                                        "getWidth",
                                                        SymfonyStyle.class))
                                ? ternaryExpressionTemp
                                : CONST_MAX_LINE_LENGTH);
        this.lineLength =
                NamespaceGlobal.min
                        .env(env)
                        .call(
                                ZVal.subtract(
                                        width,
                                        ZVal.toLong(ZVal.strictEqualityCheck("/", "===", "\\"))),
                                CONST_MAX_LINE_LENGTH)
                        .value();
        super.__construct(env, output);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(
        index = 1,
        name = "type",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "style",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "prefix")
    @ConvertedParameter(
        index = 4,
        name = "padding",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "escape",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object block(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object style = assignParameter(args, 2, true);
        if (null == style) {
            style = ZVal.getNull();
        }
        Object prefix = assignParameter(args, 3, true);
        if (null == prefix) {
            prefix = " ";
        }
        Object padding = assignParameter(args, 4, true);
        if (null == padding) {
            padding = false;
        }
        Object escape = assignParameter(args, 5, true);
        if (null == escape) {
            escape = true;
        }
        messages =
                ZVal.assign(
                        function_is_array.f.env(env).call(messages).getBool()
                                ? function_array_values.f.env(env).call(messages).value()
                                : ZVal.newArray(new ZPair(0, messages)));
        this.autoPrependBlock(env);
        this.writeln(env, this.createBlock(env, messages, type, style, prefix, padding, escape));
        this.newLine(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object title(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.autoPrependBlock(env);
        this.writeln(
                env,
                ZVal.newArray(
                        new ZPair(
                                0,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<comment>%s</>",
                                                OutputFormatter.runtimeStaticObject
                                                        .escapeTrailingBackslash(env, message))
                                        .value()),
                        new ZPair(
                                1,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<comment>%s</>",
                                                function_str_repeat
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "=",
                                                                Helper.runtimeStaticObject
                                                                        .strlenWithoutDecoration(
                                                                                env,
                                                                                env.callMethod(
                                                                                        this,
                                                                                        "getFormatter",
                                                                                        SymfonyStyle
                                                                                                .class),
                                                                                message))
                                                        .value())
                                        .value())));
        this.newLine(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object section(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.autoPrependBlock(env);
        this.writeln(
                env,
                ZVal.newArray(
                        new ZPair(
                                0,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<comment>%s</>",
                                                OutputFormatter.runtimeStaticObject
                                                        .escapeTrailingBackslash(env, message))
                                        .value()),
                        new ZPair(
                                1,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "<comment>%s</>",
                                                function_str_repeat
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "-",
                                                                Helper.runtimeStaticObject
                                                                        .strlenWithoutDecoration(
                                                                                env,
                                                                                env.callMethod(
                                                                                        this,
                                                                                        "getFormatter",
                                                                                        SymfonyStyle
                                                                                                .class),
                                                                                message))
                                                        .value())
                                        .value())));
        this.newLine(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "elements", typeHint = "array")
    public Object listing(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Style")
                        .setFile("/vendor/symfony/console/Style/SymfonyStyle.php");
        Object elements = assignParameter(args, 0, false);
        this.autoPrependText(env);
        elements =
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Symfony\\Component\\Console\\Style",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "element")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object element = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(" * %s", element)
                                                        .value());
                                    }
                                },
                                elements)
                        .value();
        this.writeln(env, elements);
        this.newLine(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object text(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object messages = null;
        this.autoPrependText(env);
        messages =
                ZVal.assign(
                        function_is_array.f.env(env).call(message).getBool()
                                ? function_array_values.f.env(env).call(message).value()
                                : ZVal.newArray(new ZPair(0, message)));
        for (ZPair zpairResult1744 : ZVal.getIterable(messages, env, true)) {
            message = ZVal.assign(zpairResult1744.getValue());
            this.writeln(env, function_sprintf.f.env(env).call(" %s", message).value());
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object comment(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.block(
                env,
                message,
                ZVal.getNull(),
                ZVal.getNull(),
                "<fg=default;bg=default> // </>",
                false,
                false);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object success(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.block(env, message, "OK", "fg=black;bg=green", " ", true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object error(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.block(env, message, "ERROR", "fg=white;bg=red", " ", true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object warning(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.block(env, message, "WARNING", "fg=white;bg=red", " ", true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object note(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.block(env, message, "NOTE", "fg=yellow", " ! ");
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    public Object caution(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        this.block(env, message, "CAUTION", "fg=white;bg=red", " ! ", true);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "headers", typeHint = "array")
    @ConvertedParameter(index = 1, name = "rows", typeHint = "array")
    public Object table(RuntimeEnv env, Object... args) {
        Object headers = assignParameter(args, 0, false);
        Object rows = assignParameter(args, 1, false);
        Object style = null;
        Object table = null;
        style =
                ZVal.assign(
                        ((RuntimeClassInterface)
                                        Table.runtimeStaticObject.getStyleDefinition(
                                                env, "symfony-style-guide"))
                                .phpClone(env));
        env.callMethod(style, "setCellHeaderFormat", SymfonyStyle.class, "<info>%s</info>");
        table = new Table(env, this);
        env.callMethod(table, "setHeaders", SymfonyStyle.class, headers);
        env.callMethod(table, "setRows", SymfonyStyle.class, rows);
        env.callMethod(table, "setStyle", SymfonyStyle.class, style);
        env.callMethod(table, "render", SymfonyStyle.class);
        this.newLine(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "validator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object ask(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        Object validator = assignParameter(args, 2, true);
        if (null == validator) {
            validator = ZVal.getNull();
        }
        question = new Question(env, question, _pDefault);
        env.callMethod(question, "setValidator", SymfonyStyle.class, validator);
        return ZVal.assign(this.askQuestion(env, question));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(
        index = 1,
        name = "validator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object askHidden(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object validator = assignParameter(args, 1, true);
        if (null == validator) {
            validator = ZVal.getNull();
        }
        question = new Question(env, question);
        env.callMethod(question, "setHidden", SymfonyStyle.class, true);
        env.callMethod(question, "setValidator", SymfonyStyle.class, validator);
        return ZVal.assign(this.askQuestion(env, question));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object confirm(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = true;
        }
        return ZVal.assign(
                this.askQuestion(env, new ConfirmationQuestion(env, question, _pDefault)));
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
    public Object choice(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object choices = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        ReferenceContainer values = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", _pDefault)) {
            values.setObject(function_array_flip.f.env(env).call(choices).value());
            _pDefault = ZVal.assign(values.arrayGet(env, _pDefault));
        }

        return ZVal.assign(
                this.askQuestion(env, new ChoiceQuestion(env, question, choices, _pDefault)));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "max", defaultValue = "0", defaultValueType = "number")
    public Object progressStart(RuntimeEnv env, Object... args) {
        Object max = assignParameter(args, 0, true);
        if (null == max) {
            max = 0;
        }
        this.progressBar = this.createProgressBar(env, max);
        env.callMethod(this.progressBar, "start", SymfonyStyle.class);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "step", defaultValue = "1", defaultValueType = "number")
    public Object progressAdvance(RuntimeEnv env, Object... args) {
        Object step = assignParameter(args, 0, true);
        if (null == step) {
            step = 1;
        }
        env.callMethod(this.getProgressBar(env), "advance", SymfonyStyle.class, step);
        return null;
    }

    @ConvertedMethod
    public Object progressFinish(RuntimeEnv env, Object... args) {
        env.callMethod(this.getProgressBar(env), "finish", SymfonyStyle.class);
        this.newLine(env, 2);
        this.progressBar = ZVal.getNull();
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "max", defaultValue = "0", defaultValueType = "number")
    public Object createProgressBar(RuntimeEnv env, Object... args) {
        Object max = assignParameter(args, 0, true);
        if (null == max) {
            max = 0;
        }
        Object progressBar = null;
        progressBar = super.createProgressBar(env, max);
        if (ZVal.strictNotEqualityCheck("\\", "!==", "/")) {
            env.callMethod(progressBar, "setEmptyBarCharacter", SymfonyStyle.class, "\u2591");
            env.callMethod(progressBar, "setProgressCharacter", SymfonyStyle.class, "");
            env.callMethod(progressBar, "setBarCharacter", SymfonyStyle.class, "\u2593");
        }

        return ZVal.assign(progressBar);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "question",
        typeHint = "Symfony\\Component\\Console\\Question\\Question"
    )
    public Object askQuestion(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object answer = null;
        if (ZVal.isTrue(env.callMethod(this.input, "isInteractive", SymfonyStyle.class))) {
            this.autoPrependBlock(env);
        }

        if (!ZVal.isTrue(this.questionHelper)) {
            this.questionHelper = new SymfonyQuestionHelper(env);
        }

        answer =
                env.callMethod(
                        this.questionHelper, "ask", SymfonyStyle.class, this.input, this, question);
        if (ZVal.isTrue(env.callMethod(this.input, "isInteractive", SymfonyStyle.class))) {
            this.newLine(env);
            env.callMethod(this.bufferedOutput, "write", SymfonyStyle.class, "\n");
        }

        return ZVal.assign(answer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(index = 1, name = "type")
    public Object writeln(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = CONST_OUTPUT_NORMAL;
        }
        Object message = null;
        if (!NamespaceGlobal.is_iterable.env(env).call(messages).getBool()) {
            messages = ZVal.newArray(new ZPair(0, messages));
        }

        for (ZPair zpairResult1745 : ZVal.getIterable(messages, env, true)) {
            message = ZVal.assign(zpairResult1745.getValue());
            super.writeln(env, message, type);
            this.writeBuffer(env, message, true, type);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages")
    @ConvertedParameter(
        index = 1,
        name = "newline",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "type")
    public Object write(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object newline = assignParameter(args, 1, true);
        if (null == newline) {
            newline = false;
        }
        Object type = assignParameter(args, 2, true);
        if (null == type) {
            type = CONST_OUTPUT_NORMAL;
        }
        Object message = null;
        if (!NamespaceGlobal.is_iterable.env(env).call(messages).getBool()) {
            messages = ZVal.newArray(new ZPair(0, messages));
        }

        for (ZPair zpairResult1746 : ZVal.getIterable(messages, env, true)) {
            message = ZVal.assign(zpairResult1746.getValue());
            super.write(env, message, newline, type);
            this.writeBuffer(env, message, newline, type);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "count", defaultValue = "1", defaultValueType = "number")
    public Object newLine(RuntimeEnv env, Object... args) {
        Object count = assignParameter(args, 0, true);
        if (null == count) {
            count = 1;
        }
        super.newLine(env, count);
        env.callMethod(
                this.bufferedOutput,
                "write",
                SymfonyStyle.class,
                function_str_repeat.f.env(env).call("\n", count).value());
        return null;
    }

    @ConvertedMethod
    public Object getErrorStyle(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Symfony
                        .namespaces
                        .Component
                        .namespaces
                        .Console
                        .namespaces
                        .Style
                        .classes
                        .SymfonyStyle(
                        env,
                        this.input,
                        env.callMethod(this, "getErrorOutput", SymfonyStyle.class)));
    }

    @ConvertedMethod
    private Object getProgressBar(RuntimeEnv env, Object... args) {
        if (!ZVal.isTrue(this.progressBar)) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "The ProgressBar is not started."));
        }

        return ZVal.assign(this.progressBar);
    }

    @ConvertedMethod
    private Object autoPrependBlock(RuntimeEnv env, Object... args) {
        ReferenceContainer chars = new BasicReferenceContainer(null);
        chars.setObject(
                function_substr
                        .f
                        .env(env)
                        .call(
                                function_str_replace
                                        .f
                                        .env(env)
                                        .call(
                                                "\n",
                                                "\n",
                                                env.callMethod(
                                                        this.bufferedOutput,
                                                        "fetch",
                                                        SymfonyStyle.class))
                                        .value(),
                                -2)
                        .value());
        if (!arrayActionR(ArrayAction.ISSET, chars, env, 0)) {
            this.newLine(env);
            return null;
        }

        this.newLine(
                env,
                ZVal.subtract(
                        2,
                        NamespaceGlobal.substr_count
                                .env(env)
                                .call(chars.getObject(), "\n")
                                .value()));
        return null;
    }

    @ConvertedMethod
    private Object autoPrependText(RuntimeEnv env, Object... args) {
        Object fetched = null;
        fetched = env.callMethod(this.bufferedOutput, "fetch", SymfonyStyle.class);
        if (ZVal.strictNotEqualityCheck(
                "\n", "!==", function_substr.f.env(env).call(fetched, -1).value())) {
            this.newLine(env);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message", typeHint = "string")
    @ConvertedParameter(index = 1, name = "newLine", typeHint = "bool")
    @ConvertedParameter(index = 2, name = "type", typeHint = "int")
    private Object writeBuffer(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object newLine = assignParameter(args, 1, false);
        Object type = assignParameter(args, 2, false);
        env.callMethod(
                this.bufferedOutput,
                "write",
                SymfonyStyle.class,
                function_substr.f.env(env).call(message, -4).value(),
                newLine,
                type);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "messages", typeHint = "iterable")
    @ConvertedParameter(
        index = 1,
        name = "type",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "style",
        typeHint = "string",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 3, name = "prefix", typeHint = "string")
    @ConvertedParameter(
        index = 4,
        name = "padding",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 5,
        name = "escape",
        typeHint = "bool",
        defaultValue = "false",
        defaultValueType = "constant"
    )
    private Object createBlock(RuntimeEnv env, Object... args) {
        Object messages = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = ZVal.getNull();
        }
        Object style = assignParameter(args, 2, true);
        if (null == style) {
            style = ZVal.getNull();
        }
        Object prefix = assignParameter(args, 3, true);
        if (null == prefix) {
            prefix = " ";
        }
        Object padding = assignParameter(args, 4, true);
        if (null == padding) {
            padding = false;
        }
        Object escape = assignParameter(args, 5, true);
        if (null == escape) {
            escape = false;
        }
        Object lineIndentation = null;
        ReferenceContainer line = new BasicReferenceContainer(null);
        Object firstLineIndex = null;
        Object i = null;
        Object indentLength = null;
        Object message = null;
        Object prefixLength = null;
        ReferenceContainer lines = new BasicReferenceContainer(null);
        Object key = null;
        indentLength = 0;
        prefixLength =
                Helper.runtimeStaticObject.strlenWithoutDecoration(
                        env, env.callMethod(this, "getFormatter", SymfonyStyle.class), prefix);
        lines.setObject(ZVal.newArray());
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", type)) {
            type = function_sprintf.f.env(env).call("[%s] ", type).value();
            indentLength = function_strlen.f.env(env).call(type).value();
            lineIndentation = function_str_repeat.f.env(env).call(" ", indentLength).value();
        }

        for (ZPair zpairResult1747 : ZVal.getIterable(messages, env, false)) {
            key = ZVal.assign(zpairResult1747.getKey());
            message = ZVal.assign(zpairResult1747.getValue());
            if (ZVal.isTrue(escape)) {
                message = OutputFormatter.runtimeStaticObject.escape(env, message);
            }

            lines.setObject(
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    lines.getObject(),
                                    function_explode
                                            .f
                                            .env(env)
                                            .call(
                                                    "\n",
                                                    NamespaceGlobal.wordwrap
                                                            .env(env)
                                                            .call(
                                                                    message,
                                                                    ZVal.subtract(
                                                                            ZVal.subtract(
                                                                                    this.lineLength,
                                                                                    prefixLength),
                                                                            indentLength),
                                                                    "\n",
                                                                    true)
                                                            .value())
                                            .value())
                            .value());
            if (ZVal.toBool(
                            ZVal.isGreaterThan(
                                    function_count.f.env(env).call(messages).value(), '>', 1))
                    && ZVal.toBool(
                            ZVal.isLessThan(
                                    key,
                                    '<',
                                    ZVal.subtract(
                                            function_count.f.env(env).call(messages).value(),
                                            1)))) {
                lines.arrayAppend(env).set("");
            }
        }

        firstLineIndex = 0;
        if (ZVal.toBool(padding)
                && ZVal.toBool(env.callMethod(this, "isDecorated", SymfonyStyle.class))) {
            firstLineIndex = 1;
            function_array_unshift.f.env(env).call(lines.getObject(), "");
            lines.arrayAppend(env).set("");
        }

        for (ZPair zpairResult1748 : ZVal.getIterable(lines.getObject(), env, false)) {
            i = ZVal.assign(zpairResult1748.getKey());
            line = zpairResult1748;
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", type)) {
                line.setObject(
                        ZVal.assign(
                                ZVal.strictEqualityCheck(firstLineIndex, "===", i)
                                        ? toStringR(type, env) + toStringR(line.getObject(), env)
                                        : toStringR(lineIndentation, env)
                                                + toStringR(line.getObject(), env)));
            }

            line.setObject(toStringR(prefix, env) + toStringR(line.getObject(), env));
            line.setObject(
                    toStringR(line.getObject(), env)
                            + toStringR(
                                    function_str_repeat
                                            .f
                                            .env(env)
                                            .call(
                                                    " ",
                                                    ZVal.subtract(
                                                            this.lineLength,
                                                            Helper.runtimeStaticObject
                                                                    .strlenWithoutDecoration(
                                                                            env,
                                                                            env.callMethod(
                                                                                    this,
                                                                                    "getFormatter",
                                                                                    SymfonyStyle
                                                                                            .class),
                                                                            line.getObject())))
                                            .value(),
                                    env));
            if (ZVal.isTrue(style)) {
                line.setObject(
                        function_sprintf
                                .f
                                .env(env)
                                .call("<%s>%s</>", style, line.getObject())
                                .value());
            }
        }

        return ZVal.assign(lines.getObject());
    }

    public static final Object CONST_MAX_LINE_LENGTH = 120;

    public static final Object CONST_class = "Symfony\\Component\\Console\\Style\\SymfonyStyle";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends OutputStyle.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Style\\SymfonyStyle")
                    .setLookup(
                            SymfonyStyle.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "bufferedOutput",
                            "input",
                            "lineLength",
                            "output",
                            "progressBar",
                            "questionHelper")
                    .setFilename("vendor/symfony/console/Style/SymfonyStyle.php")
                    .addInterface("Symfony\\Component\\Console\\Output\\OutputInterface")
                    .addInterface("Symfony\\Component\\Console\\Style\\StyleInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Style\\OutputStyle")
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
