package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.kk_KZ.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/kk_KZ/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Address {

    public Address(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Address.class) {
            this.__construct(env, args);
        }
    }

    public Address(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object city(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                .kk_KZ
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "city")))
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
                                                        .kk_KZ
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .city)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\kk_KZ\\Address";

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
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object buildingNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("numerify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
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
                                                                            .kk_KZ
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .buildingNumber)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object regionSuffix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                            .kk_KZ
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .regionSuffix)
                            .value());
        }

        @ConvertedMethod
        public Object region(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                            .kk_KZ
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .region)
                            .value());
        }

        @ConvertedMethod
        public Object street(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                            .kk_KZ
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .street)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object citySuffix = ZVal.arrayFromList("\u049B\u0430\u043B\u0430\u0441\u044B");

        public Object regionSuffix = ZVal.arrayFromList("\u043E\u0431\u043B\u044B\u0441\u044B");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "\u043A\u04E9\u0448\u0435\u0441\u0456",
                        "\u0434\u0430\u04A3\u0493\u044B\u043B\u044B");

        public Object buildingNumber = ZVal.arrayFromList("###");

        public Object postcode = ZVal.arrayFromList("0#####");

        public Object country =
                ZVal.arrayFromList(
                        "\u049A\u0430\u0437\u0430\u049B\u0441\u0442\u0430\u043D",
                        "\u0420\u0435\u0441\u0435\u0439");

        public Object region =
                ZVal.arrayFromList(
                        "\u0410\u043B\u043C\u0430\u0442\u044B",
                        "\u0410\u049B\u0442\u0430\u0443",
                        "\u0410\u049B\u0442\u04E9\u0431\u0435",
                        "\u0410\u0441\u0442\u0430\u043D\u0430",
                        "\u0410\u0442\u044B\u0440\u0430\u0443",
                        "\u0411\u0430\u0439\u049B\u043E\u04A3\u044B\u0440",
                        "\u049A\u0430\u0440\u0430\u0493\u0430\u043D\u0434\u044B",
                        "\u041A\u04E9\u043A\u0448\u0435\u0442\u0430\u0443",
                        "\u049A\u043E\u0441\u0442\u0430\u043D\u0430\u0439",
                        "\u049A\u044B\u0437\u044B\u043B\u043E\u0440\u0434\u0430",
                        "\u041C\u0430\u04A3\u0493\u044B\u0441\u0442\u0430\u0443",
                        "\u041F\u0430\u0432\u043B\u043E\u0434\u0430\u0440",
                        "\u041F\u0435\u0442\u0440\u043E\u043F\u0430\u0432\u043B",
                        "\u0422\u0430\u043B\u0434\u044B\u049B\u043E\u0440\u0493\u0430\u043D",
                        "\u0422\u0430\u0440\u0430\u0437",
                        "\u041E\u0440\u0430\u043B",
                        "\u04E8\u0441\u043A\u0435\u043C\u0435\u043D",
                        "\u0428\u044B\u043C\u043A\u0435\u043D\u0442");

        public Object city =
                ZVal.arrayFromList(
                        "\u0410\u043B\u043C\u0430\u0442\u044B",
                        "\u0410\u049B\u0442\u0430\u0443",
                        "\u0410\u049B\u0442\u04E9\u0431\u0435",
                        "\u0410\u0441\u0442\u0430\u043D\u0430",
                        "\u0410\u0442\u044B\u0440\u0430\u0443",
                        "\u0411\u0430\u0439\u049B\u043E\u04A3\u044B\u0440",
                        "\u049A\u0430\u0440\u0430\u0493\u0430\u043D\u0434\u044B",
                        "\u041A\u04E9\u043A\u0448\u0435\u0442\u0430\u0443",
                        "\u049A\u043E\u0441\u0442\u0430\u043D\u0430\u0439",
                        "\u049A\u044B\u0437\u044B\u043B\u043E\u0440\u0434\u0430",
                        "\u041C\u0430\u04A3\u0493\u044B\u0441\u0442\u0430\u0443",
                        "\u041F\u0430\u0432\u043B\u043E\u0434\u0430\u0440",
                        "\u041F\u0435\u0442\u0440\u043E\u043F\u0430\u0432\u043B",
                        "\u0422\u0430\u043B\u0434\u044B\u049B\u043E\u0440\u0493\u0430\u043D",
                        "\u0422\u0430\u0440\u0430\u0437",
                        "\u041E\u0440\u0430\u043B",
                        "\u04E8\u0441\u043A\u0435\u043C\u0435\u043D",
                        "\u0428\u044B\u043C\u043A\u0435\u043D\u0442");

        public Object street =
                ZVal.arrayFromList(
                        "\u0410\u0431\u0430\u0439",
                        "\u0413\u043E\u0433\u043E\u043B\u044C",
                        "\u041A\u0435\u043D\u0435\u0441\u0430\u0440\u044B",
                        "\u0411\u0435\u0439\u0431\u0456\u0442\u0448\u0456\u043B\u0456\u043A",
                        "\u0414\u043E\u0441\u0442\u044B\u049B",
                        "\u0411\u04B1\u049B\u0430\u0440 \u0436\u044B\u0440\u0430\u0443");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{postcode}}, {{region}} {{regionSuffix}}, {{city}} {{citySuffix}}, {{street}} {{streetSuffix}}, {{buildingNumber}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{street}} {{streetSuffix}}, {{buildingNumber}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\kk_KZ\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "city",
                            "citySuffix",
                            "country",
                            "postcode",
                            "region",
                            "regionSuffix",
                            "street",
                            "streetAddressFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/kk_KZ/Address.php")
                    .addExtendsClass("Faker\\Provider\\Address")
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
