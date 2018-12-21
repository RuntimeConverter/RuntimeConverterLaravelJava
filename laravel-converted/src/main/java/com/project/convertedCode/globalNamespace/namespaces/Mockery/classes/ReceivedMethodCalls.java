package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/ReceivedMethodCalls.php

*/

public class ReceivedMethodCalls extends RuntimeClassBase {

    public Object methodCalls = ZVal.newArray();

    public ReceivedMethodCalls(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ReceivedMethodCalls(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methodCall", typeHint = "Mockery\\MethodCall")
    public Object push(RuntimeEnv env, Object... args) {
        Object methodCall = assignParameter(args, 0, false);
        new ReferenceClassProperty(this, "methodCalls", env).arrayAppend(env).set(methodCall);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectation", typeHint = "Mockery\\Expectation")
    public Object verify(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object expectation = assignParameter(args, 0, false);
        Object methodCall = null;
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult735 : ZVal.getIterable(this.methodCalls, env, true)) {
            methodCall = ZVal.assign(zpairResult735.getValue());
            if (ZVal.strictNotEqualityCheck(
                    env.callMethod(methodCall, "getMethod", ReceivedMethodCalls.class),
                    "!==",
                    env.callMethod(expectation, "getName", ReceivedMethodCalls.class))) {
                continue;
            }

            if (!ZVal.isTrue(
                    env.callMethod(
                            expectation,
                            "matchArgs",
                            ReceivedMethodCalls.class,
                            env.callMethod(methodCall, "getArgs", ReceivedMethodCalls.class)))) {
                continue;
            }

            env.callMethod(
                    expectation,
                    "verifyCall",
                    ReceivedMethodCalls.class,
                    env.callMethod(methodCall, "getArgs", ReceivedMethodCalls.class));
        }

        env.callMethod(expectation, "verify", ReceivedMethodCalls.class);
        return null;
    }

    public static final Object CONST_class = "Mockery\\ReceivedMethodCalls";

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
                    .setName("Mockery\\ReceivedMethodCalls")
                    .setLookup(
                            ReceivedMethodCalls.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("methodCalls")
                    .setFilename("vendor/mockery/mockery/library/Mockery/ReceivedMethodCalls.php")
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
