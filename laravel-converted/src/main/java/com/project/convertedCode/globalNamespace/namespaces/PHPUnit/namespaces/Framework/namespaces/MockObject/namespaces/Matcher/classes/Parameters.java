package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.StatelessInvocation;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.Constraint;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_get_class;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEqual;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsAnything;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/Parameters.php

*/

public class Parameters extends StatelessInvocation {

    public Object parameters = ZVal.newArray();

    public Object invocation = null;

    public Object parameterVerificationResult = null;

    public Parameters(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Parameters.class) {
            this.__construct(env, args);
        }
    }

    public Parameters(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameters", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parameters = assignParameter(args, 0, false);
        Object parameter = null;
        for (ZPair zpairResult1165 : ZVal.getIterable(parameters, env, true)) {
            parameter = ZVal.assign(zpairResult1165.getValue());
            if (!ZVal.isTrue(
                    ZVal.checkInstanceType(
                            parameter,
                            Constraint.class,
                            "PHPUnit\\Framework\\Constraint\\Constraint"))) {
                parameter = new IsEqual(env, parameter);
            }

            new ReferenceClassProperty(this, "parameters", env).arrayAppend(env).set(parameter);
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object parameter = null;
        Object index = null;
        Object text = null;
        text = "with parameter";
        for (ZPair zpairResult1166 : ZVal.getIterable(this.parameters, env, false)) {
            index = ZVal.assign(zpairResult1166.getKey());
            parameter = ZVal.assign(zpairResult1166.getValue());
            if (ZVal.isGreaterThan(index, '>', 0)) {
                text = toStringR(text, env) + " and";
            }

            text =
                    toStringR(text, env)
                            + " "
                            + toStringR(index, env)
                            + " "
                            + toStringR(
                                    env.callMethod(parameter, "toString", Parameters.class), env);
        }

        return ZVal.assign(text);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        Object e = null;
        this.invocation = invocation;
        this.parameterVerificationResult = ZVal.getNull();
        try {
            this.parameterVerificationResult = this.verify(env);
            return ZVal.assign(this.parameterVerificationResult);
        } catch (ConvertedException convertedException136) {
            if (convertedException136.instanceOf(
                    ExpectationFailedException.class,
                    "PHPUnit\\Framework\\ExpectationFailedException")) {
                e = convertedException136.getObject();
                this.parameterVerificationResult = e;
                throw ZVal.getException(env, this.parameterVerificationResult);
            } else {
                throw convertedException136;
            }
        }
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object parameter = null;
        Object i = null;
        Object message = null;
        if (ZVal.isset(this.parameterVerificationResult)) {
            return ZVal.assign(this.guardAgainstDuplicateEvaluationOfParameterConstraints(env));
        }

        if (ZVal.strictEqualityCheck(this.invocation, "===", ZVal.getNull())) {
            throw ZVal.getException(
                    env, new ExpectationFailedException(env, "Mocked method does not exist."));
        }

        if (ZVal.isLessThan(
                function_count
                        .f
                        .env(env)
                        .call(env.callMethod(this.invocation, "getParameters", Parameters.class))
                        .value(),
                '<',
                function_count.f.env(env).call(this.parameters).value())) {
            message = "Parameter count for invocation %s is too low.";
            if (ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    function_count.f.env(env).call(this.parameters).value(),
                                    "===",
                                    1))
                    && ZVal.toBool(
                            ZVal.strictEqualityCheck(
                                    function_get_class
                                            .f
                                            .env(env)
                                            .call(
                                                    new ReferenceClassProperty(
                                                                    this, "parameters", env)
                                                            .arrayGet(env, 0))
                                            .value(),
                                    "===",
                                    IsAnything.CONST_class))) {
                message =
                        toStringR(message, env)
                                + "\nTo allow 0 or more parameters with any value, omit ->with() or use ->withAnyParameters() instead.";
            }

            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            message,
                                            env.callMethod(
                                                    this.invocation, "toString", Parameters.class))
                                    .value()));
        }

        for (ZPair zpairResult1167 : ZVal.getIterable(this.parameters, env, false)) {
            i = ZVal.assign(zpairResult1167.getKey());
            parameter = ZVal.assign(zpairResult1167.getValue());
            env.callMethod(
                    parameter,
                    "evaluate",
                    Parameters.class,
                    handleReturnReference(
                                    env.callMethod(
                                            this.invocation, "getParameters", Parameters.class))
                            .arrayGet(env, i),
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Parameter %s for invocation %s does not match expected "
                                            + "value.",
                                    i,
                                    env.callMethod(this.invocation, "toString", Parameters.class))
                            .value());
        }

        return ZVal.assign(true);
    }

    @ConvertedMethod
    private Object guardAgainstDuplicateEvaluationOfParameterConstraints(
            RuntimeEnv env, Object... args) {
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.parameterVerificationResult, PHPException.class, "Exception"))) {
            throw ZVal.getException(env, this.parameterVerificationResult);
        }

        return ZVal.assign(ZVal.toBool(this.parameterVerificationResult));
    }

    public static final Object CONST_class = "PHPUnit\\Framework\\MockObject\\Matcher\\Parameters";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StatelessInvocation.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\Parameters")
                    .setLookup(
                            Parameters.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("invocation", "parameterVerificationResult", "parameters")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/Parameters.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Matcher\\Invocation")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Verifiable")
                    .addExtendsClass("PHPUnit\\Framework\\MockObject\\Matcher\\StatelessInvocation")
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
