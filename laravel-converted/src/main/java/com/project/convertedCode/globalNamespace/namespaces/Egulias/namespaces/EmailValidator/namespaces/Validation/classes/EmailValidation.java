package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Validation/EmailValidation.php

*/

public interface EmailValidation {

    public static final Object CONST_class = "Egulias\\EmailValidator\\Validation\\EmailValidation";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "email")
    @ConvertedParameter(
        index = 1,
        name = "emailLexer",
        typeHint = "Egulias\\EmailValidator\\EmailLexer"
    )
    public Object isValid(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getError(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object getWarnings(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Egulias\\EmailValidator\\Validation\\EmailValidation")
                    .setLookup(EmailValidation.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Validation/EmailValidation.php")
                    .get();
}
