package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.CountValidator.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/CountValidator/CountValidatorAbstract.php

*/

public abstract class CountValidatorAbstract extends RuntimeClassBase {

    public Object _expectation = ZVal.getNull();

    public Object _limit = ZVal.getNull();

    public CountValidatorAbstract(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CountValidatorAbstract.class) {
            this.__construct(env, args);
        }
    }

    public CountValidatorAbstract(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "expectation", typeHint = "Mockery\\Expectation")
    @ConvertedParameter(index = 1, name = "limit")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object expectation = assignParameter(args, 0, false);
        Object limit = assignParameter(args, 1, false);
        this._expectation = expectation;
        this._limit = limit;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "n")
    public Object isEligible(RuntimeEnv env, Object... args) {
        Object n = assignParameter(args, 0, false);
        return ZVal.assign(ZVal.isLessThan(n, '<', this._limit));
    }

    public static final Object CONST_class = "Mockery\\CountValidator\\CountValidatorAbstract";

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
                    .setName("Mockery\\CountValidator\\CountValidatorAbstract")
                    .setLookup(
                            CountValidatorAbstract.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectation", "_limit")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/CountValidator/CountValidatorAbstract.php")
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
