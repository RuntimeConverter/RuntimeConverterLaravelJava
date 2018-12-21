package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_merge;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes.MultipleErrors;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_count;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.namespaces.Exception.classes.EmptyValidationList;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Validation.classes.EmailValidation;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Validation/MultipleValidationWithAnd.php

*/

public class MultipleValidationWithAnd extends RuntimeClassBase implements EmailValidation {

    public Object validations = ZVal.newArray();

    public Object warnings = ZVal.newArray();

    public Object error = null;

    public Object mode = null;

    public MultipleValidationWithAnd(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == MultipleValidationWithAnd.class) {
            this.__construct(env, args);
        }
    }

    public MultipleValidationWithAnd(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "validations", typeHint = "array")
    @ConvertedParameter(index = 1, name = "mode")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object validations = assignParameter(args, 0, false);
        Object mode = assignParameter(args, 1, true);
        if (null == mode) {
            mode = CONST_ALLOW_ALL_ERRORS;
        }
        if (ZVal.equalityCheck(function_count.f.env(env).call(validations).value(), 0)) {
            throw ZVal.getException(env, new EmptyValidationList(env));
        }

        this.validations = validations;
        this.mode = mode;
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
        int runtimeConverterBreakCount;
        Object email = assignParameter(args, 0, false);
        Object emailLexer = assignParameter(args, 1, false);
        Object result = null;
        Object errors = null;
        Object validation = null;
        result = true;
        errors = ZVal.newArray();
        runtimeConverterBreakCount = 0;
        for (ZPair zpairResult25 : ZVal.getIterable(this.validations, env, true)) {
            validation = ZVal.assign(zpairResult25.getValue());
            env.callMethod(emailLexer, "reset", MultipleValidationWithAnd.class);
            result =
                    ZVal.toBool(result)
                            && ZVal.toBool(
                                    env.callMethod(
                                            validation,
                                            "isValid",
                                            MultipleValidationWithAnd.class,
                                            email,
                                            emailLexer));
            this.warnings =
                    function_array_merge
                            .f
                            .env(env)
                            .call(
                                    this.warnings,
                                    env.callMethod(
                                            validation,
                                            "getWarnings",
                                            MultipleValidationWithAnd.class))
                            .value();
            errors =
                    this.addNewError(
                            env,
                            env.callMethod(validation, "getError", MultipleValidationWithAnd.class),
                            errors);
            if (ZVal.isTrue(this.shouldStop(env, result))) {
                break;
            }
        }

        if (!ZVal.isEmpty(errors)) {
            this.error = new MultipleErrors(env, errors);
        }

        return ZVal.assign(result);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "possibleError")
    @ConvertedParameter(index = 1, name = "errors", typeHint = "array")
    private Object addNewError(RuntimeEnv env, Object... args) {
        Object possibleError = assignParameter(args, 0, false);
        ReferenceContainer errors = new BasicReferenceContainer(assignParameter(args, 1, false));
        if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", possibleError)) {
            errors.arrayAppend(env).set(possibleError);
        }

        return ZVal.assign(errors.getObject());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "result")
    private Object shouldStop(RuntimeEnv env, Object... args) {
        Object result = assignParameter(args, 0, false);
        return ZVal.assign(
                ZVal.toBool(!ZVal.isTrue(result))
                        && ZVal.toBool(
                                ZVal.strictEqualityCheck(this.mode, "===", CONST_STOP_ON_ERROR)));
    }

    @ConvertedMethod
    public Object getError(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.error);
    }

    @ConvertedMethod
    public Object getWarnings(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.warnings);
    }

    public static final Object CONST_STOP_ON_ERROR = 0;

    public static final Object CONST_ALLOW_ALL_ERRORS = 1;

    public static final Object CONST_class =
            "Egulias\\EmailValidator\\Validation\\MultipleValidationWithAnd";

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
                    .setName("Egulias\\EmailValidator\\Validation\\MultipleValidationWithAnd")
                    .setLookup(
                            MultipleValidationWithAnd.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("error", "mode", "validations", "warnings")
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Validation/MultipleValidationWithAnd.php")
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
