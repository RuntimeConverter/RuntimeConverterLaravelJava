package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.de_AT.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/de_AT/Address.php

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
                                                                .de_AT
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
                                                        .de_AT
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    @ConvertedMethod
    public Object streetSuffixShort(RuntimeEnv env, Object... args) {
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
                                                                .de_AT
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetSuffixShort")))
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
                                                        .de_AT
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetSuffixShort)
                        .value());
    }

    @ConvertedMethod
    public Object streetSuffixLong(RuntimeEnv env, Object... args) {
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
                                                                .de_AT
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetSuffixLong")))
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
                                                        .de_AT
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetSuffixLong)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\de_AT\\Address";

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
                                                            .de_AT
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }

        @ConvertedMethod
        public Object buildingNumber(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("regexify")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    runtimeStaticObject.numerify(
                                            env,
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
                                                                                    .de_AT
                                                                                    .classes
                                                                                    .Address
                                                                                    .RequestStaticProperties
                                                                                    .class)
                                                                    .buildingNumber)
                                                    .value()))
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#", "##[abc]", "#[abc]");

        public Object streetSuffixLong =
                ZVal.arrayFromList("Gasse", "Platz", "Ring", "Stra\u00DFe", "Weg");

        public Object streetSuffixShort =
                ZVal.arrayFromList("gasse", "platz", "ring", "stra\u00DFe", "weg");

        public Object postcode = ZVal.arrayFromList("####");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Allentsteig",
                                    "Altheim",
                                    "Althofen",
                                    "Amstetten",
                                    "Ansfelden",
                                    "Attnang-Puchheim",
                                    "Bad Aussee",
                                    "Bad Hall",
                                    "Bad Ischl",
                                    "Bad Leonfelden",
                                    "Bad Radkersburg",
                                    "Bad Sankt Leonhard im Lavanttal",
                                    "Bad V\u00F6slau",
                                    "Baden",
                                    "B\u00E4rnbach",
                                    "Berndorf",
                                    "Bischofshofen",
                                    "Bleiburg",
                                    "Bludenz",
                                    "Braunau am Inn",
                                    "Bregenz",
                                    "Bruck an der Leitha",
                                    "Bruck an der Mur",
                                    "Deutsch-Wagram",
                                    "Deutschlandsberg",
                                    "Dornbirn",
                                    "Drosendorf-Zissersdorf 1",
                                    "D\u00FCrnstein",
                                    "Ebenfurth",
                                    "Ebreichsdorf",
                                    "Eferding",
                                    "Eggenburg",
                                    "Eisenerz",
                                    "Eisenstadt",
                                    "Enns",
                                    "Fehring",
                                    "Feldbach",
                                    "Feldkirch",
                                    "Feldkirchen",
                                    "Ferlach",
                                    "Fischamend",
                                    "Frauenkirchen",
                                    "Freistadt",
                                    "Friedberg",
                                    "Friesach",
                                    "Frohnleiten",
                                    "F\u00FCrstenfeld",
                                    "Gallneukirchen",
                                    "G\u00E4nserndorf",
                                    "Geras",
                                    "Gerasdorf bei Wien",
                                    "Gf\u00F6hl",
                                    "Gleisdorf",
                                    "Gloggnitz",
                                    "Gm\u00FCnd",
                                    "Gm\u00FCnd in K\u00E4rnten",
                                    "Gmunden",
                                    "Graz",
                                    "Grein",
                                    "Grieskirchen",
                                    "Gro\u00DF-Enzersdorf",
                                    "Gro\u00DF-Gerungs",
                                    "Gro\u00DF-Siegharts",
                                    "G\u00FCssing",
                                    "Haag",
                                    "Hainburg an der Donau",
                                    "Hainfeld",
                                    "Hall in Tirol",
                                    "Hallein",
                                    "Hardegg",
                                    "Hartberg",
                                    "Heidenreichstein",
                                    "Hermagor-Pressegger See",
                                    "Herzogenburg",
                                    "Hohenems",
                                    "Hollabrunn",
                                    "Horn",
                                    "Imst",
                                    "Innsbruck",
                                    "Jennersdorf",
                                    "Judenburg",
                                    "Kapfenberg",
                                    "Kindberg",
                                    "Kirchdorf an der Krems",
                                    "Kirchschlag in der Buckligen Welt",
                                    "Kitzb\u00FChel",
                                    "Klagenfurt",
                                    "Klosterneuburg",
                                    "Knittelfeld",
                                    "K\u00F6flach",
                                    "Korneuburg",
                                    "Krems an der Donau",
                                    "Kufstein",
                                    "Laa an der Thaya",
                                    "Laakirchen",
                                    "Landeck",
                                    "Langenlois",
                                    "Leibnitz",
                                    "Leoben",
                                    "Leonding",
                                    "Lienz",
                                    "Liezen",
                                    "Lilienfeld",
                                    "Linz",
                                    "Litschau",
                                    "Maissau",
                                    "Mank",
                                    "Mannersdorf am Leithagebirge",
                                    "Marchegg",
                                    "Marchtrenk",
                                    "Mariazell",
                                    "Mattersburg",
                                    "Mattighofen",
                                    "Mautern an der Donau",
                                    "Melk",
                                    "Mistelbach an der Zaya",
                                    "M\u00F6dling",
                                    "Murau",
                                    "Mureck",
                                    "M\u00FCrzzuschlag",
                                    "Neufeld an der Leitha",
                                    "Neulengbach",
                                    "Neumarkt am Wallersee",
                                    "Neunkirchen",
                                    "Neusiedl am See",
                                    "Oberndorf bei Salzburg",
                                    "Oberpullendorf",
                                    "Oberwart",
                                    "Oberw\u00E4lz",
                                    "Perg",
                                    "Peuerbach",
                                    "Pinkafeld",
                                    "P\u00F6chlarn",
                                    "Poysdorf",
                                    "Pregarten",
                                    "Pulkau",
                                    "Purbach am Neusiedler See",
                                    "Purkersdorf",
                                    "Raabs an der Thaya",
                                    "Radenthein",
                                    "Radstadt",
                                    "Rattenberg",
                                    "Retz",
                                    "Ried im Innkreis",
                                    "Rohrbach in Ober\u00F6sterreich",
                                    "Rottenmann",
                                    "Rust",
                                    "Saalfelden am Steinernen Meer",
                                    "Salzburg",
                                    "Sankt Andr\u00E4 im Lavanttal",
                                    "Sankt Johann im Pongau",
                                    "Sankt P\u00F6lten",
                                    "Sankt Valentin",
                                    "Sankt Veit an der Glan",
                                    "Sch\u00E4rding",
                                    "Scheibbs",
                                    "Schladming",
                                    "Schrattenthal",
                                    "Schrems",
                                    "Schwanenstadt",
                                    "Schwaz",
                                    "Schwechat",
                                    "Seekirchen am Wallersee",
                                    "Spittal an der Drau",
                                    "Stadtschlaining",
                                    "Steyr",
                                    "Steyregg",
                                    "Stockerau",
                                    "Stra\u00DFburg",
                                    "Ternitz",
                                    "Traiskirchen",
                                    "Traismauer",
                                    "Traun",
                                    "Trieben",
                                    "Trofaiach",
                                    "Tulln an der Donau",
                                    "Villach",
                                    "Vils",
                                    "V\u00F6cklabruck",
                                    "Voitsberg",
                                    "V\u00F6lkermarkt",
                                    "Waidhofen an der Thaya",
                                    "Waidhofen an der Ybbs",
                                    "Weitra",
                                    "Weiz",
                                    "Wels",
                                    "Wien",
                                    "Wiener Neustadt",
                                    "Wieselburg",
                                    "Wilhelmsburg",
                                    "Wolfsberg",
                                    "Wolkersdorf",
                                    "W\u00F6rgl",
                                    "Ybbs an der Donau",
                                    "Zell am See",
                                    "Zeltweg",
                                    "Zistersdorf",
                                    "Zwettl");
                        });

        public Object state =
                ZVal.arrayFromList(
                        "Burgenland",
                        "K\u00E4rnten",
                        "Nieder\u00F6sterreich",
                        "Ober\u00F6sterreich",
                        "Salzburg",
                        "Steiermark",
                        "Tirol",
                        "Vorarlberg",
                        "Wien");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afghanistan",
                                    "Alandinseln",
                                    "Albanien",
                                    "Algerien",
                                    "Amerikanisch-Ozeanien",
                                    "Amerikanisch-Samoa",
                                    "Amerikanische Jungferninseln",
                                    "Andorra",
                                    "Angola",
                                    "Anguilla",
                                    "Antarktis",
                                    "Antigua und Barbuda",
                                    "Argentinien",
                                    "Armenien",
                                    "Aruba",
                                    "Aserbaidschan",
                                    "Australien",
                                    "\u00C4gypten",
                                    "\u00C4quatorialguinea",
                                    "\u00C4thiopien",
                                    "\u00C4u\u00DFeres Ozeanien",
                                    "Bahamas",
                                    "Bahrain",
                                    "Bangladesch",
                                    "Barbados",
                                    "Belarus",
                                    "Belgien",
                                    "Belize",
                                    "Benin",
                                    "Bermuda",
                                    "Bhutan",
                                    "Bolivien",
                                    "Bosnien und Herzegowina",
                                    "Botsuana",
                                    "Bouvetinsel",
                                    "Brasilien",
                                    "Britische Jungferninseln",
                                    "Britisches Territorium im Indischen Ozean",
                                    "Brunei Darussalam",
                                    "Bulgarien",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Chile",
                                    "China",
                                    "Cookinseln",
                                    "Costa Rica",
                                    "C\u00F4te d\u2019Ivoire",
                                    "Demokratische Republik Kongo",
                                    "Demokratische Volksrepublik Korea",
                                    "Deutschland",
                                    "Dominica",
                                    "Dominikanische Republik",
                                    "Dschibuti",
                                    "D\u00E4nemark",
                                    "Ecuador",
                                    "El Salvador",
                                    "Eritrea",
                                    "Estland",
                                    "Europ\u00E4ische Union",
                                    "Falklandinseln",
                                    "Fidschi",
                                    "Finnland",
                                    "Frankreich",
                                    "Franz\u00F6sisch-Guayana",
                                    "Franz\u00F6sisch-Polynesien",
                                    "Franz\u00F6sische S\u00FCd- und Antarktisgebiete",
                                    "F\u00E4r\u00F6er",
                                    "Gabun",
                                    "Gambia",
                                    "Georgien",
                                    "Ghana",
                                    "Gibraltar",
                                    "Grenada",
                                    "Griechenland",
                                    "Gr\u00F6nland",
                                    "Guadeloupe",
                                    "Guam",
                                    "Guatemala",
                                    "Guernsey",
                                    "Guinea",
                                    "Guinea-Bissau",
                                    "Guyana",
                                    "Haiti",
                                    "Heard- und McDonald-Inseln",
                                    "Honduras",
                                    "Indien",
                                    "Indonesien",
                                    "Irak",
                                    "Iran",
                                    "Irland",
                                    "Island",
                                    "Isle of Man",
                                    "Israel",
                                    "Italien",
                                    "Jamaika",
                                    "Japan",
                                    "Jemen",
                                    "Jersey",
                                    "Jordanien",
                                    "Kaimaninseln",
                                    "Kambodscha",
                                    "Kamerun",
                                    "Kanada",
                                    "Kap Verde",
                                    "Kasachstan",
                                    "Katar",
                                    "Kenia",
                                    "Kirgisistan",
                                    "Kiribati",
                                    "Kokosinseln",
                                    "Kolumbien",
                                    "Komoren",
                                    "Kongo",
                                    "Kroatien",
                                    "Kuba",
                                    "Kuwait",
                                    "Laos",
                                    "Lesotho",
                                    "Lettland",
                                    "Libanon",
                                    "Liberia",
                                    "Libyen",
                                    "Liechtenstein",
                                    "Litauen",
                                    "Luxemburg",
                                    "Madagaskar",
                                    "Malawi",
                                    "Malaysia",
                                    "Malediven",
                                    "Mali",
                                    "Malta",
                                    "Marokko",
                                    "Marshallinseln",
                                    "Martinique",
                                    "Mauretanien",
                                    "Mauritius",
                                    "Mayotte",
                                    "Mazedonien",
                                    "Mexiko",
                                    "Mikronesien",
                                    "Monaco",
                                    "Mongolei",
                                    "Montenegro",
                                    "Montserrat",
                                    "Mosambik",
                                    "Myanmar",
                                    "Namibia",
                                    "Nauru",
                                    "Nepal",
                                    "Neukaledonien",
                                    "Neuseeland",
                                    "Nicaragua",
                                    "Niederlande",
                                    "Niederl\u00E4ndische Antillen",
                                    "Niger",
                                    "Nigeria",
                                    "Niue",
                                    "Norfolkinsel",
                                    "Norwegen",
                                    "N\u00F6rdliche Marianen",
                                    "Oman",
                                    "Osttimor",
                                    "\u00D6sterreich",
                                    "Pakistan",
                                    "Palau",
                                    "Pal\u00E4stinensische Gebiete",
                                    "Panama",
                                    "Papua-Neuguinea",
                                    "Paraguay",
                                    "Peru",
                                    "Philippinen",
                                    "Pitcairn",
                                    "Polen",
                                    "Portugal",
                                    "Puerto Rico",
                                    "Republik Korea",
                                    "Republik Moldau",
                                    "Ruanda",
                                    "Rum\u00E4nien",
                                    "Russische F\u00F6deration",
                                    "R\u00E9union",
                                    "Salomonen",
                                    "Sambia",
                                    "Samoa",
                                    "San Marino",
                                    "Saudi-Arabien",
                                    "Schweden",
                                    "Schweiz",
                                    "Senegal",
                                    "Serbien",
                                    "Serbien und Montenegro",
                                    "Seychellen",
                                    "Sierra Leone",
                                    "Simbabwe",
                                    "Singapur",
                                    "Slowakei",
                                    "Slowenien",
                                    "Somalia",
                                    "Sonderverwaltungszone Hongkong",
                                    "Sonderverwaltungszone Macao",
                                    "Spanien",
                                    "Sri Lanka",
                                    "St. Barth\u00E9lemy",
                                    "St. Helena",
                                    "St. Kitts und Nevis",
                                    "St. Lucia",
                                    "St. Martin",
                                    "St. Pierre und Miquelon",
                                    "St. Vincent und die Grenadinen",
                                    "Sudan",
                                    "Suriname",
                                    "Svalbard und Jan Mayen",
                                    "Swasiland",
                                    "Syrien",
                                    "S\u00E3o Tom\u00E9 und Pr\u00EDncipe",
                                    "S\u00FCdafrika",
                                    "S\u00FCdgeorgien und die S\u00FCdlichen Sandwichinseln",
                                    "Tadschikistan",
                                    "Taiwan",
                                    "Tansania",
                                    "Thailand",
                                    "Togo",
                                    "Tokelau",
                                    "Tonga",
                                    "Trinidad und Tobago",
                                    "Tschad",
                                    "Tschechische Republik",
                                    "Tunesien",
                                    "Turkmenistan",
                                    "Turks- und Caicosinseln",
                                    "Tuvalu",
                                    "T\u00FCrkei",
                                    "Uganda",
                                    "Ukraine",
                                    "Unbekannte oder ung\u00FCltige Region",
                                    "Ungarn",
                                    "Uruguay",
                                    "Usbekistan",
                                    "Vanuatu",
                                    "Vatikanstadt",
                                    "Venezuela",
                                    "Vereinigte Arabische Emirate",
                                    "Vereinigte Staaten",
                                    "Vereinigtes K\u00F6nigreich",
                                    "Vietnam",
                                    "Wallis und Futuna",
                                    "Weihnachtsinsel",
                                    "Westsahara",
                                    "Zentralafrikanische Republik",
                                    "Zypern");
                        });

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{lastName}}{{streetSuffixShort}}",
                        "{{firstName}}-{{lastName}}-{{streetSuffixLong}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{postcode}} {{city}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\de_AT\\Address")
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
                            "state",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffixLong",
                            "streetSuffixShort")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/de_AT/Address.php")
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
