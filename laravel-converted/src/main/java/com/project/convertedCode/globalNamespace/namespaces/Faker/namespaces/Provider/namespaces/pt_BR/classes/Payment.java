package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.pt_BR.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/Payment.php

*/

public class Payment
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Payment {

    public Payment(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Payment.class) {
            this.__construct(env, args);
        }
    }

    public Payment(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_class = "Faker\\Provider\\pt_BR\\Payment";

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
                    .Payment
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "prefix")
        @ConvertedParameter(index = 1, name = "countryCode")
        @ConvertedParameter(
            index = 2,
            name = "length",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object bankAccountNumber(RuntimeEnv env, Object... args) {
            Object prefix = assignParameter(args, 0, true);
            if (null == prefix) {
                prefix = "";
            }
            Object countryCode = assignParameter(args, 1, true);
            if (null == countryCode) {
                countryCode = "BR";
            }
            Object length = assignParameter(args, 2, true);
            if (null == length) {
                length = ZVal.getNull();
            }
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
                            .method("iban")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(countryCode, prefix, length)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cardVendors =
                ZVal.arrayFromList(
                        "Visa",
                        "Visa",
                        "Visa",
                        "Visa",
                        "Visa",
                        "MasterCard",
                        "MasterCard",
                        "MasterCard",
                        "MasterCard",
                        "MasterCard",
                        "American Express",
                        "Discover Card",
                        "Diners",
                        "Elo",
                        "Hipercard");

        public Object cardParams =
                ZVal.newArray(
                        new ZPair("Visa", ZVal.arrayFromList("4##############")),
                        new ZPair("MasterCard", ZVal.arrayFromList("5##############")),
                        new ZPair(
                                "American Express",
                                ZVal.arrayFromList("34############", "37############")),
                        new ZPair(
                                "Discover Card",
                                ZVal.arrayFromList(
                                        "6011###########",
                                        "622############",
                                        "64#############",
                                        "65#############")),
                        new ZPair(
                                "Diners",
                                ZVal.arrayFromList(
                                        "301############",
                                        "301##########",
                                        "305############",
                                        "305##########",
                                        "36#############",
                                        "36###########",
                                        "38#############",
                                        "38###########")),
                        new ZPair(
                                "Elo",
                                ZVal.arrayFromList(
                                        "636368#########",
                                        "438935#########",
                                        "504175#########",
                                        "451416#########",
                                        "636297#########",
                                        "5067###########",
                                        "4576###########",
                                        "4011###########")),
                        new ZPair(
                                "Hipercard",
                                ZVal.arrayFromList("38#############", "60#############")),
                        new ZPair("Aura", ZVal.arrayFromList("50#############")));
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\pt_BR\\Payment")
                    .setLookup(
                            Payment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("cardParams", "cardVendors")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/pt_BR/Payment.php")
                    .addExtendsClass("Faker\\Provider\\Payment")
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
