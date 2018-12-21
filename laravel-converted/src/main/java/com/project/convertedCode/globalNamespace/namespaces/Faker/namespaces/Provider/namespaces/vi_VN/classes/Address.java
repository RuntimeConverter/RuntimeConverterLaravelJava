package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.vi_VN.classes;

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
import static com.runtimeconverter.runtime.ZVal.handleReturnReference;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/vi_VN/Address.php

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
    public Object hamletName(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object format = null;
        format =
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
                                                                .vi_VN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "hamletNameFormats")))
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
                                                        .vi_VN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .hamletNameFormats)
                        .value();
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                        .method("bothify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("generator")
                                                                                .value(),
                                                                        "parse",
                                                                        Address.class,
                                                                        format))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object hamletPrefix(RuntimeEnv env, Object... args) {
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
                                                                .vi_VN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "hamletPrefix")))
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
                                                        .vi_VN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .hamletPrefix)
                        .value());
    }

    @ConvertedMethod
    public Object wardName(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object format = null;
        format =
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
                                                                .vi_VN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "wardNameFormats")))
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
                                                        .vi_VN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .wardNameFormats)
                        .value();
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                        .method("bothify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("generator")
                                                                                .value(),
                                                                        "parse",
                                                                        Address.class,
                                                                        format))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object wardPrefix(RuntimeEnv env, Object... args) {
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
                                                                .vi_VN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "wardPrefix")))
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
                                                        .vi_VN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .wardPrefix)
                        .value());
    }

    @ConvertedMethod
    public Object districtName(RuntimeEnv env, Object... args) {
        PassByReferenceArgs rLastRefArgs;
        Object format = null;
        format =
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
                                                                .vi_VN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "districtNameFormats")))
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
                                                        .vi_VN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .districtNameFormats)
                        .value();
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                        .method("bothify")
                        .addReferenceArgs(
                                rLastRefArgs =
                                        new RuntimeArgsWithReferences()
                                                .add(
                                                        0,
                                                        handleReturnReference(
                                                                env.callMethod(
                                                                        toObjectR(this)
                                                                                .accessProp(
                                                                                        this, env)
                                                                                .name("generator")
                                                                                .value(),
                                                                        "parse",
                                                                        Address.class,
                                                                        format))))
                        .call(rLastRefArgs.get(0))
                        .value());
    }

    @ConvertedMethod
    public Object districtPrefix(RuntimeEnv env, Object... args) {
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
                                                                .vi_VN
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "districtPrefix")))
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
                                                        .vi_VN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .districtPrefix)
                        .value());
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
                                                                .vi_VN
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
                                                        .vi_VN
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .city)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\vi_VN\\Address";

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
        public Object province(RuntimeEnv env, Object... args) {
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
                                                            .vi_VN
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .province)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object buildingNumber = ZVal.arrayFromList("####", "###", "##", "#");

        public Object postcode = ZVal.arrayFromList("#####", "######", "#####-####");

        public Object province =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "An Giang",
                                    "B\u00E0 R\u1ECBa - V\u0169ng T\u00E0u",
                                    "B\u1EAFc Giang",
                                    "B\u1EAFc K\u1EA1n",
                                    "B\u1EA1c Li\u00EAu",
                                    "B\u1EAFc Ninh",
                                    "B\u1EBFn Tre",
                                    "B\u00ECnh \u0110\u1ECBnh",
                                    "B\u00ECnh D\u01B0\u01A1ng",
                                    "B\u00ECnh Ph\u01B0\u1EDBc",
                                    "B\u00ECnh Thu\u1EADn",
                                    "C\u00E0 Mau",
                                    "Cao B\u1EB1ng",
                                    "\u0110\u1EAFk L\u1EAFk",
                                    "\u0110\u1EAFk N\u00F4ng",
                                    "\u0110i\u1EC7n Bi\u00EAn",
                                    "\u0110\u1ED3ng Nai",
                                    "\u0110\u1ED3ng Th\u00E1p",
                                    "Gia Lai",
                                    "H\u00E0 Giang",
                                    "H\u00E0 Nam",
                                    "H\u00E0 T\u0129nh",
                                    "H\u1EA3i D\u01B0\u01A1ng",
                                    "H\u1EADu Giang",
                                    "H\u00F2a B\u00ECnh",
                                    "H\u01B0ng Y\u00EAn",
                                    "Kh\u00E1nh H\u00F2a",
                                    "Ki\u00EAn Giang",
                                    "Kon Tum",
                                    "Lai Ch\u00E2u",
                                    "L\u00E2m \u0110\u1ED3ng",
                                    "L\u1EA1ng S\u01A1n",
                                    "L\u00E0o Cai",
                                    "Long An",
                                    "Nam \u0110\u1ECBnh",
                                    "Ngh\u1EC7 An",
                                    "Ninh B\u00ECnh",
                                    "Ninh Thu\u1EADn",
                                    "Ph\u00FA Th\u1ECD",
                                    "Qu\u1EA3ng B\u00ECnh",
                                    "Qu\u1EA3ng Nam",
                                    "Qu\u1EA3ng Ng\u00E3i",
                                    "Qu\u1EA3ng Ninh",
                                    "Qu\u1EA3ng Tr\u1ECB",
                                    "S\u00F3c Tr\u0103ng",
                                    "S\u01A1n La",
                                    "T\u00E2y Ninh",
                                    "Th\u00E1i B\u00ECnh",
                                    "Th\u00E1i Nguy\u00EAn",
                                    "Thanh H\u00F3a",
                                    "Th\u1EEBa Thi\u00EAn Hu\u1EBF",
                                    "Ti\u1EC1n Giang",
                                    "Tr\u00E0 Vinh",
                                    "Tuy\u00EAn Quang",
                                    "V\u0129nh Long",
                                    "V\u0129nh Ph\u00FAc",
                                    "Y\u00EAn B\u00E1i",
                                    "Ph\u00FA Y\u00EAn");
                        });

        public Object city =
                ZVal.arrayFromList(
                        "C\u1EA7n Th\u01A1",
                        "\u0110\u00E0 N\u1EB5ng",
                        "H\u1EA3i Ph\u00F2ng",
                        "H\u00E0 N\u1ED9i",
                        "H\u1ED3 Ch\u00ED Minh");

        public Object streetNameFormats =
                ZVal.arrayFromList(
                        "Ph\u1ED1 {{lastName}} {{middleName}} {{firstName}}",
                        "Ph\u1ED1 {{lastName}} {{middleName}} {{firstName}}",
                        "Ph\u1ED1 {{lastName}} {{middleName}} {{firstName}}",
                        "Ph\u1ED1 {{firstName}}",
                        "Ph\u1ED1 {{lastName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{buildingNumber}} {{streetName}}");

        public Object hamletNameFormats =
                ZVal.arrayFromList(
                        "{{hamletPrefix}} {{middleName}} {{firstName}}",
                        "{{hamletPrefix}} {{lastName}} {{firstName}}",
                        "{{hamletPrefix}} {{firstName}} {{lastName}}",
                        "{{hamletPrefix}} {{middleName}} {{firstName}}",
                        "{{hamletPrefix}} {{lastName}} {{middleName}} {{firstName}}",
                        "{{hamletPrefix}} {{firstName}}",
                        "{{hamletPrefix}} {{lastName}}",
                        "{{hamletPrefix}} ##",
                        "{{hamletPrefix}} #");

        public Object hamletPrefix = ZVal.arrayFromList("Th\u00F4n", "\u1EA4p");

        public Object wardNameFormats =
                ZVal.arrayFromList(
                        "{{hamletPrefix}} {{middleName}} {{firstName}}",
                        "{{hamletPrefix}} {{lastName}} {{firstName}}",
                        "{{wardPrefix}} {{firstName}} {{lastName}}",
                        "{{wardPrefix}} {{middleName}} {{firstName}}",
                        "{{wardPrefix}} {{lastName}} {{middleName}} {{firstName}}",
                        "{{wardPrefix}} {{firstName}}",
                        "{{wardPrefix}} {{lastName}}",
                        "{{wardPrefix}} ##",
                        "{{wardPrefix}} #");

        public Object wardPrefix = ZVal.arrayFromList("Ph\u01B0\u1EDDng", "X\u00E3");

        public Object districtNameFormats =
                ZVal.arrayFromList(
                        "{{districtPrefix}} {{middleName}} {{firstName}}",
                        "{{districtPrefix}} {{lastName}} {{firstName}}",
                        "{{districtPrefix}} {{firstName}} {{lastName}}",
                        "{{districtPrefix}} {{middleName}} {{firstName}}",
                        "{{districtPrefix}} {{lastName}} {{middleName}} {{firstName}}",
                        "{{districtPrefix}} {{firstName}}",
                        "{{districtPrefix}} {{lastName}}",
                        "{{districtPrefix}} ##",
                        "{{districtPrefix}} #");

        public Object districtPrefix = ZVal.arrayFromList("Qu\u1EADn", "Huy\u1EC7n");

        public Object addressFormats =
                ZVal.arrayFromList(
                        "{{streetAddress}}, {{wardName}}, {{districtName}}\n{{city}}",
                        "{{streetAddress}}, {{wardName}}, {{districtName}}\n{{province}}",
                        "{{buildingNumber}}, {{hamletName}}, {{wardName}}, {{districtName}}\n{{province}}");

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
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\vi_VN\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "buildingNumber",
                            "city",
                            "country",
                            "districtNameFormats",
                            "districtPrefix",
                            "hamletNameFormats",
                            "hamletPrefix",
                            "postcode",
                            "province",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "wardNameFormats",
                            "wardPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/vi_VN/Address.php")
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
