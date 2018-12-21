package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.InvalidEmail;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.classes.EmailParser;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes.EmailValidation;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Validation/RFCValidation.php

*/

public class RFCValidation extends RuntimeClassBase implements EmailValidation {

    public Object parser = null;

    public Object warnings = ZVal.newArray();

    public Object error = null;

    public RFCValidation(RuntimeEnv env, Object... args) {
        super(env);
    }

    public RFCValidation(NoConstructor n) {
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
        Object invalid = null;
        this.parser = new EmailParser(env, emailLexer);
        try {
            env.callMethod(this.parser, "parse", RFCValidation.class, toStringR(email, env));
        } catch (ConvertedException convertedException9) {
            if (convertedException9.instanceOf(
                    InvalidEmail.class, "Egulias\\EmailValidator\\Exception\\InvalidEmail")) {
                invalid = convertedException9.getObject();
                this.error = invalid;
                return ZVal.assign(false);
            } else {
                throw convertedException9;
            }
        }

        this.warnings = env.callMethod(this.parser, "getWarnings", RFCValidation.class);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    public Object getError(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.error);
    }

    @ConvertedMethod
    public Object getWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.warnings);
    }

    public static final Object CONST_class = "Egulias\\EmailValidator\\Validation\\RFCValidation";

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
                    .setName("Egulias\\EmailValidator\\Validation\\RFCValidation")
                    .setLookup(
                            RFCValidation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("error", "parser", "warnings")
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Validation/RFCValidation.php")
                    .addInterface("Egulias\\EmailValidator\\Validation\\EmailValidation")
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
