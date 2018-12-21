package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.da_DK.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/da_DK/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\da_DK\\Address";

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
                                                            .da_DK
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
                                                            .da_DK
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetSuffixWord)
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
                                                                                            .da_DK
                                                                                            .classes
                                                                                            .Address
                                                                                            .RequestStaticProperties
                                                                                            .class)
                                                                            .buildingNumber)
                                                            .value())
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object buildingLevel(RuntimeEnv env, Object... args) {
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
                                                                            .da_DK
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .buildingLevel)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object buildingSide(RuntimeEnv env, Object... args) {
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
                                                            .da_DK
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .buildingSide)
                            .value());
        }

        @ConvertedMethod
        public Object kommune(RuntimeEnv env, Object... args) {
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
                                                            .da_DK
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .kommuneNames)
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
                                                            .da_DK
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .regionNames)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object citySuffix =
                ZVal.arrayFromList("sted", "bjerg", "borg", "r\u00F8d", "lund", "by");

        public Object streetSuffix = ZVal.arrayFromList("vej", "gade", "skov", "shaven");

        public Object streetSuffixWord =
                ZVal.arrayFromList("Vej", "Gade", "All\u00E9", "Boulevard", "Plads", "Have");

        public Object buildingNumber =
                ZVal.arrayFromList("%##", "%#", "%#", "%", "%", "%", "%?", "% ?");

        public Object buildingLevel = ZVal.arrayFromList("st.", "%.", "%. sal.");

        public Object buildingSide = ZVal.arrayFromList("tv.", "th.");

        public Object postcode = ZVal.arrayFromList("%###");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aabenraa",
                                    "Aabybro",
                                    "Aakirkeby",
                                    "Aalborg",
                                    "Aalestrup",
                                    "Aars",
                                    "Aarup",
                                    "Agedrup",
                                    "Agerb\u00E6k",
                                    "Agerskov",
                                    "Albertslund",
                                    "Aller\u00F8d",
                                    "Allinge",
                                    "Alling\u00E5bro",
                                    "Almind",
                                    "Anholt",
                                    "Ansager",
                                    "Arden",
                                    "Asaa",
                                    "Askeby",
                                    "Asn\u00E6s",
                                    "Asperup",
                                    "Assens",
                                    "Augustenborg",
                                    "Aulum",
                                    "Auning",
                                    "Bagenkop",
                                    "Bagsv\u00E6rd",
                                    "Balle",
                                    "Ballerup",
                                    "Bandholm",
                                    "Barrit",
                                    "Beder",
                                    "Bedsted",
                                    "Bevtoft",
                                    "Billum",
                                    "Billund",
                                    "Bindslev",
                                    "Birker\u00F8d",
                                    "Bjerringbro",
                                    "Bjert",
                                    "Bj\u00E6verskov",
                                    "Blokhus",
                                    "Blommenslyst",
                                    "Bl\u00E5vand",
                                    "Boeslunde",
                                    "Bogense",
                                    "Bog\u00F8",
                                    "Bolderslev",
                                    "Bording",
                                    "Borre",
                                    "Borup",
                                    "Br\u00F8ndby",
                                    "Brabrand",
                                    "Bramming",
                                    "Brande",
                                    "Branderup",
                                    "Bredebro",
                                    "Bredsten",
                                    "Brenderup",
                                    "Broager",
                                    "Broby",
                                    "Brovst",
                                    "Bryrup",
                                    "Br\u00E6dstrup",
                                    "Strand",
                                    "Br\u00F8nderslev",
                                    "Br\u00F8nsh\u00F8j",
                                    "Br\u00F8rup",
                                    "B\u00E6kke",
                                    "B\u00E6kmarksbro",
                                    "B\u00E6lum",
                                    "B\u00F8rkop",
                                    "B\u00F8vlingbjerg",
                                    "Charlottenlund",
                                    "Christiansfeld",
                                    "Dalby",
                                    "Dalmose",
                                    "Dannemare",
                                    "Daug\u00E5rd",
                                    "Dianalund",
                                    "Drag\u00F8r",
                                    "Dronninglund",
                                    "Dronningm\u00F8lle",
                                    "Dybvad",
                                    "Dysseg\u00E5rd",
                                    "Ebberup",
                                    "Ebeltoft",
                                    "Egernsund",
                                    "Egtved",
                                    "Eg\u00E5",
                                    "Ejby",
                                    "Ejstrupholm",
                                    "Engesvang",
                                    "Errindlev",
                                    "Erslev",
                                    "Esbjerg",
                                    "Eskebjerg",
                                    "Eskilstrup",
                                    "Esperg\u00E6rde",
                                    "Faaborg",
                                    "Fan\u00F8",
                                    "Fars\u00F8",
                                    "Farum",
                                    "Faxe",
                                    "Ladeplads",
                                    "Fej\u00F8",
                                    "Ferritslev",
                                    "Fjenneslev",
                                    "Fjerritslev",
                                    "Flemming",
                                    "Fredensborg",
                                    "Fredericia",
                                    "Frederiksberg",
                                    "Frederikshavn",
                                    "Frederikssund",
                                    "Frederiksv\u00E6rk",
                                    "Fr\u00F8rup",
                                    "Fr\u00F8strup",
                                    "Fuglebjerg",
                                    "F\u00F8llenslev",
                                    "F\u00F8vling",
                                    "F\u00E5revejle",
                                    "F\u00E5rup",
                                    "F\u00E5rvang",
                                    "Gadbjerg",
                                    "Gadstrup",
                                    "Galten",
                                    "Gandrup",
                                    "Gedser",
                                    "Gedsted",
                                    "Gedved",
                                    "Gelsted",
                                    "Gentofte",
                                    "Gesten",
                                    "Gilleleje",
                                    "Gislev",
                                    "Gislinge",
                                    "Gistrup",
                                    "Give",
                                    "Gjerlev",
                                    "Gjern",
                                    "Glamsbjerg",
                                    "Glejbjerg",
                                    "Glesborg",
                                    "Glostrup",
                                    "Glums\u00F8",
                                    "Gram",
                                    "Gredstedbro",
                                    "Grenaa",
                                    "Greve",
                                    "Grevinge",
                                    "Grindsted",
                                    "Gr\u00E6sted",
                                    "Gr\u00E5sten",
                                    "Gudbjerg",
                                    "Sydfyn",
                                    "Gudhjem",
                                    "Gudme",
                                    "Guldborg",
                                    "G\u00F8rding",
                                    "G\u00F8rlev",
                                    "G\u00F8rl\u00F8se",
                                    "Haderslev",
                                    "Haderup",
                                    "Hadsten",
                                    "Hadsund",
                                    "Hals",
                                    "Hammel",
                                    "Hampen",
                                    "Hanstholm",
                                    "Harbo\u00F8re",
                                    "Harlev",
                                    "Harndrup",
                                    "Harpelunde",
                                    "Hasle",
                                    "Haslev",
                                    "Hasselager",
                                    "Havdrup",
                                    "Havndal",
                                    "Hedehusene",
                                    "Hedensted",
                                    "Hejls",
                                    "Hejnsvig",
                                    "Helleb\u00E6k",
                                    "Hellerup",
                                    "Helsinge",
                                    "Helsing\u00F8r",
                                    "Hemmet",
                                    "Henne",
                                    "Herf\u00F8lge",
                                    "Herlev",
                                    "Herlufmagle",
                                    "Herning",
                                    "Hesselager",
                                    "Hiller\u00F8d",
                                    "Hinnerup",
                                    "Hirtshals",
                                    "Hjallerup",
                                    "Hjerm",
                                    "Hjortsh\u00F8j",
                                    "Hj\u00F8rring",
                                    "Hobro",
                                    "Holb\u00E6k",
                                    "Holeby",
                                    "Holmegaard",
                                    "Holstebro",
                                    "Holsted",
                                    "Holte",
                                    "Horbelev",
                                    "Hornb\u00E6k",
                                    "Hornslet",
                                    "Hornsyld",
                                    "Horsens",
                                    "Horslunde",
                                    "Hovborg",
                                    "Hovedg\u00E5rd",
                                    "Humble",
                                    "Humleb\u00E6k",
                                    "Hundested",
                                    "Hundslund",
                                    "Hurup",
                                    "Hvals\u00F8",
                                    "Hvide",
                                    "Sande",
                                    "Hvidovre",
                                    "H\u00F8jbjerg",
                                    "H\u00F8jby",
                                    "H\u00F8jer",
                                    "H\u00F8jslev",
                                    "H\u00F8ng",
                                    "H\u00F8rning",
                                    "H\u00F8rsholm",
                                    "H\u00F8rve",
                                    "H\u00E5rlev",
                                    "Idestrup",
                                    "Ikast",
                                    "Ish\u00F8j",
                                    "Janderup",
                                    "Vestj",
                                    "Jelling",
                                    "Jerslev",
                                    "Sj\u00E6lland",
                                    "Jerup",
                                    "Jordrup",
                                    "Juelsminde",
                                    "Jyderup",
                                    "Jyllinge",
                                    "Jystrup",
                                    "Midtsj",
                                    "J\u00E6gerspris",
                                    "Kalundborg",
                                    "Kalvehave",
                                    "Karby",
                                    "Karise",
                                    "Karlslunde",
                                    "Karreb\u00E6ksminde",
                                    "Karup",
                                    "Kastrup",
                                    "Kerteminde",
                                    "Kettinge",
                                    "Kib\u00E6k",
                                    "Kirke",
                                    "Hyllinge",
                                    "S\u00E5by",
                                    "Kjellerup",
                                    "Klampenborg",
                                    "Klarup",
                                    "Klemensker",
                                    "Klippinge",
                                    "Klovborg",
                                    "Knebel",
                                    "Kokkedal",
                                    "Kolding",
                                    "Kolind",
                                    "Kongens",
                                    "Lyngby",
                                    "Kongerslev",
                                    "Kors\u00F8r",
                                    "Krus\u00E5",
                                    "Kvistg\u00E5rd",
                                    "Kv\u00E6rndrup",
                                    "K\u00F8benhavn",
                                    "K\u00F8ge",
                                    "Langeb\u00E6k",
                                    "Langeskov",
                                    "Lang\u00E5",
                                    "Lejre",
                                    "Lemming",
                                    "Lemvig",
                                    "Lille",
                                    "Skensved",
                                    "Lintrup",
                                    "Liseleje",
                                    "Lundby",
                                    "Lunderskov",
                                    "Lynge",
                                    "Lystrup",
                                    "L\u00E6s\u00F8",
                                    "L\u00F8gstrup",
                                    "L\u00F8gst\u00F8r",
                                    "L\u00F8gumkloster",
                                    "L\u00F8kken",
                                    "L\u00F8sning",
                                    "L\u00E5sby",
                                    "Malling",
                                    "Mariager",
                                    "Maribo",
                                    "Marslev",
                                    "Marstal",
                                    "Martofte",
                                    "Melby",
                                    "Mern",
                                    "Mesinge",
                                    "Middelfart",
                                    "Millinge",
                                    "Morud",
                                    "Munke",
                                    "Bjergby",
                                    "Munkebo",
                                    "M\u00F8ldrup",
                                    "M\u00F8rke",
                                    "M\u00F8rk\u00F8v",
                                    "M\u00E5l\u00F8v",
                                    "M\u00E5rslet",
                                    "Nakskov",
                                    "Nex\u00F8",
                                    "Nibe",
                                    "Nimtofte",
                                    "Nordborg",
                                    "Nyborg",
                                    "Nyk\u00F8bing",
                                    "Nyrup",
                                    "Nysted",
                                    "N\u00E6rum",
                                    "N\u00E6stved",
                                    "N\u00F8rager",
                                    "N\u00F8rre",
                                    "Aaby",
                                    "Alslev",
                                    "Asmindrup",
                                    "Nebel",
                                    "Snede",
                                    "N\u00F8rreballe",
                                    "N\u00F8rresundby",
                                    "Odder",
                                    "Odense",
                                    "Oksb\u00F8l",
                                    "Otterup",
                                    "Oure",
                                    "Outrup",
                                    "Padborg",
                                    "Pandrup",
                                    "Pr\u00E6st\u00F8",
                                    "Randb\u00F8l",
                                    "Randers",
                                    "Ranum",
                                    "Rask",
                                    "M\u00F8lle",
                                    "Redsted",
                                    "Regstrup",
                                    "Ribe",
                                    "Ringe",
                                    "Ringk\u00F8bing",
                                    "Ringsted",
                                    "Risskov",
                                    "Roskilde",
                                    "Roslev",
                                    "Rude",
                                    "Rudk\u00F8bing",
                                    "Ruds",
                                    "Vedby",
                                    "Rungsted",
                                    "Kyst",
                                    "Rynkeby",
                                    "Ryomg\u00E5rd",
                                    "Ryslinge",
                                    "R\u00F8dby",
                                    "R\u00F8dding",
                                    "R\u00F8dekro",
                                    "R\u00F8dk\u00E6rsbro",
                                    "R\u00F8dovre",
                                    "R\u00F8dvig",
                                    "Stevns",
                                    "R\u00F8nde",
                                    "R\u00F8nne",
                                    "R\u00F8nnede",
                                    "R\u00F8rvig",
                                    "Sabro",
                                    "Saksk\u00F8bing",
                                    "Saltum",
                                    "Sams\u00F8",
                                    "Sandved",
                                    "Sejer\u00F8",
                                    "Silkeborg",
                                    "Sindal",
                                    "Sj\u00E6llands",
                                    "Odde",
                                    "Sj\u00F8lund",
                                    "Skagen",
                                    "Skals",
                                    "Skamby",
                                    "Skanderborg",
                                    "Skibby",
                                    "Skive",
                                    "Skjern",
                                    "Skodsborg",
                                    "Skovlunde",
                                    "Sk\u00E6lsk\u00F8r",
                                    "Sk\u00E6rb\u00E6k",
                                    "Sk\u00E6vinge",
                                    "Sk\u00F8dstrup",
                                    "Sk\u00F8rping",
                                    "Sk\u00E5rup",
                                    "Slagelse",
                                    "Slangerup",
                                    "Sm\u00F8rum",
                                    "Snedsted",
                                    "Snekkersten",
                                    "Snertinge",
                                    "Solbjerg",
                                    "Solr\u00F8d",
                                    "Sommersted",
                                    "Sorring",
                                    "Sor\u00F8",
                                    "Spentrup",
                                    "Spjald",
                                    "Sporup",
                                    "Sp\u00F8ttrup",
                                    "Stakroge",
                                    "Stege",
                                    "Stenderup",
                                    "Stenlille",
                                    "Stenl\u00F8se",
                                    "Stenstrup",
                                    "Stensved",
                                    "Stoholm",
                                    "Jyll",
                                    "Stokkemarke",
                                    "Store",
                                    "Fuglede",
                                    "Heddinge",
                                    "Merl\u00F8se",
                                    "Storvorde",
                                    "Stouby",
                                    "Strandby",
                                    "Struer",
                                    "Str\u00F8by",
                                    "Stubbek\u00F8bing",
                                    "St\u00F8vring",
                                    "Suldrup",
                                    "Sulsted",
                                    "Sunds",
                                    "Svaneke",
                                    "Sveb\u00F8lle",
                                    "Svendborg",
                                    "Svenstrup",
                                    "Svinninge",
                                    "Sydals",
                                    "S\u00E6by",
                                    "S\u00F8borg",
                                    "S\u00F8by",
                                    "\u00C6r\u00F8",
                                    "S\u00F8llested",
                                    "S\u00F8nder",
                                    "Felding",
                                    "S\u00F8nderborg",
                                    "S\u00F8nders\u00F8",
                                    "S\u00F8rvad",
                                    "Taastrup",
                                    "Tappern\u00F8je",
                                    "Tarm",
                                    "Terndrup",
                                    "Them",
                                    "Thisted",
                                    "Thors\u00F8",
                                    "Thybor\u00F8n",
                                    "Thyholm",
                                    "Tik\u00F8b",
                                    "Tilst",
                                    "Tinglev",
                                    "Tistrup",
                                    "Tisvildeleje",
                                    "Tjele",
                                    "Tj\u00E6reborg",
                                    "Toftlund",
                                    "Tommerup",
                                    "Toreby",
                                    "Torrig",
                                    "Tranbjerg",
                                    "Tranek\u00E6r",
                                    "Trige",
                                    "Trustrup",
                                    "Tune",
                                    "Tureby",
                                    "Tylstrup",
                                    "T\u00F8ll\u00F8se",
                                    "T\u00F8nder",
                                    "T\u00F8rring",
                                    "T\u00E5rs",
                                    "Ugerl\u00F8se",
                                    "Uldum",
                                    "Ulfborg",
                                    "Ullerslev",
                                    "Ulstrup",
                                    "Vadum",
                                    "Valby",
                                    "Vallensb\u00E6k",
                                    "Vamdrup",
                                    "Vandel",
                                    "Vanl\u00F8se",
                                    "Varde",
                                    "Vedb\u00E6k",
                                    "Veflinge",
                                    "Vejby",
                                    "Vejen",
                                    "Vejers",
                                    "Vejle",
                                    "Vejstrup",
                                    "Veks\u00F8",
                                    "Vemb",
                                    "Vemmelev",
                                    "Vesl\u00F8s",
                                    "Vestbjerg",
                                    "Vester",
                                    "Skerninge",
                                    "Vesterborg",
                                    "Vestervig",
                                    "Viborg",
                                    "Viby",
                                    "Videb\u00E6k",
                                    "Vildbjerg",
                                    "Vils",
                                    "Vinderup",
                                    "Vipper\u00F8d",
                                    "Virum",
                                    "Vissenbjerg",
                                    "Viuf",
                                    "Vodskov",
                                    "Vojens",
                                    "Vonge",
                                    "Vorbasse",
                                    "Vordingborg",
                                    "V\u00E6ggerl\u00F8se",
                                    "V\u00E6rl\u00F8se",
                                    "\u00C6r\u00F8sk\u00F8bing",
                                    "\u00D8lgod",
                                    "\u00D8lsted",
                                    "\u00D8lstykke",
                                    "\u00D8rb\u00E6k",
                                    "\u00D8rnh\u00F8j",
                                    "\u00D8rsted",
                                    "Djurs",
                                    "\u00D8stbirk",
                                    "\u00D8ster",
                                    "Assels",
                                    "Ulslev",
                                    "\u00D8stermarie",
                                    "\u00D8stervr\u00E5",
                                    "\u00C5byh\u00F8j",
                                    "\u00C5lb\u00E6k",
                                    "\u00C5lsg\u00E5rde",
                                    "\u00C5rhus",
                                    "\u00C5rre",
                                    "\u00C5rslev",
                                    "Haarby",
                                    "Niv\u00E5",
                                    "R\u00F8m\u00F8",
                                    "Omme",
                                    "Vr\u00E5",
                                    "\u00D8rum");
                        });

        public Object kommuneNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "K\u00F8benhavn",
                                    "Frederiksberg",
                                    "Ballerup",
                                    "Br\u00F8ndby",
                                    "Drag\u00F8r",
                                    "Gentofte",
                                    "Gladsaxe",
                                    "Glostrup",
                                    "Herlev",
                                    "Albertslund",
                                    "Hvidovre",
                                    "H\u00F8je Taastrup",
                                    "Lyngby-Taarb\u00E6k",
                                    "R\u00F8dovre",
                                    "Ish\u00F8j",
                                    "T\u00E5rnby",
                                    "Vallensb\u00E6k",
                                    "Aller\u00F8d",
                                    "Fredensborg",
                                    "Helsing\u00F8r",
                                    "Hiller\u00F8d",
                                    "H\u00F8rsholm",
                                    "Rudersdal",
                                    "Egedal",
                                    "Frederikssund",
                                    "Greve",
                                    "Halsn\u00E6s",
                                    "Roskilde",
                                    "Solr\u00F8d",
                                    "Gribskov",
                                    "Odsherred",
                                    "Holb\u00E6k",
                                    "Faxe",
                                    "Kalundborg",
                                    "Ringsted",
                                    "Slagelse",
                                    "Stevns",
                                    "Sor\u00F8",
                                    "Lejre",
                                    "Lolland",
                                    "N\u00E6stved",
                                    "Guldborgsund",
                                    "Vordingborg",
                                    "Bornholm",
                                    "Middelfart",
                                    "Christians\u00F8",
                                    "Assens",
                                    "Faaborg-Midtfyn",
                                    "Kerteminde",
                                    "Nyborg",
                                    "Odense",
                                    "Svendborg",
                                    "Nordfyns",
                                    "Langeland",
                                    "\u00C6r\u00F8",
                                    "Haderslev",
                                    "Billund",
                                    "S\u00F8nderborg",
                                    "T\u00F8nder",
                                    "Esbjerg",
                                    "Fan\u00F8",
                                    "Varde",
                                    "Vejen",
                                    "Aabenraa",
                                    "Fredericia",
                                    "Horsens",
                                    "Kolding",
                                    "Vejle",
                                    "Herning",
                                    "Holstebro",
                                    "Lemvig",
                                    "Struer",
                                    "Syddjurs",
                                    "Fures\u00F8",
                                    "Norddjurs",
                                    "Favrskov",
                                    "Odder",
                                    "Randers",
                                    "Silkeborg",
                                    "Sams\u00F8",
                                    "Skanderborg",
                                    "Aarhus",
                                    "Ikast-Brande",
                                    "Ringk\u00F8bing-Skjern",
                                    "Hedensted",
                                    "Mors\u00F8",
                                    "Skive",
                                    "Thisted",
                                    "Viborg",
                                    "Br\u00F8nderslev",
                                    "Frederikshavn",
                                    "Vesthimmerlands",
                                    "L\u00E6s\u00F8",
                                    "Rebild",
                                    "Mariagerfjord",
                                    "Jammerbugt",
                                    "Aalborg",
                                    "Hj\u00F8rring",
                                    "K\u00F8ge");
                        });

        public Object regionNames =
                ZVal.arrayFromList(
                        "Region Nordjylland",
                        "Region Midtjylland",
                        "Region Syddanmark",
                        "Region Hovedstaden",
                        "Region Sj\u00E6lland");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Andorra",
                                    "Forenede Arabiske Emirater",
                                    "Afghanistan",
                                    "Antigua og Barbuda",
                                    "Anguilla",
                                    "Albanien",
                                    "Armenien",
                                    "Hollandske Antiller",
                                    "Angola",
                                    "Antarktis",
                                    "Argentina",
                                    "Amerikansk Samoa",
                                    "\u00D8strig",
                                    "Australien",
                                    "Aruba",
                                    "\u00C5land",
                                    "Aserbajdsjan",
                                    "Bosnien-Hercegovina",
                                    "Barbados",
                                    "Bangladesh",
                                    "Belgien",
                                    "Burkina Faso",
                                    "Bulgarien",
                                    "Bahrain",
                                    "Burundi",
                                    "Benin",
                                    "Saint Barth\u00E9lemy",
                                    "Bermuda",
                                    "Brunei Darussalam",
                                    "Bolivia",
                                    "Brasilien",
                                    "Bahamas",
                                    "Bhutan",
                                    "Bouvet\u00F8",
                                    "Botswana",
                                    "Hviderusland",
                                    "Belize",
                                    "Canada",
                                    "Cocos\u00F8erne",
                                    "Congo-Kinshasa",
                                    "Centralafrikanske Republik",
                                    "Congo",
                                    "Schweiz",
                                    "Elfenbenskysten",
                                    "Cook-\u00F8erne",
                                    "Chile",
                                    "Cameroun",
                                    "Kina",
                                    "Colombia",
                                    "Costa Rica",
                                    "Serbien og Montenegro",
                                    "Cuba",
                                    "Kap Verde",
                                    "Jule\u00F8en",
                                    "Cypern",
                                    "Tjekkiet",
                                    "Tyskland",
                                    "Djibouti",
                                    "Danmark",
                                    "Dominica",
                                    "Den Dominikanske Republik",
                                    "Algeriet",
                                    "Ecuador",
                                    "Estland",
                                    "Egypten",
                                    "Vestsahara",
                                    "Eritrea",
                                    "Spanien",
                                    "Etiopien",
                                    "Finland",
                                    "Fiji-\u00F8erne",
                                    "Falklands\u00F8erne",
                                    "Mikronesiens Forenede Stater",
                                    "F\u00E6r\u00F8erne",
                                    "Frankrig",
                                    "Gabon",
                                    "Storbritannien",
                                    "Grenada",
                                    "Georgien",
                                    "Fransk Guyana",
                                    "Guernsey",
                                    "Ghana",
                                    "Gibraltar",
                                    "Gr\u00F8nland",
                                    "Gambia",
                                    "Guinea",
                                    "Guadeloupe",
                                    "\u00C6kvatorialguinea",
                                    "Gr\u00E6kenland",
                                    "South Georgia og De Sydlige Sandwich\u00F8er",
                                    "Guatemala",
                                    "Guam",
                                    "Guinea-Bissau",
                                    "Guyana",
                                    "SAR Hongkong",
                                    "Heard- og McDonald-\u00F8erne",
                                    "Honduras",
                                    "Kroatien",
                                    "Haiti",
                                    "Ungarn",
                                    "Indonesien",
                                    "Irland",
                                    "Israel",
                                    "Isle of Man",
                                    "Indien",
                                    "Det Britiske Territorium i Det Indiske Ocean",
                                    "Irak",
                                    "Iran",
                                    "Island",
                                    "Italien",
                                    "Jersey",
                                    "Jamaica",
                                    "Jordan",
                                    "Japan",
                                    "Kenya",
                                    "Kirgisistan",
                                    "Cambodja",
                                    "Kiribati",
                                    "Comorerne",
                                    "Saint Kitts og Nevis",
                                    "Nordkorea",
                                    "Sydkorea",
                                    "Kuwait",
                                    "Cayman\u00F8erne",
                                    "Kasakhstan",
                                    "Laos",
                                    "Libanon",
                                    "Saint Lucia",
                                    "Liechtenstein",
                                    "Sri Lanka",
                                    "Liberia",
                                    "Lesotho",
                                    "Litauen",
                                    "Luxembourg",
                                    "Letland",
                                    "Libyen",
                                    "Marokko",
                                    "Monaco",
                                    "Republikken Moldova",
                                    "Montenegro",
                                    "Saint Martin",
                                    "Madagaskar",
                                    "Marshall\u00F8erne",
                                    "Republikken Makedonien",
                                    "Mali",
                                    "Myanmar",
                                    "Mongoliet",
                                    "SAR Macao",
                                    "Nordmarianerne",
                                    "Martinique",
                                    "Mauretanien",
                                    "Montserrat",
                                    "Malta",
                                    "Mauritius",
                                    "Maldiverne",
                                    "Malawi",
                                    "Mexico",
                                    "Malaysia",
                                    "Mozambique",
                                    "Namibia",
                                    "Ny Caledonien",
                                    "Niger",
                                    "Norfolk Island",
                                    "Nigeria",
                                    "Nicaragua",
                                    "Holland",
                                    "Norge",
                                    "Nepal",
                                    "Nauru",
                                    "Niue",
                                    "New Zealand",
                                    "Oman",
                                    "Panama",
                                    "Peru",
                                    "Fransk Polynesien",
                                    "Papua Ny Guinea",
                                    "Filippinerne",
                                    "Pakistan",
                                    "Polen",
                                    "Saint Pierre og Miquelon",
                                    "Pitcairn",
                                    "Puerto Rico",
                                    "De pal\u00E6stinensiske omr\u00E5der",
                                    "Portugal",
                                    "Palau",
                                    "Paraguay",
                                    "Qatar",
                                    "Reunion",
                                    "Rum\u00E6nien",
                                    "Serbien",
                                    "Rusland",
                                    "Rwanda",
                                    "Saudi-Arabien",
                                    "Salomon\u00F8erne",
                                    "Seychellerne",
                                    "Sudan",
                                    "Sverige",
                                    "Singapore",
                                    "St. Helena",
                                    "Slovenien",
                                    "Svalbard og Jan Mayen",
                                    "Slovakiet",
                                    "Sierra Leone",
                                    "San Marino",
                                    "Senegal",
                                    "Somalia",
                                    "Surinam",
                                    "Sao Tome og Principe",
                                    "El Salvador",
                                    "Syrien",
                                    "Swaziland",
                                    "Turks- og Caicos\u00F8erne",
                                    "Tchad",
                                    "Franske Besiddelser i Det Sydlige Indiske Ocean",
                                    "Togo",
                                    "Thailand",
                                    "Tadsjikistan",
                                    "Tokelau",
                                    "Timor-Leste",
                                    "Turkmenistan",
                                    "Tunesien",
                                    "Tonga",
                                    "Tyrkiet",
                                    "Trinidad og Tobago",
                                    "Tuvalu",
                                    "Taiwan",
                                    "Tanzania",
                                    "Ukraine",
                                    "Uganda",
                                    "De Mindre Amerikanske Overs\u00F8iske \u00D8er",
                                    "USA",
                                    "Uruguay",
                                    "Usbekistan",
                                    "Vatikanstaten",
                                    "St. Vincent og Grenadinerne",
                                    "Venezuela",
                                    "De britiske jomfru\u00F8er",
                                    "De amerikanske jomfru\u00F8er",
                                    "Vietnam",
                                    "Vanuatu",
                                    "Wallis og Futuna\u00F8erne",
                                    "Samoa",
                                    "Yemen",
                                    "Mayotte",
                                    "Sydafrika",
                                    "Zambia",
                                    "Zimbabwe");
                        });

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{lastName}}{{streetSuffix}}",
                        "{{middleName}}{{streetSuffix}}",
                        "{{lastName}} {{streetSuffixWord}}",
                        "{{middleName}} {{streetSuffixWord}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}}, {{buildingLevel}}",
                        "{{streetName}} {{buildingNumber}}, {{buildingLevel}} {{buildingSide}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{postcode}} {{city}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\da_DK\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingLevel",
                            "buildingNumber",
                            "buildingSide",
                            "cityFormats",
                            "cityNames",
                            "citySuffix",
                            "country",
                            "kommuneNames",
                            "postcode",
                            "regionNames",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix",
                            "streetSuffixWord")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/da_DK/Address.php")
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
