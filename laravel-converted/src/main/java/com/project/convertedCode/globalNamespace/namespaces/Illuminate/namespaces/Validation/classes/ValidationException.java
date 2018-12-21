package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Validation.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Arr;
import com.project.convertedCode.globalNamespace.functions.tap;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.namespaces.Facades.classes.Validator;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Validation/ValidationException.php

*/

public class ValidationException extends PHPException {

    public Object validator = null;

    public Object response = null;

    public Object status = 422;

    public Object errorBag = null;

    public Object redirectTo = null;

    public ValidationException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ValidationException.class) {
            this.__construct(env, args);
        }
    }

    public ValidationException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "validator")
    @ConvertedParameter(
        index = 1,
        name = "response",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(index = 2, name = "errorBag")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object validator = assignParameter(args, 0, false);
        Object response = assignParameter(args, 1, true);
        if (null == response) {
            response = ZVal.getNull();
        }
        Object errorBag = assignParameter(args, 2, true);
        if (null == errorBag) {
            errorBag = "default";
        }
        super.__construct(env, "The given data was invalid.");
        this.response = response;
        this.errorBag = errorBag;
        this.validator = validator;
        return null;
    }

    @ConvertedMethod
    public Object errors(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        env.callMethod(this.validator, "errors", ValidationException.class),
                        "messages",
                        ValidationException.class));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "status")
    public Object status(RuntimeEnv env, Object... args) {
        Object status = assignParameter(args, 0, false);
        this.status = status;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "errorBag")
    public Object errorBag(RuntimeEnv env, Object... args) {
        Object errorBag = assignParameter(args, 0, false);
        this.errorBag = errorBag;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "url")
    public Object redirectTo(RuntimeEnv env, Object... args) {
        Object url = assignParameter(args, 0, false);
        this.redirectTo = url;
        return ZVal.assign(this);
    }

    @ConvertedMethod
    public Object getResponse(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.response);
    }

    public static final Object CONST_class = "Illuminate\\Validation\\ValidationException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends PHPException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "messages", typeHint = "array")
        public Object withMessages(RuntimeEnv env, Object... args) {
            ContextConstants runtimeConverterFunctionClassConstants =
                    new ContextConstants()
                            .setDir("/vendor/laravel/framework/src/Illuminate/Validation")
                            .setFile(
                                    "/vendor/laravel/framework/src/Illuminate/Validation/ValidationException.php");
            Object messages = assignParameter(args, 0, false);
            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            tap.f
                                    .env(env)
                                    .call(
                                            Validator.runtimeStaticObject.callUnknownStaticMethod(
                                                    env,
                                                    "make",
                                                    new RuntimeArgsWithReferences(),
                                                    ZVal.newArray(),
                                                    ZVal.newArray()),
                                            new Closure(
                                                    env,
                                                    runtimeConverterFunctionClassConstants,
                                                    "Illuminate\\Validation",
                                                    this) {
                                                @Override
                                                @ConvertedMethod
                                                @ConvertedParameter(index = 0, name = "validator")
                                                public Object run(
                                                        RuntimeEnv env,
                                                        Object thisvar,
                                                        PassByReferenceArgs
                                                                runtimePassByReferenceArgs,
                                                        Object... args) {
                                                    Object validator =
                                                            assignParameter(args, 0, false);
                                                    Object messages = null;
                                                    Object message = null;
                                                    Object value = null;
                                                    ReferenceContainer key =
                                                            new BasicReferenceContainer(null);
                                                    messages =
                                                            this.contextReferences.getCapturedValue(
                                                                    "messages");
                                                    for (ZPair zpairResult623 :
                                                            ZVal.getIterable(
                                                                    messages, env, false)) {
                                                        key.setObject(
                                                                ZVal.assign(
                                                                        zpairResult623.getKey()));
                                                        value =
                                                                ZVal.assign(
                                                                        zpairResult623.getValue());
                                                        for (ZPair zpairResult624 :
                                                                ZVal.getIterable(
                                                                        Arr.runtimeStaticObject
                                                                                .wrap(env, value),
                                                                        env,
                                                                        true)) {
                                                            message =
                                                                    ZVal.assign(
                                                                            zpairResult624
                                                                                    .getValue());
                                                            env.callMethod(
                                                                    env.callMethod(
                                                                            validator,
                                                                            "errors",
                                                                            ValidationException
                                                                                    .class),
                                                                    new RuntimeArgsWithReferences()
                                                                            .add(0, key),
                                                                    "add",
                                                                    ValidationException.class,
                                                                    key.getObject(),
                                                                    message);
                                                        }
                                                    }

                                                    return null;
                                                }
                                            }.use("messages", messages))
                                    .value()));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Validation\\ValidationException")
                    .setLookup(
                            ValidationException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("errorBag", "redirectTo", "response", "status", "validator")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Validation/ValidationException.php")
                    .addInterface("Throwable")
                    .addExtendsClass("Exception")
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
