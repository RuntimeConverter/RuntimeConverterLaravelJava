package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_bool;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.Question;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Question/ConfirmationQuestion.php

*/

public class ConfirmationQuestion extends Question {

    public Object trueAnswerRegex = null;

    public ConfirmationQuestion(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConfirmationQuestion.class) {
            this.__construct(env, args);
        }
    }

    public ConfirmationQuestion(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "default",
        typeHint = "bool",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "trueAnswerRegex", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = true;
        }
        Object trueAnswerRegex = assignParameter(args, 2, true);
        if (null == trueAnswerRegex) {
            trueAnswerRegex = "/^y/i";
        }
        super.__construct(env, question, _pDefault);
        this.trueAnswerRegex = trueAnswerRegex;
        env.callMethod(
                this, "setNormalizer", ConfirmationQuestion.class, this.getDefaultNormalizer(env));
        return null;
    }

    @ConvertedMethod
    private Object getDefaultNormalizer(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Question")
                        .setFile("/vendor/symfony/console/Question/ConfirmationQuestion.php");
        Object _pDefault = null;
        Object regex = null;
        _pDefault = env.callMethod(this, "getDefault", ConfirmationQuestion.class);
        regex = ZVal.assign(this.trueAnswerRegex);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\Console\\Question",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "answer")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object answer = assignParameter(args, 0, false);
                        Object regex = null;
                        Object _pDefault = null;
                        Object answerIsTrue = null;
                        _pDefault = this.contextReferences.getCapturedValue("default");
                        regex = this.contextReferences.getCapturedValue("regex");
                        if (function_is_bool.f.env(env).call(answer).getBool()) {
                            return ZVal.assign(answer);
                        }

                        answerIsTrue =
                                ZVal.assign(
                                        ZVal.toBool(
                                                function_preg_match
                                                        .f
                                                        .env(env)
                                                        .call(regex, answer)
                                                        .value()));
                        if (ZVal.strictEqualityCheck(false, "===", _pDefault)) {
                            return ZVal.assign(ZVal.toBool(answer) && ZVal.toBool(answerIsTrue));
                        }

                        return ZVal.assign(
                                ZVal.toBool(!ZVal.isTrue(answer)) || ZVal.toBool(answerIsTrue));
                    }
                }.use("default", _pDefault).use("regex", regex));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Question\\ConfirmationQuestion";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Question.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Question\\ConfirmationQuestion")
                    .setLookup(
                            ConfirmationQuestion.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attempts",
                            "autocompleterValues",
                            "default",
                            "hidden",
                            "hiddenFallback",
                            "normalizer",
                            "question",
                            "trueAnswerRegex",
                            "validator")
                    .setFilename("vendor/symfony/console/Question/ConfirmationQuestion.php")
                    .addExtendsClass("Symfony\\Component\\Console\\Question\\Question")
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
