package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Question.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_filter;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Console.namespaces.Exception.classes.InvalidArgumentException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.nativeInterfaces.Traversable;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_values;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/console/Question/Question.php

*/

public class Question extends RuntimeClassBase {

    public Object question = null;

    public Object attempts = null;

    public Object hidden = false;

    public Object hiddenFallback = true;

    public Object autocompleterValues = null;

    public Object validator = null;

    public Object _pDefault = null;

    public Object normalizer = null;

    public Question(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Question.class) {
            this.__construct(env, args);
        }
    }

    public Question(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "question", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "default",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object question = assignParameter(args, 0, false);
        Object _pDefault = assignParameter(args, 1, true);
        if (null == _pDefault) {
            _pDefault = ZVal.getNull();
        }
        this.question = question;
        this._pDefault = _pDefault;
        return null;
    }

    @ConvertedMethod
    public Object getQuestion(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.question);
    }

    @ConvertedMethod
    public Object getDefault(RuntimeEnv env, Object... args) {
        return ZVal.assign(this._pDefault);
    }

    @ConvertedMethod
    public Object isHidden(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hidden);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hidden")
    public Object setHidden(RuntimeEnv env, Object... args) {
        Object hidden = assignParameter(args, 0, false);
        if (ZVal.isTrue(this.autocompleterValues)) {
            throw ZVal.getException(
                    env,
                    new LogicException(env, "A hidden question cannot use the autocompleter."));
        }

        this.hidden = ZVal.toBool(hidden);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object isHiddenFallback(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.hiddenFallback);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "fallback")
    public Object setHiddenFallback(RuntimeEnv env, Object... args) {
        Object fallback = assignParameter(args, 0, false);
        this.hiddenFallback = ZVal.toBool(fallback);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getAutocompleterValues(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.autocompleterValues);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "values")
    public Object setAutocompleterValues(RuntimeEnv env, Object... args) {
        Object values = assignParameter(args, 0, false);
        if (function_is_array.f.env(env).call(values).getBool()) {
            values =
                    ZVal.assign(
                            ZVal.isTrue(this.isAssoc(env, values))
                                    ? function_array_merge
                                            .f
                                            .env(env)
                                            .call(
                                                    function_array_keys
                                                            .f
                                                            .env(env)
                                                            .call(values)
                                                            .value(),
                                                    function_array_values
                                                            .f
                                                            .env(env)
                                                            .call(values)
                                                            .value())
                                            .value()
                                    : function_array_values.f.env(env).call(values).value());
        }

        if (ZVal.toBool(
                        ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", values))
                                && ZVal.toBool(
                                        !function_is_array.f.env(env).call(values).getBool()))
                && ZVal.toBool(
                        !ZVal.isTrue(
                                ZVal.checkInstanceType(
                                        values, Traversable.class, "Traversable")))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env,
                            "Autocompleter values can be either an array, `null` or a `Traversable` object."));
        }

        if (ZVal.isTrue(this.hidden)) {
            throw ZVal.getException(
                    env,
                    new LogicException(env, "A hidden question cannot use the autocompleter."));
        }

        this.autocompleterValues = values;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "validator",
        typeHint = "callable",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object setValidator(RuntimeEnv env, Object... args) {
        Object validator = assignParameter(args, 0, true);
        if (null == validator) {
            validator = ZVal.getNull();
        }
        this.validator = validator;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getValidator(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.validator);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attempts")
    public Object setMaxAttempts(RuntimeEnv env, Object... args) {
        Object attempts = assignParameter(args, 0, false);
        if (ZVal.toBool(ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", attempts))
                && ZVal.toBool(ZVal.isLessThan(attempts, '<', 1))) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "Maximum number of attempts must be a positive value."));
        }

        this.attempts = attempts;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getMaxAttempts(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.attempts);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "normalizer", typeHint = "callable")
    public Object setNormalizer(RuntimeEnv env, Object... args) {
        Object normalizer = assignParameter(args, 0, false);
        this.normalizer = normalizer;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getNormalizer(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.normalizer);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "array")
    protected Object isAssoc(RuntimeEnv env, Object... args) {
        Object array = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(
                        function_count
                                .f
                                .env(env)
                                .call(
                                        function_array_filter
                                                .f
                                                .env(env)
                                                .call(
                                                        function_array_keys
                                                                .f
                                                                .env(env)
                                                                .call(array)
                                                                .value(),
                                                        "is_string")
                                                .value())
                                .value()));
    }

    public static final Object CONST_class = "Symfony\\Component\\Console\\Question\\Question";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\Console\\Question\\Question")
                    .setLookup(
                            Question.class,
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
                            "validator")
                    .setFilename("vendor/symfony/console/Question/Question.php")
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
