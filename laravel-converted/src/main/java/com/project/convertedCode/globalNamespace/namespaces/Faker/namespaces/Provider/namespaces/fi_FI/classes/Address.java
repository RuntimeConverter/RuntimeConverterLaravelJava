package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.fi_FI.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/fi_FI/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\fi_FI\\Address";

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
        public Object cityPrefix(RuntimeEnv env, Object... args) {
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
                                                            .fi_FI
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object secondaryAddress(RuntimeEnv env, Object... args) {
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
                                                                            .fi_FI
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .secondaryAddressFormats)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object state(RuntimeEnv env, Object... args) {
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
                                                            .fi_FI
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix =
                ZVal.arrayFromList(
                        "Pohjois", "Etel\u00E4", "It\u00E4", "L\u00E4nsi", "Uusi", "Uus");

        public Object citySuffix =
                ZVal.arrayFromList(
                        "kyl\u00E4",
                        "niemi",
                        "j\u00E4rvi",
                        "joki",
                        "lampi",
                        "m\u00E4ki",
                        "vesi",
                        "niemi",
                        "harju",
                        "lahti",
                        "harju",
                        "salmi",
                        "koski",
                        "pudas",
                        "saari");

        public Object buildingNumber = ZVal.arrayFromList("####", "###", "##", "#", "#");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "tie",
                        "kuja",
                        "polku",
                        "kierros",
                        "kulma",
                        "katu",
                        "kaarre",
                        "kaari",
                        "rinne",
                        "kaarto",
                        "haka",
                        "silta",
                        "rinne",
                        "t\u00F6yry");

        public Object postcode = ZVal.arrayFromList("#####");

        public Object state =
                ZVal.arrayFromList(
                        "Ahvenanmaa",
                        "Etel\u00E4-Karjala",
                        "Etel\u00E4-Pohjanmaa",
                        "Etel\u00E4-Savo",
                        "Kainuu",
                        "Kanta-H\u00E4me",
                        "Keski-Pohjanmaa",
                        "Keski-Suomi",
                        "Kymenlaakso",
                        "Lappi",
                        "Pirkanmaa",
                        "Pohjanmaa",
                        "Pohjois-Karjala",
                        "Pohjois-Pohjanmaa",
                        "Pohjois-Savo",
                        "P\u00E4ij\u00E4t-H\u00E4me",
                        "Satakunta",
                        "Uusimaa",
                        "Varsinais-Suomi");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganistan",
                                    "Alankomaat",
                                    "Albania",
                                    "Algeria",
                                    "Andorra",
                                    "Angola",
                                    "Antigua ja Barbuda",
                                    "Argentiina",
                                    "Armenia",
                                    "Australia",
                                    "Azerbaid\u1E91an",
                                    "Bahama",
                                    "Bahrain",
                                    "Bangladesh",
                                    "Barbados",
                                    "Belgia",
                                    "Belize",
                                    "Benin",
                                    "Bhutan",
                                    "Bolivia",
                                    "Bosnia ja Hertsegovina",
                                    "Botswana",
                                    "Brasilia",
                                    "Brunel",
                                    "Bulgaria",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Chile",
                                    "Costa Rica",
                                    "Djibouti",
                                    "Dominica",
                                    "Dominikaaninen tasavalta",
                                    "Ecuador",
                                    "Egypti",
                                    "El Salvador",
                                    "Eritrea",
                                    "Espanja",
                                    "Etel\u00E4-Afrikka",
                                    "Etel\u00E4-Korea",
                                    "Etel\u00E4-Sudan",
                                    "Etiopia",
                                    "Fid\u1E91i",
                                    "Filippiinit",
                                    "Gabon",
                                    "Gambia",
                                    "Georgia",
                                    "Ghana",
                                    "Grenada",
                                    "Guatemala",
                                    "Guinea-Bissau",
                                    "Guinea",
                                    "Guyana",
                                    "Haiti",
                                    "Honduras",
                                    "Indonesia",
                                    "Intia",
                                    "Irak",
                                    "Iran",
                                    "Irlanti",
                                    "Islanti",
                                    "Israel",
                                    "Italia",
                                    "It\u00E4-Timor",
                                    "It\u00E4valta",
                                    "Jamaika",
                                    "Japani",
                                    "Jemen",
                                    "Jordania",
                                    "Kambod\u1E91a",
                                    "Kamerun",
                                    "Kanada",
                                    "Kap Verde",
                                    "Kazakstan",
                                    "Kenia",
                                    "Keski-Afrikan tasavalta",
                                    "Kiina",
                                    "Kirgisia",
                                    "Kiribati",
                                    "Kolumbia",
                                    "Komorit",
                                    "Kongon demokraattinen tasavalta",
                                    "Kongon tasavalta",
                                    "Kosovo",
                                    "Kreikka",
                                    "Kroatia",
                                    "Kuuba",
                                    "Kuwait",
                                    "Kypros",
                                    "Laos",
                                    "Latvia",
                                    "Lesotho",
                                    "Libanon",
                                    "Liberai",
                                    "Libya",
                                    "Lichtenstein",
                                    "Liettua",
                                    "Luxemburg",
                                    "Madagaskar",
                                    "Makedonia",
                                    "Malawi",
                                    "Malediivit",
                                    "Malesia",
                                    "Mali",
                                    "Malta",
                                    "Marokko",
                                    "Marshallinsaaret",
                                    "Mauritania",
                                    "Mauritius",
                                    "Meksiko",
                                    "Mikronesia",
                                    "Moldova",
                                    "Monaco",
                                    "Mongolia",
                                    "Montenegro",
                                    "Mosambik",
                                    "Myanmar",
                                    "Namibia",
                                    "Nauru",
                                    "Nepal",
                                    "Nicaragua",
                                    "Nigeria",
                                    "Niger",
                                    "Norja",
                                    "Norsunluurannikko",
                                    "Oman",
                                    "Pakistan",
                                    "Palau",
                                    "Panama",
                                    "Papua-Uusi-Guinea",
                                    "Paraguay",
                                    "Peru",
                                    "Pohjois-Korea",
                                    "Portugali",
                                    "Puola",
                                    "P\u00E4iv\u00E4ntasaajan Guinea",
                                    "Qatar",
                                    "Ranska",
                                    "Romania",
                                    "Ruanda",
                                    "Ruotsi",
                                    "Saint Kitts ja Nevis",
                                    "Saint Lucia",
                                    "Saint Vincent ja Grenadiinit",
                                    "Saksa",
                                    "Salomonsaaret",
                                    "Sambia",
                                    "Samoa",
                                    "San Marino",
                                    "S\u00E3o Tom\u00E9 ja Pr\u00EDncipe",
                                    "Saudi-Arabia",
                                    "Senegal",
                                    "Serbia",
                                    "Seychellit",
                                    "Sierra Leone",
                                    "Singapore",
                                    "Slovakia",
                                    "Somalia",
                                    "Sri Lanka",
                                    "Sudan",
                                    "Suomi",
                                    "Suriname",
                                    "Swazimaa",
                                    "Sveitsi",
                                    "Syyria",
                                    "Tad\u1E91ikistan",
                                    "Tansania",
                                    "Tanska",
                                    "Thaimaa",
                                    "Togo",
                                    "Tonga",
                                    "Trinidad ja Tobago",
                                    "T\u0161ad",
                                    "T\u0161ekki",
                                    "Tunisia",
                                    "Turkki",
                                    "Turkmenistan",
                                    "Tuvalu",
                                    "Uganda",
                                    "Ukraina",
                                    "Unkari",
                                    "Uruguay",
                                    "Uusi-Seelanti",
                                    "Uzbekistan",
                                    "Valko-Ven\u00E4j\u00E4",
                                    "Vanuatu",
                                    "Vatikaanivaltio",
                                    "Venzuela",
                                    "Ven\u00E4j\u00E4",
                                    "Vietnam",
                                    "Viro",
                                    "Yhdistyneet Arabiemiirikunnat",
                                    "Yhdistynyt kuningaskunta",
                                    "Yhdysvallat",
                                    "Zimbabwe");
                        });

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{cityPrefix}}-{{firstName}}{{citySuffix}}",
                        "{{cityPrefix}}-{{firstName}}",
                        "{{firstName}}{{citySuffix}}",
                        "{{lastName}}{{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList("{{firstName}}{{streetSuffix}}", "{{lastName}}{{streetSuffix}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}} {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{streetAddress}}\n{{postcode}} {{city}}, {{state}}",
                        "{{streetAddress}}\n{{postcode}} {{city}}");

        public Object secondaryAddressFormats = ZVal.arrayFromList("###");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\fi_FI\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cityFormats",
                            "cityPrefix",
                            "citySuffix",
                            "country",
                            "postcode",
                            "secondaryAddressFormats",
                            "state",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/fi_FI/Address.php")
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
