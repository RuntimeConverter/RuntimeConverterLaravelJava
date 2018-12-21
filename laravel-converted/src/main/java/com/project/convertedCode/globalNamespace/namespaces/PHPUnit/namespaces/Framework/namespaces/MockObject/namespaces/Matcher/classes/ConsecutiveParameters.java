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
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.Constraint.classes.IsEqual;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/ConsecutiveParameters.php

*/

public class ConsecutiveParameters extends StatelessInvocation {

    public Object parameterGroups = ZVal.newArray();

    public Object invocations = ZVal.newArray();

    public ConsecutiveParameters(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsecutiveParameters.class) {
            this.__construct(env, args);
        }
    }

    public ConsecutiveParameters(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "parameterGroups", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parameterGroups = assignParameter(args, 0, false);
        Object parameter = null;
        Object index = null;
        Object parameters = null;
        for (ZPair zpairResult1161 : ZVal.getIterable(parameterGroups, env, false)) {
            index = ZVal.assign(zpairResult1161.getKey());
            parameters = ZVal.assign(zpairResult1161.getValue());
            for (ZPair zpairResult1162 : ZVal.getIterable(parameters, env, true)) {
                parameter = ZVal.assign(zpairResult1162.getValue());
                if (!ZVal.isTrue(
                        ZVal.checkInstanceType(
                                parameter,
                                Constraint.class,
                                "PHPUnit\\Framework\\Constraint\\Constraint"))) {
                    parameter = new IsEqual(env, parameter);
                }

                new ReferenceClassProperty(this, "parameterGroups", env)
                        .arrayAppend(env, index)
                        .set(parameter);
            }
        }

        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return "with consecutive parameters";
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object matches(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        Object callIndex = null;
        new ReferenceClassProperty(this, "invocations", env).arrayAppend(env).set(invocation);
        callIndex = ZVal.subtract(function_count.f.env(env).call(this.invocations).value(), 1);
        this.verifyInvocation(env, invocation, callIndex);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object invocation = null;
        Object callIndex = null;
        for (ZPair zpairResult1163 : ZVal.getIterable(this.invocations, env, false)) {
            callIndex = ZVal.assign(zpairResult1163.getKey());
            invocation = ZVal.assign(zpairResult1163.getValue());
            this.verifyInvocation(env, invocation, callIndex);
        }

        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    @ConvertedParameter(index = 1, name = "callIndex")
    private Object verifyInvocation(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        Object callIndex = assignParameter(args, 1, false);
        Object parameter = null;
        Object i = null;
        Object parameters = null;
        if (arrayActionR(
                ArrayAction.ISSET,
                new ReferenceClassProperty(this, "parameterGroups", env),
                env,
                callIndex)) {
            parameters =
                    ZVal.assign(
                            new ReferenceClassProperty(this, "parameterGroups", env)
                                    .arrayGet(env, callIndex));

        } else {
            return null;
        }

        if (ZVal.strictEqualityCheck(invocation, "===", ZVal.getNull())) {
            throw ZVal.getException(
                    env, new ExpectationFailedException(env, "Mocked method does not exist."));
        }

        if (ZVal.isLessThan(
                function_count
                        .f
                        .env(env)
                        .call(
                                env.callMethod(
                                        invocation, "getParameters", ConsecutiveParameters.class))
                        .value(),
                '<',
                function_count.f.env(env).call(parameters).value())) {
            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Parameter count for invocation %s is too low.",
                                            env.callMethod(
                                                    invocation,
                                                    "toString",
                                                    ConsecutiveParameters.class))
                                    .value()));
        }

        for (ZPair zpairResult1164 : ZVal.getIterable(parameters, env, false)) {
            i = ZVal.assign(zpairResult1164.getKey());
            parameter = ZVal.assign(zpairResult1164.getValue());
            env.callMethod(
                    parameter,
                    "evaluate",
                    ConsecutiveParameters.class,
                    handleReturnReference(
                                    env.callMethod(
                                            invocation,
                                            "getParameters",
                                            ConsecutiveParameters.class))
                            .arrayGet(env, i),
                    function_sprintf
                            .f
                            .env(env)
                            .call(
                                    "Parameter %s for invocation #%d %s does not match expected "
                                            + "value.",
                                    i,
                                    callIndex,
                                    env.callMethod(
                                            invocation, "toString", ConsecutiveParameters.class))
                            .value());
        }

        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\ConsecutiveParameters";

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
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\ConsecutiveParameters")
                    .setLookup(
                            ConsecutiveParameters.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("invocations", "parameterGroups")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/ConsecutiveParameters.php")
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
