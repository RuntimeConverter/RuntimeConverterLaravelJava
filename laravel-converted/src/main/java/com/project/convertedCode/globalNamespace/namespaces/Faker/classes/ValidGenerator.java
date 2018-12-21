package com.project.convertedCode.globalNamespace.namespaces.Faker.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_callable;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func_array;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.runtime.function_call_user_func;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.OverflowException;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithInfo;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/ValidGenerator.php

*/

public class ValidGenerator extends RuntimeClassBase {

    public Object generator = null;

    public Object validator = null;

    public Object maxRetries = null;

    public ValidGenerator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ValidGenerator.class) {
            this.__construct(env, args);
        }
    }

    public ValidGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "generator", typeHint = "Faker\\Generator")
    @ConvertedParameter(
        index = 1,
        name = "validator",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 2,
        name = "maxRetries",
        defaultValue = "10000",
        defaultValueType = "number"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir("/vendor/fzaninotto/faker/src/Faker")
                        .setFile("/vendor/fzaninotto/faker/src/Faker/ValidGenerator.php");
        Object generator = assignParameter(args, 0, false);
        Object validator = assignParameter(args, 1, true);
        if (null == validator) {
            validator = ZVal.getNull();
        }
        Object maxRetries = assignParameter(args, 2, true);
        if (null == maxRetries) {
            maxRetries = 10000;
        }
        if (function_is_null.f.env(env).call(validator).getBool()) {
            validator =
                    new Closure(env, runtimeConverterFunctionClassConstants, "Faker", this) {
                        @Override
                        @ConvertedMethod
                        public Object run(
                                RuntimeEnv env,
                                Object thisvar,
                                PassByReferenceArgs runtimePassByReferenceArgs,
                                Object... args) {
                            return ZVal.assign(true);
                        }
                    };

        } else if (!function_is_callable.f.env(env).call(validator).getBool()) {
            throw ZVal.getException(
                    env,
                    new InvalidArgumentException(
                            env, "valid() only accepts callables as first argument"));
        }

        this.generator = generator;
        this.validator = validator;
        this.maxRetries = maxRetries;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "attribute")
    public Object __get(RuntimeEnv env, Object... args) {
        Object attribute = assignParameter(args, 0, false);
        return ZVal.assign(this.__call(env, attribute, ZVal.newArray()));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(index = 1, name = "arguments")
    public Object __call(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object arguments = assignParameter(args, 1, false);
        Object res = null;
        ReferenceContainer i = new BasicReferenceContainer(null);
        i.setObject(0);
        do {
            res =
                    function_call_user_func_array
                            .f
                            .env(env)
                            .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                            .call(
                                    ZVal.newArray(new ZPair(0, this.generator), new ZPair(1, name)),
                                    arguments)
                            .value();
            i.setObject(ZVal.increment(i.getObject()));
            if (ZVal.isGreaterThan(i.getObject(), '>', this.maxRetries)) {
                throw ZVal.getException(
                        env,
                        new OverflowException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Maximum retries of %d reached without finding a valid value",
                                                this.maxRetries)
                                        .value()));
            }

        } while (!function_call_user_func
                .f
                .env(env)
                .addReferenceArgs(new RuntimeArgsWithInfo(args, this))
                .call(this.validator, res)
                .getBool());

        return ZVal.assign(res);
    }

    public static final Object CONST_class = "Faker\\ValidGenerator";

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
                    .setName("Faker\\ValidGenerator")
                    .setLookup(
                            ValidGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "maxRetries", "validator")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/ValidGenerator.php")
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
