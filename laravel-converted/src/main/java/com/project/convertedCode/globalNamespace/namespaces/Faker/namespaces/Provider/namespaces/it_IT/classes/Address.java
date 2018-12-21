package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.it_IT.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/it_IT/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\it_IT\\Address";

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
        public Object cityPrefix(RuntimeEnv env, Object... args) {
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
                                                            .it_IT
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .cityPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object secondaryAddress(RuntimeEnv env, Object... args) {
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
                                                                            .it_IT
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .secondaryAddressFormats)
                                            .value())
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
                                                            .it_IT
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .state)
                            .value());
        }

        @ConvertedMethod
        public Object stateAbbr(RuntimeEnv env, Object... args) {
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
                                                            .it_IT
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .stateAbbr)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object cityPrefix = ZVal.arrayFromList("San", "Borgo", "Sesto", "Quarto", "Settimo");

        public Object citySuffix =
                ZVal.arrayFromList(
                        "a mare",
                        "lido",
                        "ligure",
                        "del friuli",
                        "salentino",
                        "calabro",
                        "veneto",
                        "nell'emilia",
                        "umbro",
                        "laziale",
                        "terme",
                        "sardo");

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#");

        public Object streetSuffix =
                ZVal.arrayFromList(
                        "Piazza", "Strada", "Via", "Borgo", "Contrada", "Rotonda", "Incrocio");

        public Object postcode = ZVal.arrayFromList("#####");

        public Object state =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Agrigento",
                                    "Alessandria",
                                    "Ancona",
                                    "Aosta",
                                    "Arezzo",
                                    "Ascoli Piceno",
                                    "Asti",
                                    "Avellino",
                                    "Bari",
                                    "Barletta-Andria-Trani",
                                    "Belluno",
                                    "Benevento",
                                    "Bergamo",
                                    "Biella",
                                    "Bologna",
                                    "Bolzano",
                                    "Brescia",
                                    "Brindisi",
                                    "Cagliari",
                                    "Caltanissetta",
                                    "Campobasso",
                                    "Carbonia-Iglesias",
                                    "Caserta",
                                    "Catania",
                                    "Catanzaro",
                                    "Chieti",
                                    "Como",
                                    "Cosenza",
                                    "Cremona",
                                    "Crotone",
                                    "Cuneo",
                                    "Enna",
                                    "Fermo",
                                    "Ferrara",
                                    "Firenze",
                                    "Foggia",
                                    "Forl\u00EC-Cesena",
                                    "Frosinone",
                                    "Genova",
                                    "Gorizia",
                                    "Grosseto",
                                    "Imperia",
                                    "Isernia",
                                    "La Spezia",
                                    "L'Aquila",
                                    "Latina",
                                    "Lecce",
                                    "Lecco",
                                    "Livorno",
                                    "Lodi",
                                    "Lucca",
                                    "Macerata",
                                    "Mantova",
                                    "Massa-Carrara",
                                    "Matera",
                                    "Messina",
                                    "Milano",
                                    "Modena",
                                    "Monza e della Brianza",
                                    "Napoli",
                                    "Novara",
                                    "Nuoro",
                                    "Olbia-Tempio",
                                    "Oristano",
                                    "Padova",
                                    "Palermo",
                                    "Parma",
                                    "Pavia",
                                    "Perugia",
                                    "Pesaro e Urbino",
                                    "Pescara",
                                    "Piacenza",
                                    "Pisa",
                                    "Pistoia",
                                    "Pordenone",
                                    "Potenza",
                                    "Prato",
                                    "Ragusa",
                                    "Ravenna",
                                    "Reggio Calabria",
                                    "Reggio Emilia",
                                    "Rieti",
                                    "Rimini",
                                    "Roma",
                                    "Rovigo",
                                    "Salerno",
                                    "Medio Campidano",
                                    "Sassari",
                                    "Savona",
                                    "Siena",
                                    "Siracusa",
                                    "Sondrio",
                                    "Taranto",
                                    "Teramo",
                                    "Terni",
                                    "Torino",
                                    "Ogliastra",
                                    "Trapani",
                                    "Trento",
                                    "Treviso",
                                    "Trieste",
                                    "Udine",
                                    "Varese",
                                    "Venezia",
                                    "Verbano-Cusio-Ossola",
                                    "Vercelli",
                                    "Verona",
                                    "Vibo Valentia",
                                    "Vicenza",
                                    "Viterbo");
                        });

        public Object stateAbbr =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "AG", "AL", "AN", "AO", "AR", "AP", "AT", "AV", "BA", "BT",
                                    "BL", "BN", "BG", "BI", "BO", "BZ", "BS", "BR", "CA", "CL",
                                    "CB", "CI", "CE", "CT", "CZ", "CH", "CO", "CS", "CR", "KR",
                                    "CN", "EN", "FM", "FE", "FI", "FG", "FC", "FR", "GE", "GO",
                                    "GR", "IM", "IS", "SP", "AQ", "LT", "LE", "LC", "LI", "LO",
                                    "LU", "MC", "MN", "MS", "MT", "ME", "MI", "MO", "MB", "NA",
                                    "NO", "NU", "OT", "OR", "PD", "PA", "PR", "PV", "PG", "PU",
                                    "PE", "PC", "PI", "PT", "PN", "PZ", "PO", "RG", "RA", "RC",
                                    "RE", "RI", "RN", "RM", "RO", "SA", "VS", "SS", "SV", "SI",
                                    "SR", "SO", "TA", "TE", "TR", "TO", "OG", "TP", "TN", "TV",
                                    "TS", "UD", "VA", "VE", "VB", "VC", "VR", "VV", "VI", "VT");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afghanistan",
                                    "Albania",
                                    "Algeria",
                                    "American Samoa",
                                    "Andorra",
                                    "Angola",
                                    "Anguilla",
                                    "Antartide (territori a sud del 60\u00B0 parallelo)",
                                    "Antigua e Barbuda",
                                    "Argentina",
                                    "Armenia",
                                    "Aruba",
                                    "Australia",
                                    "Austria",
                                    "Azerbaijan",
                                    "Bahamas",
                                    "Bahrain",
                                    "Bangladesh",
                                    "Barbados",
                                    "Bielorussia",
                                    "Belgio",
                                    "Belize",
                                    "Benin",
                                    "Bermuda",
                                    "Bhutan",
                                    "Bolivia",
                                    "Bosnia e Herzegovina",
                                    "Botswana",
                                    "Bouvet Island (Bouvetoya)",
                                    "Brasile",
                                    "Territorio dell'arcipelago indiano",
                                    "Isole Vergini Britanniche",
                                    "Brunei Darussalam",
                                    "Bulgaria",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Cambogia",
                                    "Cameroon",
                                    "Canada",
                                    "Capo Verde",
                                    "Isole Cayman",
                                    "Repubblica Centrale Africana",
                                    "Chad",
                                    "Cile",
                                    "Cina",
                                    "Isola di Pasqua",
                                    "Isola di Cocos (Keeling)",
                                    "Colombia",
                                    "Comoros",
                                    "Congo",
                                    "Isole Cook",
                                    "Costa Rica",
                                    "Costa d'Avorio",
                                    "Croazia",
                                    "Cuba",
                                    "Cipro",
                                    "Repubblica Ceca",
                                    "Danimarca",
                                    "Gibuti",
                                    "Repubblica Dominicana",
                                    "Equador",
                                    "Egitto",
                                    "El Salvador",
                                    "Guinea Equatoriale",
                                    "Eritrea",
                                    "Estonia",
                                    "Etiopia",
                                    "Isole Faroe",
                                    "Isole Falkland (Malvinas)",
                                    "Fiji",
                                    "Finlandia",
                                    "Francia",
                                    "Guyana Francese",
                                    "Polinesia Francese",
                                    "Territori Francesi del sud",
                                    "Gabon",
                                    "Gambia",
                                    "Georgia",
                                    "Germania",
                                    "Ghana",
                                    "Gibilterra",
                                    "Grecia",
                                    "Groenlandia",
                                    "Grenada",
                                    "Guadalupa",
                                    "Guam",
                                    "Guatemala",
                                    "Guernsey",
                                    "Guinea",
                                    "Guinea-Bissau",
                                    "Guyana",
                                    "Haiti",
                                    "Heard Island and McDonald Islands",
                                    "Citt\u00E0 del Vaticano",
                                    "Honduras",
                                    "Hong Kong",
                                    "Ungheria",
                                    "Islanda",
                                    "India",
                                    "Indonesia",
                                    "Iran",
                                    "Iraq",
                                    "Irlanda",
                                    "Isola di Man",
                                    "Israele",
                                    "Italia",
                                    "Giamaica",
                                    "Giappone",
                                    "Jersey",
                                    "Giordania",
                                    "Kazakhstan",
                                    "Kenya",
                                    "Kiribati",
                                    "Korea",
                                    "Kuwait",
                                    "Republicca Kirgiza",
                                    "Repubblica del Laos",
                                    "Latvia",
                                    "Libano",
                                    "Lesotho",
                                    "Liberia",
                                    "Libyan Arab Jamahiriya",
                                    "Liechtenstein",
                                    "Lituania",
                                    "Lussemburgo",
                                    "Macao",
                                    "Macedonia",
                                    "Madagascar",
                                    "Malawi",
                                    "Malesia",
                                    "Maldive",
                                    "Mali",
                                    "Malta",
                                    "Isole Marshall",
                                    "Martinica",
                                    "Mauritania",
                                    "Mauritius",
                                    "Mayotte",
                                    "Messico",
                                    "Micronesia",
                                    "Moldova",
                                    "Principato di Monaco",
                                    "Mongolia",
                                    "Montenegro",
                                    "Montserrat",
                                    "Marocco",
                                    "Mozambico",
                                    "Myanmar",
                                    "Namibia",
                                    "Nauru",
                                    "Nepal",
                                    "Antille Olandesi",
                                    "Olanda",
                                    "Nuova Caledonia",
                                    "Nuova Zelanda",
                                    "Nicaragua",
                                    "Niger",
                                    "Nigeria",
                                    "Niue",
                                    "Isole Norfolk",
                                    "Northern Mariana Islands",
                                    "Norvegia",
                                    "Oman",
                                    "Pakistan",
                                    "Palau",
                                    "Palestina",
                                    "Panama",
                                    "Papua Nuova Guinea",
                                    "Paraguay",
                                    "Peru",
                                    "Filippine",
                                    "Pitcairn Islands",
                                    "Polonia",
                                    "Portogallo",
                                    "Porto Rico",
                                    "Qatar",
                                    "Reunion",
                                    "Romania",
                                    "Russia",
                                    "Rwanda",
                                    "San Bartolomeo",
                                    "Sant'Elena",
                                    "Saint Kitts and Nevis",
                                    "Saint Lucia",
                                    "Saint Martin",
                                    "Saint Pierre and Miquelon",
                                    "Saint Vincent and the Grenadines",
                                    "Samoa",
                                    "San Marino",
                                    "Sao Tome and Principe",
                                    "Arabia Saudita",
                                    "Senegal",
                                    "Serbia",
                                    "Seychelles",
                                    "Sierra Leone",
                                    "Singapore",
                                    "Slovenia",
                                    "Isole Solomon",
                                    "Somalia",
                                    "Sud Africa",
                                    "Georgia del sud e South Sandwich Islands",
                                    "Spagna",
                                    "Sri Lanka",
                                    "Sudan",
                                    "Suriname",
                                    "Svalbard & Jan Mayen Islands",
                                    "Swaziland",
                                    "Svezia",
                                    "Svizzera",
                                    "Siria",
                                    "Taiwan",
                                    "Tajikistan",
                                    "Tanzania",
                                    "Tailandia",
                                    "Timor-Leste",
                                    "Togo",
                                    "Tokelau",
                                    "Tonga",
                                    "Trinidad e Tobago",
                                    "Tunisia",
                                    "Turchia",
                                    "Turkmenistan",
                                    "Isole di Turks and Caicos",
                                    "Tuvalu",
                                    "Uganda",
                                    "Ucraina",
                                    "Emirati Arabi Uniti",
                                    "Regno Unito",
                                    "Stati Uniti d'America",
                                    "United States Minor Outlying Islands",
                                    "Isole Vergini Statunitensi",
                                    "Uruguay",
                                    "Uzbekistan",
                                    "Vanuatu",
                                    "Venezuela",
                                    "Vietnam",
                                    "Wallis and Futuna",
                                    "Western Sahara",
                                    "Yemen",
                                    "Zambia",
                                    "Zimbabwe");
                        });

        public Object cityFormats =
                ZVal.arrayFromList(
                        "{{cityPrefix}} {{firstName}} {{citySuffix}}",
                        "{{cityPrefix}} {{firstName}}",
                        "{{firstName}} {{citySuffix}}",
                        "{{lastName}} {{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{streetSuffix}} {{firstName}}", "{{streetSuffix}} {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}} {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{streetAddress}}\n{{city}}, {{postcode}} {{state}} ({{stateAbbr}})");

        public Object secondaryAddressFormats = ZVal.arrayFromList("Appartamento ##", "Piano #");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\it_IT\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "cityFormats",
                            "cityPrefix",
                            "citySuffix",
                            "country",
                            "postcode",
                            "secondaryAddressFormats",
                            "state",
                            "stateAbbr",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetSuffix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/it_IT/Address.php")
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
