package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Calculator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.ZAssignment;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.InvalidArgumentException;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_sum;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Calculator/Luhn.php

*/

public class Luhn extends RuntimeClassBase {

    public Luhn(RuntimeEnv env, Object... args) {
        super(env);
    }

    public Luhn(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Calculator\\Luhn";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "number")
        private Object checksum(RuntimeEnv env, Object... args) {
            ReferenceContainer number =
                    new BasicReferenceContainer(assignParameter(args, 0, false));
            Object length = null;
            Object i = null;
            Object sum = null;
            number.setObject(ZVal.assign(toStringR(number.getObject(), env)));
            length = function_strlen.f.env(env).call(number.getObject()).value();
            sum = 0;
            for (i = ZVal.subtract(length, 1);
                    ZVal.isGreaterThanOrEqualTo(i, ">=", 0);
                    i = ZAssignment.subtract("-=", i, 2)) {
                sum = ZAssignment.add("+=", sum, number.arrayGet(env, i));
            }

            for (i = ZVal.subtract(length, 2);
                    ZVal.isGreaterThanOrEqualTo(i, ">=", 0);
                    i = ZAssignment.subtract("-=", i, 2)) {
                sum =
                        ZAssignment.add(
                                "+=",
                                sum,
                                function_array_sum
                                        .f
                                        .env(env)
                                        .call(
                                                NamespaceGlobal.str_split
                                                        .env(env)
                                                        .call(
                                                                ZVal.multiply(
                                                                        number.arrayGet(env, i), 2))
                                                        .value())
                                        .value());
            }

            return ZVal.assign(ZVal.modulus(sum, 10));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "partialNumber")
        public Object computeCheckDigit(RuntimeEnv env, Object... args) {
            Object partialNumber = assignParameter(args, 0, false);
            Object checkDigit = null;
            checkDigit = runtimeStaticObject.checksum(env, toStringR(partialNumber, env) + "0");
            if (ZVal.strictEqualityCheck(checkDigit, "===", 0)) {
                return 0;
            }

            return ZVal.assign(toStringR(ZVal.subtract(10, checkDigit), env));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "number")
        public Object isValid(RuntimeEnv env, Object... args) {
            Object number = assignParameter(args, 0, false);
            return ZVal.assign(
                    ZVal.strictEqualityCheck(runtimeStaticObject.checksum(env, number), "===", 0));
        }

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "partialValue")
        public Object generateLuhnNumber(RuntimeEnv env, Object... args) {
            Object partialValue = assignParameter(args, 0, false);
            if (!function_preg_match.f.env(env).call("/^\\d+$/", partialValue).getBool()) {
                throw ZVal.getException(
                        env, new InvalidArgumentException(env, "Argument should be an integer."));
            }

            return ZVal.assign(
                    toStringR(partialValue, env)
                            + toStringR(
                                    com.project.convertedCode.globalNamespace.namespaces.Faker
                                            .namespaces.Calculator.classes.Luhn.runtimeStaticObject
                                            .computeCheckDigit(env, partialValue),
                                    env));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Calculator\\Luhn")
                    .setLookup(
                            Luhn.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Calculator/Luhn.php")
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
