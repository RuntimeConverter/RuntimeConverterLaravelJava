package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_search;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes.Question;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Question/ChoiceQuestion.php

*/

public class ChoiceQuestion extends Question {

    public Object choices = null;

    public Object multiselect = false;

    public Object prompt = " > ";

    public Object errorMessage = "Value \"%s\" is invalid";

    public ChoiceQuestion(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ChoiceQuestion.class) {
            this.__construct(env, args);
        }
    }

    public ChoiceQuestion(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question", typeHint = "string")
    @ConvertedParameter(index = 1, name = "choices", typeHint = "array")
    @ConvertedParameter(
        index = 2,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object choices = assignParameter(args, 1, false);
        Object _pDefault = assignParameter(args, 2, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        if (!ZVal.isTrue(choices)) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env, "Choice question must have at least 1 choice available."));
        }

        super.__construct(env, question, _pDefault);
        this.choices = choices;
        env.callMethod(this, "setValidator", ChoiceQuestion.class, this.getDefaultValidator(env));
        env.callMethod(this, "setAutocompleterValues", ChoiceQuestion.class, choices);
        return null;
    }

    @ConvertedMethod
    public Object getChoices(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.choices);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "multiselect")
    public Object setMultiselect(RuntimeEnv env, Object... args) {
        Object multiselect = assignParameter(args, 0, false);
        this.multiselect = multiselect;
        env.callMethod(this, "setValidator", ChoiceQuestion.class, this.getDefaultValidator(env));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object isMultiselect(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.multiselect);
    }

    @ConvertedMethod
    public Object getPrompt(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.prompt);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prompt")
    public Object setPrompt(RuntimeEnv env, Object... args) {
        Object prompt = assignParameter(args, 0, false);
        this.prompt = prompt;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "errorMessage")
    public Object setErrorMessage(RuntimeEnv env, Object... args) {
        Object errorMessage = assignParameter(args, 0, false);
        this.errorMessage = errorMessage;
        env.callMethod(this, "setValidator", ChoiceQuestion.class, this.getDefaultValidator(env));
        return ZVal.assign(this);
    }

    @ConvertedMethod
    private Object getDefaultValidator(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/symfony/console/Question")
                        .setFile("/vendor/symfony/console/Question/ChoiceQuestion.php");
        Object multiselect = null;
        Object errorMessage = null;
        Object choices = null;
        Object isAssoc = null;
        choices = ZVal.assign(this.choices);
        errorMessage = ZVal.assign(this.errorMessage);
        multiselect = ZVal.assign(this.multiselect);
        isAssoc = env.callMethod(this, "isAssoc", ChoiceQuestion.class, choices);
        return ZVal.assign(
                new Closure(
                        env,
                        runtimeConverterFunctionClassConstants,
                        "Symfony\\Component\\Console\\Question",
                        this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "selected")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object selected = assignParameter(args, 0, false);
                        ReferenceContainer multiselectChoices = new BasicReferenceContainer(null);
                        Object errorMessage = null;
                        ReferenceContainer matches = new BasicReferenceContainer(null);
                        Object multiselect = null;
                        Object result = null;
                        Object selectedChoices = null;
                        Object choice = null;
                        ReferenceContainer choices = new BasicReferenceContainer(null);
                        ReferenceContainer results = new BasicReferenceContainer(null);
                        Object value = null;
                        Object key = null;
                        Object isAssoc = null;
                        multiselect = this.contextReferences.getCapturedValue("multiselect");
                        errorMessage = this.contextReferences.getCapturedValue("errorMessage");
                        choices = this.contextReferences.getReferenceContainer("choices");
                        isAssoc = this.contextReferences.getCapturedValue("isAssoc");
                        selectedChoices =
                                function_str_replace.f.env(env).call(" ", "", selected).value();
                        if (ZVal.isTrue(multiselect)) {
                            if (!function_preg_match
                                    .f
                                    .env(env)
                                    .addReferenceArgs(
                                            new RuntimeArgsWithReferences().add(2, matches))
                                    .call(
                                            "/^[^,]+(?:,[^,]+)*$/",
                                            selectedChoices,
                                            matches.getObject())
                                    .getBool()) {
                                throw ZVal.getException(
                                        env,
                                        new InvalidArgumentException(
                                                env,
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(errorMessage, selected)
                                                        .value()));
                            }

                            selectedChoices =
                                    function_explode.f.env(env).call(",", selectedChoices).value();

                        } else {
                            selectedChoices = ZVal.newArray(new ZPair(0, selected));
                        }

                        multiselectChoices.setObject(ZVal.newArray());
                        for (ZPair zpairResult1742 : ZVal.getIterable(selectedChoices, env, true)) {
                            value = ZVal.assign(zpairResult1742.getValue());
                            results.setObject(ZVal.newArray());
                            for (ZPair zpairResult1743 :
                                    ZVal.getIterable(choices.getObject(), env, false)) {
                                key = ZVal.assign(zpairResult1743.getKey());
                                choice = ZVal.assign(zpairResult1743.getValue());
                                if (ZVal.strictEqualityCheck(choice, "===", value)) {
                                    results.arrayAppend(env).set(key);
                                }
                            }

                            if (ZVal.isGreaterThan(
                                    function_count.f.env(env).call(results.getObject()).value(),
                                    '>',
                                    1)) {
                                throw ZVal.getException(
                                        env,
                                        new InvalidArgumentException(
                                                env,
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                "The provided answer is ambiguous. Value should be one of %s.",
                                                                NamespaceGlobal.implode
                                                                        .env(env)
                                                                        .call(
                                                                                " or ",
                                                                                results.getObject())
                                                                        .value())
                                                        .value()));
                            }

                            result =
                                    function_array_search
                                            .f
                                            .env(env)
                                            .call(value, choices.getObject())
                                            .value();
                            if (!ZVal.isTrue(isAssoc)) {
                                if (ZVal.strictNotEqualityCheck(false, "!==", result)) {
                                    result = ZVal.assign(choices.arrayGet(env, result));

                                } else if (arrayActionR(ArrayAction.ISSET, choices, env, value)) {
                                    result = ZVal.assign(choices.arrayGet(env, value));
                                }

                            } else if (ZVal.toBool(ZVal.strictEqualityCheck(false, "===", result))
                                    && ZVal.toBool(
                                            arrayActionR(ArrayAction.ISSET, choices, env, value))) {
                                result = ZVal.assign(value);
                            }

                            if (ZVal.strictEqualityCheck(false, "===", result)) {
                                throw ZVal.getException(
                                        env,
                                        new InvalidArgumentException(
                                                env,
                                                function_sprintf
                                                        .f
                                                        .env(env)
                                                        .call(errorMessage, value)
                                                        .value()));
                            }

                            multiselectChoices.arrayAppend(env).set(toStringR(result, env));
                        }

                        if (ZVal.isTrue(multiselect)) {
                            return ZVal.assign(multiselectChoices.getObject());
                        }

                        return ZVal.assign(
                                function_current
                                        .f
                                        .env(env)
                                        .call(multiselectChoices.getObject())
                                        .value());
                    }
                }.use("multiselect", multiselect)
                        .use("errorMessage", errorMessage)
                        .use("choices", choices)
                        .use("isAssoc", isAssoc));
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Console\\Question\\ChoiceQuestion";

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
                    .setName("Symfony\\Component\\Console\\Question\\ChoiceQuestion")
                    .setLookup(
                            ChoiceQuestion.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "attempts",
                            "autocompleterValues",
                            "choices",
                            "default",
                            "errorMessage",
                            "hidden",
                            "hiddenFallback",
                            "multiselect",
                            "normalizer",
                            "prompt",
                            "question",
                            "validator")
                    .setFilename("vendor/symfony/console/Question/ChoiceQuestion.php")
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
