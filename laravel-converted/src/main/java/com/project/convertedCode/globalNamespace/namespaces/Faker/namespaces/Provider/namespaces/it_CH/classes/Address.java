package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.it_CH.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_key;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.array.function_current;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/it_CH/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .namespaces
                .it_IT
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
    public Object cityName(RuntimeEnv env, Object... args) {
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
                                                                .it_CH
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "cityNames")))
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
                                                        .it_CH
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\it_CH\\Address";

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
                    .namespaces
                    .it_IT
                    .classes
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object streetPrefix(RuntimeEnv env, Object... args) {
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
                                                            .it_CH
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object canton(RuntimeEnv env, Object... args) {
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
                                                            .it_CH
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .canton)
                            .value());
        }

        @ConvertedMethod
        public Object cantonShort(RuntimeEnv env, Object... args) {
            Object canton = null;
            canton =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("canton")
                            .call()
                            .value();
            return ZVal.assign(function_key.f.env(env).call(canton).value());
        }

        @ConvertedMethod
        public Object cantonName(RuntimeEnv env, Object... args) {
            Object canton = null;
            canton =
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("canton")
                            .call()
                            .value();
            return ZVal.assign(function_current.f.env(env).call(canton).value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#", "#a", "#b", "#c");

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "Piazza", "Strada", "Via", "Borgo", "Contrada", "Rotonda", "Incrocio");

        public Object postcode = ZVal.arrayFromList("####");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aarau",
                                    "Adliswil",
                                    "Aesch",
                                    "Affoltern am Albis",
                                    "Allschwil",
                                    "Altst\u00E4tten",
                                    "Amriswil",
                                    "Arbon",
                                    "Arth",
                                    "Baar",
                                    "Baden",
                                    "Basilea",
                                    "Bassersdorf",
                                    "Bellinzona",
                                    "Belp",
                                    "Berna",
                                    "Bienne",
                                    "Binningen",
                                    "Birsfelden",
                                    "Briga-Glis",
                                    "Brugg",
                                    "Buchs",
                                    "Bulle",
                                    "Burgdorf",
                                    "B\u00FClach",
                                    "Carouge",
                                    "Cham",
                                    "Ch\u00EAne-Bougeries",
                                    "Coira",
                                    "Davos",
                                    "Del\u00E9mont",
                                    "Dietikon",
                                    "D\u00FCbendorf",
                                    "Ebikon",
                                    "Ecublens",
                                    "Einsiedeln",
                                    "Emmen",
                                    "Frauenfeld",
                                    "Freienbach",
                                    "Friburgo",
                                    "Ginevra",
                                    "Gland",
                                    "Gossau",
                                    "Grenchen",
                                    "Herisau",
                                    "Hinwil",
                                    "Horgen",
                                    "Horw",
                                    "Illnau-Effretikon",
                                    "Ittigen",
                                    "Kloten",
                                    "Kreuzlingen",
                                    "Kriens",
                                    "K\u00F6niz",
                                    "K\u00FCsnacht",
                                    "K\u00FCssnacht",
                                    "La Chaux-de-Fonds",
                                    "La Tour-de-Peilz",
                                    "Lancy",
                                    "Langenthal",
                                    "Le Grand-Saconnex",
                                    "Le Locle",
                                    "Liestal",
                                    "Locarno",
                                    "Losanna",
                                    "Lucerna",
                                    "Lugano",
                                    "Lyss",
                                    "Martigny",
                                    "Meilen",
                                    "Mendrisio",
                                    "Meyrin",
                                    "Monthey",
                                    "Montreux",
                                    "Morges",
                                    "Muri bei Bern",
                                    "Muttenz",
                                    "M\u00E4nnedorf",
                                    "M\u00F6hlin",
                                    "M\u00FCnchenstein",
                                    "M\u00FCnsingen",
                                    "Neuch\u00E2tel",
                                    "Neuhausen am Rheinfall",
                                    "Nyon",
                                    "Oberwil",
                                    "Oftringen",
                                    "Olten",
                                    "Onex",
                                    "Opfikon",
                                    "Ostermundigen",
                                    "Pf\u00E4ffikon",
                                    "Pratteln",
                                    "Prilly",
                                    "Pully",
                                    "Rapperswil-Jona",
                                    "Regensdorf",
                                    "Reinach",
                                    "Renens",
                                    "Rheinfelden",
                                    "Richterswil",
                                    "Riehen",
                                    "R\u00FCti",
                                    "San Gallo",
                                    "Schlieren",
                                    "Sciaffusa",
                                    "Sierre",
                                    "Sion",
                                    "Soletta",
                                    "Spiez",
                                    "Spreitenbach",
                                    "Steffisburg",
                                    "St\u00E4fa",
                                    "Svitto",
                                    "Thalwil",
                                    "Thun",
                                    "Th\u00F4nex",
                                    "Uster",
                                    "Uzwil",
                                    "Val-de-Travers",
                                    "Vernier",
                                    "Versoix",
                                    "Vevey",
                                    "Veyrier",
                                    "Villars-sur-Gl\u00E2ne",
                                    "Volketswil",
                                    "Wallisellen",
                                    "Weinfelden",
                                    "Wettingen",
                                    "Wetzikon",
                                    "Wil",
                                    "Winterthur",
                                    "Wohlen",
                                    "Worb",
                                    "W\u00E4denswil",
                                    "Yverdon-les-Bains",
                                    "Zofingen",
                                    "Zollikon",
                                    "Zugo",
                                    "Zurigo");
                        });

        public Object canton =
                ZVal.newArray(
                        new ZPair(0, ZVal.newArray(new ZPair("AG", "Argovia"))),
                        new ZPair(1, ZVal.newArray(new ZPair("AI", "Appenzello Interno"))),
                        new ZPair(2, ZVal.newArray(new ZPair("AR", "Appenzello Esterno"))),
                        new ZPair(3, ZVal.newArray(new ZPair("BE", "Berna"))),
                        new ZPair(4, ZVal.newArray(new ZPair("BL", "Basilea Campagna"))),
                        new ZPair(5, ZVal.newArray(new ZPair("BS", "Basilea Citt\u00E0"))),
                        new ZPair(6, ZVal.newArray(new ZPair("FR", "Friburgo"))),
                        new ZPair(7, ZVal.newArray(new ZPair("GE", "Ginevra"))),
                        new ZPair(8, ZVal.newArray(new ZPair("GL", "Glarona"))),
                        new ZPair(9, ZVal.newArray(new ZPair("GR", "Grigioni"))),
                        new ZPair(10, ZVal.newArray(new ZPair("JU", "Giura"))),
                        new ZPair(11, ZVal.newArray(new ZPair("LU", "Lucerna"))),
                        new ZPair(12, ZVal.newArray(new ZPair("NE", "Neuch\u00E2tel"))),
                        new ZPair(13, ZVal.newArray(new ZPair("NW", "Nidvaldo"))),
                        new ZPair(14, ZVal.newArray(new ZPair("OW", "Obvaldo"))),
                        new ZPair(15, ZVal.newArray(new ZPair("SG", "San Gallo"))),
                        new ZPair(16, ZVal.newArray(new ZPair("SH", "Sciaffusa"))),
                        new ZPair(17, ZVal.newArray(new ZPair("SO", "Soletta"))),
                        new ZPair(18, ZVal.newArray(new ZPair("SZ", "Svitto"))),
                        new ZPair(19, ZVal.newArray(new ZPair("TG", "Turgovia"))),
                        new ZPair(20, ZVal.newArray(new ZPair("TI", "Ticino"))),
                        new ZPair(21, ZVal.newArray(new ZPair("UR", "Uri"))),
                        new ZPair(22, ZVal.newArray(new ZPair("VD", "Vaud"))),
                        new ZPair(23, ZVal.newArray(new ZPair("VS", "Vallese"))),
                        new ZPair(24, ZVal.newArray(new ZPair("ZG", "Zugo"))),
                        new ZPair(25, ZVal.newArray(new ZPair("ZH", "Zurigo"))));

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetSuffix}} {{firstName}}", "{{streetSuffix}} {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{postcode}} {{city}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\it_CH\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "canton",
                            "cityFormats",
                            "cityNames",
                            "postcode",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/it_CH/Address.php")
                    .addExtendsClass("Faker\\Provider\\it_IT\\Address")
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
