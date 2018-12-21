package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ka_GE.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/Payment.php

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

    public static final Object CONST_class = "Faker\\Provider\\ka_GE\\Payment";

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
        public Object bank(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Payment.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
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
                                                            .ka_GE
                                                            .classes
                                                            .Payment
                                                            .RequestStaticProperties
                                                            .class)
                                            .banks)
                            .value());
        }

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
                countryCode = "GE";
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

        public Object banks =
                ZVal.arrayFromList(
                        "\u10D1\u10D0\u10DC\u10D9\u10D8 \u10E0\u10D4\u10E1\u10DE\u10E3\u10D1\u10DA\u10D8\u10D9\u10D0",
                        "\u10D7\u10D8\u10D1\u10D8\u10E1\u10D8 \u10D1\u10D0\u10DC\u10D9\u10D8",
                        "\u10E1\u10D0\u10E5\u10D0\u10E0\u10D7\u10D5\u10D4\u10DA\u10DD\u10E1 \u10D1\u10D0\u10DC\u10D9\u10D8",
                        "\u10DA\u10D8\u10D1\u10D4\u10E0\u10D7\u10D8 \u10D1\u10D0\u10DC\u10D9\u10D8",
                        "\u10D1\u10D0\u10D6\u10D8\u10E1\u10D1\u10D0\u10DC\u10D9\u10D8",
                        "\u10D5\u10D8\u10D7\u10D8\u10D1\u10D8 \u10D1\u10D0\u10DC\u10D9\u10D8 \u10EF\u10DD\u10E0\u10EF\u10D8\u10D0",
                        "\u10D1\u10D0\u10DC\u10D9\u10D8 \u10E5\u10D0\u10E0\u10D7\u10E3",
                        "\u10DE\u10E0\u10DD\u10D9\u10E0\u10D4\u10D3\u10D8\u10E2 \u10D1\u10D0\u10DC\u10D9\u10D8",
                        "\u10E1\u10D8\u10DA\u10E5 \u10E0\u10DD\u10E3\u10D3 \u10D1\u10D0\u10DC\u10D9\u10D8 ",
                        "\u10D9\u10D0\u10DE\u10D8\u10E2\u10D0\u10DA \u10D1\u10D0\u10DC\u10D9\u10D8 ",
                        "\u10D0\u10D6\u10D4\u10E0\u10D1\u10D0\u10D8\u10EF\u10D0\u10DC\u10D8\u10E1 \u10E1\u10D0\u10D4\u10E0\u10D7\u10D0\u10E8\u10DD\u10E0\u10D8\u10E1\u10DD \u10D1\u10D0\u10DC\u10D9\u10D8 - \u10E1\u10D0\u10E5\u10D0\u10E0\u10D7\u10D5\u10D4\u10DA\u10DD ",
                        "\u10D6\u10D8\u10E0\u10D0\u10D0\u10D7 \u10D1\u10D0\u10DC\u10D9\u10D8\u10E1 \u10D7\u10D1\u10D8\u10DA\u10D8\u10E1\u10D8\u10E1 \u10E4\u10D8\u10DA\u10D8\u10D0\u10DA\u10D8 ",
                        "\u10D9\u10D0\u10D5\u10D9\u10D0\u10E1\u10D8\u10D8\u10E1 \u10D2\u10D0\u10DC\u10D5\u10D8\u10D7\u10D0\u10E0\u10D4\u10D1\u10D8\u10E1 \u10D1\u10D0\u10DC\u10D9\u10D8 - \u10E1\u10D0\u10E5\u10D0\u10E0\u10D7\u10D5\u10D4\u10DA\u10DD",
                        "\u10D8\u10E8 \u10D1\u10D0\u10DC\u10D9\u10D8 \u10E1\u10D0\u10E5\u10D0\u10E0\u10D7\u10D5\u10D4\u10DA\u10DD",
                        "\u10DE\u10E0\u10DD\u10D2\u10E0\u10D4\u10E1 \u10D1\u10D0\u10DC\u10D9\u10D8",
                        "\u10D9\u10DD\u10E0 \u10E1\u10E2\u10D0\u10DC\u10D3\u10D0\u10E0\u10E2 \u10D1\u10D0\u10DC\u10D9\u10D8",
                        "\u10EE\u10D0\u10DA\u10D8\u10D9 \u10D1\u10D0\u10DC\u10D9\u10D8 \u10E1\u10D0\u10E5\u10D0\u10E0\u10D7\u10D5\u10D4\u10DA\u10DD ",
                        "\u10DE\u10D0\u10E8\u10D0 \u10D1\u10D0\u10DC\u10D9\u10D8 \u10E1\u10D0\u10E5\u10D0\u10E0\u10D7\u10D5\u10D4\u10DA\u10DD",
                        "\u10E4\u10D8\u10DC\u10D9\u10D0 \u10D1\u10D0\u10DC\u10D9\u10D8 \u10E1\u10D0\u10E5\u10D0\u10E0\u10D7\u10D5\u10D4\u10DA\u10DD");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ka_GE\\Payment")
                    .setLookup(
                            Payment.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames("banks")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ka_GE/Payment.php")
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
