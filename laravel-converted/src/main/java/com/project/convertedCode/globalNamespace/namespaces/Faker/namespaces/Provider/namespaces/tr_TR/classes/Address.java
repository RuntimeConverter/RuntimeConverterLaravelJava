package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.tr_TR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/tr_TR/Address.php

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
                                                                .tr_TR
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
                                                        .tr_TR
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\tr_TR\\Address";

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

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "Sokak",
                        "Caddesi",
                        "Kav\u015Fa\u011F\u0131",
                        "Dura\u011F\u0131",
                        "\u0130\u015F Han\u0131",
                        "Mevkii");

        public Object postcode = ZVal.arrayFromList("#####");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adana",
                                    "Ad\u0131yaman",
                                    "Afyonkarahisar",
                                    "A\u011Fr\u0131",
                                    "Aksaray",
                                    "Amasya",
                                    "Ankara",
                                    "Antalya",
                                    "Ardahan",
                                    "Artvin",
                                    "Ayd\u0131n",
                                    "Bal\u0131kesir",
                                    "Bart\u0131n",
                                    "Batman",
                                    "Bayburt",
                                    "Bilecik",
                                    "Bing\u00F6l",
                                    "Bitlis",
                                    "Bolu",
                                    "Burdur",
                                    "Bursa",
                                    "\u00C7anakkale",
                                    "\u00C7ank\u0131r\u0131",
                                    "\u00C7orum",
                                    "Denizli",
                                    "Diyarbak\u0131r",
                                    "D\u00FCzce",
                                    "Edirne",
                                    "Elaz\u0131\u011F",
                                    "Erzincan",
                                    "Erzurum",
                                    "Eski\u015Fehir",
                                    "Gaziantep",
                                    "Giresun",
                                    "G\u00FCm\u00FC\u015Fhane",
                                    "Hakkari",
                                    "Hatay",
                                    "I\u011Fd\u0131r",
                                    "Isparta",
                                    "\u0130stanbul",
                                    "\u0130zmir",
                                    "Kahramanmara\u015F",
                                    "Karab\u00FCk",
                                    "Karaman",
                                    "Kars",
                                    "Kastamonu",
                                    "Kayseri",
                                    "Kilis",
                                    "K\u0131r\u0131kkale",
                                    "K\u0131rklareli",
                                    "K\u0131r\u015Fehir",
                                    "Kocaeli",
                                    "Konya",
                                    "K\u00FCtahya",
                                    "Malatya",
                                    "Manisa",
                                    "Mardin",
                                    "Mersin",
                                    "Mu\u011Fla",
                                    "Mu\u015F",
                                    "Nev\u015Fehir",
                                    "Ni\u011Fde",
                                    "Ordu",
                                    "Osmaniye",
                                    "Rize",
                                    "Sakarya",
                                    "Samsun",
                                    "\u015Eanl\u0131urfa",
                                    "Siirt",
                                    "Sinop",
                                    "\u015E\u0131rnak",
                                    "Sivas",
                                    "Tekirda\u011F",
                                    "Tokat",
                                    "Trabzon",
                                    "Tunceli",
                                    "U\u015Fak",
                                    "Van",
                                    "Yalova",
                                    "Yozgat",
                                    "Zonguldak");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Almanya",
                                    "Amerika Birle\u015Fik Devletleri",
                                    "Arjantin",
                                    "Arnavutluk",
                                    "Avustralya",
                                    "Avusturya",
                                    "Azerbaycan",
                                    "Bahreyn",
                                    "Bel\u00E7ika",
                                    "Beyaz Rusya",
                                    "Birle\u015Fik Arap Emirlikleri",
                                    "Bosna-hersek",
                                    "Brezilya",
                                    "Bulgaristan",
                                    "\u00C7ek Cumhuriyeti",
                                    "Cezayir",
                                    "\u00C7in Halk Cumhuriyeti",
                                    "Danimarka",
                                    "Dominik Cumhuriyeti",
                                    "Endonezya",
                                    "Ermenistan",
                                    "Estonya",
                                    "Fas",
                                    "Filipinler",
                                    "Filistin",
                                    "Finlandiya",
                                    "Fransa",
                                    "G\u00FCney Afrika Cumhuriyeti",
                                    "G\u00FCney Kore",
                                    "G\u00FCrcistan",
                                    "Hindistan",
                                    "H\u0131rvatistan",
                                    "Hollanda",
                                    "\u0130ngiltere",
                                    "Irak",
                                    "\u0130ran",
                                    "\u0130rlanda",
                                    "\u0130sko\u00E7ya",
                                    "\u0130spanya",
                                    "\u0130srail",
                                    "\u0130sve\u00E7",
                                    "\u0130svi\u00E7re",
                                    "\u0130talya",
                                    "Jamaika",
                                    "Japonya",
                                    "Kambo\u00E7ya",
                                    "Kanada",
                                    "Karada\u011F",
                                    "Kazakistan",
                                    "K\u0131br\u0131s",
                                    "K\u0131rg\u0131zistan",
                                    "Kosta Rika",
                                    "K\u00FCba",
                                    "Kuzey Kore",
                                    "Letonya",
                                    "Libya",
                                    "Litvanya",
                                    "L\u00FCbnan",
                                    "L\u00FCksemburg",
                                    "Macaristan",
                                    "Makedonya",
                                    "Maldivler",
                                    "Malta",
                                    "Maur\u0131t\u0131us",
                                    "M\u0131s\u0131r",
                                    "Nepal",
                                    "\u00D6zbekistan",
                                    "Pakistan",
                                    "Polonya",
                                    "Portekiz",
                                    "Romanya",
                                    "Rusya",
                                    "S\u0131rbistan",
                                    "Slovakya",
                                    "Slovenya",
                                    "Sri Lanka",
                                    "Sudan",
                                    "Suriye",
                                    "Suudi Arabistan",
                                    "Tacikistan",
                                    "Tayland",
                                    "Tayvan",
                                    "Tunus",
                                    "T\u00FCrkiye",
                                    "Ukrayna",
                                    "Umman",
                                    "\u00DCrd\u00FCn",
                                    "Venezuela",
                                    "Vietnam",
                                    "Yemen",
                                    "Yeni Zelanda",
                                    "Ye\u015Fil Burun",
                                    "Yunanistan",
                                    "Zambiya",
                                    "Zimbabve");
                        });

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{lastName}} {{streetSuffix}}",
                        "{{firstName}} {{streetSuffix}}",
                        "{{firstName}} {{streetSuffix}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{postcode}} {{city}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\tr_TR\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cityFormats",
                            "cityNames",
                            "country",
                            "postcode",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/tr_TR/Address.php")
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
