package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.nb_NO.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/nb_NO/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\nb_NO\\Address";

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
                                                            .nb_NO
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityNames)
                            .value());
        }

        @ConvertedMethod
        public Object streetSuffixWord(RuntimeEnv env, Object... args) {
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
                                                            .nb_NO
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetSuffixWord)
                            .value());
        }

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
                                                            .nb_NO
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object buildingNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("toUpper")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                    env, this, Address.class)
                                            .method("bothify")
                                            .addReferenceArgs(new RuntimeArgsWithReferences())
                                            .call(
                                                    StaticMethodUtils.accessUnknownLateStaticMethod(
                                                                    env, this, Address.class)
                                                            .method("randomElement")
                                                            .addReferenceArgs(
                                                                    new RuntimeArgsWithReferences())
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
                                                                                            .nb_NO
                                                                                            .classes
                                                                                            .Address
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .buildingNumber)
                                                            .value())
                                            .value())
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object buildingNumber = ZVal.arrayFromList("%###", "%##", "%#", "%#?", "%", "%?");

        public Object streetPrefix =
                ZVal.arrayFromList(
                        "\u00D8vre", "Nedre", "S\u00F8ndre", "Gamle", "\u00D8stre", "Vestre");

        public Object streetSuffix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "all\u00E9en",
                                    "bakken",
                                    "berget",
                                    "br\u00E5ten",
                                    "eggen",
                                    "engen",
                                    "ekra",
                                    "faret",
                                    "flata",
                                    "gata",
                                    "gjerdet",
                                    "grenda",
                                    "gropa",
                                    "hagen",
                                    "haugen",
                                    "havna",
                                    "holtet",
                                    "h\u00F8gda",
                                    "jordet",
                                    "kollen",
                                    "kroken",
                                    "lia",
                                    "lunden",
                                    "lyngen",
                                    "l\u00F8kka",
                                    "marka",
                                    "moen",
                                    "myra",
                                    "plassen",
                                    "ringen",
                                    "roa",
                                    "r\u00F8a",
                                    "skogen",
                                    "skrenten",
                                    "spranget",
                                    "stien",
                                    "stranda",
                                    "stubben",
                                    "stykket",
                                    "svingen",
                                    "tjernet",
                                    "toppen",
                                    "tunet",
                                    "vollen",
                                    "vika",
                                    "\u00E5sen");
                        });

        public Object streetSuffixWord =
                ZVal.arrayFromList("sgate", "svei", "s Gate", "s Vei", "gata", "veien");

        public Object postcode = ZVal.arrayFromList("####", "####", "####", "0###");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alta",
                                    "Arendal",
                                    "Askim",
                                    "Bergen",
                                    "Bod\u00F8",
                                    "Brekstad",
                                    "Brevik",
                                    "Brumunddal",
                                    "Bryne",
                                    "Br\u00F8nn\u00F8ysund",
                                    "Drammen",
                                    "Dr\u00F8bak",
                                    "Egersund",
                                    "Elverum",
                                    "Fagernes",
                                    "Farsund",
                                    "Fauske",
                                    "Finnsnes",
                                    "Flekkefjord",
                                    "Flor\u00F8",
                                    "Fosnav\u00E5g",
                                    "Fredrikstad",
                                    "F\u00F8rde",
                                    "Gj\u00F8vik",
                                    "Grimstad",
                                    "Halden",
                                    "Hamar",
                                    "Hammerfest",
                                    "Harstad",
                                    "Haugesund",
                                    "Hokksund",
                                    "Holmestrand",
                                    "Honningsv\u00E5g",
                                    "Horten",
                                    "H\u00F8nefoss",
                                    "Jessheim",
                                    "J\u00F8rpeland",
                                    "Kirkenes",
                                    "Kolvereid",
                                    "Kongsberg",
                                    "Kongsvinger",
                                    "Kopervik",
                                    "Krager\u00F8",
                                    "Kristiansand",
                                    "Kristiansund",
                                    "Langesund",
                                    "Larvik",
                                    "Leknes",
                                    "Levanger",
                                    "Lillehammer",
                                    "Lillesand",
                                    "Lillestr\u00F8m",
                                    "Lyngdal",
                                    "Mandal",
                                    "Mo i Rana",
                                    "Moelv",
                                    "Molde",
                                    "Mosj\u00F8en",
                                    "Moss",
                                    "Mysen",
                                    "M\u00E5l\u00F8y",
                                    "Namsos",
                                    "Narvik",
                                    "Notodden",
                                    "Odda",
                                    "Orkanger",
                                    "Oslo",
                                    "Otta",
                                    "Porsgrunn",
                                    "Ris\u00F8r",
                                    "Rjukan",
                                    "R\u00F8ros",
                                    "Sandefjord",
                                    "Sandnes",
                                    "Sandnessj\u00F8en",
                                    "Sandvika",
                                    "Sarpsborg",
                                    "Sauda",
                                    "Ski",
                                    "Skien",
                                    "Skudeneshavn",
                                    "Sortland",
                                    "Stathelle",
                                    "Stavanger",
                                    "Stavern",
                                    "Steinkjer",
                                    "Stj\u00F8rdalshalsen",
                                    "Stokmarknes",
                                    "Stord",
                                    "Svelvik",
                                    "Svolv\u00E6r",
                                    "Troms\u00F8",
                                    "Trondheim",
                                    "Tvedestrand",
                                    "T\u00F8nsberg",
                                    "Ulsteinvik",
                                    "Vads\u00F8",
                                    "Vard\u00F8",
                                    "Verdals\u00F8ra",
                                    "Vinstra",
                                    "\u00C5krehamn",
                                    "\u00C5lesund",
                                    "\u00C5ndalsnes",
                                    "\u00C5sg\u00E5rdstrand");
                        });

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object kommuneNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Halden",
                                    "Moss",
                                    "Sarpsborg",
                                    "Fredrikstad",
                                    "Hvaler",
                                    "Aremark",
                                    "Marker",
                                    "R\u00F8mskog",
                                    "Tr\u00F8gstad",
                                    "Spydeberg",
                                    "Askim",
                                    "Eidsberg",
                                    "Skiptvet",
                                    "Rakkestad",
                                    "R\u00E5de",
                                    "Rygge",
                                    "V\u00E5ler",
                                    "Hob\u00F8l",
                                    "Vestby",
                                    "Ski",
                                    "\u00C5s",
                                    "Frogn",
                                    "Nesodden",
                                    "Oppeg\u00E5rd",
                                    "B\u00E6rum",
                                    "Asker",
                                    "Aurskog-H\u00F8land",
                                    "S\u00F8rum",
                                    "Fet",
                                    "R\u00E6lingen",
                                    "Enebakk",
                                    "L\u00F8renskog",
                                    "Skedsmo",
                                    "Nittedal",
                                    "Gjerdrum",
                                    "Ullensaker",
                                    "Nes",
                                    "Eidsvoll",
                                    "Nannestad",
                                    "Hurdal",
                                    "Oslo",
                                    "Kongsvinger",
                                    "Hamar",
                                    "Ringsaker",
                                    "L\u00F8ten",
                                    "Stange",
                                    "Nord-Odal",
                                    "S\u00F8r-Odal",
                                    "Eidskog",
                                    "Grue",
                                    "\u00C5snes",
                                    "V\u00E5ler",
                                    "Elverum",
                                    "Trysil",
                                    "\u00C5mot",
                                    "Stor-Elvdal",
                                    "Rendalen",
                                    "Engerdal",
                                    "Tolga",
                                    "Tynset",
                                    "Alvdal",
                                    "Folldal",
                                    "Os",
                                    "Lillehammer",
                                    "Gj\u00F8vik",
                                    "Dovre",
                                    "Lesja",
                                    "Skj\u00E5k",
                                    "Lom",
                                    "V\u00E5g\u00E5",
                                    "Nord-Fron",
                                    "Sel",
                                    "S\u00F8r-Fron",
                                    "Ringebu",
                                    "\u00D8yer",
                                    "Gausdal",
                                    "\u00D8stre Toten",
                                    "Vestre Toten",
                                    "Jevnaker",
                                    "Lunner",
                                    "Gran",
                                    "S\u00F8ndre Land",
                                    "Nordre Land",
                                    "S\u00F8r-Aurdal",
                                    "Etnedal",
                                    "Nord-Aurdal",
                                    "Vestre Slidre",
                                    "\u00D8ystre Slidre",
                                    "Vang",
                                    "Drammen",
                                    "Kongsberg",
                                    "Ringerike",
                                    "Hole",
                                    "Fl\u00E5",
                                    "Nes",
                                    "Gol",
                                    "Hemsedal",
                                    "\u00C5l",
                                    "Hol",
                                    "Sigdal",
                                    "Kr\u00F8dsherad",
                                    "Modum",
                                    "\u00D8vre Eiker",
                                    "Nedre Eiker",
                                    "Lier",
                                    "R\u00F8yken",
                                    "Hurum",
                                    "Flesberg",
                                    "Rollag",
                                    "Nore og Uvdal",
                                    "Horten",
                                    "Holmestrand",
                                    "T\u00F8nsberg",
                                    "Sandefjord",
                                    "Larvik",
                                    "Svelvik",
                                    "Sande",
                                    "Hof",
                                    "Re",
                                    "Andebu",
                                    "Stokke",
                                    "N\u00F8tter\u00F8y",
                                    "Tj\u00F8me",
                                    "Lardal",
                                    "Porsgrunn",
                                    "Skien",
                                    "Notodden",
                                    "Siljan",
                                    "Bamble",
                                    "Krager\u00F8",
                                    "Drangedal",
                                    "Nome",
                                    "B\u00F8",
                                    "Sauherad",
                                    "Tinn",
                                    "Hjartdal",
                                    "Seljord",
                                    "Kviteseid",
                                    "Nissedal",
                                    "Fyresdal",
                                    "Tokke",
                                    "Vinje",
                                    "Ris\u00F8r",
                                    "Grimstad",
                                    "Arendal",
                                    "Gjerstad",
                                    "Veg\u00E5rshei",
                                    "Tvedestrand",
                                    "Froland",
                                    "Lillesand",
                                    "Birkenes",
                                    "\u00C5mli",
                                    "Iveland",
                                    "Evje og Hornnes",
                                    "Bygland",
                                    "Valle",
                                    "Bykle",
                                    "Kristiansand",
                                    "Mandal",
                                    "Farsund",
                                    "Flekkefjord",
                                    "Vennesla",
                                    "Songdalen",
                                    "S\u00F8gne",
                                    "Marnardal",
                                    "\u00C5seral",
                                    "Audnedal",
                                    "Lindesnes",
                                    "Lyngdal",
                                    "H\u00E6gebostad",
                                    "Kvinesdal",
                                    "Sirdal",
                                    "Eigersund",
                                    "Sandnes",
                                    "Stavanger",
                                    "Haugesund",
                                    "Sokndal",
                                    "Lund",
                                    "Bjerkreim",
                                    "H\u00E5",
                                    "Klepp",
                                    "Time",
                                    "Gjesdal",
                                    "Sola",
                                    "Randaberg",
                                    "Forsand",
                                    "Strand",
                                    "Hjelmeland",
                                    "Suldal",
                                    "Sauda",
                                    "Finn\u00F8y",
                                    "Rennes\u00F8y",
                                    "Kvits\u00F8y",
                                    "Bokn",
                                    "Tysv\u00E6r",
                                    "Karm\u00F8y",
                                    "Utsira",
                                    "Vindafjord",
                                    "Bergen",
                                    "Etne",
                                    "Sveio",
                                    "B\u00F8mlo",
                                    "Stord",
                                    "Fitjar",
                                    "Tysnes",
                                    "Kvinnherad",
                                    "Jondal",
                                    "Odda",
                                    "Ullensvang",
                                    "Eidfjord",
                                    "Ulvik",
                                    "Granvin",
                                    "Voss",
                                    "Kvam",
                                    "Fusa",
                                    "Samnanger",
                                    "Os",
                                    "Austevoll",
                                    "Sund",
                                    "Fjell",
                                    "Ask\u00F8y",
                                    "Vaksdal",
                                    "Modalen",
                                    "Oster\u00F8y",
                                    "Meland",
                                    "\u00D8ygarden",
                                    "Rad\u00F8y",
                                    "Lind\u00E5s",
                                    "Austrheim",
                                    "Fedje",
                                    "Masfjorden",
                                    "Flora",
                                    "Gulen",
                                    "Solund",
                                    "Hyllestad",
                                    "H\u00F8yanger",
                                    "Vik",
                                    "Balestrand",
                                    "Leikanger",
                                    "Sogndal",
                                    "Aurland",
                                    "L\u00E6rdal",
                                    "\u00C5rdal",
                                    "Luster",
                                    "Askvoll",
                                    "Fjaler",
                                    "Gaular",
                                    "J\u00F8lster",
                                    "F\u00F8rde",
                                    "Naustdal",
                                    "Bremanger",
                                    "V\u00E5gs\u00F8y",
                                    "Selje",
                                    "Eid",
                                    "Hornindal",
                                    "Gloppen",
                                    "Stryn",
                                    "Molde",
                                    "\u00C5lesund",
                                    "Kristiansund",
                                    "Vanylven",
                                    "Sande",
                                    "Her\u00F8y",
                                    "Ulstein",
                                    "Hareid",
                                    "Volda",
                                    "\u00D8rsta",
                                    "\u00D8rskog",
                                    "Norddal",
                                    "Stranda",
                                    "Stordal",
                                    "Sykkylven",
                                    "Skodje",
                                    "Sula",
                                    "Giske",
                                    "Haram",
                                    "Vestnes",
                                    "Rauma",
                                    "Nesset",
                                    "Midsund",
                                    "Sand\u00F8y",
                                    "Aukra",
                                    "Fr\u00E6na",
                                    "Eide",
                                    "Aver\u00F8y",
                                    "Gjemnes",
                                    "Tingvoll",
                                    "Sunndal",
                                    "Surnadal",
                                    "Rindal",
                                    "Halsa",
                                    "Sm\u00F8la",
                                    "Aure",
                                    "Trondheim",
                                    "Hemne",
                                    "Snillfjord",
                                    "Hitra",
                                    "Fr\u00F8ya",
                                    "\u00D8rland",
                                    "Agdenes",
                                    "Rissa",
                                    "Bjugn",
                                    "\u00C5fjord",
                                    "Roan",
                                    "Osen",
                                    "Oppdal",
                                    "Rennebu",
                                    "Meldal",
                                    "Orkdal",
                                    "R\u00F8ros",
                                    "Holt\u00E5len",
                                    "Midtre Gauldal",
                                    "Melhus",
                                    "Skaun",
                                    "Kl\u00E6bu",
                                    "Malvik",
                                    "Selbu",
                                    "Tydal",
                                    "Steinkjer",
                                    "Namsos",
                                    "Mer\u00E5ker",
                                    "Stj\u00F8rdal",
                                    "Frosta",
                                    "Leksvik",
                                    "Levanger",
                                    "Verdal",
                                    "Verran",
                                    "Namdalseid",
                                    "Inder\u00F8y",
                                    "Sn\u00E5sa",
                                    "Lierne",
                                    "R\u00F8yrvik",
                                    "Namsskogan",
                                    "Grong",
                                    "H\u00F8ylandet",
                                    "Overhalla",
                                    "Fosnes",
                                    "Flatanger",
                                    "Vikna",
                                    "N\u00E6r\u00F8y",
                                    "Leka",
                                    "Bod\u00F8",
                                    "Narvik",
                                    "Bindal",
                                    "S\u00F8mna",
                                    "Br\u00F8nn\u00F8y",
                                    "Vega",
                                    "Vevelstad",
                                    "Her\u00F8y",
                                    "Alstahaug",
                                    "Leirfjord",
                                    "Vefsn",
                                    "Grane",
                                    "Hattfjelldal",
                                    "D\u00F8nna",
                                    "Nesna",
                                    "Hemnes",
                                    "Rana",
                                    "Lur\u00F8y",
                                    "Tr\u00E6na",
                                    "R\u00F8d\u00F8y",
                                    "Mel\u00F8y",
                                    "Gildesk\u00E5l",
                                    "Beiarn",
                                    "Saltdal",
                                    "Fauske",
                                    "S\u00F8rfold",
                                    "Steigen",
                                    "Hamar\u00F8y",
                                    "Tysfjord",
                                    "L\u00F8dingen",
                                    "Tjeldsund",
                                    "Evenes",
                                    "Ballangen",
                                    "R\u00F8st",
                                    "V\u00E6r\u00F8y",
                                    "Flakstad",
                                    "Vestv\u00E5g\u00F8y",
                                    "V\u00E5gan",
                                    "Hadsel",
                                    "B\u00F8",
                                    "\u00D8ksnes",
                                    "Sortland",
                                    "And\u00F8y",
                                    "Moskenes",
                                    "Harstad[10]",
                                    "Troms\u00F8",
                                    "Kv\u00E6fjord",
                                    "Sk\u00E5nland",
                                    "Ibestad",
                                    "Gratangen",
                                    "Lavangen",
                                    "Bardu",
                                    "Salangen",
                                    "M\u00E5lselv",
                                    "S\u00F8rreisa",
                                    "Dyr\u00F8y",
                                    "Tran\u00F8y",
                                    "Torsken",
                                    "Berg",
                                    "Lenvik",
                                    "Balsfjord",
                                    "Karls\u00F8y",
                                    "Lyngen",
                                    "Storfjord",
                                    "K\u00E5fjord",
                                    "Skjerv\u00F8y",
                                    "Nordreisa",
                                    "Kv\u00E6nangen",
                                    "Vard\u00F8",
                                    "Vads\u00F8",
                                    "Hammerfest",
                                    "Kautokeino",
                                    "Alta",
                                    "Loppa",
                                    "Hasvik",
                                    "Kvalsund",
                                    "M\u00E5s\u00F8y",
                                    "Nordkapp",
                                    "Porsanger",
                                    "Karasjok",
                                    "Lebesby",
                                    "Gamvik",
                                    "Berlev\u00E5g",
                                    "Tana",
                                    "Nesseby",
                                    "B\u00E5tsfjord",
                                    "S\u00F8r-Varanger");
                        });

        public Object countyNames =
                ZVal.arrayFromList(
                        "\u00D8stfold",
                        "Akershus",
                        "Oslo",
                        "Hedmark",
                        "Oppland",
                        "Buskerud",
                        "Vestfold",
                        "Telemark",
                        "Aust-Agder",
                        "Vest-Agder",
                        "Rogaland",
                        "Hordaland",
                        "Sogn og Fjordane",
                        "M\u00F8re og Romsdal",
                        "S\u00F8r-Tr\u00F8ndelag",
                        "Nord-Tr\u00F8ndelag",
                        "Nordland",
                        "Troms",
                        "Finnmark",
                        "Svalbard",
                        "Jan Mayen",
                        "Kontinentalsokkelen");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Abkhasia",
                                    "Afghanistan",
                                    "Albania",
                                    "Algerie",
                                    "Andorra",
                                    "Angola",
                                    "Antigua og Barbuda",
                                    "Argentina",
                                    "Armenia",
                                    "Aserbajdsjan",
                                    "Australia",
                                    "Bahamas",
                                    "Bahrain",
                                    "Bangladesh",
                                    "Barbados",
                                    "Belgia",
                                    "Belize",
                                    "Benin",
                                    "Bhutan",
                                    "Bolivia",
                                    "Bosnia-Hercegovina",
                                    "Botswana",
                                    "Brasil",
                                    "Brunei",
                                    "Bulgaria",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Canada",
                                    "Chile",
                                    "Colombia",
                                    "Costa Rica",
                                    "Cuba",
                                    "Danmark",
                                    "De forente arabiske emirater",
                                    "Den demokratiske republikken Kongo",
                                    "Den dominikanske republikk",
                                    "Den sentralafrikanske republikk",
                                    "Djibouti",
                                    "Dominica",
                                    "Ecuador",
                                    "Egypt",
                                    "Ekvatorial-Guinea",
                                    "Elfenbenskysten",
                                    "El Salvador",
                                    "Eritrea",
                                    "Estland",
                                    "Etiopia",
                                    "Fiji",
                                    "Filippinene",
                                    "Finland",
                                    "Frankrike",
                                    "Gabon",
                                    "Gambia",
                                    "Georgia",
                                    "Ghana",
                                    "Grenada",
                                    "Guatemala",
                                    "Guinea",
                                    "Guinea-Bissau",
                                    "Guyana",
                                    "Haiti",
                                    "Hellas",
                                    "Honduras",
                                    "Hviterussland",
                                    "India",
                                    "Indonesia",
                                    "Irak",
                                    "Iran",
                                    "Irland",
                                    "Island",
                                    "Israel",
                                    "Italia",
                                    "Jamaica",
                                    "Japan",
                                    "Jemen",
                                    "Jordan",
                                    "Kambodsja",
                                    "Kamerun",
                                    "Kapp Verde",
                                    "Kasakhstan",
                                    "Kenya",
                                    "Folkerepublikken Kina",
                                    "Kirgisistan",
                                    "Kiribati",
                                    "Komorene",
                                    "Republikken Kongo",
                                    "Kosovo",
                                    "Kroatia",
                                    "Kuwait",
                                    "Kypros",
                                    "Laos",
                                    "Latvia",
                                    "Lesotho",
                                    "Libanon",
                                    "Liberia",
                                    "Libya",
                                    "Liechtenstein",
                                    "Litauen",
                                    "Luxembourg",
                                    "Madagaskar",
                                    "Makedonia",
                                    "Malawi",
                                    "Malaysia",
                                    "Maldivene",
                                    "Mali",
                                    "Malta",
                                    "Marokko",
                                    "Marshall\u00F8yene",
                                    "Mauritania",
                                    "Mauritius",
                                    "Mexico",
                                    "Mikronesiaf\u00F8derasjonen",
                                    "Moldova",
                                    "Monaco",
                                    "Mongolia",
                                    "Montenegro",
                                    "Mosambik",
                                    "Myanmar",
                                    "Namibia",
                                    "Nauru",
                                    "Nederland",
                                    "Nepal",
                                    "New Zealand",
                                    "Nicaragua",
                                    "Niger",
                                    "Nigeria",
                                    "Nord-Korea",
                                    "Nord-Kypros",
                                    "Norge",
                                    "Oman",
                                    "Pakistan",
                                    "Palau",
                                    "Panama",
                                    "Papua Ny-Guinea",
                                    "Paraguay",
                                    "Peru",
                                    "Polen",
                                    "Portugal",
                                    "Qatar",
                                    "Romania",
                                    "Russland",
                                    "Rwanda",
                                    "Saint Kitts og Nevis",
                                    "Saint Lucia",
                                    "Saint Vincent og Grenadinene",
                                    "Salomon\u00F8yene",
                                    "Samoa",
                                    "San Marino",
                                    "S\u00E3o Tom\u00E9 og Pr\u00EDncipe",
                                    "Saudi-Arabia",
                                    "Senegal",
                                    "Serbia",
                                    "Seychellene",
                                    "Sierra Leone",
                                    "Singapore",
                                    "Slovakia",
                                    "Slovenia",
                                    "Somalia",
                                    "Spania",
                                    "Sri Lanka",
                                    "Storbritannia",
                                    "Sudan",
                                    "Surinam",
                                    "Sveits",
                                    "Sverige",
                                    "Swaziland",
                                    "Syria",
                                    "S\u00F8r-Afrika",
                                    "S\u00F8r-Korea",
                                    "S\u00F8r-Ossetia",
                                    "S\u00F8r-Sudan",
                                    "Tadsjikistan",
                                    "Taiwan",
                                    "Tanzania",
                                    "Thailand",
                                    "Togo",
                                    "Tonga",
                                    "Transnistria",
                                    "Trinidad og Tobago",
                                    "Tsjad",
                                    "Tsjekkia",
                                    "Tunisia",
                                    "Turkmenistan",
                                    "Tuvalu",
                                    "Tyrkia",
                                    "Tyskland",
                                    "Uganda",
                                    "USA",
                                    "Ukraina",
                                    "Ungarn",
                                    "Uruguay",
                                    "Usbekistan",
                                    "Vanuatu",
                                    "Vatikanstaten",
                                    "Venezuela",
                                    "Vietnam",
                                    "Zambia",
                                    "Zimbabwe",
                                    "\u00D8sterrike",
                                    "\u00D8st-Timor");
                        });

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{lastName}}{{streetSuffix}}",
                        "{{lastName}}{{streetSuffix}}",
                        "{{firstName}}{{streetSuffix}}",
                        "{{firstName}}{{streetSuffix}}",
                        "{{streetPrefix}}{{streetSuffix}}",
                        "{{streetPrefix}}{{streetSuffix}}",
                        "{{streetPrefix}}{{streetSuffix}}",
                        "{{streetPrefix}}{{streetSuffix}}",
                        "{{lastName}} {{streetSuffixWord}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{postcode}} {{city}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\nb_NO\\Address")
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
                            "countyNames",
                            "kommuneNames",
                            "postcode",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix",
                            "streetSuffix",
                            "streetSuffixWord")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/nb_NO/Address.php")
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
