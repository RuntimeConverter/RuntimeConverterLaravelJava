package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_US.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/en_US/Address.php

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

    public static final Object CONST_class = "Faker\\Provider\\en_US\\Address";

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
                                                            .en_US
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
                                                                            .en_US
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
                                                            .en_US
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
                                                            .en_US
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

        public Object cityPrefix =
                ZVal.arrayFromList("North", "East", "West", "South", "New", "Lake", "Port");

        public Object citySuffix =
                ZVal.arrayFromList(
                        "town", "ton", "land", "ville", "berg", "burgh", "borough", "bury", "view",
                        "port", "mouth", "stad", "furt", "chester", "mouth", "fort", "haven",
                        "side", "shire");

        public Object buildingNumber = ZVal.arrayFromList("%####", "%###", "%##");

        public Object streetSuffix =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alley",
                                    "Avenue",
                                    "Branch",
                                    "Bridge",
                                    "Brook",
                                    "Brooks",
                                    "Burg",
                                    "Burgs",
                                    "Bypass",
                                    "Camp",
                                    "Canyon",
                                    "Cape",
                                    "Causeway",
                                    "Center",
                                    "Centers",
                                    "Circle",
                                    "Circles",
                                    "Cliff",
                                    "Cliffs",
                                    "Club",
                                    "Common",
                                    "Corner",
                                    "Corners",
                                    "Course",
                                    "Court",
                                    "Courts",
                                    "Cove",
                                    "Coves",
                                    "Creek",
                                    "Crescent",
                                    "Crest",
                                    "Crossing",
                                    "Crossroad",
                                    "Curve",
                                    "Dale",
                                    "Dam",
                                    "Divide",
                                    "Drive",
                                    "Drive",
                                    "Drives",
                                    "Estate",
                                    "Estates",
                                    "Expressway",
                                    "Extension",
                                    "Extensions",
                                    "Fall",
                                    "Falls",
                                    "Ferry",
                                    "Field",
                                    "Fields",
                                    "Flat",
                                    "Flats",
                                    "Ford",
                                    "Fords",
                                    "Forest",
                                    "Forge",
                                    "Forges",
                                    "Fork",
                                    "Forks",
                                    "Fort",
                                    "Freeway",
                                    "Garden",
                                    "Gardens",
                                    "Gateway",
                                    "Glen",
                                    "Glens",
                                    "Green",
                                    "Greens",
                                    "Grove",
                                    "Groves",
                                    "Harbor",
                                    "Harbors",
                                    "Haven",
                                    "Heights",
                                    "Highway",
                                    "Hill",
                                    "Hills",
                                    "Hollow",
                                    "Inlet",
                                    "Inlet",
                                    "Island",
                                    "Island",
                                    "Islands",
                                    "Islands",
                                    "Isle",
                                    "Isle",
                                    "Junction",
                                    "Junctions",
                                    "Key",
                                    "Keys",
                                    "Knoll",
                                    "Knolls",
                                    "Lake",
                                    "Lakes",
                                    "Land",
                                    "Landing",
                                    "Lane",
                                    "Light",
                                    "Lights",
                                    "Loaf",
                                    "Lock",
                                    "Locks",
                                    "Locks",
                                    "Lodge",
                                    "Lodge",
                                    "Loop",
                                    "Mall",
                                    "Manor",
                                    "Manors",
                                    "Meadow",
                                    "Meadows",
                                    "Mews",
                                    "Mill",
                                    "Mills",
                                    "Mission",
                                    "Mission",
                                    "Motorway",
                                    "Mount",
                                    "Mountain",
                                    "Mountain",
                                    "Mountains",
                                    "Mountains",
                                    "Neck",
                                    "Orchard",
                                    "Oval",
                                    "Overpass",
                                    "Park",
                                    "Parks",
                                    "Parkway",
                                    "Parkways",
                                    "Pass",
                                    "Passage",
                                    "Path",
                                    "Pike",
                                    "Pine",
                                    "Pines",
                                    "Place",
                                    "Plain",
                                    "Plains",
                                    "Plains",
                                    "Plaza",
                                    "Plaza",
                                    "Point",
                                    "Points",
                                    "Port",
                                    "Port",
                                    "Ports",
                                    "Ports",
                                    "Prairie",
                                    "Prairie",
                                    "Radial",
                                    "Ramp",
                                    "Ranch",
                                    "Rapid",
                                    "Rapids",
                                    "Rest",
                                    "Ridge",
                                    "Ridges",
                                    "River",
                                    "Road",
                                    "Road",
                                    "Roads",
                                    "Roads",
                                    "Route",
                                    "Row",
                                    "Rue",
                                    "Run",
                                    "Shoal",
                                    "Shoals",
                                    "Shore",
                                    "Shores",
                                    "Skyway",
                                    "Spring",
                                    "Springs",
                                    "Springs",
                                    "Spur",
                                    "Spurs",
                                    "Square",
                                    "Square",
                                    "Squares",
                                    "Squares",
                                    "Station",
                                    "Station",
                                    "Stravenue",
                                    "Stravenue",
                                    "Stream",
                                    "Stream",
                                    "Street",
                                    "Street",
                                    "Streets",
                                    "Summit",
                                    "Summit",
                                    "Terrace",
                                    "Throughway",
                                    "Trace",
                                    "Track",
                                    "Trafficway",
                                    "Trail",
                                    "Trail",
                                    "Tunnel",
                                    "Tunnel",
                                    "Turnpike",
                                    "Turnpike",
                                    "Underpass",
                                    "Union",
                                    "Unions",
                                    "Valley",
                                    "Valleys",
                                    "Via",
                                    "Viaduct",
                                    "View",
                                    "Views",
                                    "Village",
                                    "Village",
                                    "Villages",
                                    "Ville",
                                    "Vista",
                                    "Vista",
                                    "Walk",
                                    "Walks",
                                    "Wall",
                                    "Way",
                                    "Ways",
                                    "Well",
                                    "Wells");
                        });

        public Object postcode = ZVal.arrayFromList("#####", "#####-####");

        public Object state =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Alabama",
                                    "Alaska",
                                    "Arizona",
                                    "Arkansas",
                                    "California",
                                    "Colorado",
                                    "Connecticut",
                                    "Delaware",
                                    "District of Columbia",
                                    "Florida",
                                    "Georgia",
                                    "Hawaii",
                                    "Idaho",
                                    "Illinois",
                                    "Indiana",
                                    "Iowa",
                                    "Kansas",
                                    "Kentucky",
                                    "Louisiana",
                                    "Maine",
                                    "Maryland",
                                    "Massachusetts",
                                    "Michigan",
                                    "Minnesota",
                                    "Mississippi",
                                    "Missouri",
                                    "Montana",
                                    "Nebraska",
                                    "Nevada",
                                    "New Hampshire",
                                    "New Jersey",
                                    "New Mexico",
                                    "New York",
                                    "North Carolina",
                                    "North Dakota",
                                    "Ohio",
                                    "Oklahoma",
                                    "Oregon",
                                    "Pennsylvania",
                                    "Rhode Island",
                                    "South Carolina",
                                    "South Dakota",
                                    "Tennessee",
                                    "Texas",
                                    "Utah",
                                    "Vermont",
                                    "Virginia",
                                    "Washington",
                                    "West Virginia",
                                    "Wisconsin",
                                    "Wyoming");
                        });

        public Object stateAbbr =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL",
                                    "GA", "HI", "IA", "ID", "IL", "IN", "KS", "KY", "LA", "MA",
                                    "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE",
                                    "NH", "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI",
                                    "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA", "WI", "WV",
                                    "WY");
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
                                    "Antarctica (the territory South of 60 deg S)",
                                    "Antigua and Barbuda",
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
                                    "Belarus",
                                    "Belgium",
                                    "Belize",
                                    "Benin",
                                    "Bermuda",
                                    "Bhutan",
                                    "Bolivia",
                                    "Bosnia and Herzegovina",
                                    "Botswana",
                                    "Bouvet Island (Bouvetoya)",
                                    "Brazil",
                                    "British Indian Ocean Territory (Chagos Archipelago)",
                                    "British Virgin Islands",
                                    "Brunei Darussalam",
                                    "Bulgaria",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Cambodia",
                                    "Cameroon",
                                    "Canada",
                                    "Cape Verde",
                                    "Cayman Islands",
                                    "Central African Republic",
                                    "Chad",
                                    "Chile",
                                    "China",
                                    "Christmas Island",
                                    "Cocos (Keeling) Islands",
                                    "Colombia",
                                    "Comoros",
                                    "Congo",
                                    "Cook Islands",
                                    "Costa Rica",
                                    "Cote d'Ivoire",
                                    "Croatia",
                                    "Cuba",
                                    "Cyprus",
                                    "Czech Republic",
                                    "Denmark",
                                    "Djibouti",
                                    "Dominica",
                                    "Dominican Republic",
                                    "Ecuador",
                                    "Egypt",
                                    "El Salvador",
                                    "Equatorial Guinea",
                                    "Eritrea",
                                    "Estonia",
                                    "Ethiopia",
                                    "Faroe Islands",
                                    "Falkland Islands (Malvinas)",
                                    "Fiji",
                                    "Finland",
                                    "France",
                                    "French Guiana",
                                    "French Polynesia",
                                    "French Southern Territories",
                                    "Gabon",
                                    "Gambia",
                                    "Georgia",
                                    "Germany",
                                    "Ghana",
                                    "Gibraltar",
                                    "Greece",
                                    "Greenland",
                                    "Grenada",
                                    "Guadeloupe",
                                    "Guam",
                                    "Guatemala",
                                    "Guernsey",
                                    "Guinea",
                                    "Guinea-Bissau",
                                    "Guyana",
                                    "Haiti",
                                    "Heard Island and McDonald Islands",
                                    "Holy See (Vatican City State)",
                                    "Honduras",
                                    "Hong Kong",
                                    "Hungary",
                                    "Iceland",
                                    "India",
                                    "Indonesia",
                                    "Iran",
                                    "Iraq",
                                    "Ireland",
                                    "Isle of Man",
                                    "Israel",
                                    "Italy",
                                    "Jamaica",
                                    "Japan",
                                    "Jersey",
                                    "Jordan",
                                    "Kazakhstan",
                                    "Kenya",
                                    "Kiribati",
                                    "Korea",
                                    "Korea",
                                    "Kuwait",
                                    "Kyrgyz Republic",
                                    "Lao People's Democratic Republic",
                                    "Latvia",
                                    "Lebanon",
                                    "Lesotho",
                                    "Liberia",
                                    "Libyan Arab Jamahiriya",
                                    "Liechtenstein",
                                    "Lithuania",
                                    "Luxembourg",
                                    "Macao",
                                    "Macedonia",
                                    "Madagascar",
                                    "Malawi",
                                    "Malaysia",
                                    "Maldives",
                                    "Mali",
                                    "Malta",
                                    "Marshall Islands",
                                    "Martinique",
                                    "Mauritania",
                                    "Mauritius",
                                    "Mayotte",
                                    "Mexico",
                                    "Micronesia",
                                    "Moldova",
                                    "Monaco",
                                    "Mongolia",
                                    "Montenegro",
                                    "Montserrat",
                                    "Morocco",
                                    "Mozambique",
                                    "Myanmar",
                                    "Namibia",
                                    "Nauru",
                                    "Nepal",
                                    "Netherlands Antilles",
                                    "Netherlands",
                                    "New Caledonia",
                                    "New Zealand",
                                    "Nicaragua",
                                    "Niger",
                                    "Nigeria",
                                    "Niue",
                                    "Norfolk Island",
                                    "Northern Mariana Islands",
                                    "Norway",
                                    "Oman",
                                    "Pakistan",
                                    "Palau",
                                    "Palestinian Territories",
                                    "Panama",
                                    "Papua New Guinea",
                                    "Paraguay",
                                    "Peru",
                                    "Philippines",
                                    "Pitcairn Islands",
                                    "Poland",
                                    "Portugal",
                                    "Puerto Rico",
                                    "Qatar",
                                    "Reunion",
                                    "Romania",
                                    "Russian Federation",
                                    "Rwanda",
                                    "Saint Barthelemy",
                                    "Saint Helena",
                                    "Saint Kitts and Nevis",
                                    "Saint Lucia",
                                    "Saint Martin",
                                    "Saint Pierre and Miquelon",
                                    "Saint Vincent and the Grenadines",
                                    "Samoa",
                                    "San Marino",
                                    "Sao Tome and Principe",
                                    "Saudi Arabia",
                                    "Senegal",
                                    "Serbia",
                                    "Seychelles",
                                    "Sierra Leone",
                                    "Singapore",
                                    "Slovakia (Slovak Republic)",
                                    "Slovenia",
                                    "Solomon Islands",
                                    "Somalia",
                                    "South Africa",
                                    "South Georgia and the South Sandwich Islands",
                                    "Spain",
                                    "Sri Lanka",
                                    "Sudan",
                                    "Suriname",
                                    "Svalbard & Jan Mayen Islands",
                                    "Swaziland",
                                    "Sweden",
                                    "Switzerland",
                                    "Syrian Arab Republic",
                                    "Taiwan",
                                    "Tajikistan",
                                    "Tanzania",
                                    "Thailand",
                                    "Timor-Leste",
                                    "Togo",
                                    "Tokelau",
                                    "Tonga",
                                    "Trinidad and Tobago",
                                    "Tunisia",
                                    "Turkey",
                                    "Turkmenistan",
                                    "Turks and Caicos Islands",
                                    "Tuvalu",
                                    "Uganda",
                                    "Ukraine",
                                    "United Arab Emirates",
                                    "United Kingdom",
                                    "United States of America",
                                    "United States Minor Outlying Islands",
                                    "United States Virgin Islands",
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
                        "{{cityPrefix}} {{firstName}}{{citySuffix}}",
                        "{{cityPrefix}} {{firstName}}",
                        "{{firstName}}{{citySuffix}}",
                        "{{lastName}}{{citySuffix}}");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "{{firstName}} {{streetSuffix}}", "{{lastName}} {{streetSuffix}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{buildingNumber}} {{streetName}}",
                        "{{buildingNumber}} {{streetName}} {{secondaryAddress}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}\n{{city}}, {{stateAbbr}} {{postcode}}");

        public Object secondaryAddressFormats = ZVal.arrayFromList("Apt. ###", "Suite ###");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_US\\Address")
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
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_US/Address.php")
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
