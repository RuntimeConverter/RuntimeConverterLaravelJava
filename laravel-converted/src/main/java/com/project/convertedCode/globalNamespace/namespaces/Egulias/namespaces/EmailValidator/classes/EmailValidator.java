package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.classes.EmailLexer;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/EmailValidator.php

*/

public class EmailValidator extends RuntimeClassBase {

    public Object lexer = null;

    public Object warnings = null;

    public Object error = null;

    public EmailValidator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EmailValidator.class) {
            this.__construct(env, args);
        }
    }

    public EmailValidator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        this.lexer = new EmailLexer(env);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email")
    @ConvertedParameter(
        index = 1,
        name = "emailValidation",
        typeHint = "Egulias\\EmailValidator\\Validation\\EmailValidation"
    )
    public Object isValid(RuntimeEnv env, Object... args) {
        Object email = assignParameter(args, 0, false);
        Object emailValidation = assignParameter(args, 1, false);
        Object isValid = null;
        isValid =
                env.callMethod(emailValidation, "isValid", EmailValidator.class, email, this.lexer);
        this.warnings = env.callMethod(emailValidation, "getWarnings", EmailValidator.class);
        this.error = env.callMethod(emailValidation, "getError", EmailValidator.class);
        return ZVal.assign(isValid);
    }

    @ConvertedMethod
    public Object hasWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(!ZVal.isEmpty(this.warnings));
    }

    @ConvertedMethod
    public Object getWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.warnings);
    }

    @ConvertedMethod
    public Object getError(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.error);
    }

    public static final Object CONST_class = "Egulias\\EmailValidator\\EmailValidator";

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
                    .setName("Egulias\\EmailValidator\\EmailValidator")
                    .setLookup(
                            EmailValidator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("error", "lexer", "warnings")
                    .setFilename("vendor/egulias/email-validator/EmailValidator/EmailValidator.php")
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
