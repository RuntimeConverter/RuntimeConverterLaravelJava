package com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.CodeCoverage.classes.RuntimeException;
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

 vendor/phpunit/php-code-coverage/src/Exception/UnintentionallyCoveredCodeException.php

*/

public final class UnintentionallyCoveredCodeException extends RuntimeException {

    public Object unintentionallyCoveredUnits = ZVal.newArray();

    public UnintentionallyCoveredCodeException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UnintentionallyCoveredCodeException.class) {
            this.__construct(env, args);
        }
    }

    public UnintentionallyCoveredCodeException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "unintentionallyCoveredUnits", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object unintentionallyCoveredUnits = assignParameter(args, 0, false);
        this.unintentionallyCoveredUnits = unintentionallyCoveredUnits;
        super.__construct(env, this.toString(env));
        return null;
    }

    @ConvertedMethod
    public Object getUnintentionallyCoveredUnits(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.unintentionallyCoveredUnits);
    }

    @ConvertedMethod
    private Object toString(RuntimeEnv env, Object... args) {
        Object unit = null;
        Object message = null;
        message = "";
        for (ZPair zpairResult1014 :
                ZVal.getIterable(this.unintentionallyCoveredUnits, env, true)) {
            unit = ZVal.assign(zpairResult1014.getValue());
            message = toStringR(message, env) + "- " + toStringR(unit, env) + "\n";
        }

        return ZVal.assign(message);
    }

    public static final Object CONST_class =
            "SebastianBergmann\\CodeCoverage\\UnintentionallyCoveredCodeException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RuntimeException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("SebastianBergmann\\CodeCoverage\\UnintentionallyCoveredCodeException")
                    .setLookup(
                            UnintentionallyCoveredCodeException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("unintentionallyCoveredUnits")
                    .setFilename(
                            "vendor/phpunit/php-code-coverage/src/Exception/UnintentionallyCoveredCodeException.php")
                    .addInterface("SebastianBergmann\\CodeCoverage\\Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("SebastianBergmann\\CodeCoverage\\RuntimeException")
                    .addExtendsClass("RuntimeException")
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
