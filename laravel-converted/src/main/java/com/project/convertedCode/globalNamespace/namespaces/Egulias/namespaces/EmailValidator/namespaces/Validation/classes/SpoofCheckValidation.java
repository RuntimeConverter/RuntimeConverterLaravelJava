package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_class_exists;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.namespaces.Error.classes.SpoofEmail;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes.EmailValidation;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Validation/SpoofCheckValidation.php

*/

public class SpoofCheckValidation extends RuntimeClassBase implements EmailValidation {

    public Object error = null;

    public SpoofCheckValidation(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == SpoofCheckValidation.class) {
            this.__construct(env, args);
        }
    }

    public SpoofCheckValidation(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        if (!function_class_exists.f.env(env).call("Spoofchecker").getBool()) {
            throw ZVal.getException(
                    env,
                    new LogicException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "The %s class requires the Intl extension.",
                                            "SpoofCheckValidation")
                                    .value()));
        }

        return null;
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
        Object checker = null;
        checker = env.createNew(ZVal.resolveClassAlias(env, "Spoofchecker"));
        env.callMethod(
                checker,
                "setChecks",
                SpoofCheckValidation.class,
                ClassConstantUtils.getConstantValueByClass(
                        env, ZVal.resolveClassAlias(env, "Spoofchecker"), "SINGLE_SCRIPT"));
        if (ZVal.isTrue(
                env.callMethod(checker, "isSuspicious", SpoofCheckValidation.class, email))) {
            this.error = new SpoofEmail(env);
        }

        return ZVal.assign(ZVal.strictEqualityCheck(this.error, "===", ZVal.getNull()));
    }

    @ConvertedMethod
    public Object getError(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.error);
    }

    @ConvertedMethod
    public Object getWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.newArray());
    }

    public static final Object CONST_class =
            "Egulias\\EmailValidator\\Validation\\SpoofCheckValidation";

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
                    .setName("Egulias\\EmailValidator\\Validation\\SpoofCheckValidation")
                    .setLookup(
                            SpoofCheckValidation.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("error")
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Validation/SpoofCheckValidation.php")
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
