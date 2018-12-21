package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.nl_BE.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/nl_BE/Address.php

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
                                                                .nl_BE
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
                                                        .nl_BE
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\nl_BE\\Address";

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
        public Object postcode(RuntimeEnv env, Object... args) {
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
                                                            .nl_BE
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .postcodes)
                            .value());
        }

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
                                                            .nl_BE
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object postcodes =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "2970", "3700", "7510", "9420", "8511", "3800", "9300", "9880",
                                    "3200", "8700", "8211", "2630", "4557", "4280", "3930", "5590",
                                    "5362", "4219", "6280", "9991", "8660", "1790", "9051", "5544",
                                    "4317", "5310", "6250", "5070", "3570", "5550", "4432", "1652",
                                    "8690", "4540", "6680", "6953", "4770", "6997", "7750", "5300",
                                    "1070", "6150", "4821", "4031", "7387", "5537", "6721", "6890",
                                    "4430", "5500", "5520", "4520", "4160", "7640", "2000", "2018",
                                    "2020", "2030", "2040", "2050", "2060", "2099", "7910", "8570",
                                    "9200", "9400", "5170", "7811", "4990", "1390", "8850", "2370",
                                    "4601", "6700", "7181", "5060", "6870", "3665", "9404", "9890",
                                    "7040", "1730", "8310", "1007", "9960", "6860", "3460", "5330",
                                    "9800", "7800", "6791", "3404", "3384", "6717", "7941", "6790",
                                    "7972", "4880", "5660", "6880", "7382", "6706", "1367", "5580",
                                    "8630", "8580", "4260", "3271", "4340", "4400", "6900", "4630",
                                    "4920", "3128", "9310", "2387", "4837", "6464", "6460", "5555",
                                    "7730", "5377", "7380", "1470", "5190", "9860", "2490", "6951",
                                    "6500", "4671", "5570", "7534", "5370", "6940", "7971", "4983",
                                    "4690", "9968", "7830", "6600", "3870", "4651", "7130", "7331",
                                    "7870", "7604", "1401", "9520", "8531", "9150", "4052", "6980",
                                    "1320", "6594", "7532", "3960");
                        });

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object streetNameFormats = ZVal.arrayFromList("{{lastName}}{{streetSuffix}}");

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n {{postcode}} {{city}}");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "baan",
                        "boulevard",
                        "dreef",
                        "hof",
                        "laan",
                        "pad",
                        "ring",
                        "singel",
                        "steeg",
                        "straat",
                        "weg");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Aalst",
                                    "Aarlen",
                                    "Aarschot",
                                    "Aat",
                                    "Andenne",
                                    "Antoing",
                                    "Antwerpen",
                                    "Bastenaken",
                                    "Beringen",
                                    "Beaumont",
                                    "Beauraing",
                                    "Bergen",
                                    "Bilzen",
                                    "Binche",
                                    "Blankenberge",
                                    "Borgloon",
                                    "Borgworm",
                                    "Bouillon",
                                    "Bree",
                                    "Brugge",
                                    "Brussel",
                                    "Charleroi",
                                    "Ch\u00E2telet",
                                    "Chi\u00E8vres",
                                    "Chimay",
                                    "Chiny",
                                    "Ciney",
                                    "Couvin",
                                    "Damme",
                                    "Deinze",
                                    "Dendermonde",
                                    "Diest",
                                    "Diksmuide",
                                    "Dilsen-Stokkem",
                                    "Dinant",
                                    "Doornik",
                                    "Durbuy",
                                    "Edingen",
                                    "Eeklo",
                                    "Eupen",
                                    "Fleurus",
                                    "Florenville",
                                    "Fontaine-l'Ev\u00EAque",
                                    "Fosses-la-Ville",
                                    "Geel",
                                    "Geldenaken",
                                    "Gembloers",
                                    "Genepi\u00EBn",
                                    "Genk",
                                    "Gent",
                                    "Geraardsbergen",
                                    "Gistel",
                                    "'s-Gravenbrakel",
                                    "Halen",
                                    "Halle",
                                    "Hamont-Achel",
                                    "Hannuit",
                                    "Harelbeke",
                                    "Hasselt",
                                    "Herentals",
                                    "Herk-de-Stad",
                                    "Herstal",
                                    "Herve",
                                    "Hoei",
                                    "Hoogstraten",
                                    "Houffalize",
                                    "Ieper",
                                    "Izegem",
                                    "Komen-Waasten",
                                    "Kortrijk",
                                    "La Louvi\u00E8re",
                                    "La Roche-en-Ardenne",
                                    "Landen",
                                    "Le R\u0153ulx",
                                    "Lessen",
                                    "Leuze-en-Hainaut",
                                    "Leuven",
                                    "Lier",
                                    "Limburg",
                                    "Lo-Reninge",
                                    "Lokeren",
                                    "Lommel",
                                    "Luik",
                                    "Maaseik",
                                    "Malmedy",
                                    "Marche-en-Famenne",
                                    "Mechelen",
                                    "Menen",
                                    "Mesen",
                                    "Moeskroen",
                                    "Mortsel",
                                    "Namen",
                                    "Neufch\u00E2teau",
                                    "Nieuwpoort",
                                    "Nijvel",
                                    "Ninove",
                                    "Oostende",
                                    "Ottignies",
                                    "Oudenaarde",
                                    "Oudenburg",
                                    "Peer",
                                    "P\u00E9ruwelz",
                                    "Philippeville",
                                    "Poperinge",
                                    "Rochefort",
                                    "Roeselare",
                                    "Ronse",
                                    "Saint-Ghislain",
                                    "Saint-Hubert",
                                    "Sankt Vith",
                                    "Scherpenheuvel-Zichem",
                                    "Seraing",
                                    "Sint-Niklaas",
                                    "Sint-Truiden",
                                    "Spa",
                                    "Stavelot",
                                    "Thuin",
                                    "Tielt",
                                    "Tienen",
                                    "Tongeren",
                                    "Torhout",
                                    "Turnhout",
                                    "Verviers",
                                    "Veurne",
                                    "Vilvoorde",
                                    "Virton",
                                    "Walcourt",
                                    "Waregem",
                                    "Waver",
                                    "Wervik",
                                    "Wezet",
                                    "Zinnik",
                                    "Zottegem",
                                    "Zoutleeuw");
                        });

        public Object state =
                ZVal.arrayFromList(
                        "Antwerpen",
                        "Limburg",
                        "Oost-Vlaanderen",
                        "Vlaams-Brabant",
                        "West-Vlaanderen",
                        "Henegouwen",
                        "Luik",
                        "Luxemburg",
                        "Namen",
                        "Waals-Brabant");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afghanistan",
                                    "Albani\u00EB",
                                    "Algerije",
                                    "Amerikaans-Samoa",
                                    "Andorra",
                                    "Angola",
                                    "Amerikaanse Virgineilanden",
                                    "Anguilla",
                                    "Antartica",
                                    "Antigua en Barbuda",
                                    "Argentini\u00EB",
                                    "Armeni\u00EB",
                                    "Aruba",
                                    "Australi\u00EB",
                                    "Azerbeidzjan",
                                    "Bahamas",
                                    "Bahrein",
                                    "Bangladesh",
                                    "Barbados",
                                    "Belgi\u00EB",
                                    "Belize",
                                    "Benin",
                                    "Bermuda",
                                    "Bhutan",
                                    "Bolivia",
                                    "Bosni\u00EB-Herzegovina",
                                    "Botswana",
                                    "Bouvet Eiland (Bouvetoya)",
                                    "Brazili\u00EB",
                                    "Britse Maagdeneilanden",
                                    "Brunei Darussalam",
                                    "Bulgarije",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Cambodja",
                                    "Canada",
                                    "Centraal-Afrikaanse Republiek",
                                    "Chili",
                                    "China",
                                    "Christmaseiland",
                                    "Cocoseilanden",
                                    "Colombia",
                                    "Comoren",
                                    "Congo",
                                    "Cookeilanden",
                                    "Costa Rica",
                                    "Cuba",
                                    "Cyprus",
                                    "Denemarken",
                                    "Djibouti",
                                    "Dominica",
                                    "Dominicaanse Republiek",
                                    "Duitsland",
                                    "Ecuador",
                                    "Egypte",
                                    "El salvador",
                                    "Equatoriaal-Guinea",
                                    "Eritrea",
                                    "Estland",
                                    "Ethiopi\u00EB",
                                    "Faroe Eilanden",
                                    "Falklandeilanden",
                                    "Fiji",
                                    "Finland",
                                    "Frankrijk",
                                    "Frans-Guyana",
                                    "Frans-Polynesi\u00EB",
                                    "Franse Zuidelijke en Antarctische Gebieden",
                                    "Gabon",
                                    "Gambia",
                                    "Georgi\u00EB",
                                    "Ghana",
                                    "Gibraltar",
                                    "Griekenland",
                                    "Groenland",
                                    "Grenada",
                                    "Guadeloupe",
                                    "Guam",
                                    "Guatemala",
                                    "Guernsey",
                                    "Guinee",
                                    "Guinee-Bissau",
                                    "Guyana",
                                    "Ha\u00EFti",
                                    "Heard en McDonaldeilanden",
                                    "Honduras",
                                    "Hong Kong",
                                    "Hongarije",
                                    "IJsland",
                                    "India",
                                    "Indonesi\u00EB",
                                    "Iran",
                                    "Irak",
                                    "Ierland",
                                    "Man",
                                    "Israel",
                                    "Ivoorkust",
                                    "Itali\u00EB",
                                    "Jamaica",
                                    "Japan",
                                    "Jersey",
                                    "Jordani\u00EB",
                                    "Jemen",
                                    "Kazachstan",
                                    "Kenia",
                                    "Kleinere afgelegen eilanden van de Verenigde staten",
                                    "Kiribati",
                                    "Korea",
                                    "Koeweit",
                                    "Kirgizi\u00EB",
                                    "Kameroen",
                                    "Kaapverdi\u00EB",
                                    "Kaaimaneilanden",
                                    "Kroati\u00EB",
                                    "Laos",
                                    "Letland",
                                    "Libanon",
                                    "Lesotho",
                                    "Liberia",
                                    "Libi\u00EB",
                                    "Liechtenstein",
                                    "Litouwen",
                                    "Luxemburg",
                                    "Macau",
                                    "Macedoni\u00EB",
                                    "Madagascar",
                                    "Malawi",
                                    "Maleisi\u00EB",
                                    "Maldiven",
                                    "Mali",
                                    "Malta",
                                    "Marshalleilanden",
                                    "Martinique",
                                    "Mauritus",
                                    "Mauritania",
                                    "Mayotte",
                                    "Mexico",
                                    "Micronesi\u00EB",
                                    "Moldavi\u00EB",
                                    "Monaco",
                                    "Mongoli\u00EB",
                                    "Montenegro",
                                    "Monsterrat",
                                    "Marokko",
                                    "Mozambique",
                                    "Myanmar",
                                    "Namibi\u00EB",
                                    "Nauru",
                                    "Nepal",
                                    "Nederlandse Antillen",
                                    "Nederland",
                                    "Nieuw-Caledoni\u00EB",
                                    "Nieuw-Zeeland",
                                    "Nicaragua",
                                    "Niger",
                                    "Nigeria",
                                    "Niue",
                                    "Norfolk",
                                    "Noordelijke Marianen",
                                    "Noorwegen",
                                    "Oman",
                                    "Oostenrijk",
                                    "Oeganda",
                                    "Oekra\u00EFne",
                                    "Oezbakistan",
                                    "Pakistan",
                                    "Palau",
                                    "Palestina",
                                    "Panama",
                                    "Papoea-Nieuw-Guinea",
                                    "Paraguay",
                                    "Peru",
                                    "Filipijnen",
                                    "Pitcairneilanden",
                                    "Polen",
                                    "Portugal",
                                    "Puerto Rico",
                                    "Qatar",
                                    "R\u00E9union",
                                    "Roemeni\u00EB",
                                    "Rusland",
                                    "Rwanda",
                                    "Rwanda",
                                    "Sint-Bartholomeus",
                                    "Sint-Helena",
                                    "Saint Kitts en Nevis",
                                    "Saint Lucia",
                                    "Sint Maarten",
                                    "Saint-Pierre en Miquelon",
                                    "Saint Vincent en de Grenadines",
                                    "Samoa",
                                    "San Marino",
                                    "Sao Toma en Principe",
                                    "Saoedi-Arabi\u00EB",
                                    "Senegal",
                                    "Servi\u00EB",
                                    "Seychellen",
                                    "Sierra Leone",
                                    "Singapore",
                                    "Sloveni\u00EB",
                                    "Salomonseilanden",
                                    "Somali\u00EB",
                                    "Spanje",
                                    "Sri Lanka",
                                    "Soedan",
                                    "Suriname",
                                    "Spitsbergen en Jan Mayen",
                                    "Swaziland",
                                    "Zweden",
                                    "Zwitserland",
                                    "Syri\u00EB",
                                    "Taiwan",
                                    "Tadzjikistan",
                                    "Tanzania",
                                    "Thailand",
                                    "Tsjaad",
                                    "Timor-Leste",
                                    "Togo",
                                    "Tokelau-eilanden",
                                    "Tonga",
                                    "Trinidad en Trobago",
                                    "Tunesi\u00EB",
                                    "Turkije",
                                    "Turkmenistan",
                                    "Turks- en Caicoseilanden",
                                    "Tuvalu",
                                    "Tsjechische Republiek",
                                    "Uruguay",
                                    "Vanuatu",
                                    "Venezuela",
                                    "Verenigde Arabische Emiraten",
                                    "Verenigd Koninkrijk",
                                    "Verenigde Staten van Amerika",
                                    "Vaticaanstad",
                                    "Vietnam",
                                    "Wallis en Futuna",
                                    "Westerlijke Shara",
                                    "Wit-Rusland",
                                    "Zambia",
                                    "Zuid-Afrika",
                                    "Zuid-Georgia en de Zuidelijke Sandwicheilanden",
                                    "Zimbabwe");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\nl_BE\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "cityFormats",
                            "cityNames",
                            "country",
                            "postcodes",
                            "state",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/nl_BE/Address.php")
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
