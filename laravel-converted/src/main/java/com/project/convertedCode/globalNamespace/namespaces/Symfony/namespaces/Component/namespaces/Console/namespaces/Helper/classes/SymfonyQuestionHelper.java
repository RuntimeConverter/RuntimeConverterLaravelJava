package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.ConfirmationQuestion;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Formatter.classes.OutputFormatter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.ChoiceQuestion;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Style.classes.SymfonyStyle;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Helper.classes.QuestionHelper;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Helper/SymfonyQuestionHelper.php

*/

public class SymfonyQuestionHelper extends QuestionHelper {

    public SymfonyQuestionHelper(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SymfonyQuestionHelper(NoConstructor n) {
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
        name = "question",
        typeHint = "Symfony\\Component\\Console\\Question\\Question"
    )
    protected Object writePrompt(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object output = assignParameter(args, 0, false);
        Object question = assignParameter(args, 1, false);
        ReferenceContainer _pDefault = new BasicReferenceContainer(null);
        Object width = null;
        Object text = null;
        ReferenceContainer choices = new BasicReferenceContainer(null);
        Object value = null;
        Object key = null;
        text =
                OutputFormatter.runtimeStaticObject.escapeTrailingBackslash(
                        env, env.callMethod(question, "getQuestion", SymfonyQuestionHelper.class));
        _pDefault.setObject(env.callMethod(question, "getDefault", SymfonyQuestionHelper.class));
        SwitchEnumType113 switchVariable113 =
                ZVal.getEnum(
                        true,
                        SwitchEnumType113.DEFAULT_CASE,
                        SwitchEnumType113.DYNAMIC_TYPE_369,
                        ZVal.strictEqualityCheck(ZVal.getNull(), "===", _pDefault.getObject()),
                        SwitchEnumType113.DYNAMIC_TYPE_370,
                        ZVal.checkInstanceType(
                                question,
                                ConfirmationQuestion.class,
                                "Symfony\\Component\\Console\\Question\\ConfirmationQuestion"),
                        SwitchEnumType113.DYNAMIC_TYPE_371,
                        ZVal.toBool(
                                        ZVal.checkInstanceType(
                                                question,
                                                ChoiceQuestion.class,
                                                "Symfony\\Component\\Console\\Question\\ChoiceQuestion"))
                                && ZVal.toBool(
                                        env.callMethod(
                                                question,
                                                "isMultiselect",
                                                SymfonyQuestionHelper.class)),
                        SwitchEnumType113.DYNAMIC_TYPE_372,
                        ZVal.checkInstanceType(
                                question,
                                ChoiceQuestion.class,
                                "Symfony\\Component\\Console\\Question\\ChoiceQuestion"));
        switch (switchVariable113) {
            case DYNAMIC_TYPE_369:
                text = function_sprintf.f.env(env).call(" <info>%s</info>:", text).value();
                break;
            case DYNAMIC_TYPE_370:
                text =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        " <info>%s (yes/no)</info> [<comment>%s</comment>]:",
                                        text, ZVal.isTrue(_pDefault.getObject()) ? "yes" : "no")
                                .value();
                break;
            case DYNAMIC_TYPE_371:
                choices.setObject(
                        env.callMethod(question, "getChoices", SymfonyQuestionHelper.class));
                _pDefault.setObject(
                        function_explode.f.env(env).call(",", _pDefault.getObject()).value());
                runtimeConverterBreakCount = 0;
                for (ZPair zpairResult1694 : ZVal.getIterable(_pDefault.getObject(), env, false)) {
                    key = ZVal.assign(zpairResult1694.getKey());
                    value = ZVal.assign(zpairResult1694.getValue());
                    _pDefault
                            .arrayAccess(env, key)
                            .set(
                                    choices.arrayGet(
                                            env, function_trim.f.env(env).call(value).value()));
                }

                text =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        " <info>%s</info> [<comment>%s</comment>]:",
                                        text,
                                        OutputFormatter.runtimeStaticObject.escape(
                                                env,
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(", ", _pDefault.getObject())
                                                        .value()))
                                .value();
                break;
            case DYNAMIC_TYPE_372:
                choices.setObject(
                        env.callMethod(question, "getChoices", SymfonyQuestionHelper.class));
                text =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        " <info>%s</info> [<comment>%s</comment>]:",
                                        text,
                                        OutputFormatter.runtimeStaticObject.escape(
                                                env, choices.arrayGet(env, _pDefault.getObject())))
                                .value();
                break;
            case DEFAULT_CASE:
                text =
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        " <info>%s</info> [<comment>%s</comment>]:",
                                        text,
                                        OutputFormatter.runtimeStaticObject.escape(
                                                env, _pDefault.getObject()))
                                .value();
        }
        ;
        env.callMethod(output, "writeln", SymfonyQuestionHelper.class, text);
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        question,
                        ChoiceQuestion.class,
                        "Symfony\\Component\\Console\\Question\\ChoiceQuestion"))) {
            width =
                    NamespaceGlobal.max
                            .env(env)
                            .call(
                                    function_array_map
                                            .f
                                            .env(env)
                                            .call(
                                                    "strlen",
                                                    function_array_keys
                                                            .f
                                                            .env(env)
                                                            .call(
                                                                    env.callMethod(
                                                                            question,
                                                                            "getChoices",
                                                                            SymfonyQuestionHelper
                                                                                    .class))
                                                            .value())
                                            .value())
                            .value();
            runtimeConverterBreakCount = 0;
            for (ZPair zpairResult1695 :
                    ZVal.getIterable(
                            env.callMethod(question, "getChoices", SymfonyQuestionHelper.class),
                            env,
                            false)) {
                key = ZVal.assign(zpairResult1695.getKey());
                value = ZVal.assign(zpairResult1695.getValue());
                env.callMethod(
                        output,
                        "writeln",
                        SymfonyQuestionHelper.class,
                        function_sprintf
                                .f
                                .env(env)
                                .call(
                                        "  [<comment>%-"
                                                + toStringR(width, env)
                                                + "s</comment>] %s",
                                        key,
                                        value)
                                .value());
            }
        }

        env.callMethod(output, "write", SymfonyQuestionHelper.class, " > ");
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
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        output,
                        SymfonyStyle.class,
                        "Symfony\\Component\\Console\\Style\\SymfonyStyle"))) {
            env.callMethod(output, "newLine", SymfonyQuestionHelper.class);
            env.callMethod(
                    output,
                    "error",
                    SymfonyQuestionHelper.class,
                    env.callMethod(error, "getMessage", SymfonyQuestionHelper.class));
            return null;
        }

        super.writeError(env, output, error);
        return null;
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Helper\\SymfonyQuestionHelper";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends QuestionHelper.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Helper\\SymfonyQuestionHelper")
                    .setLookup(
                            SymfonyQuestionHelper.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("helperSet", "inputStream")
                    .setFilename("vendor/symfony/console/Helper/SymfonyQuestionHelper.php")
                    .addInterface("Symfony\\Component\\Console\\Helper\\HelperInterface")
                    .addExtendsClass("Symfony\\Component\\Console\\Helper\\QuestionHelper")
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

    private enum SwitchEnumType113 {
        DYNAMIC_TYPE_369,
        DYNAMIC_TYPE_370,
        DYNAMIC_TYPE_371,
        DYNAMIC_TYPE_372,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
