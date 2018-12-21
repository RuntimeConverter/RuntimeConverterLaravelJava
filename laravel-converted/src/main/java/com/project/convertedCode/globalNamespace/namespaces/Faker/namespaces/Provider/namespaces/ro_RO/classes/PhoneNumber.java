package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ro_RO.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.references.ArrayDimensionReference;
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/ro_RO/PhoneNumber.php

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
        Object number = null;
        Object type = null;
        type =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(
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
                                                                                                        .ro_RO
                                                                                                        .classes
                                                                                                        .PhoneNumber
                                                                                                        .RequestStaticProperties
                                                                                                        .class)
                                                                                        .normalFormats)
                                                                        .value())))
                        .call(rLastRefArgs.get(0))
                        .value();
        number =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                        .method("numerify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                StaticMethodUtils
                                                                        .accessUnknownLateStaticMethod(
                                                                                env,
                                                                                this,
                                                                                PhoneNumber.class)
                                                                        .method("randomElement")
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
                                                                                                                                .ro_RO
                                                                                                                                .classes
                                                                                                                                .PhoneNumber
                                                                                                                                .RequestStaticProperties
                                                                                                                                .class)
                                                                                                                .normalFormats,
                                                                                                        type)))
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
                                                                                                        .ro_RO
                                                                                                        .classes
                                                                                                        .PhoneNumber
                                                                                                        .RequestStaticProperties
                                                                                                        .class,
                                                                                                "normalFormats")
                                                                                        .arrayGet(
                                                                                                env,
                                                                                                type))
                                                                        .value())))
                        .call(rLastRefArgs.get(0))
                        .value();
        return ZVal.assign(number);
    }

    public static final Object CONST_class = "Faker\\Provider\\ro_RO\\PhoneNumber";

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

        @ConvertedMethod
        public Object tollFreePhoneNumber(RuntimeEnv env, Object... args) {
            Object number = null;
            number =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
                                            .method("randomElement")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
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
                                                                            .ro_RO
                                                                            .classes
                                                                            .PhoneNumber
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "specialFormats")
                                                            .arrayGet(env, "toll-free"))
                                            .value())
                            .value();
            return ZVal.assign(number);
        }

        @ConvertedMethod
        public Object premiumRatePhoneNumber(RuntimeEnv env, Object... args) {
            Object number = null;
            number =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, PhoneNumber.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, PhoneNumber.class)
                                            .method("randomElement")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
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
                                                                            .ro_RO
                                                                            .classes
                                                                            .PhoneNumber
                                                                            .RequestStaticProperties
                                                                            .class,
                                                                    "specialFormats")
                                                            .arrayGet(env, "premium-rate"))
                                            .value())
                            .value();
            return ZVal.assign(number);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object normalFormats =
                ZVal.newArray(
                        new ZPair(
                                "landline",
                                ZVal.arrayFromList(
                                        "021#######",
                                        "023#######",
                                        "024#######",
                                        "025#######",
                                        "026#######",
                                        "027#######",
                                        "031#######",
                                        "033#######",
                                        "034#######",
                                        "035#######",
                                        "036#######",
                                        "037#######")),
                        new ZPair("mobile", ZVal.arrayFromList("07########")));

        public Object specialFormats =
                ZVal.newArray(
                        new ZPair(
                                "toll-free",
                                ZVal.arrayFromList(
                                        "0800######",
                                        "0801######",
                                        "0802######",
                                        "0806######",
                                        "0807######",
                                        "0870######")),
                        new ZPair(
                                "premium-rate",
                                ZVal.arrayFromList("0900######", "0903######", "0906######")));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ro_RO\\PhoneNumber")
                    .setLookup(
                            PhoneNumber.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("normalFormats", "specialFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ro_RO/PhoneNumber.php")
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
