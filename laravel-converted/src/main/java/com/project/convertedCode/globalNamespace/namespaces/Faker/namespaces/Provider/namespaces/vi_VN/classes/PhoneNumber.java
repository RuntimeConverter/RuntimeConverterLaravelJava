package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.vi_VN.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_str_replace;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/vi_VN/PhoneNumber.php

*/

public class PhoneNumber
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .PhoneNumber {

    public PhoneNumber(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhoneNumber.class) {
            this.__construct(env, args);
        }
    }

    public PhoneNumber(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object phoneNumber(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object areaCode = null;
        Object areaCodeLength = null;
        Object digits = null;
        areaCode =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .vi_VN
                                                                .classes
                                                                .PhoneNumber
                                                                .RequestStaticProperties
                                                                .class,
                                                        "areaCodes")))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .namespaces
                                                        .vi_VN
                                                        .classes
                                                        .PhoneNumber
                                                        .RequestStaticProperties
                                                        .class)
                                        .areaCodes)
                        .value();
        areaCodeLength = function_strlen.f.env(env).call(areaCode).value();
        digits = 7;
        if (ZVal.isLessThan(areaCodeLength, '<', 2)) {
            digits = 8;
        }

        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("numerify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                function_str_replace
                                                                        .f
                                                                        .env(env)
                                                                        .call(
                                                                                "[a]",
                                                                                areaCode,
                                                                                StaticMethodUtils
                                                                                        .accessUnknownLateStaticMethod(
                                                                                                env,
                                                                                                this,
                                                                                                PhoneNumber
                                                                                                        .class)
                                                                                        .method(
                                                                                                "randomElement")
                                                                                        .addReferenceArgs(
                                                                                                new RuntimeArgsWithReferences()
                                                                                                        .add(
                                                                                                                0,
                                                                                                                new ArrayDimensionReference(
                                                                                                                        env
                                                                                                                                .getRequestStaticProperties(
                                                                                                                                        com.project
                                                                                                                                                .convertedCode
                                                                                                                                                .globalNamespace
                                                                                                                                                .namespaces
                                                                                                                                                .Faker
                                                                                                                                                .namespaces
                                                                                                                                                .Provider
                                                                                                                                                .namespaces
                                                                                                                                                .vi_VN
                                                                                                                                                .classes
                                                                                                                                                .PhoneNumber
                                                                                                                                                .RequestStaticProperties
                                                                                                                                                .class)
                                                                                                                                .formats,
                                                                                                                        digits)))
                                                                                        .call(
                                                                                                env.getRequestStaticPropertiesReference(
                                                                                                                com.project
                                                                                                                        .convertedCode
                                                                                                                        .globalNamespace
                                                                                                                        .namespaces
                                                                                                                        .Faker
                                                                                                                        .namespaces
                                                                                                                        .Provider
                                                                                                                        .namespaces
                                                                                                                        .vi_VN
                                                                                                                        .classes
                                                                                                                        .PhoneNumber
                                                                                                                        .RequestStaticProperties
                                                                                                                        .class,
                                                                                                                "formats")
                                                                                                        .arrayGet(
                                                                                                                env,
                                                                                                                digits))
                                                                                        .value())
                                                                        .value())))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\vi_VN\\PhoneNumber";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Faker
                    .namespaces
                    .Provider
                    .classes
                    .PhoneNumber
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object areaCodes =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    76, 281, 64, 781, 240, 241, 75, 650, 56, 651, 62, 780, 26, 710,
                                    511, 500, 510, 230, 61, 67, 59, 219, 351, 4, 39, 320, 31, 711,
                                    218, 321, 8, 58, 77, 60, 231, 25, 20, 63, 72, 350, 38, 30, 68,
                                    210, 57, 52, 510, 55, 33, 53, 79, 22, 66, 36, 280, 37, 54, 73,
                                    74, 27, 70, 211, 29, 96, 97, 98, 162, 163, 164, 165, 166, 167,
                                    168, 169, 91, 94, 123, 124, 125, 127, 129, 90, 93, 120, 121,
                                    122, 126, 128, 92, 186, 188, 99, 199, 95);
                        });

        public Object formats =
                ZVal.newArray(
                        new ZPair(
                                "7",
                                ZVal.arrayFromList(
                                        "0[a] ### ####",
                                        "(0[a]) ### ####",
                                        "0[a]-###-####",
                                        "(0[a])###-####",
                                        "84-[a]-###-####",
                                        "(84)([a])###-####",
                                        "+84-[a]-###-####")),
                        new ZPair(
                                "8",
                                ZVal.arrayFromList(
                                        "0[a] #### ####",
                                        "(0[a]) #### ####",
                                        "0[a]-####-####",
                                        "(0[a])####-####",
                                        "84-[a]-####-####",
                                        "(84)([a])####-####",
                                        "+84-[a]-####-####")));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\vi_VN\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("areaCodes", "formats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/vi_VN/PhoneNumber.php")
                    .addExtendsClass("Faker\\Provider\\PhoneNumber")
                    .addExtendsClass("Faker\\Provider\\Base")
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
