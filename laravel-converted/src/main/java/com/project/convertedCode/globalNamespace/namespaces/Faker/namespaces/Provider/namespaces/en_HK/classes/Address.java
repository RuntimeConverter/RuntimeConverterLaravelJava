package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_HK.classes;

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
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/en_HK/Address.php

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
                                                                .en_HK
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "cities")))
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
                                                        .en_HK
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cities)
                        .value());
    }

    @ConvertedMethod
    public Object town(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
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
                                                                        .en_HK
                                                                        .classes
                                                                        .Address
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "towns")))
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
                                                                .en_HK
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class)
                                                .towns)
                                .value()));
    }

    @ConvertedMethod
    public Object syllable(RuntimeEnv env, Object... args) {
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
                                                                .en_HK
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "syllables")))
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
                                                        .en_HK
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .syllables)
                        .value());
    }

    @ConvertedMethod
    public Object direction(RuntimeEnv env, Object... args) {
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
                                                                .en_HK
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "directions")))
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
                                                        .en_HK
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .directions)
                        .value());
    }

    @ConvertedMethod
    public Object englishStreetName(RuntimeEnv env, Object... args) {
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
                                                                .en_HK
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "englishStreetNames")))
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
                                                        .en_HK
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .englishStreetNames)
                        .value());
    }

    @ConvertedMethod
    public Object villageSuffix(RuntimeEnv env, Object... args) {
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
                                                                .en_HK
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "villageSuffixes")))
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
                                                        .en_HK
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .villageSuffixes)
                        .value());
    }

    @ConvertedMethod
    public Object estateSuffix(RuntimeEnv env, Object... args) {
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
                                                                .en_HK
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "estateSuffixes")))
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
                                                        .en_HK
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .estateSuffixes)
                        .value());
    }

    @ConvertedMethod
    public Object village(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
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
                                                                        .en_HK
                                                                        .classes
                                                                        .Address
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "villageNameFormats")))
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
                                                                .en_HK
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class)
                                                .villageNameFormats)
                                .value()));
    }

    @ConvertedMethod
    public Object estate(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
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
                                                                        .en_HK
                                                                        .classes
                                                                        .Address
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "estateNameFormats")))
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
                                                                .en_HK
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class)
                                                .estateNameFormats)
                                .value()));
    }

    public static final Object CONST_class = "Faker\\Provider\\en_HK\\Address";

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

        public Object country = ZVal.arrayFromList("Hong Kong");

        public Object syllables =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "A", "Ai", "Ak", "Am", "An", "Ang", "Ap", "At", "Au", "Cha",
                                    "Chai", "Chak", "Cham", "Chan", "Chang", "Chap", "Chat", "Chau",
                                    "Che", "Chek", "Cheng", "Cheuk", "Cheung", "Chi", "Chik",
                                    "Chim", "Chin", "Ching", "Chip", "Chit", "Chiu", "Cho", "Choi",
                                    "Chok", "Chong", "Chou", "Chue", "Chuen", "Chuet", "Chui",
                                    "Chuk", "Chun", "Chung", "Chut", "E", "Ei", "Fa", "Fai", "Fak",
                                    "Fan", "Fang", "Fat", "Fau", "Fe", "Fei", "Fo", "Fok", "Fong",
                                    "Fu", "Fui", "Fuk", "Fun", "Fung", "Fut", "Ha", "Hai", "Hak",
                                    "Ham", "Han", "Hang", "Hap", "Hat", "Hau", "Hei", "Hek", "Heng",
                                    "Heu", "Heung", "Hik", "Him", "Hin", "Hing", "Hip", "Hit",
                                    "Hiu", "Ho", "Hoi", "Hok", "Hon", "Hong", "Hot", "Hou", "Huen",
                                    "Huet", "Hui", "Huk", "Hung", "Ka", "Kai", "Kak", "Kam", "Kan",
                                    "Kang", "Kap", "Kat", "Kau", "Ke", "Kei", "Kek", "Keng", "Keu",
                                    "Keuk", "Keung", "Kik", "Kim", "Kin", "King", "Kip", "Kit",
                                    "Kiu", "Ko", "Koi", "Kok", "Kon", "Kong", "Kot", "Kou", "Ku",
                                    "Kuen", "Kuet", "Kui", "Kuk", "Kun", "Kung", "Kut", "Kwa",
                                    "Kwai", "Kwak", "Kwan", "Kwang", "Kwat", "Kwik", "Kwing", "Kwo",
                                    "Kwok", "Kwong", "La", "Lai", "Lak", "Lam", "Lan", "Lang",
                                    "Lap", "Lat", "Lau", "Le", "Lei", "Lek", "Leng", "Leuk",
                                    "Leung", "Li", "Lik", "Lim", "Lin", "Ling", "Lip", "Lit", "Liu",
                                    "Lo", "Loi", "Lok", "Long", "Lou", "Luen", "Luet", "Lui", "Luk",
                                    "Lun", "Lung", "Lut", "Ma", "Mai", "Mak", "Man", "Mang", "Mat",
                                    "Mau", "Me", "Mei", "Meng", "Mi", "Mik", "Min", "Ming", "Mit",
                                    "Miu", "Mo", "Mok", "Mong", "Mou", "Mui", "Muk", "Mun", "Mung",
                                    "Mut", "Na", "Nai", "Nam", "Nan", "Nang", "Nap", "Nat", "Nau",
                                    "Ne", "Nei", "Neung", "Ng", "Nga", "Ngai", "Ngak", "Ngam",
                                    "Ngan", "Ngang", "Ngap", "Ngat", "Ngau", "Ngit", "Ngo", "Ngoi",
                                    "Ngok", "Ngon", "Ngong", "Ngou", "Ni", "Nik", "Nim", "Nin",
                                    "Ning", "Nip", "Niu", "No", "Noi", "Nok", "Nong", "Nou", "Nuen",
                                    "Nui", "Nuk", "Nung", "Nut", "O", "Oi", "Ok", "On", "Ong", "Ou",
                                    "Pa", "Pai", "Pak", "Pam", "Pan", "Pang", "Pat", "Pau", "Pe",
                                    "Pei", "Pek", "Peng", "Pik", "Pin", "Ping", "Pit", "Piu", "Po",
                                    "Poi", "Pok", "Pong", "Pou", "Pui", "Puk", "Pun", "Pung", "Put",
                                    "Sa", "Sai", "Sak", "Sam", "San", "Sang", "Sap", "Sat", "Sau",
                                    "Se", "Sei", "Sek", "Seng", "Seuk", "Seung", "Sha", "Shai",
                                    "Shak", "Sham", "Shan", "Shang", "Shap", "Shat", "Shau", "She",
                                    "Shei", "Shek", "Sheng", "Sheuk", "Sheung", "Shi", "Shik",
                                    "Shim", "Shin", "Shing", "Ship", "Shit", "Shiu", "Sho", "Shoi",
                                    "Shok", "Shong", "Shou", "Shue", "Shuen", "Shuet", "Shui",
                                    "Shuk", "Shun", "Shung", "Shut", "Sik", "Sim", "Sin", "Sing",
                                    "Sip", "Sit", "Siu", "So", "Soi", "Sok", "Song", "Sou", "Sue",
                                    "Suen", "Suet", "Sui", "Suk", "Sun", "Sung", "Sut", "Sze", "Ta",
                                    "Tai", "Tak", "Tam", "Tan", "Tang", "Tap", "Tat", "Tau", "Te",
                                    "Tei", "Tek", "Teng", "Teu", "Teuk", "Tik", "Tim", "Tin",
                                    "Ting", "Tip", "Tit", "Tiu", "To", "Toi", "Tok", "Tong", "Tou",
                                    "Tsa", "Tsai", "Tsak", "Tsam", "Tsan", "Tsang", "Tsap", "Tsat",
                                    "Tsau", "Tse", "Tsek", "Tseng", "Tseuk", "Tseung", "Tsik",
                                    "Tsim", "Tsin", "Tsing", "Tsip", "Tsit", "Tsiu", "Tso", "Tsoi",
                                    "Tsok", "Tsong", "Tsou", "Tsue", "Tsuen", "Tsuet", "Tsui",
                                    "Tsuk", "Tsun", "Tsung", "Tsut", "Tsz", "Tuen", "Tuet", "Tui",
                                    "Tuk", "Tun", "Tung", "Tut", "Uk", "Ung", "Wa", "Wai", "Wak",
                                    "Wan", "Wang", "Wat", "Wik", "Wing", "Wo", "Wok", "Wong", "Wu",
                                    "Wui", "Wun", "Wut", "Ya", "Yai", "Yak", "Yam", "Yan", "Yap",
                                    "Yat", "Yau", "Ye", "Yeng", "Yeuk", "Yeung", "Yi", "Yik", "Yim",
                                    "Yin", "Ying", "Yip", "Yit", "Yiu", "Yo", "Yue", "Yuen", "Yuet",
                                    "Yui", "Yuk", "Yun", "Yung");
                        });

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{buildingNumber}} {{streetName}}",
                        "{{buildingNumber}} {{village}}",
                        "Block {{buildingNumber}}, {{estate}}");

        public Object addressFormats = ZVal.arrayFromList("{{streetAddress}}\n{{town}}\n{{city}}");

        public Object villageNameFormats =
                ZVal.arrayFromList(
                        "{{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{villageSuffix}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{town}}",
                        "{{town}} {{villageSuffix}}");

        public Object estateNameFormats =
                ZVal.arrayFromList(
                        "{{syllable}} {{syllable}} {{estateSuffix}}",
                        "{{syllable}} {{syllable}} {{estateSuffix}}",
                        "{{syllable}} {{syllable}} {{estateSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{estateSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{estateSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{estateSuffix}}",
                        "{{town}} {{estateSuffix}}");

        public Object villageSuffixes =
                ZVal.arrayFromList("Village", "Tsuen", "San Tsuen", "New Village", "Wai");

        public Object estateSuffixes = ZVal.arrayFromList("Estate", "Court");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{syllable}} {{streetSuffix}}",
                        "{{syllable}} {{syllable}} {{streetSuffix}}",
                        "{{syllable}} {{syllable}} {{streetSuffix}}",
                        "{{syllable}} {{syllable}} {{streetSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{streetSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{streetSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{streetSuffix}}",
                        "{{syllable}} {{syllable}} {{direction}} {{streetSuffix}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{direction}} {{streetSuffix}}",
                        "{{syllable}} {{syllable}} {{streetSuffix}} {{direction}}",
                        "{{syllable}} {{syllable}} {{syllable}} {{streetSuffix}} {{direction}}",
                        "{{englishStreetName}} {{streetSuffix}}",
                        "{{englishStreetName}} {{streetSuffix}} {{direction}}");

        public Object englishStreetNames =
                ZVal.arrayFromList(
                        "King's",
                        "Queen's",
                        "Nathan",
                        "Robinson",
                        "Kingston",
                        "Irving",
                        "Bonham",
                        "Salisbury",
                        "Tonkin",
                        "Nanking",
                        "Peking",
                        "Canton",
                        "Amoy",
                        "Shanghai");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "Road", "Road", "Road", "Street", "Street", "Street", "Lane", "Circuit",
                        "Avenue", "Path", "Square");

        public Object directions = ZVal.arrayFromList("North", "East", "South", "West");

        public Object cities = ZVal.arrayFromList("Hong Kong", "Kowloon", "New Territories");

        public Object towns =
                ZVal.arrayFromList(
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "{{syllable}} {{syllable}} {{syllable}}",
                        "Aberdeen",
                        "Stanley",
                        "Victoria");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_HK\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "cities",
                            "country",
                            "directions",
                            "englishStreetNames",
                            "estateNameFormats",
                            "estateSuffixes",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix",
                            "syllables",
                            "towns",
                            "villageNameFormats",
                            "villageSuffixes")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_HK/Address.php")
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
