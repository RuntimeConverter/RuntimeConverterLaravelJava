package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.classes.ExpectationFailedException;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedRecorder;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedAtMostCount.php

*/

public class InvokedAtMostCount extends InvokedRecorder {

    public Object allowedInvocations = null;

    public InvokedAtMostCount(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == InvokedAtMostCount.class) {
            this.__construct(env, args);
        }
    }

    public InvokedAtMostCount(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "allowedInvocations")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object allowedInvocations = assignParameter(args, 0, false);
        this.allowedInvocations = allowedInvocations;
        return null;
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        return ZVal.assign("invoked at most " + toStringR(this.allowedInvocations, env) + " times");
    }

    @ConvertedMethod
    public Object verify(RuntimeEnv env, Object... args) {
        Object count = null;
        count = env.callMethod(this, "getInvocationCount", InvokedAtMostCount.class);
        if (ZVal.isGreaterThan(count, '>', this.allowedInvocations)) {
            throw ZVal.getException(
                    env,
                    new ExpectationFailedException(
                            env,
                            "Expected invocation at most "
                                    + toStringR(this.allowedInvocations, env)
                                    + " times but it occurred "
                                    + toStringR(count, env)
                                    + " time(s)."));
        }

        return null;
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtMostCount";

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
                    .setName("PHPUnit\\Framework\\MockObject\\Matcher\\InvokedAtMostCount")
                    .setLookup(
                            InvokedAtMostCount.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("allowedInvocations", "invocations")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Matcher/InvokedAtMostCount.php")
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
}
