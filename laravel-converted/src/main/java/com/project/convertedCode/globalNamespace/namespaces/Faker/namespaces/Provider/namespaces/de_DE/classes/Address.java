package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.de_DE.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/de_DE/Address.php

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
                                                                .de_DE
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
                                                        .de_DE
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
                                                                .de_DE
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
                                                        .de_DE
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
                                                                .de_DE
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
                                                        .de_DE
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetSuffixLong)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\de_DE\\Address";

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
                                                            .de_DE
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
                                                                                    .de_DE
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

        public Object buildingNumber =
                ZVal.arrayFromList("###", "##", "#", "#/#", "##[abc]", "#[abc]");

        public Object streetSuffixLong =
                ZVal.arrayFromList("Gasse", "Platz", "Ring", "Stra\u00DFe", "Weg", "Allee");

        public Object streetSuffixShort =
                ZVal.arrayFromList("gasse", "platz", "ring", "stra\u00DFe", "str.", "weg", "allee");

        public Object postcode = ZVal.arrayFromList("#####");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aachen",
                                    "Aalen",
                                    "Achern",
                                    "Achim",
                                    "Ahaus",
                                    "Ahlen",
                                    "Ahrensburg",
                                    "Aichach",
                                    "Albstadt",
                                    "Alfter",
                                    "Alsdorf",
                                    "Altenburg",
                                    "Amberg",
                                    "Andernach",
                                    "Annaberg-Buchholz",
                                    "Ansbach",
                                    "Apolda",
                                    "Arnsberg",
                                    "Arnstadt",
                                    "Aschaffenburg",
                                    "Aschersleben",
                                    "Attendorn",
                                    "Augsburg",
                                    "Aurich",
                                    "Backnang",
                                    "Bad Harzburg",
                                    "Bad Hersfeld",
                                    "Bad Homburg vor der H\u00F6he",
                                    "Bad Honnef",
                                    "Bad Kissingen",
                                    "Bad Kreuznach",
                                    "Bad Mergentheim",
                                    "Bad Nauheim",
                                    "Bad Neuenahr-Ahrweiler",
                                    "Bad Oeynhausen",
                                    "Bad Oldesloe",
                                    "Bad Rappenau",
                                    "Bad Salzuflen",
                                    "Bad Soden am Taunus",
                                    "Bad Vilbel",
                                    "Bad Waldsee",
                                    "Bad Zwischenahn",
                                    "Baden-Baden",
                                    "Baesweiler",
                                    "Balingen",
                                    "Bamberg",
                                    "Barsinghausen",
                                    "Baunatal",
                                    "Bautzen",
                                    "Bayreuth",
                                    "Beckum",
                                    "Bedburg",
                                    "Bensheim",
                                    "Bergheim",
                                    "Bergisch Gladbach",
                                    "Bergkamen",
                                    "Berlin",
                                    "Bernau bei Berlin",
                                    "Bernburg (Saale)",
                                    "Biberach an der Ri\u00DF",
                                    "Bielefeld",
                                    "Bietigheim-Bissingen",
                                    "Bingen am Rhein",
                                    "Bitterfeld-Wolfen",
                                    "Blankenburg (Harz)",
                                    "Blankenfelde-Mahlow",
                                    "Blieskastel",
                                    "B\u00F6blingen",
                                    "Bocholt",
                                    "Bochum",
                                    "Bonn",
                                    "Borken",
                                    "Bornheim",
                                    "Bottrop",
                                    "Bramsche",
                                    "Brandenburg an der Havel",
                                    "Braunschweig",
                                    "Bremen",
                                    "Bremerhaven",
                                    "Bretten",
                                    "Brilon",
                                    "Bruchk\u00F6bel",
                                    "Bruchsal",
                                    "Br\u00FChl",
                                    "Buchholz in der Nordheide",
                                    "B\u00FCdingen",
                                    "B\u00FChl",
                                    "B\u00FCnde",
                                    "B\u00FCren",
                                    "Burg",
                                    "Burgdorf",
                                    "Burgwedel",
                                    "Butzbach",
                                    "Buxtehude",
                                    "Calw",
                                    "Castrop-Rauxel",
                                    "Celle",
                                    "Chemnitz",
                                    "Cloppenburg",
                                    "Coburg",
                                    "Coesfeld",
                                    "Coswig",
                                    "Cottbus",
                                    "Crailsheim",
                                    "Cuxhaven",
                                    "Dachau",
                                    "Darmstadt",
                                    "Datteln",
                                    "Deggendorf",
                                    "Delbr\u00FCck",
                                    "Delitzsch",
                                    "Delmenhorst",
                                    "Dessau-Ro\u00DFlau",
                                    "Detmold",
                                    "Dietzenbach",
                                    "Dillenburg",
                                    "Dillingen/Saar",
                                    "Dinslaken",
                                    "Ditzingen",
                                    "D\u00F6beln",
                                    "Donaueschingen",
                                    "Dormagen",
                                    "Dorsten",
                                    "Dortmund",
                                    "Dreieich",
                                    "Dresden",
                                    "Duderstadt",
                                    "Duisburg",
                                    "D\u00FClmen",
                                    "D\u00FCren",
                                    "D\u00FCsseldorf",
                                    "Eberswalde",
                                    "Eckernf\u00F6rde",
                                    "Edewecht",
                                    "Ehingen",
                                    "Einbeck",
                                    "Eisenach",
                                    "Eisenh\u00FCttenstadt",
                                    "Eisleben, Lutherstadt",
                                    "Eislingen/Fils",
                                    "Ellwangen (Jagst)",
                                    "Elmshorn",
                                    "Elsdorf",
                                    "Emden",
                                    "Emmendingen",
                                    "Emmerich am Rhein",
                                    "Emsdetten",
                                    "Enger",
                                    "Ennepetal",
                                    "Ennigerloh",
                                    "Eppingen",
                                    "Erding",
                                    "Erftstadt",
                                    "Erfurt",
                                    "Erkelenz",
                                    "Erkrath",
                                    "Erlangen",
                                    "Eschborn",
                                    "Eschweiler",
                                    "Espelkamp",
                                    "Essen",
                                    "Esslingen am Neckar",
                                    "Ettlingen",
                                    "Euskirchen",
                                    "Falkensee",
                                    "Fellbach",
                                    "Filderstadt",
                                    "Flensburg",
                                    "Fl\u00F6rsheim am Main",
                                    "Forchheim",
                                    "Frankenthal (Pfalz)",
                                    "Frankfurt (Oder)",
                                    "Frankfurt am Main",
                                    "Frechen",
                                    "Freiberg",
                                    "Freiburg im Breisgau",
                                    "Freising",
                                    "Freital",
                                    "Freudenstadt",
                                    "Friedberg",
                                    "Friedberg (Hessen)",
                                    "Friedrichsdorf",
                                    "Friedrichshafen",
                                    "Friesoythe",
                                    "Fr\u00F6ndenberg/Ruhr",
                                    "Fulda",
                                    "F\u00FCrstenfeldbruck",
                                    "F\u00FCrstenwalde/Spree",
                                    "F\u00FCrth",
                                    "Gaggenau",
                                    "Ganderkesee",
                                    "Garbsen",
                                    "Gardelegen",
                                    "Garmisch-Partenkirchen",
                                    "Gauting",
                                    "Geesthacht",
                                    "Geestland",
                                    "Geilenkirchen",
                                    "Geislingen an der Steige",
                                    "Geldern",
                                    "Gelnhausen",
                                    "Gelsenkirchen",
                                    "Georgsmarienh\u00FCtte",
                                    "Gera",
                                    "Geretsried",
                                    "Germering",
                                    "Germersheim",
                                    "Gersthofen",
                                    "Geseke",
                                    "Gevelsberg",
                                    "Gie\u00DFen",
                                    "Gifhorn",
                                    "Gladbeck",
                                    "Glauchau",
                                    "Goch",
                                    "G\u00F6ppingen",
                                    "G\u00F6rlitz",
                                    "Goslar",
                                    "Gotha",
                                    "G\u00F6ttingen",
                                    "Greifswald",
                                    "Greiz",
                                    "Greven",
                                    "Grevenbroich",
                                    "Griesheim",
                                    "Grimma",
                                    "Gronau (Westf.)",
                                    "Gro\u00DF-Gerau",
                                    "Gro\u00DF-Umstadt",
                                    "Gummersbach",
                                    "G\u00FCnzburg",
                                    "G\u00FCstrow",
                                    "G\u00FCtersloh",
                                    "Haan",
                                    "Haar",
                                    "Hagen",
                                    "Halberstadt",
                                    "Halle (Saale)",
                                    "Halle (Westf.)",
                                    "Haltern am See",
                                    "Hamburg",
                                    "Hameln",
                                    "Hamm",
                                    "Hamminkeln",
                                    "Hanau",
                                    "Hann. M\u00FCnden",
                                    "Hannover",
                                    "Haren (Ems)",
                                    "Harsewinkel",
                                    "Ha\u00DFloch",
                                    "Hattersheim am Main",
                                    "Hattingen",
                                    "Heide",
                                    "Heidelberg",
                                    "Heidenheim an der Brenz",
                                    "Heilbronn",
                                    "Heiligenhaus",
                                    "Heinsberg",
                                    "Helmstedt",
                                    "Hemer",
                                    "Hennef (Sieg)",
                                    "Hennigsdorf",
                                    "Henstedt-Ulzburg",
                                    "Heppenheim (Bergstra\u00DFe)",
                                    "Herborn",
                                    "Herdecke",
                                    "Herford",
                                    "Herne",
                                    "Herrenberg",
                                    "Herten",
                                    "Herzogenaurach",
                                    "Herzogenrath",
                                    "Hilden",
                                    "Hildesheim",
                                    "Hockenheim",
                                    "Hof",
                                    "Hofheim am Taunus",
                                    "Hohen Neuendorf",
                                    "Holzminden",
                                    "Homburg",
                                    "Horb am Neckar",
                                    "H\u00F6xter",
                                    "Hoyerswerda",
                                    "H\u00FCckelhoven",
                                    "H\u00FCrth",
                                    "Husum",
                                    "Ibbenb\u00FCren",
                                    "Idar-Oberstein",
                                    "Idstein",
                                    "Ilmenau",
                                    "Ilsede",
                                    "Ingelheim am Rhein",
                                    "Ingolstadt",
                                    "Iserlohn",
                                    "Isernhagen",
                                    "Itzehoe",
                                    "Jena",
                                    "J\u00FCchen",
                                    "J\u00FClich",
                                    "Kaarst",
                                    "Kaiserslautern",
                                    "Kaltenkirchen",
                                    "Kamen",
                                    "Kamp-Lintfort",
                                    "Karben",
                                    "Karlsfeld",
                                    "Karlsruhe",
                                    "Kassel",
                                    "Kaufbeuren",
                                    "Kehl",
                                    "Kelkheim (Taunus)",
                                    "Kempen",
                                    "Kempten (Allg\u00E4u)",
                                    "Kerpen",
                                    "Kevelaer",
                                    "Kiel",
                                    "Kirchheim unter Teck",
                                    "Kitzingen",
                                    "Kleinmachnow",
                                    "Kleve",
                                    "Koblenz",
                                    "K\u00F6ln",
                                    "K\u00F6nigs Wusterhausen",
                                    "K\u00F6nigsbrunn",
                                    "K\u00F6nigswinter",
                                    "Konstanz",
                                    "Korbach",
                                    "Kornwestheim",
                                    "Korschenbroich",
                                    "K\u00F6then (Anhalt)",
                                    "Krefeld",
                                    "Kreuztal",
                                    "Kulmbach",
                                    "Laatzen",
                                    "Lage",
                                    "Lahr/Schwarzwald",
                                    "Lampertheim",
                                    "Landau in der Pfalz",
                                    "Landsberg am Lech",
                                    "Landshut",
                                    "Langen",
                                    "Langenfeld (Rheinland)",
                                    "Langenhagen",
                                    "Lauf an der Pegnitz",
                                    "Laupheim",
                                    "Leer",
                                    "Lehrte",
                                    "Leichlingen (Rheinland)",
                                    "Leimen",
                                    "Leinfelden-Echterdingen",
                                    "Leipzig",
                                    "Lemgo",
                                    "Lengerich",
                                    "Lennestadt",
                                    "Leonberg",
                                    "Leutkirch im Allg\u00E4u",
                                    "Leverkusen",
                                    "Lichtenfels",
                                    "Limbach-Oberfrohna",
                                    "Limburg an der Lahn",
                                    "Lindau (Bodensee)",
                                    "Lindlar",
                                    "Lingen (Ems)",
                                    "Lippstadt",
                                    "Lohmar",
                                    "L\u00F6hne",
                                    "Lohne (Oldenburg)",
                                    "L\u00F6rrach",
                                    "L\u00FCbbecke",
                                    "L\u00FCbeck",
                                    "Luckenwalde",
                                    "L\u00FCdenscheid",
                                    "L\u00FCdinghausen",
                                    "Ludwigsburg",
                                    "Ludwigsfelde",
                                    "Ludwigshafen am Rhein",
                                    "L\u00FCneburg",
                                    "L\u00FCnen",
                                    "Magdeburg",
                                    "Maintal",
                                    "Mainz",
                                    "Mannheim",
                                    "Marburg",
                                    "Markkleeberg",
                                    "Marl",
                                    "Mechernich",
                                    "Meckenheim",
                                    "Meerbusch",
                                    "Meinerzhagen",
                                    "Meiningen",
                                    "Mei\u00DFen",
                                    "Melle",
                                    "Memmingen",
                                    "Menden (Sauerland)",
                                    "Meppen",
                                    "Merseburg",
                                    "Merzig",
                                    "Meschede",
                                    "Mettmann",
                                    "Metzingen",
                                    "Minden",
                                    "Moers",
                                    "M\u00F6nchengladbach",
                                    "Monheim am Rhein",
                                    "Moormerland",
                                    "M\u00F6rfelden-Walldorf",
                                    "Mosbach",
                                    "M\u00FChlacker",
                                    "M\u00FChlhausen/Th\u00FCringen",
                                    "M\u00FChlheim am Main",
                                    "M\u00FClheim an der Ruhr",
                                    "M\u00FCnchen",
                                    "M\u00FCnster",
                                    "Nagold",
                                    "Naumburg (Saale)",
                                    "Neckarsulm",
                                    "Netphen",
                                    "Nettetal",
                                    "Neu Wulmstorf",
                                    "Neu-Isenburg",
                                    "Neu-Ulm",
                                    "Neubrandenburg",
                                    "Neuburg an der Donau",
                                    "Neukirchen-Vluyn",
                                    "Neumarkt in der Oberpfalz",
                                    "Neum\u00FCnster",
                                    "Neunkirchen",
                                    "Neuruppin",
                                    "Neus\u00E4\u00DF",
                                    "Neuss",
                                    "Neustadt am R\u00FCbenberge",
                                    "Neustadt an der Weinstra\u00DFe",
                                    "Neustrelitz",
                                    "Neuwied",
                                    "Niederkassel",
                                    "Nienburg/Weser",
                                    "Norden",
                                    "Nordenham",
                                    "Norderstedt",
                                    "Nordhausen",
                                    "Nordhorn",
                                    "Northeim",
                                    "N\u00FCrnberg",
                                    "N\u00FCrtingen",
                                    "Oberhausen",
                                    "Obertshausen",
                                    "Oberursel (Taunus)",
                                    "Oelde",
                                    "Oer-Erkenschwick",
                                    "Offenbach am Main",
                                    "Offenburg",
                                    "\u00D6hringen",
                                    "Olching",
                                    "Oldenburg",
                                    "Olpe",
                                    "Oranienburg",
                                    "Osnabr\u00FCck",
                                    "Osterholz-Scharmbeck",
                                    "Osterode am Harz",
                                    "Ostfildern",
                                    "Ottobrunn",
                                    "Overath",
                                    "Paderborn",
                                    "Panketal",
                                    "Papenburg",
                                    "Passau",
                                    "Peine",
                                    "Petershagen",
                                    "Pfaffenhofen an der Ilm",
                                    "Pforzheim",
                                    "Pfungstadt",
                                    "Pinneberg",
                                    "Pirmasens",
                                    "Pirna",
                                    "Plauen",
                                    "Plettenberg",
                                    "Porta Westfalica",
                                    "Potsdam",
                                    "Puchheim",
                                    "Pulheim",
                                    "Quedlinburg",
                                    "Quickborn",
                                    "Radebeul",
                                    "Radevormwald",
                                    "Radolfzell am Bodensee",
                                    "Rastatt",
                                    "Rastede",
                                    "Rathenow",
                                    "Ratingen",
                                    "Ravensburg",
                                    "Recklinghausen",
                                    "Rees",
                                    "Regensburg",
                                    "Reinbek",
                                    "Remscheid",
                                    "Remseck am Neckar",
                                    "Rendsburg",
                                    "Reutlingen",
                                    "Rheda-Wiedenbr\u00FCck",
                                    "Rheinbach",
                                    "Rheinberg",
                                    "Rheine",
                                    "Rheinfelden (Baden)",
                                    "Rheinstetten",
                                    "Riedstadt",
                                    "Riesa",
                                    "Rietberg",
                                    "Rinteln",
                                    "R\u00F6dermark",
                                    "Rodgau",
                                    "Ronnenberg",
                                    "Rosenheim",
                                    "R\u00F6srath",
                                    "Rostock",
                                    "Rotenburg (W\u00FCmme)",
                                    "Roth",
                                    "Rottenburg am Neckar",
                                    "Rottweil",
                                    "Rudolstadt",
                                    "R\u00FCsselsheim am Main",
                                    "Saalfeld/Saale",
                                    "Saarbr\u00FCcken",
                                    "Saarlouis",
                                    "Salzgitter",
                                    "Salzkotten",
                                    "Salzwedel",
                                    "Sangerhausen",
                                    "Sankt Augustin",
                                    "Sankt Ingbert",
                                    "Schleswig",
                                    "Schlo\u00DF Holte-Stukenbrock",
                                    "Schmallenberg",
                                    "Sch\u00F6nebeck",
                                    "Schorndorf",
                                    "Schortens",
                                    "Schramberg",
                                    "Schwabach",
                                    "Schw\u00E4bisch Gm\u00FCnd",
                                    "Schw\u00E4bisch Hall",
                                    "Schwandorf",
                                    "Schwanewede",
                                    "Schwedt/Oder",
                                    "Schweinfurt",
                                    "Schwelm",
                                    "Schwerin",
                                    "Schwerte",
                                    "Schwetzingen",
                                    "Seelze",
                                    "Seevetal",
                                    "Sehnde",
                                    "Seligenstadt",
                                    "Selm",
                                    "Senden",
                                    "Senden",
                                    "Senftenberg",
                                    "Siegburg",
                                    "Siegen",
                                    "Sindelfingen",
                                    "Singen (Hohentwiel)",
                                    "Sinsheim",
                                    "Soest",
                                    "Solingen",
                                    "Soltau",
                                    "Sondershausen",
                                    "Sonneberg",
                                    "Sonthofen",
                                    "Speyer",
                                    "Spremberg",
                                    "Springe",
                                    "Sprockh\u00F6vel",
                                    "St. Wendel",
                                    "Stade",
                                    "Stadtallendorf",
                                    "Stadthagen",
                                    "Stadtlohn",
                                    "Starnberg",
                                    "Sta\u00DFfurt",
                                    "Steinfurt",
                                    "Steinhagen",
                                    "Stendal",
                                    "Stolberg (Rheinland)",
                                    "Stralsund",
                                    "Straubing",
                                    "Strausberg",
                                    "Stuhr",
                                    "Stutensee",
                                    "Stuttgart",
                                    "Suhl",
                                    "Sundern (Sauerland)",
                                    "Syke",
                                    "Taunusstein",
                                    "Teltow",
                                    "T\u00F6nisvorst",
                                    "Torgau",
                                    "Traunreut",
                                    "Trier",
                                    "Troisdorf",
                                    "T\u00FCbingen",
                                    "Tuttlingen",
                                    "\u00DCbach-Palenberg",
                                    "\u00DCberlingen",
                                    "Uelzen",
                                    "Uetze",
                                    "Ulm",
                                    "Unna",
                                    "Unterhaching",
                                    "Unterschlei\u00DFheim",
                                    "Vaihingen an der Enz",
                                    "Varel",
                                    "Vaterstetten",
                                    "Vechta",
                                    "Velbert",
                                    "Verden (Aller)",
                                    "Verl",
                                    "Versmold",
                                    "Viernheim",
                                    "Viersen",
                                    "Villingen-Schwenningen",
                                    "Voerde (Niederrhein)",
                                    "V\u00F6lklingen",
                                    "Vreden",
                                    "Wachtberg",
                                    "Wagh\u00E4usel",
                                    "Waiblingen",
                                    "Waldkirch",
                                    "Waldkraiburg",
                                    "Waldshut-Tiengen",
                                    "Wallenhorst",
                                    "Walsrode",
                                    "Waltrop",
                                    "Wandlitz",
                                    "Wangen im Allg\u00E4u",
                                    "Warburg",
                                    "Waren (M\u00FCritz)",
                                    "Warendorf",
                                    "Warstein",
                                    "Wedel",
                                    "Wedemark",
                                    "Wegberg",
                                    "Weiden in der Oberpfalz",
                                    "Weil am Rhein",
                                    "Weilheim in Oberbayern",
                                    "Weimar",
                                    "Weingarten",
                                    "Weinheim",
                                    "Weinstadt",
                                    "Wei\u00DFenfels",
                                    "Weiterstadt",
                                    "Werdau",
                                    "Werder (Havel)",
                                    "Werl",
                                    "Wermelskirchen",
                                    "Werne",
                                    "Wernigerode",
                                    "Wertheim",
                                    "Wesel",
                                    "Wesseling",
                                    "Westerstede",
                                    "Westoverledingen",
                                    "Wetter (Ruhr)",
                                    "Wetzlar",
                                    "Weyhe",
                                    "Wiehl",
                                    "Wiesbaden",
                                    "Wiesloch",
                                    "Wilhelmshaven",
                                    "Willich",
                                    "Wilnsdorf",
                                    "Winnenden",
                                    "Winsen (Luhe)",
                                    "Wipperf\u00FCrth",
                                    "Wismar",
                                    "Witten",
                                    "Wittenberg, Lutherstadt",
                                    "Wittmund",
                                    "Wolfenb\u00FCttel",
                                    "Wolfsburg",
                                    "Worms",
                                    "W\u00FClfrath",
                                    "Wunstorf",
                                    "Wuppertal",
                                    "W\u00FCrselen",
                                    "W\u00FCrzburg",
                                    "Xanten",
                                    "Zeitz",
                                    "Zerbst/Anhalt",
                                    "Zirndorf",
                                    "Zittau",
                                    "Z\u00FClpich",
                                    "Zweibr\u00FCcken",
                                    "Zwickau");
                        });

        public Object state =
                ZVal.arrayFromList(
                        "Baden-W\u00FCrttemberg",
                        "Bayern",
                        "Berlin",
                        "Brandenburg",
                        "Bremen",
                        "Hamburg",
                        "Hessen",
                        "Mecklenburg-Vorpommern",
                        "Niedersachsen",
                        "Nordrhein-Westfalen",
                        "Rheinland-Pfalz",
                        "Saarland",
                        "Sachsen",
                        "Sachsen-Anhalt",
                        "Schleswig-Holstein",
                        "Th\u00FCringen");

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
                    .setName("Faker\\Provider\\de_DE\\Address")
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
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/de_DE/Address.php")
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
