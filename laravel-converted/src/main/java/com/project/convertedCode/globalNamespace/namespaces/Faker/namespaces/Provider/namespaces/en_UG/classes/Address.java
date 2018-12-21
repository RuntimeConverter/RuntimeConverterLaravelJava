package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_UG.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/en_UG/Address.php

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
                .en_US
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

    public static final Object CONST_class = "Faker\\Provider\\en_UG\\Address";

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
                    .en_US
                    .classes
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object cityName(RuntimeEnv env, Object... args) {
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
                                                            .en_UG
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityName)
                            .value());
        }

        @ConvertedMethod
        public Object district(RuntimeEnv env, Object... args) {
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
                                                            .en_UG
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .district)
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
                                                            .en_UG
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .region)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object cityName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alebtong",
                                    "Abim",
                                    "Adjumani",
                                    "Amolatar",
                                    "Amuria",
                                    "Amuru",
                                    "Apac",
                                    "Arua",
                                    "Bombo",
                                    "Budaka",
                                    "Bugembe",
                                    "Bugiri",
                                    "Bukedea",
                                    "Bulisa",
                                    "Buikwe",
                                    "Bundibugyo",
                                    "Busembatya",
                                    "Bushenyi",
                                    "Busia",
                                    "Busolwe",
                                    "Butaleja",
                                    "Buwenge",
                                    "Dokolo",
                                    "Entebbe",
                                    "Fort Portal",
                                    "Gulu",
                                    "Hima",
                                    "Hoima",
                                    "Ibanda",
                                    "Iganga",
                                    "Isingiro",
                                    "Jinja",
                                    "Kaabong",
                                    "Kabale",
                                    "Kaberamaido",
                                    "Kabwohe",
                                    "Kagadi",
                                    "Kakinga",
                                    "Kakiri",
                                    "Kalangala",
                                    "Kaliro",
                                    "Kalisizo",
                                    "Kalongo",
                                    "Kalungu",
                                    "Kampala",
                                    "Kamuli",
                                    "Kanoni",
                                    "Kamwenge",
                                    "Kanungu",
                                    "Kapchorwa",
                                    "Kasese",
                                    "Katakwi",
                                    "Kayunga",
                                    "Kibaale",
                                    "Kiboga",
                                    "Kihiihi",
                                    "Kiira",
                                    "Kiruhura",
                                    "Kiryandongo",
                                    "Kisoro",
                                    "Kitgum",
                                    "Koboko",
                                    "Kotido",
                                    "Kumi",
                                    "Kyenjojo",
                                    "Kyotera",
                                    "Lira",
                                    "Lugazi",
                                    "Lukaya",
                                    "Luwero",
                                    "Lwakhakha",
                                    "Lwengo",
                                    "Lyantonde",
                                    "Malaba",
                                    "Manafwa",
                                    "Masaka",
                                    "Masindi",
                                    "Masindi Port",
                                    "Matugga",
                                    "Mayuge",
                                    "Mbale",
                                    "Mbarara",
                                    "Mitooma",
                                    "Mityana",
                                    "Mpigi",
                                    "Mpondwe",
                                    "Moroto",
                                    "Moyo",
                                    "Mubende",
                                    "Mukono",
                                    "Mutukula",
                                    "Nagongera",
                                    "Nakaseke",
                                    "Nakasongola",
                                    "Nakapiripirit",
                                    "Namutumba",
                                    "Nansana",
                                    "Nebbi",
                                    "Ngora",
                                    "Njeru",
                                    "Nkokonjeru",
                                    "Ntungamo",
                                    "Oyam",
                                    "Pader",
                                    "Paidha",
                                    "Pakwach",
                                    "Pallisa",
                                    "Rakai",
                                    "Rukungiri",
                                    "Sembabule",
                                    "Sironko",
                                    "Soroti",
                                    "Tororo",
                                    "Wakiso",
                                    "Wobulenzi",
                                    "Yumbe");
                        });

        public Object district =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abim",
                                    "Adjumani",
                                    "Agago",
                                    "Alebtong",
                                    "Amolatar",
                                    "Amudat",
                                    "Amuria",
                                    "Amuru",
                                    "Apac",
                                    "Arua",
                                    "Budaka",
                                    "Bududa",
                                    "Bugiri",
                                    "Buhweju",
                                    "Buikwe",
                                    "Bukedea",
                                    "Bukomansimbi",
                                    "Bukwo",
                                    "Bulambuli",
                                    "Buliisa",
                                    "Bundibugyo",
                                    "Bushenyi",
                                    "Busia",
                                    "Butaleja",
                                    "Butambala",
                                    "Buvuma",
                                    "Buyende",
                                    "Dokolo",
                                    "Gomba",
                                    "Gulu",
                                    "Hoima",
                                    "Ibanda",
                                    "Iganga",
                                    "Isingiro",
                                    "Jinja",
                                    "Kaabong",
                                    "Kabale",
                                    "Kabarole",
                                    "Kaberamaido",
                                    "Kalangala",
                                    "Kaliro",
                                    "Kalungu",
                                    "Kampala",
                                    "Kamuli",
                                    "Kamwenge",
                                    "Kanungu",
                                    "Kapchorwa",
                                    "Kasese",
                                    "Katakwi",
                                    "Kayunga",
                                    "Kibaale",
                                    "Kiboga",
                                    "Kibuku",
                                    "Kigezi",
                                    "Kiruhura",
                                    "Kiryandongo",
                                    "Kisoro",
                                    "Kitgum",
                                    "Koboko",
                                    "Kole",
                                    "Kotido",
                                    "Kumi",
                                    "Kween",
                                    "Kyankwanzi",
                                    "Kyegegwa",
                                    "Kyenjojo",
                                    "Lamwo",
                                    "Lira",
                                    "Luuka",
                                    "Luweero",
                                    "Lwengo",
                                    "Lyantonde",
                                    "Manafwa",
                                    "Maracha",
                                    "Maracha-Terego",
                                    "Masaka",
                                    "Masindi",
                                    "Mayuge",
                                    "Mbale",
                                    "Mbarara",
                                    "Mitooma",
                                    "Mityana",
                                    "Moroto",
                                    "Moyo",
                                    "Mpigi",
                                    "Mubende",
                                    "Mukono",
                                    "Nakapiripirit",
                                    "Nakaseke",
                                    "Nakasongola",
                                    "Namayingo",
                                    "Namutumba",
                                    "Napak",
                                    "Nebbi",
                                    "Ngora",
                                    "Ntoroko",
                                    "Ntungamo",
                                    "Nwoya",
                                    "Otuke",
                                    "Oyam",
                                    "Pader",
                                    "Pallisa",
                                    "Rakai",
                                    "Rubirizi",
                                    "Rukungiri",
                                    "Sembabule",
                                    "Serere",
                                    "Sheema",
                                    "Sironko",
                                    "Soroti",
                                    "Tororo",
                                    "Wakiso",
                                    "Yumbe",
                                    "Zombo");
                        });

        public Object postcode = ZVal.arrayFromList("#", "##", "###", "####", "#####");

        public Object region = ZVal.arrayFromList("Central", "East", "North", "West");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_UG\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "cityFormats", "cityName", "district", "postcode", "region")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_UG/Address.php")
                    .addExtendsClass("Faker\\Provider\\en_US\\Address")
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
