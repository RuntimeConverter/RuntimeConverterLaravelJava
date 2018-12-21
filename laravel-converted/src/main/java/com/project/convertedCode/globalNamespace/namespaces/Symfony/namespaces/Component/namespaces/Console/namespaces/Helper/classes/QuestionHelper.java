package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.file.function_fread;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatterStyle;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.Helper;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.RuntimeException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.ChoiceQuestion;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.string.function_rtrim;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_repeat;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Input.classes.StreamableInputInterface;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.string.function_substr;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Output.classes.ConsoleOutputInterface;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/QuestionHelper.php

*/

public class QuestionHelper extends Helper {

    public Object inputStream = null;

    public QuestionHelper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public QuestionHelper(NoConstructor n) {
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
    @ConvertedParameter(
        index = 2,
        name = "question",
        typeHint = "Symfony\\Component\\Console\\Question\\Question"
    )
    public Object ask(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Helper")
                        .setFile("/vendor/symfony/console/Helper/QuestionHelper.php");
        Object input = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object question = assignParameter(args, 2, false);
        Object interviewer = null;
        Object stream = null;
        ReferenceContainer choices = new BasicReferenceContainer(null);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        output,
                        ConsoleOutputInterface.class,
                        "Symfony\\Component\\Console\\Output\\ConsoleOutputInterface"))) {
            output = env.callMethod(output, "getErrorOutput", QuestionHelper.class);
        }

        if (!ZVal.isTrue(env.callMethod(input, "isInteractive", QuestionHelper.class))) {
            if (ZVal.isTrue(
                    ZVal.checkInstanceType(
                            question,
                            ChoiceQuestion.class,
                            "Symfony\\Component\\Console\\Question\\ChoiceQuestion"))) {
                choices.setObject(env.callMethod(question, "getChoices", QuestionHelper.class));
                return ZVal.assign(
                        choices.arrayGet(
                                env, env.callMethod(question, "getDefault", QuestionHelper.class)));
            }

            return ZVal.assign(env.callMethod(question, "getDefault", QuestionHelper.class));
        }

        if (ZVal.toBool(
                        ZVal.checkInstanceType(
                                input,
                                StreamableInputInterface.class,
                                "Symfony\\Component\\Console\\Input\\StreamableInputInterface"))
                && ZVal.toBool(stream = env.callMethod(input, "getStream", QuestionHelper.class))) {
            this.inputStream = stream;
        }

        if (!ZVal.isTrue(env.callMethod(question, "getValidator", QuestionHelper.class))) {
            return ZVal.assign(this.doAsk(env, output, question));
        }

        interviewer =
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\Console\\Helper",
                        this) {
                    @Override
                    @ConvertedMethod
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object _closureThisVar = this.getClosureThisVar();
                        Object output = null;
                        Object question = null;
                        output = this.contextReferences.getCapturedValue("output");
                        question = this.contextReferences.getCapturedValue("question");
                        return ZVal.assign(QuestionHelper.this.doAsk(env, output, question));
                    }
                }.use("output", output).use("question", question);
        return ZVal.assign(this.validateAttempts(env, interviewer, output, question));
    }

    @ConvertedMethod
    public Object getName(RuntimeEnv env, Object... args) {
        return "question";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "question",
        typeHint = "Symfony\\Component\\Console\\Question\\Question"
    )
    private Object doAsk(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object question = assignParameter(args, 1, false);
        ReferenceContainer ret = new BasicReferenceContainer(null);
        Object normalizer = null;
        Object autocomplete = null;
        Object e = null;
        Object inputStream = null;
        Object ternaryExpressionTemp = null;
        this.writePrompt(env, output, question);
        inputStream =
                ZVal.assign(
                        ZVal.isTrue(ternaryExpressionTemp = this.inputStream)
                                ? ternaryExpressionTemp
                                : function_constant.get(env, "STDIN"));
        autocomplete = env.callMethod(question, "getAutocompleterValues", QuestionHelper.class);
        if (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", autocomplete))
                || ZVal.toBool(!ZVal.isTrue(this.hasSttyAvailable(env)))) {
            ret.setObject(false);
            if (ZVal.isTrue(env.callMethod(question, "isHidden", QuestionHelper.class))) {
                try {
                    ret.setObject(
                            function_trim
                                    .f
                                    .env(env)
                                    .call(this.getHiddenResponse(env, output, inputStream))
                                    .value());
                } catch (ConvertedException convertedException243) {
                    if (convertedException243.instanceOf(
                            RuntimeException.class,
                            "Symfony\\Component\\Console\\Exception\\RuntimeException")) {
                        e = convertedException243.getObject();
                        if (!ZVal.isTrue(
                                env.callMethod(
                                        question, "isHiddenFallback", QuestionHelper.class))) {
                            throw ZVal.getException(env, e);
                        }

                    } else {
                        throw convertedException243;
                    }
                }
            }

            if (ZVal.strictEqualityCheck(false, "===", ret.getObject())) {
                ret.setObject(NamespaceGlobal.fgets.env(env).call(inputStream, 4096).value());
                if (ZVal.strictEqualityCheck(false, "===", ret.getObject())) {
                    throw ZVal.getException(env, new RuntimeException(env, "Aborted"));
                }

                ret.setObject(function_trim.f.env(env).call(ret.getObject()).value());
            }

        } else {
            ret.setObject(
                    function_trim
                            .f
                            .env(env)
                            .call(
                                    this.autocomplete(
                                            env,
                                            output,
                                            question,
                                            inputStream,
                                            function_is_array
                                                            .f
                                                            .env(env)
                                                            .call(autocomplete)
                                                            .getBool()
                                                    ? autocomplete
                                                    : NamespaceGlobal.iterator_to_array
                                                            .env(env)
                                                            .call(autocomplete, false)
                                                            .value()))
                            .value());
        }

        ret.setObject(
                ZVal.assign(
                        ZVal.isGreaterThan(
                                        function_strlen.f.env(env).call(ret.getObject()).value(),
                                        '>',
                                        0)
                                ? ret.getObject()
                                : env.callMethod(question, "getDefault", QuestionHelper.class)));
        if (ZVal.isTrue(
                normalizer = env.callMethod(question, "getNormalizer", QuestionHelper.class))) {
            return ZVal.assign(
                    env.callFunctionDynamic(
                                    normalizer,
                                    new RuntimeArgsWithReferences().add(0, ret),
                                    ret.getObject())
                            .value());
        }

        return ZVal.assign(ret.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "question",
        typeHint = "Symfony\\Component\\Console\\Question\\Question"
    )
    protected Object writePrompt(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object question = assignParameter(args, 1, false);
        Object width = null;
        ReferenceContainer messages = new BasicReferenceContainer(null);
        Object message = null;
        Object value = null;
        Object key = null;
        Object maxWidth = null;
        message = env.callMethod(question, "getQuestion", QuestionHelper.class);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        question,
                        ChoiceQuestion.class,
                        "Symfony\\Component\\Console\\Question\\ChoiceQuestion"))) {
            maxWidth =
                    NamespaceGlobal.max
                            .env(env)
                            .call(
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    ZVal.newArray(
                                                            new ZPair(0, this),
                                                            new ZPair(1, "strlen")),
                                                    function_array_keys
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            question,
                                                                            "getChoices",
                                                                            QuestionHelper.class))
                                                            .value())
                                            .value())
                            .value();
            messages.setObject(
                    ZVal.assign(
                            rToArrayCast(
                                    env.callMethod(
                                            question, "getQuestion", QuestionHelper.class))));
            for (ZPair zpairResult1691 :
                    ZVal.getIterable(
                            env.callMethod(question, "getChoices", QuestionHelper.class),
                            env,
                            false)) {
                key = ZVal.assign(zpairResult1691.getKey());
                value = ZVal.assign(zpairResult1691.getValue());
                width =
                        ZVal.subtract(
                                maxWidth,
                                env.callMethod(this, "strlen", QuestionHelper.class, key));
                messages.arrayAppend(env)
                        .set(
                                "  [<info>"
                                        + toStringR(key, env)
                                        + toStringR(
                                                function_str_repeat
                                                        .f
                                                        .env(env)
                                                        .call(" ", width)
                                                        .value(),
                                                env)
                                        + "</info>] "
                                        + toStringR(value, env));
            }

            env.callMethod(output, "writeln", QuestionHelper.class, messages.getObject());
            message = env.callMethod(question, "getPrompt", QuestionHelper.class);
        }

        env.callMethod(output, "write", QuestionHelper.class, message);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(index = 1, name = "error", typeHint = "Exception")
    protected Object writeError(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object error = assignParameter(args, 1, false);
        Object message = null;
        if (ZVal.toBool(
                        ZVal.strictNotEqualityCheck(
                                ZVal.getNull(),
                                "!==",
                                env.callMethod(this, "getHelperSet", QuestionHelper.class)))
                && ZVal.toBool(
                        env.callMethod(
                                env.callMethod(this, "getHelperSet", QuestionHelper.class),
                                "has",
                                QuestionHelper.class,
                                "formatter"))) {
            message =
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(this, "getHelperSet", QuestionHelper.class),
                                    "get",
                                    QuestionHelper.class,
                                    "formatter"),
                            "formatBlock",
                            QuestionHelper.class,
                            env.callMethod(error, "getMessage", QuestionHelper.class),
                            "error");

        } else {
            message =
                    "<error>"
                            + toStringR(
                                    env.callMethod(error, "getMessage", QuestionHelper.class), env)
                            + "</error>";
        }

        env.callMethod(output, "writeln", QuestionHelper.class, message);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 1,
        name = "question",
        typeHint = "Symfony\\Component\\Console\\Question\\Question"
    )
    @ConvertedParameter(index = 2, name = "inputStream")
    @ConvertedParameter(index = 3, name = "autocomplete", typeHint = "array")
    private Object autocomplete(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        int runtimeConverterContinueCount;
        Object output = assignParameter(args, 0, false);
        Object question = assignParameter(args, 1, false);
        Object inputStream = assignParameter(args, 2, false);
        Object autocomplete = assignParameter(args, 3, false);
        Object ret = null;
        Object sttyMode = null;
        ReferenceContainer numMatches = new BasicReferenceContainer(null);
        ReferenceContainer c = new BasicReferenceContainer(null);
        ReferenceContainer i = new BasicReferenceContainer(null);
        Object ofs = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object value = null;
        ret = "";
        i.setObject(0);
        ofs = -1;
        matches.setObject(ZVal.assign(autocomplete));
        numMatches.setObject(function_count.f.env(env).call(matches.getObject()).value());
        sttyMode = NamespaceGlobal.shell_exec.env(env).call("stty -g").value();
        NamespaceGlobal.shell_exec.env(env).call("stty -icanon -echo");
        env.callMethod(
                env.callMethod(output, "getFormatter", QuestionHelper.class),
                "setStyle",
                QuestionHelper.class,
                "hl",
                new OutputFormatterStyle(env, "black", "white"));
        runtimeConverterBreakCount = 0;
        runtimeConverterContinueCount = 0;
        while (!NamespaceGlobal.feof.env(env).call(inputStream).getBool()) {
            c.setObject(function_fread.f.env(env).call(inputStream, 1).value());
            if (ZVal.strictEqualityCheck("", "===", c.getObject())) {
                if (ZVal.toBool(ZVal.strictEqualityCheck(0, "===", numMatches.getObject()))
                        && ZVal.toBool(ZVal.strictNotEqualityCheck(0, "!==", i.getObject()))) {
                    i.setObject(ZVal.decrement(i.getObject()));
                    env.callMethod(output, "write", QuestionHelper.class, "\u001B[1D");
                }

                if (ZVal.strictEqualityCheck(0, "===", i.getObject())) {
                    ofs = -1;
                    matches.setObject(ZVal.assign(autocomplete));
                    numMatches.setObject(
                            function_count.f.env(env).call(matches.getObject()).value());

                } else {
                    numMatches.setObject(0);
                }

                ret = function_substr.f.env(env).call(ret, 0, i.getObject()).value();

            } else if (ZVal.strictEqualityCheck("\u001B", "===", c.getObject())) {
                c.setObject(
                        toStringR(c.getObject(), env)
                                + toStringR(
                                        function_fread.f.env(env).call(inputStream, 2).value(),
                                        env));
                if (ZVal.toBool(arrayActionR(ArrayAction.ISSET, c, env, 2))
                        && ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "A", "===", c.arrayGet(env, 2)))
                                        || ZVal.toBool(
                                                ZVal.strictEqualityCheck(
                                                        "B", "===", c.arrayGet(env, 2))))) {
                    if (ZVal.toBool(ZVal.strictEqualityCheck("A", "===", c.arrayGet(env, 2)))
                            && ZVal.toBool(ZVal.strictEqualityCheck(-1, "===", ofs))) {
                        ofs = 0;
                    }

                    if (ZVal.strictEqualityCheck(0, "===", numMatches.getObject())) {
                        continue;
                    }

                    ofs =
                            ZAssignment.add(
                                    "+=",
                                    ofs,
                                    ZVal.strictEqualityCheck("A", "===", c.arrayGet(env, 2))
                                            ? -1
                                            : 1);
                    ofs =
                            ZVal.modulus(
                                    ZVal.add(numMatches.getObject(), ofs), numMatches.getObject());
                }

            } else if (ZVal.isLessThan(
                    NamespaceGlobal.ord.env(env).call(c.getObject()).value(), '<', 32)) {
                if (ZVal.toBool(ZVal.strictEqualityCheck("\t", "===", c.getObject()))
                        || ZVal.toBool(ZVal.strictEqualityCheck("\n", "===", c.getObject()))) {
                    if (ZVal.toBool(ZVal.isGreaterThan(numMatches.getObject(), '>', 0))
                            && ZVal.toBool(ZVal.strictNotEqualityCheck(-1, "!==", ofs))) {
                        ret = ZVal.assign(matches.arrayGet(env, ofs));
                        env.callMethod(
                                output,
                                "write",
                                QuestionHelper.class,
                                function_substr.f.env(env).call(ret, i.getObject()).value());
                        i.setObject(function_strlen.f.env(env).call(ret).value());
                    }

                    if (ZVal.strictEqualityCheck("\n", "===", c.getObject())) {
                        env.callMethod(output, "write", QuestionHelper.class, c.getObject());
                        break;
                    }

                    numMatches.setObject(0);
                }

                continue;

            } else {
                env.callMethod(output, "write", QuestionHelper.class, c.getObject());
                ret = toStringR(ret, env) + toStringR(c.getObject(), env);
                i.setObject(ZVal.increment(i.getObject()));
                numMatches.setObject(0);
                ofs = 0;
                runtimeConverterBreakCount = 0;
                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1692 : ZVal.getIterable(autocomplete, env, true)) {
                    value = ZVal.assign(zpairResult1692.getValue());
                    if (ZVal.strictEqualityCheck(
                            0, "===", function_strpos.f.env(env).call(value, ret).value())) {
                        matches.arrayAccess(env, ZVal.postIncrement(numMatches)).set(value);
                    }
                }
            }

            env.callMethod(output, "write", QuestionHelper.class, "\u001B[K");
            if (ZVal.toBool(ZVal.isGreaterThan(numMatches.getObject(), '>', 0))
                    && ZVal.toBool(ZVal.strictNotEqualityCheck(-1, "!==", ofs))) {
                env.callMethod(output, "write", QuestionHelper.class, "\u001B7");
                env.callMethod(
                        output,
                        "write",
                        QuestionHelper.class,
                        "<hl>"
                                + toStringR(
                                        OutputFormatter.runtimeStaticObject.escapeTrailingBackslash(
                                                env,
                                                function_substr
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                matches.arrayGet(env, ofs),
                                                                i.getObject())
                                                        .value()),
                                        env)
                                + "</hl>");
                env.callMethod(output, "write", QuestionHelper.class, "\u001B8");
            }
        }

        NamespaceGlobal.shell_exec
                .env(env)
                .call(function_sprintf.f.env(env).call("stty %s", sttyMode).value());
        return ZVal.assign(ret);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(index = 1, name = "inputStream")
    private Object getHiddenResponse(RuntimeEnv env, Object... args) {
        Object output = assignParameter(args, 0, false);
        Object inputStream = assignParameter(args, 1, false);
        Object sttyMode = null;
        Object readCmd = null;
        Object exe = null;
        Object shell = null;
        Object tmpExe = null;
        Object value = null;
        Object command = null;
        if (ZVal.strictEqualityCheck("\\", "===", "/")) {
            exe =
                    toStringR(env.addRootFilesystemPrefix("/vendor/symfony/console/Helper"), env)
                            + "/../Resources/bin/hiddeninput.exe";
            if (ZVal.strictEqualityCheck(
                    "phar:",
                    "===",
                    function_substr
                            .f
                            .env(env)
                            .call(
                                    env.addRootFilesystemPrefix(
                                            "/vendor/symfony/console/Helper/QuestionHelper.php"),
                                    0,
                                    5)
                            .value())) {
                tmpExe =
                        toStringR(NamespaceGlobal.sys_get_temp_dir.env(env).call().value(), env)
                                + "/hiddeninput.exe";
                NamespaceGlobal.copy.env(env).call(exe, tmpExe);
                exe = ZVal.assign(tmpExe);
            }

            value =
                    function_rtrim
                            .f
                            .env(env)
                            .call(NamespaceGlobal.shell_exec.env(env).call(exe).value())
                            .value();
            env.callMethod(output, "writeln", QuestionHelper.class, "");
            if (ZVal.isset(tmpExe)) {
                NamespaceGlobal.unlink.env(env).call(tmpExe);
            }

            return ZVal.assign(value);
        }

        if (ZVal.isTrue(this.hasSttyAvailable(env))) {
            sttyMode = NamespaceGlobal.shell_exec.env(env).call("stty -g").value();
            NamespaceGlobal.shell_exec.env(env).call("stty -echo");
            value = NamespaceGlobal.fgets.env(env).call(inputStream, 4096).value();
            NamespaceGlobal.shell_exec
                    .env(env)
                    .call(function_sprintf.f.env(env).call("stty %s", sttyMode).value());
            if (ZVal.strictEqualityCheck(false, "===", value)) {
                throw ZVal.getException(env, new RuntimeException(env, "Aborted"));
            }

            value = function_trim.f.env(env).call(value).value();
            env.callMethod(output, "writeln", QuestionHelper.class, "");
            return ZVal.assign(value);
        }

        if (ZVal.strictNotEqualityCheck(false, "!==", shell = this.getShell(env))) {
            readCmd =
                    ZVal.assign(
                            ZVal.strictEqualityCheck("csh", "===", shell)
                                    ? "set mypassword = $<"
                                    : "read -r mypassword");
            command =
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "/usr/bin/env %s -c 'stty -echo; %s; stty echo; echo $mypassword'",
                                    shell, readCmd)
                            .value();
            value =
                    function_rtrim
                            .f
                            .env(env)
                            .call(NamespaceGlobal.shell_exec.env(env).call(command).value())
                            .value();
            env.callMethod(output, "writeln", QuestionHelper.class, "");
            return ZVal.assign(value);
        }

        throw ZVal.getException(env, new RuntimeException(env, "Unable to hide the response."));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "interviewer", typeHint = "callable")
    @ConvertedParameter(
        index = 1,
        name = "output",
        typeHint = "Symfony\\Component\\Console\\Output\\OutputInterface"
    )
    @ConvertedParameter(
        index = 2,
        name = "question",
        typeHint = "Symfony\\Component\\Console\\Question\\Question"
    )
    private Object validateAttempts(RuntimeEnv env, Object... args) {
        Object interviewer = assignParameter(args, 0, false);
        Object output = assignParameter(args, 1, false);
        Object question = assignParameter(args, 2, false);
        Object e = null;
        Object error = null;
        ReferenceContainer attempts = new BasicReferenceContainer(null);
        error = ZVal.getNull();
        attempts.setObject(env.callMethod(question, "getMaxAttempts", QuestionHelper.class));
        while (ZVal.toBool(ZVal.strictEqualityCheck(ZVal.getNull(), "===", attempts.getObject()))
                || ZVal.toBool(ZVal.postDecrement(attempts))) {
            if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", error)) {
                this.writeError(env, output, error);
            }

            try {
                return ZVal.assign(
                        function_call_user_func
                                .f
                                .env(env)
                                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                                .call(
                                        env.callMethod(
                                                question, "getValidator", QuestionHelper.class),
                                        env.callFunctionDynamic(
                                                        interviewer,
                                                        new RuntimeArgsWithReferences())
                                                .value())
                                .value());
            } catch (ConvertedException convertedException244) {
                if (convertedException244.instanceOf(
                        RuntimeException.class,
                        "Symfony\\Component\\Console\\Exception\\RuntimeException")) {
                    e = convertedException244.getObject();
                    throw ZVal.getException(env, e);
                } else if (convertedException244.instanceOf(PHPException.class, "Exception")) {
                    error = convertedException244.getObject();
                } else {
                    throw convertedException244;
                }
            }
        }

        throw ZVal.getException(env, error);
    }

    @ConvertedMethod
    private Object getShell(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object test = null;
        Object sh = null;
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
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
                                        .QuestionHelper
                                        .RequestStaticProperties
                                        .class)
                        .shell)) {
            return ZVal.assign(
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
                                            .QuestionHelper
                                            .RequestStaticProperties
                                            .class)
                            .shell);
        }

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
                                        .QuestionHelper
                                        .RequestStaticProperties
                                        .class)
                        .shell =
                false;
        if (function_file_exists.f.env(env).call("/usr/bin/env").getBool()) {
            test = "/usr/bin/env %s -c 'echo OK' 2> /dev/null";
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1693 :
                    ZVal.getIterable(ZVal.arrayFromList("bash", "zsh", "ksh", "csh"), env, true)) {
                sh = ZVal.assign(zpairResult1693.getValue());
                if (ZVal.strictEqualityCheck(
                        "OK",
                        "===",
                        function_rtrim
                                .f
                                .env(env)
                                .call(
                                        NamespaceGlobal.shell_exec
                                                .env(env)
                                                .call(
                                                        function_sprintf
                                                                .f
                                                                .env(env)
                                                                .call(test, sh)
                                                                .value())
                                                .value())
                                .value())) {
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
                                                    .QuestionHelper
                                                    .RequestStaticProperties
                                                    .class)
                                    .shell =
                            sh;
                    break;
                }
            }
        }

        return ZVal.assign(
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
                                        .QuestionHelper
                                        .RequestStaticProperties
                                        .class)
                        .shell);
    }

    @ConvertedMethod
    private Object hasSttyAvailable(RuntimeEnv env, Object... args) {
        ReferenceContainer output = new BasicReferenceContainer(null);
        ReferenceContainer exitcode = new BasicReferenceContainer(null);
        if (ZVal.strictNotEqualityCheck(
                ZVal.getNull(),
                "!==",
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
                                        .QuestionHelper
                                        .RequestStaticProperties
                                        .class)
                        .stty)) {
            return ZVal.assign(
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
                                            .QuestionHelper
                                            .RequestStaticProperties
                                            .class)
                            .stty);
        }

        NamespaceGlobal.exec
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithReferences().add(1, output).add(2, exitcode))
                .call("stty 2>&1", output.getObject(), exitcode.getObject());
        return ZVal.assign(
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
                                                .QuestionHelper
                                                .RequestStaticProperties
                                                .class)
                                .stty =
                        ZVal.strictEqualityCheck(0, "===", exitcode.getObject()));
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Helper\\QuestionHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Helper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object disableStty(RuntimeEnv env, Object... args) {
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
                                            .QuestionHelper
                                            .RequestStaticProperties
                                            .class)
                            .stty =
                    false;
            return null;
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object shell = null;

        public Object stty = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\QuestionHelper")
                    .setLookup(
                            QuestionHelper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("helperSet", "inputStream")
                    .setStaticPropertyNames("shell", "stty")
                    .setFilename("vendor/symfony/console/Helper/QuestionHelper.php")
                    .addInterface("Symfony\\Component\\Console\\Helper\\HelperInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Helper\\Helper")
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
