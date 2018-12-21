package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.tr_TR.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/tr_TR/Person.php

*/

public class Person
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Person {

    public Person(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Person.class) {
            this.__construct(env, args);
        }
    }

    public Person(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object title(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                        .method("titleMale")
                        .call()
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\tr_TR\\Person";

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
                    .Person
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object titleMale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                            .tr_TR
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .title)
                            .value());
        }

        @ConvertedMethod
        public Object titleFemale(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("titleMale")
                            .call()
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{firstNameMale}} {{lastName}}",
                        "{{titleMale}} {{firstNameMale}} {{lastName}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{firstNameFemale}} {{lastName}}",
                        "{{titleFemale}} {{firstNameFemale}} {{lastName}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ahmet",
                                    "Ali",
                                    "Alp",
                                    "Arma\u011Fan",
                                    "Atakan",
                                    "A\u015Fk\u0131n",
                                    "Baran",
                                    "Bartu",
                                    "Berk",
                                    "Berkay",
                                    "Berke",
                                    "Bora",
                                    "Burak",
                                    "Canberk",
                                    "Cem",
                                    "Cihan",
                                    "Deniz",
                                    "Efe",
                                    "Ege",
                                    "Ege",
                                    "Emir",
                                    "Emirhan",
                                    "Emre",
                                    "Ferid",
                                    "G\u00F6kt\u00FCrk",
                                    "G\u00F6rkem",
                                    "G\u00FCney",
                                    "Ka\u011Fan",
                                    "Kerem",
                                    "Koray",
                                    "Kutay",
                                    "Mert",
                                    "Onur",
                                    "Og\u00FCn",
                                    "Polat",
                                    "R\u00FCzgar",
                                    "Sarp",
                                    "Serhan",
                                    "Toprak",
                                    "Tuna",
                                    "T\u00FCrker",
                                    "Utku",
                                    "Ya\u011F\u0131z",
                                    "Yi\u011Fit",
                                    "\u00C7\u0131nar",
                                    "Derin",
                                    "Meri\u00E7",
                                    "Barlas",
                                    "Da\u011Fhan",
                                    "Doruk",
                                    "\u00C7a\u011Fan");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromList(
                        "Ada",
                        "Esma",
                        "Emel",
                        "Ebru",
                        "\u015Eahnur",
                        "\u00DCmran",
                        "Sinem",
                        "\u0130rem",
                        "R\u00FCya",
                        "Ece",
                        "Burcu");

        public Object lastName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abac\u0131",
                                    "Abadan",
                                    "Aclan",
                                    "Adal",
                                    "Adan",
                                    "Ad\u0131var",
                                    "Akal",
                                    "Akan",
                                    "Akar",
                                    "Akay",
                                    "Akayd\u0131n",
                                    "Akbulut",
                                    "Akg\u00FCl",
                                    "Ak\u0131\u015F\u0131k",
                                    "Akman",
                                    "Aky\u00FCrek",
                                    "Aky\u00FCz",
                                    "Ak\u015Fit",
                                    "Aln\u0131a\u00E7\u0131k",
                                    "Alpu\u011Fan",
                                    "Alyanak",
                                    "Ar\u0131can",
                                    "Arslano\u011Flu",
                                    "Atakol",
                                    "Atan",
                                    "Avan",
                                    "Ayayd\u0131n",
                                    "Aybar",
                                    "Aydan",
                                    "Ayka\u00E7",
                                    "Ayverdi",
                                    "A\u011Fao\u011Flu",
                                    "A\u015F\u0131ko\u011Flu",
                                    "Babacan",
                                    "Babao\u011Flu",
                                    "Bademci",
                                    "Bak\u0131rc\u0131o\u011Flu",
                                    "Balaban",
                                    "Balc\u0131",
                                    "Barbaroso\u011Flu",
                                    "Baturalp",
                                    "Baykam",
                                    "Ba\u015Fo\u011Flu",
                                    "Berbero\u011Flu",
                                    "Be\u015Ferler",
                                    "Be\u015Fok",
                                    "Bi\u00E7er",
                                    "Bolatl\u0131",
                                    "Dalk\u0131ran",
                                    "Da\u011Fda\u015F",
                                    "Da\u011Flaro\u011Flu",
                                    "Demirba\u015F",
                                    "Demirel",
                                    "Denkel",
                                    "Dizdar",
                                    "Do\u011Fan",
                                    "Durak",
                                    "Durmaz",
                                    "Duygulu",
                                    "D\u00FC\u015Fenkalkar",
                                    "Egeli",
                                    "Ekici",
                                    "Ek\u015Fio\u011Flu",
                                    "Eli\u00E7in",
                                    "Elmasta\u015Fo\u011Flu",
                                    "El\u00E7ibo\u011Fa",
                                    "Erbay",
                                    "Erberk",
                                    "Erbulak",
                                    "Erdo\u011Fan",
                                    "Erez",
                                    "Erginsoy",
                                    "Erkekli",
                                    "Eronat",
                                    "Ertep\u0131nar",
                                    "Ert\u00FCrk",
                                    "Er\u00E7etin",
                                    "Evliyao\u011Flu",
                                    "Fahri",
                                    "G\u00F6n\u00FClta\u015F",
                                    "G\u00FCm\u00FC\u015Fpala",
                                    "G\u00FCnday",
                                    "G\u00FCrmen",
                                    "Il\u0131cal\u0131",
                                    "Kahveci",
                                    "Kaplang\u0131",
                                    "Karabulut",
                                    "Karab\u00F6cek",
                                    "Karada\u015F",
                                    "Karaduman",
                                    "Karaer",
                                    "Kasapo\u011Flu",
                                    "Kavakl\u0131o\u011Flu",
                                    "Kaya",
                                    "Kesero\u011Flu",
                                    "Ke\u00E7eci",
                                    "K\u0131l\u0131\u00E7\u00E7\u0131",
                                    "K\u0131ra\u00E7",
                                    "Kocab\u0131y\u0131k",
                                    "Korol",
                                    "Koyuncu",
                                    "Ko\u00E7",
                                    "Ko\u00E7o\u011Flu",
                                    "Ko\u00E7yi\u011Fit",
                                    "Kuday",
                                    "Kulaks\u0131zo\u011Flu",
                                    "Kumcuo\u011Flu",
                                    "Kunt",
                                    "Kunter",
                                    "Kurutluo\u011Flu",
                                    "Kutlay",
                                    "Kuzucu",
                                    "K\u00F6rm\u00FCk\u00E7\u00FC",
                                    "K\u00F6yba\u015F\u0131",
                                    "K\u00F6yl\u00FCo\u011Flu",
                                    "K\u00FC\u00E7\u00FCkler",
                                    "Limoncuo\u011Flu",
                                    "Mayho\u015F",
                                    "Menemencio\u011Flu",
                                    "Merto\u011Flu",
                                    "Nalbanto\u011Flu",
                                    "Nebio\u011Flu",
                                    "Numano\u011Flu",
                                    "Okumu\u015F",
                                    "Okur",
                                    "Oralo\u011Flu",
                                    "Orbay",
                                    "Ozansoy",
                                    "Paks\u00FCt",
                                    "Pekkan",
                                    "Pektemek",
                                    "Polat",
                                    "Poyrazo\u011Flu",
                                    "Po\u00E7an",
                                    "Sad\u0131klar",
                                    "Samanc\u0131",
                                    "Sandalc\u0131",
                                    "Sar\u0131o\u011Flu",
                                    "Sayg\u0131ner",
                                    "Sepet\u00E7i",
                                    "Sezek",
                                    "Sinano\u011Flu",
                                    "Solmaz",
                                    "S\u00F6zeri",
                                    "S\u00FCleymano\u011Flu",
                                    "Tahincio\u011Flu",
                                    "Tanr\u0131kulu",
                                    "Tazeg\u00FCl",
                                    "Ta\u015Fl\u0131",
                                    "Ta\u015F\u00E7\u0131",
                                    "Tekand",
                                    "Tekelio\u011Flu",
                                    "Tokatl\u0131o\u011Flu",
                                    "Tokg\u00F6z",
                                    "Topalo\u011Flu",
                                    "Top\u00E7uo\u011Flu",
                                    "Toraman",
                                    "Tunaboylu",
                                    "Tun\u00E7eri",
                                    "Tu\u011Flu",
                                    "Tu\u011Fluk",
                                    "T\u00FCrkdo\u011Fan",
                                    "T\u00FCrky\u0131lmaz",
                                    "T\u00FCt\u00FCnc\u00FC",
                                    "T\u00FCz\u00FCn",
                                    "Uca",
                                    "Uluhan",
                                    "Velio\u011Flu",
                                    "Yal\u00E7\u0131n",
                                    "Yaz\u0131c\u0131",
                                    "Yetkiner",
                                    "Ye\u015Filkaya",
                                    "Y\u0131ld\u0131r\u0131m",
                                    "Y\u0131ld\u0131zo\u011Flu",
                                    "Y\u0131lmazer",
                                    "Yorulmaz",
                                    "\u00C7amdal\u0131",
                                    "\u00C7apano\u011Flu",
                                    "\u00C7atalba\u015F",
                                    "\u00C7a\u011F\u0131ran",
                                    "\u00C7etin",
                                    "\u00C7etiner",
                                    "\u00C7evik",
                                    "\u00C7\u00F6rek\u00E7i",
                                    "\u00D6n\u00FCr",
                                    "\u00D6rge",
                                    "\u00D6ymen",
                                    "\u00D6zberk",
                                    "\u00D6zbey",
                                    "\u00D6zbir",
                                    "\u00D6zdenak",
                                    "\u00D6zdo\u011Fan",
                                    "\u00D6zg\u00F6rkey",
                                    "\u00D6zkara",
                                    "\u00D6zk\u00F6k",
                                    "\u00D6ztonga",
                                    "\u00D6ztuna");
                        });

        public Object title = ZVal.arrayFromList("Do\u00E7. Dr.", "Dr.", "Prof. Dr.");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\tr_TR\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastName",
                            "maleNameFormats",
                            "title")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/tr_TR/Person.php")
                    .addExtendsClass("Faker\\Provider\\Person")
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
