package com.project.convertedCode.globalNamespace.namespaces.Dotenv.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.namespaces.Exception.classes.ValidationException;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.project.convertedCode.globalNamespace.namespaces.Dotenv.namespaces.Exception.classes.InvalidCallbackException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.nativeFunctions.filter.function_filter_var;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/vlucas/phpdotenv/src/Validator.php

*/

public class Validator extends RuntimeClassBase {

    public Object variables = null;

    public Object loader = null;

    public Validator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Validator.class) {
            this.__construct(env, args);
        }
    }

    public Validator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "variables", typeHint = "array")
    @ConvertedParameter(index = 1, name = "loader", typeHint = "Dotenv\\Loader")
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/vlucas/phpdotenv/src")
                        .setFile("/vendor/vlucas/phpdotenv/src/Validator.php");
        Object variables = assignParameter(args, 0, false);
        Object loader = assignParameter(args, 1, false);
        this.variables = variables;
        this.loader = loader;
        this.assertCallback(
                env,
                new Closure(env, runtimeConverterFunctionClassConstants, "Dotenv", this) {
                    @Override
                    @ConvertedMethod
                    @ConvertedParameter(index = 0, name = "value")
                    public Object run(
                            RuntimeEnv env,
                            Object thisvar,
                            PassByReferenceArgs runtimePassByReferenceArgs,
                            Object... args) {
                        Object value = assignParameter(args, 0, false);
                        return ZVal.assign(
                                ZVal.strictNotEqualityCheck(value, "!==", ZVal.getNull()));
                    }
                },
                "is missing");
        return null;
    }

    @ConvertedMethod
    public Object notEmpty(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/vlucas/phpdotenv/src")
                        .setFile("/vendor/vlucas/phpdotenv/src/Validator.php");
        return ZVal.assign(
                this.assertCallback(
                        env,
                        new Closure(env, runtimeConverterFunctionClassConstants, "Dotenv", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                return ZVal.assign(
                                        ZVal.isGreaterThan(
                                                function_strlen
                                                        .f
                                                        .env(env)
                                                        .call(
                                                                function_trim
                                                                        .f
                                                                        .env(env)
                                                                        .call(value)
                                                                        .value())
                                                        .value(),
                                                '>',
                                                0));
                            }
                        },
                        "is empty"));
    }

    @ConvertedMethod
    public Object isInteger(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/vlucas/phpdotenv/src")
                        .setFile("/vendor/vlucas/phpdotenv/src/Validator.php");
        return ZVal.assign(
                this.assertCallback(
                        env,
                        new Closure(env, runtimeConverterFunctionClassConstants, "Dotenv", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                return ZVal.assign(
                                        NamespaceGlobal.ctype_digit.env(env).call(value).value());
                            }
                        },
                        "is not an integer"));
    }

    @ConvertedMethod
    public Object isBoolean(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/vlucas/phpdotenv/src")
                        .setFile("/vendor/vlucas/phpdotenv/src/Validator.php");
        return ZVal.assign(
                this.assertCallback(
                        env,
                        new Closure(env, runtimeConverterFunctionClassConstants, "Dotenv", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                if (ZVal.strictEqualityCheck(value, "===", "")) {
                                    return ZVal.assign(false);
                                }

                                return ZVal.assign(
                                        ZVal.strictNotEqualityCheck(
                                                function_filter_var
                                                        .f
                                                        .env(env)
                                                        .call(value, 258, 134217728)
                                                        .value(),
                                                "!==",
                                                ZVal.getNull()));
                            }
                        },
                        "is not a boolean"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "choices", typeHint = "array")
    public Object allowedValues(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/vlucas/phpdotenv/src")
                        .setFile("/vendor/vlucas/phpdotenv/src/Validator.php");
        Object choices = assignParameter(args, 0, false);
        return ZVal.assign(
                this.assertCallback(
                        env,
                        new Closure(env, runtimeConverterFunctionClassConstants, "Dotenv", this) {
                            @Override
                            @ConvertedMethod
                            @ConvertedParameter(index = 0, name = "value")
                            public Object run(
                                    RuntimeEnv env,
                                    Object thisvar,
                                    PassByReferenceArgs runtimePassByReferenceArgs,
                                    Object... args) {
                                Object value = assignParameter(args, 0, false);
                                Object choices = null;
                                choices = this.contextReferences.getCapturedValue("choices");
                                return ZVal.assign(
                                        function_in_array.f.env(env).call(value, choices).value());
                            }
                        }.use("choices", choices),
                        "is not an allowed value"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "callback")
    @ConvertedParameter(index = 1, name = "message")
    protected Object assertCallback(RuntimeEnv env, Object... args) {
        Object callback = assignParameter(args, 0, false);
        Object message = assignParameter(args, 1, true);
        if (null == message) {
            message = "failed callback assertion";
        }
        Object variableName = null;
        Object variableValue = null;
        ReferenceContainer variablesFailingAssertion = new BasicReferenceContainer(null);
        if (!function_is_callable.f.env(env).call(callback).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidCallbackException(env, "The provided callback must be callable."));
        }

        variablesFailingAssertion.setObject(ZVal.newArray());
        for (ZPair zpairResult2250 : ZVal.getIterable(this.variables, env, true)) {
            variableName = ZVal.assign(zpairResult2250.getValue());
            variableValue =
                    env.callMethod(
                            this.loader, "getEnvironmentVariable", Validator.class, variableName);
            if (ZVal.strictEqualityCheck(
                    function_call_user_func
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(callback, variableValue)
                            .value(),
                    "===",
                    false)) {
                variablesFailingAssertion
                        .arrayAppend(env)
                        .set(
                                toStringR(variableName, env)
                                        + toStringR(" " + toStringR(message, env), env));
            }
        }

        if (ZVal.isGreaterThan(
                function_count.f.env(env).call(variablesFailingAssertion.getObject()).value(),
                '>',
                0)) {
            throw ZVal.getException(
                    env,
                    new ValidationException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "One or more environment variables failed assertions: %s.",
                                            NamespaceGlobal.implode
                                                    .env(env)
                                                    .call(
                                                            ", ",
                                                            variablesFailingAssertion.getObject())
                                                    .value())
                                    .value()));
        }

        return ZVal.assign(this);
    }

    public static final Object CONST_class = "Dotenv\\Validator";

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
                    .setName("Dotenv\\Validator")
                    .setLookup(
                            Validator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("loader", "variables")
                    .setFilename("vendor/vlucas/phpdotenv/src/Validator.php")
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
