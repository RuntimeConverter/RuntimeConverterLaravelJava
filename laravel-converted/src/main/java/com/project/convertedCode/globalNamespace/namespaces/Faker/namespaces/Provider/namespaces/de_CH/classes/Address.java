package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.de_CH.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/de_CH/Address.php

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
                                                                .de_CH
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
                                                        .de_CH
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
                                                                .de_CH
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
                                                        .de_CH
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
                                                                .de_CH
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
                                                        .de_CH
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetSuffixLong)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\de_CH\\Address";

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
                                                            .de_CH
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
                                                                                    .de_CH
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
                ZVal.arrayFromList("Gasse", "Platz", "Ring", "Strasse", "Weg", "Allee");

        public Object streetSuffixShort =
                ZVal.arrayFromList("gasse", "platz", "ring", "strasse", "str.", "weg", "allee");

        public Object postcode = ZVal.arrayFromList("####");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aarau",
                                    "Aarberg",
                                    "Aarburg",
                                    "Adliswil",
                                    "Aesch",
                                    "Affoltern am Albis",
                                    "Agno",
                                    "Aigle",
                                    "Allschwil",
                                    "Altdorf",
                                    "Altst\u00E4tten",
                                    "Amriswil",
                                    "Appenzell",
                                    "Arbon",
                                    "Arth",
                                    "Ascona",
                                    "Aubonne",
                                    "Avenches",
                                    "Baar",
                                    "Bad Zurzach",
                                    "Baden",
                                    "Basel",
                                    "Bassersdorf",
                                    "Bellinzona",
                                    "Belp",
                                    "Bern",
                                    "Berom\u00FCnster",
                                    "Biasca",
                                    "Biel/Bienne",
                                    "Binningen",
                                    "Birsfelden",
                                    "Bischofszell",
                                    "Boudry",
                                    "Bourg-Saint-Pierre",
                                    "Bremgarten",
                                    "Brig-Glis",
                                    "Brig",
                                    "Brugg",
                                    "Buchs",
                                    "Bulle",
                                    "Burgdorf",
                                    "B\u00FClach",
                                    "Carouge",
                                    "Cham",
                                    "Chur",
                                    "Ch\u00E2tel-Saint-Denis",
                                    "Ch\u00EAne-Bougeries",
                                    "Conthey",
                                    "Coppet",
                                    "Cossonay",
                                    "Croglio",
                                    "Cudrefin",
                                    "Cully",
                                    "Davos",
                                    "Delsberg",
                                    "Diessenhofen",
                                    "Dietikon",
                                    "D\u00FCbendorf",
                                    "Ebikon",
                                    "Echallens",
                                    "Ecublens",
                                    "Eglisau",
                                    "Einsiedeln",
                                    "Elgg",
                                    "Emmen",
                                    "Erlach",
                                    "Estavayer-le-Lac",
                                    "Flawil",
                                    "Frauenfeld",
                                    "Freiburg",
                                    "Freienbach",
                                    "F\u00FCrstenau",
                                    "Genf",
                                    "Gland",
                                    "Glarus",
                                    "Gordola",
                                    "Gossau",
                                    "Grandcour",
                                    "Grandson",
                                    "Greifensee",
                                    "Grenchen",
                                    "Greyerz",
                                    "Gr\u00FCningen",
                                    "Herisau",
                                    "Hermance",
                                    "Hinwil",
                                    "Horgen",
                                    "Horw",
                                    "Huttwil",
                                    "Ilanz",
                                    "Illnau-Effretikon",
                                    "Ittigen",
                                    "Kaiserstuhl",
                                    "Klingnau",
                                    "Kloten",
                                    "Kreuzlingen",
                                    "Kriens",
                                    "K\u00F6niz",
                                    "K\u00FCsnacht",
                                    "La Chaux-de-Fonds",
                                    "La Neuveville",
                                    "La Sarraz",
                                    "La Tour-de-Peilz",
                                    "La Tour-de-Tr\u00EAme",
                                    "Lachen",
                                    "Lancy",
                                    "Langenthal",
                                    "Laufen",
                                    "Laufenburg",
                                    "Laupen",
                                    "Lausanne",
                                    "Le Grand-Saconnex",
                                    "Le Landeron",
                                    "Le Locle",
                                    "Lenzburg",
                                    "Les Cl\u00E9es",
                                    "Leuk",
                                    "Lichtensteig",
                                    "Liestal",
                                    "Locarno",
                                    "Losone",
                                    "Lugano",
                                    "Lutry",
                                    "Luzern",
                                    "Lyss",
                                    "Maienfeld",
                                    "Martigny",
                                    "Meilen",
                                    "Mellingen",
                                    "Mendrisio",
                                    "Meyrin",
                                    "Monthey",
                                    "Montreux",
                                    "Morcote",
                                    "Morges",
                                    "Moudon",
                                    "Moutier",
                                    "Muri bei Bern",
                                    "Murten",
                                    "Muttenz",
                                    "M\u00E4nnedorf",
                                    "M\u00F6hlin",
                                    "M\u00FCnchenstein",
                                    "M\u00FCnsingen",
                                    "Neuenburg",
                                    "Neuhausen am Rheinfall",
                                    "Neunkirch",
                                    "Nidau",
                                    "Nyon",
                                    "Oberwil",
                                    "Oftringen",
                                    "Olten",
                                    "Onex",
                                    "Opfikon",
                                    "Orbe",
                                    "Orsi\u00E8res",
                                    "Ostermundigen",
                                    "Payerne",
                                    "Pf\u00E4ffikon",
                                    "Plan-les-Ouates",
                                    "Pratteln",
                                    "Prilly",
                                    "Pruntrut",
                                    "Pully",
                                    "Rapperswil-Jona",
                                    "Regensberg",
                                    "Regensdorf",
                                    "Reinach",
                                    "Renens",
                                    "Rheinau",
                                    "Rheineck",
                                    "Rheinfelden",
                                    "Richterswil",
                                    "Riehen",
                                    "Risch",
                                    "Riva San Vitale",
                                    "Rolle",
                                    "Romainm\u00F4tier",
                                    "Romanshorn",
                                    "Romont",
                                    "Rorschach",
                                    "Rue",
                                    "R\u00FCti",
                                    "Saillon",
                                    "Saint-Maurice",
                                    "Saint-Prex",
                                    "Saint-Ursanne",
                                    "Sala",
                                    "Sargans",
                                    "Sarnen",
                                    "Schaffhausen",
                                    "Schlieren",
                                    "Schwyz",
                                    "Sembrancher",
                                    "Sempach",
                                    "Siders",
                                    "Sitten",
                                    "Solothurn",
                                    "Spiez",
                                    "Spl\u00FCgen",
                                    "Spreitenbach",
                                    "St. Gallen",
                                    "Stans",
                                    "Steckborn",
                                    "Steffisburg",
                                    "Stein am Rhein",
                                    "St\u00E4fa",
                                    "Sursee",
                                    "Thalwil",
                                    "Thun",
                                    "Thusis",
                                    "Th\u00F4nex",
                                    "Unterseen",
                                    "Uster",
                                    "Uznach",
                                    "Uzwil",
                                    "Val-de-Travers NE",
                                    "Valangin",
                                    "Vernier",
                                    "Versoix",
                                    "Vevey",
                                    "Veyrier GE",
                                    "Villars-sur-Gl\u00E2ne",
                                    "Villeneuve",
                                    "Visp",
                                    "Volketswil",
                                    "Waldenburg",
                                    "Walenstadt",
                                    "Wallisellen",
                                    "Wangen an der Aare",
                                    "Weinfelden",
                                    "Werdenberg",
                                    "Wettingen",
                                    "Wetzikon",
                                    "Wiedlisbach",
                                    "Willisau",
                                    "Wil",
                                    "Winterthur",
                                    "Wohlen",
                                    "Worb",
                                    "W\u00E4denswil",
                                    "Yverdon-les-Bains",
                                    "Zofingen",
                                    "Zollikon",
                                    "Zug",
                                    "Z\u00FCrich");
                        });

        public Object canton =
                ZVal.newArray(
                        new ZPair(0, ZVal.newArray(new ZPair("AG", "Aargau"))),
                        new ZPair(1, ZVal.newArray(new ZPair("AI", "Appenzell\u00A0Innerrhoden"))),
                        new ZPair(2, ZVal.newArray(new ZPair("AR", "Appenzell\u00A0Ausserrhoden"))),
                        new ZPair(3, ZVal.newArray(new ZPair("BE", "Bern"))),
                        new ZPair(4, ZVal.newArray(new ZPair("BL", "Basel-Landschaft"))),
                        new ZPair(5, ZVal.newArray(new ZPair("BS", "Basel-Stadt"))),
                        new ZPair(6, ZVal.newArray(new ZPair("FR", "Freiburg"))),
                        new ZPair(7, ZVal.newArray(new ZPair("GE", "Genf"))),
                        new ZPair(8, ZVal.newArray(new ZPair("GL", "Glarus"))),
                        new ZPair(9, ZVal.newArray(new ZPair("GR", "Graub\u00FCnden"))),
                        new ZPair(10, ZVal.newArray(new ZPair("JU", "Jura"))),
                        new ZPair(11, ZVal.newArray(new ZPair("LU", "Luzern"))),
                        new ZPair(12, ZVal.newArray(new ZPair("NE", "Neuenburg"))),
                        new ZPair(13, ZVal.newArray(new ZPair("NW", "Nidwalden"))),
                        new ZPair(14, ZVal.newArray(new ZPair("OW", "Obwalden"))),
                        new ZPair(15, ZVal.newArray(new ZPair("SG", "St.\u00A0Gallen"))),
                        new ZPair(16, ZVal.newArray(new ZPair("SH", "Schaffhausen"))),
                        new ZPair(17, ZVal.newArray(new ZPair("SO", "Solothurn"))),
                        new ZPair(18, ZVal.newArray(new ZPair("SZ", "Schwyz"))),
                        new ZPair(19, ZVal.newArray(new ZPair("TG", "Thurgau"))),
                        new ZPair(20, ZVal.newArray(new ZPair("TI", "Tessin"))),
                        new ZPair(21, ZVal.newArray(new ZPair("UR", "Uri"))),
                        new ZPair(22, ZVal.newArray(new ZPair("VD", "Waadt"))),
                        new ZPair(23, ZVal.newArray(new ZPair("VS", "Wallis"))),
                        new ZPair(24, ZVal.newArray(new ZPair("ZG", "Zug"))),
                        new ZPair(25, ZVal.newArray(new ZPair("ZH", "Z\u00FCrich"))));

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
                                    "\u00C4usseres Ozeanien",
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
                        "{{cityName}}{{streetSuffixShort}}",
                        "{{firstName}}-{{lastName}}-{{streetSuffixLong}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{postcode}} {{city}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\de_CH\\Address")
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
                            "country",
                            "postcode",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffixLong",
                            "streetSuffixShort")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/de_CH/Address.php")
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
