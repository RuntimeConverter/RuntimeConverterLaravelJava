package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.id_ID.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.classes.ClassConstantUtils;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/id_ID/Person.php

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
    public Object lastName(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        Object lastNameRandomElement = null;
        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_MALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("lastNameMale")
                            .call()
                            .value());
        }

        if (ZVal.strictEqualityCheck(
                gender,
                "===",
                ClassConstantUtils.getConstantValueLateStatic(env, this, "GENDER_FEMALE"))) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
                            .method("lastNameFemale")
                            .call()
                            .value());
        }

        lastNameRandomElement =
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Person.class)
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
                                                                .id_ID
                                                                .classes
                                                                .Person
                                                                .RequestStaticProperties
                                                                .class,
                                                        "lastNameFormat")))
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
                                                        .id_ID
                                                        .classes
                                                        .Person
                                                        .RequestStaticProperties
                                                        .class)
                                        .lastNameFormat)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Person.class,
                        lastNameRandomElement));
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "gender",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 1,
        name = "birthDate",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object nik(RuntimeEnv env, Object... args) {
        Object gender = assignParameter(args, 0, true);
        if (null == gender) {
            gender = ZVal.getNull();
        }
        Object birthDate = assignParameter(args, 1, true);
        if (null == birthDate) {
            birthDate = ZVal.getNull();
        }
        Object nik = null;
        nik =
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "numerify",
                        Person.class,
                        "######");
        if (!ZVal.isTrue(birthDate)) {
            birthDate =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("generator").value(),
                            "dateTimeBetween",
                            Person.class);
        }

        if (!ZVal.isTrue(gender)) {
            gender =
                    env.callMethod(
                            toObjectR(this).accessProp(this, env).name("generator").value(),
                            "randomElement",
                            Person.class,
                            ZVal.newArray(
                                    new ZPair(0, CONST_GENDER_MALE),
                                    new ZPair(1, CONST_GENDER_FEMALE)));
        }

        if (ZVal.equalityCheck(gender, CONST_GENDER_FEMALE)) {
            nik =
                    toStringR(nik, env)
                            + toStringR(
                                    ZVal.add(
                                            env.callMethod(birthDate, "format", Person.class, "d"),
                                            40),
                                    env);

        } else {
            nik =
                    toStringR(nik, env)
                            + toStringR(
                                    env.callMethod(birthDate, "format", Person.class, "d"), env);
        }

        nik =
                toStringR(nik, env)
                        + toStringR(env.callMethod(birthDate, "format", Person.class, "my"), env);
        nik =
                toStringR(nik, env)
                        + toStringR(
                                env.callMethod(
                                        toObjectR(this)
                                                .accessProp(this, env)
                                                .name("generator")
                                                .value(),
                                        "numerify",
                                        Person.class,
                                        "####"),
                                env);
        return ZVal.assign(nik);
    }

    public static final Object CONST_class = "Faker\\Provider\\id_ID\\Person";

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
        public Object lastNameMale(RuntimeEnv env, Object... args) {
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
                                                            .id_ID
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .lastNameMale)
                            .value());
        }

        @ConvertedMethod
        public Object lastNameFemale(RuntimeEnv env, Object... args) {
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
                                                            .id_ID
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .lastNameFemale)
                            .value());
        }

        @ConvertedMethod
        public Object suffix(RuntimeEnv env, Object... args) {
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
                                                            .id_ID
                                                            .classes
                                                            .Person
                                                            .RequestStaticProperties
                                                            .class)
                                            .suffix)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object lastNameFormat = ZVal.arrayFromList("{{lastNameMale}}", "{{lastNameFemale}}");

        public Object maleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{lastNameMale}} {{suffix}}",
                        "{{firstNameMale}} {{firstNameMale}} {{lastNameMale}}",
                        "{{firstNameMale}} {{firstNameMale}} {{lastNameMale}} {{suffix}}");

        public Object femaleNameFormats =
                ZVal.arrayFromList(
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{lastNameFemale}} {{suffix}}",
                        "{{firstNameFemale}} {{firstNameFemale}} {{lastNameFemale}}",
                        "{{firstNameFemale}} {{firstNameFemale}} {{lastNameFemale}} {{suffix}}");

        public Object firstNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abyasa",
                                    "Ade",
                                    "Adhiarja",
                                    "Adiarja",
                                    "Adika",
                                    "Adikara",
                                    "Adinata",
                                    "Aditya",
                                    "Agus",
                                    "Ajiman",
                                    "Ajimat",
                                    "Ajimin",
                                    "Ajiono",
                                    "Akarsana",
                                    "Alambana",
                                    "Among",
                                    "Anggabaya",
                                    "Anom",
                                    "Argono",
                                    "Aris",
                                    "Arta",
                                    "Artanto",
                                    "Artawan",
                                    "Arsipatra",
                                    "Asirwada",
                                    "Asirwanda",
                                    "Aslijan",
                                    "Asmadi",
                                    "Asman",
                                    "Asmianto",
                                    "Asmuni",
                                    "Aswani",
                                    "Atma",
                                    "Atmaja",
                                    "Bagas",
                                    "Bagiya",
                                    "Bagus",
                                    "Bagya",
                                    "Bahuraksa",
                                    "Bahuwarna",
                                    "Bahuwirya",
                                    "Bajragin",
                                    "Bakda",
                                    "Bakiadi",
                                    "Bakianto",
                                    "Bakidin",
                                    "Bakijan",
                                    "Bakiman",
                                    "Bakiono",
                                    "Bakti",
                                    "Baktiadi",
                                    "Baktianto",
                                    "Baktiono",
                                    "Bala",
                                    "Balamantri",
                                    "Balangga",
                                    "Balapati",
                                    "Balidin",
                                    "Balijan",
                                    "Bambang",
                                    "Banara",
                                    "Banawa",
                                    "Banawi",
                                    "Bancar",
                                    "Budi",
                                    "Cagak",
                                    "Cager",
                                    "Cahyadi",
                                    "Cahyanto",
                                    "Cahya",
                                    "Cahyo",
                                    "Cahyono",
                                    "Caket",
                                    "Cakrabirawa",
                                    "Cakrabuana",
                                    "Cakrajiya",
                                    "Cakrawala",
                                    "Cakrawangsa",
                                    "Candra",
                                    "Chandra",
                                    "Candrakanta",
                                    "Capa",
                                    "Caraka",
                                    "Carub",
                                    "Catur",
                                    "Caturangga",
                                    "Cawisadi",
                                    "Cawisono",
                                    "Cawuk",
                                    "Cayadi",
                                    "Cecep",
                                    "Cemani",
                                    "Cemeti",
                                    "Cemplunk",
                                    "Cengkal",
                                    "Cengkir",
                                    "Dacin",
                                    "Dadap",
                                    "Dadi",
                                    "Dagel",
                                    "Daliman",
                                    "Dalimin",
                                    "Daliono",
                                    "Damar",
                                    "Damu",
                                    "Danang",
                                    "Daniswara",
                                    "Danu",
                                    "Danuja",
                                    "Dariati",
                                    "Darijan",
                                    "Darimin",
                                    "Darmaji",
                                    "Darman",
                                    "Darmana",
                                    "Darmanto",
                                    "Darsirah",
                                    "Dartono",
                                    "Daru",
                                    "Daruna",
                                    "Daryani",
                                    "Dasa",
                                    "Digdaya",
                                    "Dimas",
                                    "Dimaz",
                                    "Dipa",
                                    "Dirja",
                                    "Drajat",
                                    "Dwi",
                                    "Dono",
                                    "Dodo",
                                    "Edi",
                                    "Eka",
                                    "Elon",
                                    "Eluh",
                                    "Eman",
                                    "Emas",
                                    "Embuh",
                                    "Emong",
                                    "Empluk",
                                    "Endra",
                                    "Enteng",
                                    "Estiawan",
                                    "Estiono",
                                    "Eko",
                                    "Edi",
                                    "Edison",
                                    "Edward",
                                    "Elvin",
                                    "Erik",
                                    "Emil",
                                    "Ega",
                                    "Emin",
                                    "Eja",
                                    "Gada",
                                    "Gadang",
                                    "Gaduh",
                                    "Gaiman",
                                    "Galak",
                                    "Galang",
                                    "Galar",
                                    "Galih",
                                    "Galiono",
                                    "Galuh",
                                    "Galur",
                                    "Gaman",
                                    "Gamani",
                                    "Gamanto",
                                    "Gambira",
                                    "Gamblang",
                                    "Ganda",
                                    "Gandewa",
                                    "Gandi",
                                    "Gandi",
                                    "Ganep",
                                    "Gangsa",
                                    "Gangsar",
                                    "Ganjaran",
                                    "Gantar",
                                    "Gara",
                                    "Garan",
                                    "Garang",
                                    "Garda",
                                    "Gatot",
                                    "Gatra",
                                    "Gilang",
                                    "Galih",
                                    "Ghani",
                                    "Gading",
                                    "Hairyanto",
                                    "Hardana",
                                    "Hardi",
                                    "Harimurti",
                                    "Harja",
                                    "Harjasa",
                                    "Harjaya",
                                    "Harjo",
                                    "Harsana",
                                    "Harsanto",
                                    "Harsaya",
                                    "Hartaka",
                                    "Hartana",
                                    "Harto",
                                    "Hasta",
                                    "Heru",
                                    "Himawan",
                                    "Hadi",
                                    "Halim",
                                    "Hasim",
                                    "Hasan",
                                    "Hendra",
                                    "Hendri",
                                    "Heryanto",
                                    "Hamzah",
                                    "Hari",
                                    "Imam",
                                    "Indra",
                                    "Irwan",
                                    "Irsad",
                                    "Ikhsan",
                                    "Irfan",
                                    "Ian",
                                    "Ibrahim",
                                    "Ibrani",
                                    "Ismail",
                                    "Irnanto",
                                    "Ilyas",
                                    "Ibun",
                                    "Ivan",
                                    "Ikin",
                                    "Ihsan",
                                    "Jabal",
                                    "Jaeman",
                                    "Jaga",
                                    "Jagapati",
                                    "Jagaraga",
                                    "Jail",
                                    "Jaiman",
                                    "Jaka",
                                    "Jarwa",
                                    "Jarwadi",
                                    "Jarwi",
                                    "Jasmani",
                                    "Jaswadi",
                                    "Jati",
                                    "Jatmiko",
                                    "Jaya",
                                    "Jayadi",
                                    "Jayeng",
                                    "Jinawi",
                                    "Jindra",
                                    "Joko",
                                    "Jumadi",
                                    "Jumari",
                                    "Jamal",
                                    "Jamil",
                                    "Jais",
                                    "Jefri",
                                    "Johan",
                                    "Jono",
                                    "Kacung",
                                    "Kajen",
                                    "Kambali",
                                    "Kamidin",
                                    "Kariman",
                                    "Karja",
                                    "Karma",
                                    "Karman",
                                    "Karna",
                                    "Karsa",
                                    "Karsana",
                                    "Karta",
                                    "Kasiran",
                                    "Kasusra",
                                    "Kawaca",
                                    "Kawaya",
                                    "Kayun",
                                    "Kemba",
                                    "Kenari",
                                    "Kenes",
                                    "Kuncara",
                                    "Kunthara",
                                    "Kusuma",
                                    "Kadir",
                                    "Kala",
                                    "Kalim",
                                    "Kurnia",
                                    "Kanda",
                                    "Kardi",
                                    "Karya",
                                    "Kasim",
                                    "Kairav",
                                    "Kenzie",
                                    "Kemal",
                                    "Kamal",
                                    "Koko",
                                    "Labuh",
                                    "Laksana",
                                    "Lamar",
                                    "Lanang",
                                    "Langgeng",
                                    "Lanjar",
                                    "Lantar",
                                    "Lega",
                                    "Legawa",
                                    "Lembah",
                                    "Liman",
                                    "Limar",
                                    "Luhung",
                                    "Lukita",
                                    "Luluh",
                                    "Lulut",
                                    "Lurhur",
                                    "Luwar",
                                    "Luwes",
                                    "Latif",
                                    "Lasmanto",
                                    "Lukman",
                                    "Luthfi",
                                    "Leo",
                                    "Luis",
                                    "Lutfan",
                                    "Lasmono",
                                    "Laswi",
                                    "Mahesa",
                                    "Makara",
                                    "Makuta",
                                    "Manah",
                                    "Maras",
                                    "Margana",
                                    "Mariadi",
                                    "Marsudi",
                                    "Martaka",
                                    "Martana",
                                    "Martani",
                                    "Marwata",
                                    "Maryadi",
                                    "Maryanto",
                                    "Mitra",
                                    "Mujur",
                                    "Mulya",
                                    "Mulyanto",
                                    "Mulyono",
                                    "Mumpuni",
                                    "Muni",
                                    "Mursita",
                                    "Murti",
                                    "Mustika",
                                    "Maman",
                                    "Mahmud",
                                    "Mahdi",
                                    "Mahfud",
                                    "Malik",
                                    "Muhammad",
                                    "Mustofa",
                                    "Marsito",
                                    "Mursinin",
                                    "Nalar",
                                    "Naradi",
                                    "Nardi",
                                    "Niyaga",
                                    "Nrima",
                                    "Nugraha",
                                    "Nyana",
                                    "Narji",
                                    "Nasab",
                                    "Nasrullah",
                                    "Nasim",
                                    "Najib",
                                    "Najam",
                                    "Nyoman",
                                    "Olga",
                                    "Ozy",
                                    "Omar",
                                    "Opan",
                                    "Oskar",
                                    "Oman",
                                    "Okto",
                                    "Okta",
                                    "Opung",
                                    "Paiman",
                                    "Panca",
                                    "Pangeran",
                                    "Pangestu",
                                    "Pardi",
                                    "Parman",
                                    "Perkasa",
                                    "Praba",
                                    "Prabu",
                                    "Prabawa",
                                    "Prabowo",
                                    "Prakosa",
                                    "Pranata",
                                    "Pranawa",
                                    "Prasetya",
                                    "Prasetyo",
                                    "Prayitna",
                                    "Prayoga",
                                    "Prayogo",
                                    "Purwadi",
                                    "Purwa",
                                    "Purwanto",
                                    "Panji",
                                    "Pandu",
                                    "Paiman",
                                    "Prima",
                                    "Putu",
                                    "Raden",
                                    "Raditya",
                                    "Raharja",
                                    "Rama",
                                    "Rangga",
                                    "Reksa",
                                    "Respati",
                                    "Rusman",
                                    "Rosman",
                                    "Rahmat",
                                    "Rahman",
                                    "Rendy",
                                    "Reza",
                                    "Rizki",
                                    "Ridwan",
                                    "Rudi",
                                    "Raden",
                                    "Radit",
                                    "Radika",
                                    "Rafi",
                                    "Rafid",
                                    "Raihan",
                                    "Salman",
                                    "Saadat",
                                    "Saiful",
                                    "Surya",
                                    "Slamet",
                                    "Samsul",
                                    "Soleh",
                                    "Simon",
                                    "Sabar",
                                    "Sabri",
                                    "Sidiq",
                                    "Satya",
                                    "Setya",
                                    "Saka",
                                    "Sakti",
                                    "Taswir",
                                    "Tedi",
                                    "Teddy",
                                    "Taufan",
                                    "Taufik",
                                    "Tomi",
                                    "Tasnim",
                                    "Teguh",
                                    "Tasdik",
                                    "Timbul",
                                    "Tirta",
                                    "Tirtayasa",
                                    "Tri",
                                    "Tugiman",
                                    "Umar",
                                    "Usman",
                                    "Uda",
                                    "Umay",
                                    "Unggul",
                                    "Utama",
                                    "Umaya",
                                    "Upik",
                                    "Viktor",
                                    "Vino",
                                    "Vinsen",
                                    "Vero",
                                    "Vega",
                                    "Viman",
                                    "Virman",
                                    "Wahyu",
                                    "Wira",
                                    "Wisnu",
                                    "Wadi",
                                    "Wardi",
                                    "Warji",
                                    "Waluyo",
                                    "Wakiman",
                                    "Wage",
                                    "Wardaya",
                                    "Warsa",
                                    "Warsita",
                                    "Warta",
                                    "Wasis",
                                    "Wawan",
                                    "Xanana",
                                    "Yahya",
                                    "Yusuf",
                                    "Yosef",
                                    "Yono",
                                    "Yoga");
                        });

        public Object firstNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Ade",
                                    "Agnes",
                                    "Ajeng",
                                    "Amalia",
                                    "Anita",
                                    "Ayu",
                                    "Aisyah",
                                    "Ana",
                                    "Ami",
                                    "Ani",
                                    "Azalea",
                                    "Aurora",
                                    "Alika",
                                    "Anastasia",
                                    "Amelia",
                                    "Almira",
                                    "Bella",
                                    "Betania",
                                    "Belinda",
                                    "Citra",
                                    "Cindy",
                                    "Chelsea",
                                    "Clara",
                                    "Cornelia",
                                    "Cinta",
                                    "Cinthia",
                                    "Ciaobella",
                                    "Cici",
                                    "Carla",
                                    "Calista",
                                    "Devi",
                                    "Dewi",
                                    "Dian",
                                    "Diah",
                                    "Diana",
                                    "Dina",
                                    "Dinda",
                                    "Dalima",
                                    "Eka",
                                    "Eva",
                                    "Endah",
                                    "Elisa",
                                    "Eli",
                                    "Ella",
                                    "Ellis",
                                    "Elma",
                                    "Elvina",
                                    "Fitria",
                                    "Fitriani",
                                    "Febi",
                                    "Faizah",
                                    "Farah",
                                    "Farhunnisa",
                                    "Fathonah",
                                    "Gabriella",
                                    "Gasti",
                                    "Gawati",
                                    "Genta",
                                    "Ghaliyati",
                                    "Gina",
                                    "Gilda",
                                    "Halima",
                                    "Hesti",
                                    "Hilda",
                                    "Hafshah",
                                    "Hamima",
                                    "Hana",
                                    "Hani",
                                    "Hasna",
                                    "Humaira",
                                    "Ika",
                                    "Indah",
                                    "Intan",
                                    "Irma",
                                    "Icha",
                                    "Ida",
                                    "Ifa",
                                    "Ilsa",
                                    "Ina",
                                    "Ira",
                                    "Iriana",
                                    "Jamalia",
                                    "Janet",
                                    "Jane",
                                    "Julia",
                                    "Juli",
                                    "Jessica",
                                    "Jasmin",
                                    "Jelita",
                                    "Kamaria",
                                    "Kamila",
                                    "Kani",
                                    "Karen",
                                    "Karimah",
                                    "Kartika",
                                    "Kasiyah",
                                    "Keisha",
                                    "Kezia",
                                    "Kiandra",
                                    "Kayla",
                                    "Kania",
                                    "Lala",
                                    "Lalita",
                                    "Latika",
                                    "Laila",
                                    "Laras",
                                    "Lidya",
                                    "Lili",
                                    "Lintang",
                                    "Maria",
                                    "Mala",
                                    "Maya",
                                    "Maida",
                                    "Maimunah",
                                    "Melinda",
                                    "Mila",
                                    "Mutia",
                                    "Michelle",
                                    "Malika",
                                    "Nadia",
                                    "Nadine",
                                    "Nabila",
                                    "Natalia",
                                    "Novi",
                                    "Nova",
                                    "Nurul",
                                    "Nilam",
                                    "Najwa",
                                    "Olivia",
                                    "Ophelia",
                                    "Oni",
                                    "Oliva",
                                    "Padma",
                                    "Putri",
                                    "Paramita",
                                    "Paris",
                                    "Patricia",
                                    "Paulin",
                                    "Puput",
                                    "Puji",
                                    "Pia",
                                    "Puspa",
                                    "Puti",
                                    "Putri",
                                    "Padmi",
                                    "Qori",
                                    "Queen",
                                    "Ratih",
                                    "Ratna",
                                    "Restu",
                                    "Rini",
                                    "Rika",
                                    "Rina",
                                    "Rahayu",
                                    "Rahmi",
                                    "Rachel",
                                    "Rahmi",
                                    "Raisa",
                                    "Raina",
                                    "Sarah",
                                    "Sari",
                                    "Siti",
                                    "Siska",
                                    "Suci",
                                    "Syahrini",
                                    "Septi",
                                    "Sadina",
                                    "Safina",
                                    "Sakura",
                                    "Salimah",
                                    "Salwa",
                                    "Salsabila",
                                    "Samiah",
                                    "Shania",
                                    "Sabrina",
                                    "Silvia",
                                    "Shakila",
                                    "Talia",
                                    "Tami",
                                    "Tira",
                                    "Tiara",
                                    "Titin",
                                    "Tania",
                                    "Tina",
                                    "Tantri",
                                    "Tari",
                                    "Titi",
                                    "Uchita",
                                    "Unjani",
                                    "Ulya",
                                    "Uli",
                                    "Ulva",
                                    "Umi",
                                    "Usyi",
                                    "Vanya",
                                    "Vanesa",
                                    "Vivi",
                                    "Vera",
                                    "Vicky",
                                    "Victoria",
                                    "Violet",
                                    "Winda",
                                    "Widya",
                                    "Wulan",
                                    "Wirda",
                                    "Wani",
                                    "Yani",
                                    "Yessi",
                                    "Yulia",
                                    "Yuliana",
                                    "Yuni",
                                    "Yunita",
                                    "Yance",
                                    "Zahra",
                                    "Zalindra",
                                    "Zaenab",
                                    "Zulfa",
                                    "Zizi",
                                    "Zulaikha",
                                    "Zamira",
                                    "Zelda",
                                    "Zelaya");
                        });

        public Object lastNameMale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Adriansyah",
                                    "Ardianto",
                                    "Anggriawan",
                                    "Budiman",
                                    "Budiyanto",
                                    "Damanik",
                                    "Dongoran",
                                    "Dabukke",
                                    "Firmansyah",
                                    "Firgantoro",
                                    "Gunarto",
                                    "Gunawan",
                                    "Hardiansyah",
                                    "Habibi",
                                    "Hakim",
                                    "Halim",
                                    "Haryanto",
                                    "Hidayat",
                                    "Hidayanto",
                                    "Hutagalung",
                                    "Hutapea",
                                    "Hutasoit",
                                    "Irawan",
                                    "Iswahyudi",
                                    "Kuswoyo",
                                    "Januar",
                                    "Jailani",
                                    "Kurniawan",
                                    "Kusumo",
                                    "Latupono",
                                    "Lazuardi",
                                    "Maheswara",
                                    "Mahendra",
                                    "Mustofa",
                                    "Mansur",
                                    "Mandala",
                                    "Megantara",
                                    "Maulana",
                                    "Maryadi",
                                    "Mangunsong",
                                    "Manullang",
                                    "Marpaung",
                                    "Marbun",
                                    "Narpati",
                                    "Natsir",
                                    "Nugroho",
                                    "Najmudin",
                                    "Nashiruddin",
                                    "Nainggolan",
                                    "Nababan",
                                    "Napitupulu",
                                    "Pangestu",
                                    "Putra",
                                    "Pranowo",
                                    "Prabowo",
                                    "Pratama",
                                    "Prasetya",
                                    "Prasetyo",
                                    "Pradana",
                                    "Pradipta",
                                    "Prakasa",
                                    "Permadi",
                                    "Prasasta",
                                    "Prayoga",
                                    "Ramadan",
                                    "Rajasa",
                                    "Rajata",
                                    "Saptono",
                                    "Santoso",
                                    "Saputra",
                                    "Saefullah",
                                    "Setiawan",
                                    "Suryono",
                                    "Suwarno",
                                    "Siregar",
                                    "Sihombing",
                                    "Salahudin",
                                    "Sihombing",
                                    "Samosir",
                                    "Saragih",
                                    "Sihotang",
                                    "Simanjuntak",
                                    "Sinaga",
                                    "Simbolon",
                                    "Sitompul",
                                    "Sitorus",
                                    "Sirait",
                                    "Siregar",
                                    "Situmorang",
                                    "Tampubolon",
                                    "Thamrin",
                                    "Tamba",
                                    "Tarihoran",
                                    "Utama",
                                    "Uwais",
                                    "Wahyudin",
                                    "Waluyo",
                                    "Wibowo",
                                    "Winarno",
                                    "Wibisono",
                                    "Wijaya",
                                    "Widodo",
                                    "Wacana",
                                    "Waskita",
                                    "Wasita",
                                    "Zulkarnain");
                        });

        public Object lastNameFemale =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Agustina",
                                    "Andriani",
                                    "Anggraini",
                                    "Aryani",
                                    "Astuti",
                                    "Fujiati",
                                    "Farida",
                                    "Handayani",
                                    "Hassanah",
                                    "Hartati",
                                    "Hasanah",
                                    "Haryanti",
                                    "Hariyah",
                                    "Hastuti",
                                    "Halimah",
                                    "Kusmawati",
                                    "Kuswandari",
                                    "Laksmiwati",
                                    "Laksita",
                                    "Lestari",
                                    "Lailasari",
                                    "Mandasari",
                                    "Mardhiyah",
                                    "Mayasari",
                                    "Melani",
                                    "Mulyani",
                                    "Maryati",
                                    "Nurdiyanti",
                                    "Novitasari",
                                    "Nuraini",
                                    "Nasyidah",
                                    "Nasyiah",
                                    "Namaga",
                                    "Palastri",
                                    "Pudjiastuti",
                                    "Puspasari",
                                    "Puspita",
                                    "Purwanti",
                                    "Pratiwi",
                                    "Purnawati",
                                    "Pertiwi",
                                    "Permata",
                                    "Prastuti",
                                    "Padmasari",
                                    "Rahmawati",
                                    "Rahayu",
                                    "Riyanti",
                                    "Rahimah",
                                    "Suartini",
                                    "Sudiati",
                                    "Suryatmi",
                                    "Susanti",
                                    "Safitri",
                                    "Oktaviani",
                                    "Utami",
                                    "Usamah",
                                    "Usada",
                                    "Uyainah",
                                    "Yuniar",
                                    "Yuliarti",
                                    "Yulianti",
                                    "Yolanda",
                                    "Wahyuni",
                                    "Wijayanti",
                                    "Widiastuti",
                                    "Winarsih",
                                    "Wulandari",
                                    "Wastuti",
                                    "Zulaika");
                        });

        public Object titleMale = ZVal.arrayFromList("dr.", "drg.", "Dr.", "Drs.", "Ir.", "H.");

        public Object titleFemale = ZVal.arrayFromList("dr.", "drg.", "Dr.", "Hj.");

        public Object suffix =
                ZVal.arrayFromList(
                        "S.Ked", "S.Gz", "S.Pt", "S.IP", "S.E.I", "S.E.", "S.Kom", "S.H.", "S.T.",
                        "S.Pd", "S.Psi", "S.I.Kom", "S.Sos", "S.Farm", "M.M.", "M.Kom.", "M.TI.",
                        "M.Pd", "M.Farm", "M.Ak");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\id_ID\\Person")
                    .setLookup(
                            Person.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "femaleNameFormats",
                            "firstNameFemale",
                            "firstNameMale",
                            "lastNameFemale",
                            "lastNameFormat",
                            "lastNameMale",
                            "maleNameFormats",
                            "suffix",
                            "titleFemale",
                            "titleMale")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/id_ID/Person.php")
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
