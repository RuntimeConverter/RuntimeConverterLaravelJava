package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.ro_MD.classes;

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

 vendor/fzaninotto/faker/src/Faker/Provider/ro_MD/Address.php

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
                                                                .ro_MD
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
                                                        .ro_MD
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    @ConvertedMethod
    public Object blockSegment(RuntimeEnv env, Object... args) {
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
                                                                .ro_MD
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "blockSegment")))
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
                                                        .ro_MD
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .blockSegment)
                        .value());
    }

    @ConvertedMethod
    public Object streetPrefix(RuntimeEnv env, Object... args) {
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
                                                                .ro_MD
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetPrefix")))
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
                                                        .ro_MD
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetPrefix)
                        .value());
    }

    @ConvertedMethod
    public Object streetPlainName(RuntimeEnv env, Object... args) {
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
                                                                .ro_MD
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetPlainName")))
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
                                                        .ro_MD
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetPlainName)
                        .value());
    }

    @ConvertedMethod
    public Object streetName(RuntimeEnv env, Object... args) {
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
                                                                .ro_MD
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetNameFormats")))
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
                                                        .ro_MD
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetNameFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    @ConvertedMethod
    public Object address(RuntimeEnv env, Object... args) {
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
                                                                .ro_MD
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "addressFormats")))
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
                                                        .ro_MD
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .addressFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    @ConvertedMethod
    public Object streetAddress(RuntimeEnv env, Object... args) {
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
                                                                .ro_MD
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "streetAddressFormats")))
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
                                                        .ro_MD
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .streetAddressFormats)
                        .value();
        return ZVal.assign(
                env.callMethod(
                        toObjectR(this).accessProp(this, env).name("generator").value(),
                        "parse",
                        Address.class,
                        format));
    }

    public static final Object CONST_class = "Faker\\Provider\\ro_MD\\Address";

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
        public Object block(RuntimeEnv env, Object... args) {
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
                                                                            .ro_MD
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .block)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object floor(RuntimeEnv env, Object... args) {
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
                                                                            .ro_MD
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .floor)
                                            .value())
                            .value());
        }

        @ConvertedMethod
        public Object apartmentNumber(RuntimeEnv env, Object... args) {
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
                                                                            .ro_MD
                                                                            .classes
                                                                            .Address
                                                                            .RequestStaticProperties
                                                                            .class)
                                                            .apartmentNumber)
                                            .value())
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object buildingNumber = ZVal.arrayFromList("###", "##", "#", "#/#", "#A", "#B");

        public Object apartmentNumber = ZVal.arrayFromList("#", "##");

        public Object floor = ZVal.arrayFromList("#", "##");

        public Object block = ZVal.arrayFromList("#", "##", "A", "B", "C", "D");

        public Object blockSegment = ZVal.arrayFromList("A", "B", "C", "D");

        public Object streetPrefix =
                ZVal.arrayFromList("Str.", "B-dul.", "Aleea", "Calea", "P-\u021Ba", "Str-la");

        public Object streetPlainName =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Eroilor",
                                    "Independen\u021Bei",
                                    "Lenin",
                                    "Unirii",
                                    "31 August 1989",
                                    "Sovietului",
                                    "Mihai Viteazul",
                                    "Mircea cel B\u0103tr\u00E2n",
                                    "Mitropolitul Varlaam",
                                    "Traian",
                                    "Decebal",
                                    "Alexandru cel Bun",
                                    "Alexandri V.",
                                    "Arhangelul Mihail",
                                    "Veronica Micle",
                                    "Ion Creang\u0103",
                                    "Mihai Eminescu",
                                    "B. P. Ha\u0219deu",
                                    "Cire\u0219ilor",
                                    "Frasinului",
                                    "Salc\u00E2milor",
                                    "Br\u0103du\u021Bului",
                                    "Frunzi\u0219ului",
                                    "Castanilor",
                                    "Mesteac\u0103nului",
                                    "Florilor",
                                    "P\u0103durii",
                                    "Piersicului",
                                    "Trandafirilor",
                                    "Croitorilor",
                                    "Me\u0219terilor",
                                    "Zidarilor",
                                    "P\u0103curari",
                                    "Muncii",
                                    "\u00CEnv\u0103\u021B\u0103torului",
                                    "Chisinau",
                                    "Paris");
                        });

        public Object postcode = ZVal.arrayFromList("####");

        public Object cityNames =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Chi\u0219in\u0103u",
                                    "Tiraspol",
                                    "B\u0103l\u021Bi",
                                    "Tighina",
                                    "R\u00E2bni\u021Ba",
                                    "Cahul",
                                    "Ungheni",
                                    "Soroca",
                                    "Orhei",
                                    "Dub\u0103sari",
                                    "Comrat",
                                    "Cead\u00E2r-Lunga",
                                    "Str\u0103\u0219eni",
                                    "C\u0103u\u0219eni",
                                    "Drochia",
                                    "Slobozia",
                                    "Edine\u021B",
                                    "Vulc\u0103ne\u0219ti",
                                    "Durle\u0219ti",
                                    "H\u00E2nce\u0219ti",
                                    "Ialoveni",
                                    "F\u0103le\u0219ti",
                                    "C\u0103l\u0103ra\u0219i",
                                    "Codru",
                                    "Taraclia",
                                    "Flore\u0219ti",
                                    "Cimi\u0219lia",
                                    "S\u00E2ngerei",
                                    "Dnestrovsc",
                                    "Nisporeni",
                                    "Grigoriopol",
                                    "Basarabeasca",
                                    "R\u00E2\u0219cani",
                                    "Glodeni",
                                    "Camenca",
                                    "Rezina",
                                    "Leova",
                                    "Cricova",
                                    "Dondu\u0219eni",
                                    "Ocni\u021Ba",
                                    "Briceni",
                                    "Otaci",
                                    "Anenii Noi",
                                    "\u0218tefan Vod\u0103",
                                    "Cupcini",
                                    "S\u00E2ngera",
                                    "Criuleni",
                                    "Telene\u0219ti",
                                    "\u0218old\u0103ne\u0219ti",
                                    "Tvardi\u021Ba",
                                    "Lipcani",
                                    "Vadul lui Vod\u0103",
                                    "Iargara",
                                    "C\u0103inari",
                                    "Cantemir",
                                    "Vatra",
                                    "Biruin\u021Ba",
                                    "Crasnoe",
                                    "Corne\u0219ti",
                                    "Coste\u0219ti",
                                    "M\u0103rcule\u0219ti",
                                    "Ghinde\u0219ti",
                                    "Tiraspolul Nou",
                                    "Frunz\u0103",
                                    "Bucov\u0103\u021B",
                                    "Maiac");
                        });

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "Afganistan",
                                    "Africa de Sud",
                                    "Albania",
                                    "Algeria",
                                    "Andorra",
                                    "Angola",
                                    "Antigua \u0219i Barbuda",
                                    "Arabia Saudit\u0103",
                                    "Argentina",
                                    "Armenia",
                                    "Australia",
                                    "Austria",
                                    "Azerbaidjan",
                                    "Bahamas",
                                    "Bahrain",
                                    "Bangladesh",
                                    "Barbados",
                                    "Belarus",
                                    "Belgia",
                                    "Belize",
                                    "Benin",
                                    "Bhutan",
                                    "Birmania",
                                    "Bolivia",
                                    "Bosnia \u0219i Her\u021Begovina",
                                    "Botswana",
                                    "Brazilia",
                                    "Brunei",
                                    "Bulgaria",
                                    "Burkina Faso",
                                    "Burundi",
                                    "Cambodgia",
                                    "Camerun",
                                    "Canada",
                                    "Capul Verde",
                                    "Cehia",
                                    "Republica Centrafrican\u0103",
                                    "Chile",
                                    "Republica Popular\u0103 Chinez\u0103",
                                    "Ciad",
                                    "Cipru",
                                    "Columbia",
                                    "Comore",
                                    "Republica Democrat\u0103 Congo",
                                    "Republica Congo",
                                    "Coreea de Nord",
                                    "Coreea de Sud",
                                    "Costa Rica",
                                    "Coasta de Filde\u0219",
                                    "Croa\u021Bia",
                                    "Cuba",
                                    "Danemarca",
                                    "Djibouti",
                                    "Dominica",
                                    "Republica Dominican\u0103",
                                    "Ecuador",
                                    "Egipt",
                                    "El Salvador",
                                    "Elve\u021Bia",
                                    "Emiratele Arabe Unite",
                                    "Eritreea",
                                    "Estonia",
                                    "Etiopia",
                                    "Fiji",
                                    "Filipine",
                                    "Finlanda",
                                    "Fran\u021Ba",
                                    "Gabon",
                                    "Gambia",
                                    "Georgia",
                                    "Germania",
                                    "Ghana",
                                    "Grecia",
                                    "Grenada",
                                    "Guatemala",
                                    "Guineea",
                                    "Guineea-Bissau",
                                    "Guineea Ecuatorial\u0103",
                                    "Guyana",
                                    "Haiti",
                                    "Honduras",
                                    "India",
                                    "Indonezia",
                                    "Iordania",
                                    "Irak",
                                    "Iran",
                                    "Republica Irlanda",
                                    "Islanda",
                                    "Israel",
                                    "Italia",
                                    "Jamaica",
                                    "Japonia",
                                    "Kazahstan",
                                    "Kenya",
                                    "Kirghizstan",
                                    "Kiribati",
                                    "Kuweit",
                                    "Laos",
                                    "Lesotho",
                                    "Letonia",
                                    "Liban",
                                    "Liberia",
                                    "Libia",
                                    "Liechtenstein",
                                    "Lituania",
                                    "Luxemburg",
                                    "Republica Macedonia",
                                    "Madagascar",
                                    "Malawi",
                                    "Malaezia",
                                    "Maldive",
                                    "Mali",
                                    "Malta",
                                    "Maroc",
                                    "Insulele Marshall",
                                    "Mauritania",
                                    "Mauritius",
                                    "Mexic",
                                    "Statele Federate ale Microneziei",
                                    "Republica Moldova",
                                    "Monaco",
                                    "Mongolia",
                                    "Mozambic",
                                    "Muntenegru",
                                    "Namibia",
                                    "Nauru",
                                    "Nepal",
                                    "Nicaragua",
                                    "Niger",
                                    "Nigeria",
                                    "Norvegia",
                                    "Noua Zeeland\u0103",
                                    "Olanda",
                                    "Oman",
                                    "Pakistan",
                                    "Palau",
                                    "Panama",
                                    "Papua Noua Guinee",
                                    "Paraguay",
                                    "Peru",
                                    "Polonia",
                                    "Portugalia",
                                    "Qatar",
                                    "Regatul Unit",
                                    "Rom\u00E2nia",
                                    "Rusia",
                                    "Rwanda",
                                    "Samoa",
                                    "San Marino",
                                    "S\u00E3o Tom\u00E9 \u0219i Pr\u00EDncipe",
                                    "S\u00E3o Tom\u00E9 e Pr\u00EDncipe",
                                    "Senegal",
                                    "Serbia",
                                    "Seychelles",
                                    "Sf\u00E2nta Lucia",
                                    "Sf\u00E2ntul Cristofor \u0219i Nevis",
                                    "Saint Vincent and the Grenadines",
                                    "Sierra Leone",
                                    "Singapore",
                                    "Siria",
                                    "Slovacia",
                                    "Slovenia",
                                    "Insulele Solomon",
                                    "Somalia",
                                    "Spania",
                                    "Sri Lanka",
                                    "Statele Unite ale Americii",
                                    "Sudan",
                                    "Sudanul de Sud",
                                    "Suedia",
                                    "Surinam",
                                    "Swaziland",
                                    "Tadjikistan",
                                    "Tanzania",
                                    "Thailanda",
                                    "Timorul de Est",
                                    "Togo",
                                    "Tonga",
                                    "Trinidad-Tobago",
                                    "Tunisia",
                                    "Turcia",
                                    "Turkmenistan",
                                    "Tuvalu",
                                    "Ucraina",
                                    "Uganda",
                                    "Ungaria",
                                    "Uruguay",
                                    "Uzbekistan",
                                    "Vanuatu",
                                    "Vatican",
                                    "Venezuela",
                                    "Vietnam",
                                    "Yemen",
                                    "Zambia",
                                    "Zimbabwe");
                        });

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}", "Mun. {{cityName}}");

        public Object streetNameFormats =
                ZVal.arrayFromList("{{streetPrefix}} {{streetPlainName}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList(
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} {{buildingNumber}}",
                        "{{streetName}} nr. {{buildingNumber}}, bl. {{block}}, ap. {{apartmentNumber}}",
                        "{{streetName}} nr. {{buildingNumber}}, bl. {{block}}, et. {{floor}}, ap. {{apartmentNumber}}",
                        "{{streetName}} nr. {{buildingNumber}}, bl. {{block}}, sc. {{blockSegment}}, et. {{floor}}, ap. {{apartmentNumber}}");

        public Object addressFormats =
                ZVal.arrayFromList("{{streetAddress}}, {{city}}, CP {{postcode}}");
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\ro_MD\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "addressFormats",
                            "apartmentNumber",
                            "block",
                            "blockSegment",
                            "buildingNumber",
                            "cityFormats",
                            "cityNames",
                            "country",
                            "floor",
                            "postcode",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPlainName",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/ro_MD/Address.php")
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
