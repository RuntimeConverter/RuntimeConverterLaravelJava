package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.en_IN.classes;

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
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/en_IN/Address.php

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
    public Object societySuffix(RuntimeEnv env, Object... args) {
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
                                                                .en_IN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "societySuffix")))
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
                                                        .en_IN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .societySuffix)
                        .value());
    }

    @ConvertedMethod
    public Object societyName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
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
                                                                        .en_IN
                                                                        .classes
                                                                        .Address
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "societyNameFormat")))
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
                                                                .en_IN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class)
                                                .societyNameFormat)
                                .value()));
    }

    @ConvertedMethod
    public Object city(RuntimeEnv env, Object... args) {
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
                                                                .en_IN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "city")))
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
                                                        .en_IN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .city)
                        .value());
    }

    @ConvertedMethod
    public Object locality(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
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
                                                                        .en_IN
                                                                        .classes
                                                                        .Address
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "localityFormats")))
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
                                                                .en_IN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class)
                                                .localityFormats)
                                .value()));
    }

    @ConvertedMethod
    public Object localityName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
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
                                                                        .en_IN
                                                                        .classes
                                                                        .Address
                                                                        .RequestStaticProperties
                                                                        .class,
                                                                "localityName")))
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
                                                                .en_IN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class)
                                                .localityName)
                                .value()));
    }

    @ConvertedMethod
    public Object areaSuffix(RuntimeEnv env, Object... args) {
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
                                                                .en_IN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "areaSuffix")))
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
                                                        .en_IN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .areaSuffix)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\en_IN\\Address";

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
                                                            .en_IN
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
                                                            .en_IN
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

        public Object city =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Agra",
                                    "Ahmedabad",
                                    "Ajmer",
                                    "Alwar",
                                    "Bengaluru",
                                    "Bhubhaneshwar",
                                    "Bhopal",
                                    "Bikaner",
                                    "Chennai",
                                    "Chandigarh",
                                    "Darjeeling",
                                    "Dehra Dun",
                                    "Delhi",
                                    "Faridabad",
                                    "Gandhinagar",
                                    "Guwahati",
                                    "Gangtok",
                                    "Gurgaon",
                                    "Hyderabad",
                                    "Hisar",
                                    "Indore",
                                    "Jaipur",
                                    "Jodhpur",
                                    "Jammu",
                                    "Jamnagar",
                                    "Jabalpur",
                                    "Kolkata",
                                    "Kanpur",
                                    "Kota",
                                    "Kochi",
                                    "Ludhiana",
                                    "Lucknow",
                                    "Mumbai",
                                    "Meerut",
                                    "Mysore",
                                    "Nagpur",
                                    "Nashik",
                                    "Noida",
                                    "New Delhi",
                                    "Pune",
                                    "Patna",
                                    "Panaji",
                                    "Pilani",
                                    "Pondicherry",
                                    "Ratlam",
                                    "Raipur",
                                    "Ranchi",
                                    "Rajkot",
                                    "Surat",
                                    "Simla",
                                    "Srinagar",
                                    "Thiruvananthapuram",
                                    "Trichy",
                                    "Udaipur",
                                    "Vishakhapattanam",
                                    "Vadodara",
                                    "Warangal");
                        });

        public Object state =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Andhra Pradesh",
                                    "Arunachal Pradesh",
                                    "Assam",
                                    "Bihar",
                                    "Chhattisgarh",
                                    "Goa",
                                    "Gujarat",
                                    "Haryana",
                                    "Himachal Pradesh",
                                    "Jammu and Kashmir",
                                    "Jharkhand",
                                    "Karnataka",
                                    "Kerala",
                                    "Madhya Pradesh",
                                    "Maharashtra",
                                    "Manipur",
                                    "Meghalaya",
                                    "Mizoram",
                                    "Nagaland",
                                    "Odisha",
                                    "Punjab",
                                    "Rajasthan",
                                    "Sikkim",
                                    "Tamil Nadu",
                                    "Telangana",
                                    "Tripura",
                                    "Uttar Pradesh",
                                    "Uttarakhand",
                                    "West Bengal",
                                    "Andaman and Nicobar Islands",
                                    "Chandigarh",
                                    "Dadra and Nagar Haveli",
                                    "Daman and Diu",
                                    "Delhi",
                                    "Lakshadweep",
                                    "Puducherry");
                        });

        public Object stateAbbr =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "AP", "AR", "AS", "BR", "CG", "GA", "GJ", "HR", "HP", "JK",
                                    "JH", "KA", "KL", "MP", "MH", "MN", "ML", "MZ", "NL", "OD",
                                    "PB", "RJ", "SK", "TN", "TS", "TR", "UP", "UK", "WB", "AN",
                                    "CH", "DN", "DD", "DL", "LD", "PY");
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

        public Object localityName =
                ZVal.arrayFromList(
                        "Aundh",
                        "Andheri",
                        "Borivali",
                        "Bandra",
                        "Chinchwad",
                        "Chandpole",
                        "Churchgate",
                        "Cyber City",
                        "Dadar",
                        "Deccan Gymkhana",
                        "Goregaon",
                        "Hadapsar",
                        "Harmada",
                        "Hinjewadi",
                        "Kormangala",
                        "Kharadi",
                        "Marathahalli",
                        "Model Town",
                        "Mansarovar",
                        "Malad",
                        "Sodala",
                        "Virar",
                        "Vikhroli",
                        "Yerwada",
                        "Yeshwanthpura");

        public Object areaSuffix = ZVal.arrayFromList(" Nagar", "Pur", "Garh", "Gunj", " Chowk");

        public Object postcode =
                ZVal.arrayFromList("1#####", "2#####", "3#####", "4#####", "5#####");

        public Object localityFormats =
                ZVal.arrayFromList("{{firstName}}{{areaSuffix}}", "{{localityName}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}} {{city}} - {{postcode}}");

        public Object societySuffix =
                ZVal.arrayFromList("Society", "Apartments", "Heights", "Villas");

        public Object societyNameFormat = ZVal.arrayFromList("{{firstName}} {{societySuffix}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{buildingNumber}}, {{locality}},",
                        "{{buildingNumber}}, {{societyName}}, {{locality}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\en_IN\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "areaSuffix",
                            "city",
                            "country",
                            "localityFormats",
                            "localityName",
                            "postcode",
                            "societyNameFormat",
                            "societySuffix",
                            "state",
                            "stateAbbr",
                            "streetAddressFormats")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/en_IN/Address.php")
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
