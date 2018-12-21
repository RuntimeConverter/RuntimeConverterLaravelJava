package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedRecorder;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedCount.php

*/

public class InvokedCount extends InvokedRecorder {

    public Object expectedCount = null;

    public InvokedCount(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvokedCount.class) {
            this.__construct(env, args);
        }
    }

    public InvokedCount(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectedCount")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expectedCount = assignParameter(args, 0, false);
        this.expectedCount = expectedCount;
        return null;
    }

    @ConvertedMethod
    public Object isNever(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.strictEqualityCheck(this.expectedCount, "===", 0));
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign("invoked " + toStringR(this.expectedCount, env) + " time(s)");
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoked(RuntimeEnv env, Object... args) {
        int runtimeConverterBreakCount;
        Object invocation = assignParameter(args, 0, false);
        Object count = null;
        Object message = null;
        super.invoked(env, invocation);
        count = env.callMethod(this, "getInvocationCount", InvokedCount.class);
        if (ZVal.isGreaterThan(count, '>', this.expectedCount)) {
            message =
                    toStringR(env.callMethod(invocation, "toString", InvokedCount.class), env)
                            + " ";
            SwitchEnumType64 switchVariable64 =
                    ZVal.getEnum(
                            this.expectedCount,
                            SwitchEnumType64.DEFAULT_CASE,
                            SwitchEnumType64.INTEGER_0,
                            0,
                            SwitchEnumType64.INTEGER_1,
                            1);
            switch (switchVariable64) {
                case INTEGER_0:
                    message = toStringR(message, env) + "was not expected to be called.";
                    break;
                case INTEGER_1:
                    message =
                            toStringR(message, env)
                                    + "was not expected to be called more than once.";
                    break;
                case DEFAULT_CASE:
                    message =
                            toStringR(message, env)
                                    + toStringR(
                                            function_sprintf
                                                    .f
                                                    .env(env)
                                                    .call(
                                                            "was not expected to be called more than %d times.",
                                                            this.expectedCount)
                                                    .value(),
                                            env);
            }
            ;
            throw ZVal.getException(env, new ExpectationFailedException(env, message));
        }

        return null;
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object count = null;
        count = env.callMethod(this, "getInvocationCount", InvokedCount.class);
        if (ZVal.strictNotEqualityCheck(count, "!==", this.expectedCount)) {
            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Method was expected to be called %d times, "
                                                    + "actually called %d times.",
                                            this.expectedCount, count)
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedCount";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends InvokedRecorder.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedCount")
                    .setLookup(
                            InvokedCount.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("expectedCount", "invocations")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedCount.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Matcher\\Invocation")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Verifiable")
                    .addExtendsClass("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedRecorder")
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

    private enum SwitchEnumType64 {
        INTEGER_0,
        INTEGER_1,
        DEFAULT_CASE,
        UNREACHABLE_CODE_N42
    }
}
