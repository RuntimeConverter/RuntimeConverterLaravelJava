package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes.RFCValidation;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.namespaces.Error.classes.RFCWarnings;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Validation/NoRFCWarningsValidation.php

*/

public class NoRFCWarningsValidation extends RFCValidation {

    public NoRFCWarningsValidation(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.error = null;
    }

    public NoRFCWarningsValidation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email")
    @ConvertedParameter(
        index = 1,
        name = "emailLexer",
        typeHint = "Egulias\\EmailValidator\\EmailLexer"
    )
    public Object isValid(RuntimeEnv env, Object... args) {
        Object email = assignParameter(args, 0, false);
        Object emailLexer = assignParameter(args, 1, false);
        if (!ZVal.isTrue(super.isValid(env, email, emailLexer))) {
            return ZVal.assign(false);
        }

        if (ZVal.isEmpty(env.callMethod(this, "getWarnings", NoRFCWarningsValidation.class))) {
            return ZVal.assign(true);
        }

        this.error = new RFCWarnings(env);
        return ZVal.assign(false);
    }

    @ConvertedMethod
    public Object getError(RuntimeEnv env, Object... args) {
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isTrue(ternaryExpressionTemp = this.error)
                        ? ternaryExpressionTemp
                        : super.getError(env));
    }

    public static final Object CONST_class =
            "Egulias\\EmailValidator\\Validation\\NoRFCWarningsValidation";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends RFCValidation.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Egulias\\EmailValidator\\Validation\\NoRFCWarningsValidation")
                    .setLookup(
                            NoRFCWarningsValidation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("error", "error", "parser", "warnings")
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Validation/NoRFCWarningsValidation.php")
                    .addInterface("Egulias\\EmailValidator\\Validation\\EmailValidation")
                    .addExtendsClass("Egulias\\EmailValidator\\Validation\\RFCValidation")
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
