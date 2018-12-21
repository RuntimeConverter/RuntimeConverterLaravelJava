package com.project.convertedCode.globalNamespace.namespaces.Mockery.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.classes.Expectation;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/VerificationExpectation.php

*/

public class VerificationExpectation extends Expectation {

    public VerificationExpectation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == VerificationExpectation.class) {
            this.__construct(env, args);
        }
    }

    public VerificationExpectation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object clearCountValidators(RuntimeEnv env, Object... args) {
        toObjectR(this).accessProp(this, env).name("_countValidators").set(ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object __clone(RuntimeEnv env, Object... args) {
        super.__clone(env);
        toObjectR(this).accessProp(this, env).name("_actualCount").set(0);
        return null;
    }

    public static final Object CONST_class = "Mockery\\VerificationExpectation";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Expectation.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\VerificationExpectation")
                    .setLookup(
                            VerificationExpectation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "_actualCount",
                            "_because",
                            "_closureQueue",
                            "_countValidatorClass",
                            "_countValidators",
                            "_expectedArgs",
                            "_globalOrderNumber",
                            "_globally",
                            "_mock",
                            "_name",
                            "_orderNumber",
                            "_passthru",
                            "_returnQueue",
                            "_returnValue",
                            "_setQueue",
                            "_throw")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/VerificationExpectation.php")
                    .addInterface("Mockery\\ExpectationInterface")
                    .addExtendsClass("Mockery\\Expectation")
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
