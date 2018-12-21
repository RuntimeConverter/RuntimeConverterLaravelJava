package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_SG.classes;

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
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/en_SG/Address.php

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
    public Object streetPrefix(RuntimeEnv env, Object... args) {
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
                                                                .en_SG
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetPrefix")))
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
                                                        .en_SG
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetPrefix)
                        .value());
    }

    @ConvertedMethod
    public Object streetNumber(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                                Address.class)
                                                                        .method("randomElement")
                                                                        .addReferenceArgs(
                                                                                new RuntimeArgsWithReferences()
                                                                                        .add(
                                                                                                0,
                                                                                                env
                                                                                                        .getRequestStaticPropertiesReference(
                                                                                                                com.project
                                                                                                                        .convertedCode
                                                                                                                        .globalNamespace
                                                                                                                        .namespaces
                                                                                                                        .Faker
                                                                                                                        .namespaces
                                                                                                                        .Provider
                                                                                                                        .namespaces
                                                                                                                        .en_SG
                                                                                                                        .classes
                                                                                                                        .Address
                                                                                                                        .RequestStaticProperties
                                                                                                                        .class,
                                                                                                                "streetNumber")))
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
                                                                                                        .en_SG
                                                                                                        .classes
                                                                                                        .Address
                                                                                                        .RequestStaticProperties
                                                                                                        .class)
                                                                                        .streetNumber)
                                                                        .value())))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object blockNumber(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
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
                                                                                Address.class)
                                                                        .method("randomElement")
                                                                        .addReferenceArgs(
                                                                                new RuntimeArgsWithReferences()
                                                                                        .add(
                                                                                                0,
                                                                                                env
                                                                                                        .getRequestStaticPropertiesReference(
                                                                                                                com.project
                                                                                                                        .convertedCode
                                                                                                                        .globalNamespace
                                                                                                                        .namespaces
                                                                                                                        .Faker
                                                                                                                        .namespaces
                                                                                                                        .Provider
                                                                                                                        .namespaces
                                                                                                                        .en_SG
                                                                                                                        .classes
                                                                                                                        .Address
                                                                                                                        .RequestStaticProperties
                                                                                                                        .class,
                                                                                                                "blockNumber")))
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
                                                                                                        .en_SG
                                                                                                        .classes
                                                                                                        .Address
                                                                                                        .RequestStaticProperties
                                                                                                        .class)
                                                                                        .blockNumber)
                                                                        .value())))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object floorNumber(RuntimeEnv env, Object... args) {
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
                                                                .en_SG
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "floorNumber")))
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
                                                        .en_SG
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .floorNumber)
                        .value());
    }

    @ConvertedMethod
    public Object apartmentNumber(RuntimeEnv env, Object... args) {
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
                                                                .en_SG
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "apartmentNumber")))
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
                                                        .en_SG
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .apartmentNumber)
                        .value());
    }

    @ConvertedMethod
    public Object townName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.getRequestStaticProperties(
                                com.project
                                        .convertedCode
                                        .globalNamespace
                                        .namespaces
                                        .Faker
                                        .namespaces
                                        .Provider
                                        .namespaces
                                        .en_SG
                                        .classes
                                        .Address
                                        .RequestStaticProperties
                                        .class)
                        .townName);
    }

    public static final Object CONST_class = "Faker\\Provider\\en_SG\\Address";

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
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object streetNumber = ZVal.arrayFromList("##", "###");

        public Object blockNumber =
                ZVal.arrayFromList(
                        "Blk ##",
                        "Blk ###",
                        "Blk ###A",
                        "Blk ###B",
                        "Blk ###C",
                        "Blk ###D",
                        "Blk ###E",
                        "Blk ###F",
                        "Blk ###G",
                        "Blk ###H");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "Alley",
                        "Avenue",
                        "Bridge",
                        "Crescent",
                        "Drive",
                        "Grove",
                        "Highway",
                        "Hill",
                        "Lane",
                        "Link",
                        "Park",
                        "Place",
                        "Quay",
                        "Road",
                        "Walk",
                        "Way");

        public Object streetPrefix = ZVal.arrayFromList("Jalan");

        public Object streetName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adam",
                                    "Airport",
                                    "Alexandra",
                                    "Aljunied",
                                    "Ampang",
                                    "Ann Siang",
                                    "Angus",
                                    "Anson",
                                    "Armenian",
                                    "Balmoral",
                                    "Battery",
                                    "Bencoolen",
                                    "Collyer",
                                    "Clarke",
                                    "Church",
                                    "Cecil",
                                    "Cross",
                                    "Chulia",
                                    "Cheang Hong Lim",
                                    "Chin Swee",
                                    "Choon Guan",
                                    "Devonshire",
                                    "Dublin",
                                    "Duxton",
                                    "D'Almeida",
                                    "East Coast",
                                    "Eden",
                                    "Edgware",
                                    "Eunos",
                                    "Fifth",
                                    "First",
                                    "Funan",
                                    "Fullerton",
                                    "George",
                                    "Glasgow",
                                    "Grange",
                                    "Havelock",
                                    "High",
                                    "Hylam",
                                    "International Business",
                                    "International",
                                    "Irving",
                                    "Jubilee",
                                    "Kensington Park",
                                    "Kitchener",
                                    "Knights",
                                    "Lancaster",
                                    "Leicester",
                                    "Lengkok Bahru",
                                    "Lim Teck Kim",
                                    "Malay",
                                    "Market",
                                    "Middle",
                                    "Malabar",
                                    "Merchant",
                                    "Mohammed Sultan",
                                    "Napier",
                                    "Nathan",
                                    "Newton",
                                    "Ocean",
                                    "One Tree",
                                    "Orchard",
                                    "Outram",
                                    "Ophir",
                                    "Pekin",
                                    "Peng Siang",
                                    "Prince Edward",
                                    "Palmer",
                                    "Quality",
                                    "Queen",
                                    "Raffles",
                                    "Robinson",
                                    "Rochor",
                                    "Regent",
                                    "Ridley",
                                    "River Valley",
                                    "Sixth",
                                    "Somerset",
                                    "Stanley",
                                    "Stamford",
                                    "Shenton",
                                    "Sultan",
                                    "Telok Ayer",
                                    "Temple",
                                    "Thomson",
                                    "Unity",
                                    "Victoria",
                                    "Xilin",
                                    "York",
                                    "Zion");
                        });

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetPrefix}} {{streetName}}", "{{streetName}} {{streetSuffix}}");

        public Object floorNumber = ZVal.arrayFromList("##", "0#");

        public Object apartmentNumber = ZVal.arrayFromList("##", "###");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{streetNumber}} {{streetAddress}}\n{{townName}} {{postcode}}",
                        "{{blockNumber}} {{streetAddress}}\n{{floorNumber}} {{apartmentNumber}}\n{{townName}} {{postcode}}");

        public Object townName = "SINGAPORE";

        public Object postcode = ZVal.arrayFromList("######");

        public Object country = ZVal.arrayFromList("SINGAPORE");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_SG\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "apartmentNumber",
                            "blockNumber",
                            "country",
                            "floorNumber",
                            "postcode",
                            "streetAddressFormats",
                            "streetName",
                            "streetNumber",
                            "streetPrefix",
                            "streetSuffix",
                            "townName")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_SG/Address.php")
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
